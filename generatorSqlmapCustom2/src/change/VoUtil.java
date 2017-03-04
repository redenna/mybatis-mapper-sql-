package change;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.mybatis.generator.exception.ShellException;

public class VoUtil {
	public static List<FieldInfo> praseFullyQualifiedJavaTypes(String targetQualifiedFile) throws Exception
	{
		List<FieldInfo> ret = new ArrayList<>();
		if (null == targetQualifiedFile)
		{
			return ret;
		}
		String targetProject = "./src";
		File project = new File(targetProject);
        if (!project.isDirectory()) {
            throw new ShellException(getString("Warning.9", //$NON-NLS-1$
                    targetProject));
        }

        targetQualifiedFile = targetQualifiedFile.replaceAll("\\.", "/")+".java";
        
        File file = new File(project, targetQualifiedFile);
        if (!file.isFile()) {
        	return ret;
//        	throw new ShellException(getString("没有vo文件", //$NON-NLS-1$
//        			file.getAbsolutePath()));
        }
		
        InputStreamReader read = new InputStreamReader(new FileInputStream(file),"utf-8");//考虑到编码格式
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuffer buffer = new StringBuffer();
        String lineTxt = null;
        while((lineTxt = bufferedReader.readLine()) != null){
        	int idx = lineTxt.indexOf("//");
        	if (-1 != idx)
        	{
        		lineTxt = lineTxt.substring(0, idx);
        	}
        	buffer.append(lineTxt);
        	buffer.append(" ");
        }
        read.close();
        
        String[] wordArr = buffer.toString().split(" ");
        List<String> wordList = new ArrayList<>();
        for (int i=0; i<wordArr.length; ++i)
        {
        	String str = wordArr[i].trim();
        	if (str.equals(""))
        		continue;
        	wordList.add(str);
        }
        
        String importStr = "import";
        boolean bGotImport = false;
        List<String> importTypeList = new ArrayList<>();
        int i=0;
        for (; i<wordList.size(); ++i)
        {
        	String word = wordList.get(i);
        	if (word.equals(importStr))
        	{//import 
        		bGotImport = true;
        	}
        	else if (word.contains(";") && bGotImport)
        	{//import xxx;
        		word = word.substring(0, word.length()-1);
        		if (word.length() == 0)
        		{
        			word = wordList.get(i-1);
        		}
        		importTypeList.add(word);
        		bGotImport = false;
        	}
        	else if (word.contains("{"))
        	{//public class xxx{
        		++i;
        		break;
        	}
        }
        
        boolean bGotBracesBeg = false; //{
        for (; i<wordList.size(); ++i)
        {
        	String word = wordList.get(i);
        	if (bGotBracesBeg)
        	{
        		int idx = word.indexOf("}");
        		if (-1 == idx)
        			continue;
        		word = word.substring(idx+1, word.length());
        		bGotBracesBeg = false;
        	}
        	
        	if (word.contains("{"))
        	{
        		bGotBracesBeg = true;
        	}
        	
        	if (word.contains(";"))
        	{
        		int objTypeI = i-1;
        		word = word.substring(0, word.length()-1);
        		String objType = wordList.get(objTypeI);
        		if (word.length() == 0)
        		{
        			word = wordList.get(i-1);
        			objType = wordList.get(--objTypeI);
        		}
        		
        		boolean bCollection = false;
        		if (objType.contains(">"))
        		{
        			if (!objType.contains("<"))
        			{
        				objType = wordList.get(objTypeI-1)+objType;
        				if (!objType.contains("<"))
        				{
        					objType = wordList.get(objTypeI-2)+objType;
        				}
        			}
        			bCollection = true;
        			objType = objType.substring(objType.indexOf("<")+1, objType.length()-1);
        		}
        		
        		for (String importType : importTypeList)
				{
					if (importType.endsWith(objType))
					{
						objType = importType;
						break;
					}
				}
        		ret.add(new FieldInfo(bCollection, objType, word));
        	}
        	
        }
        return ret;
	}
	
	public static class FieldInfo{
		public boolean bCollection = false;
		public String qualifiedType;
		public String fieldName;
		
		public FieldInfo(String qualifiedType, String fieldName)
		{
			this.qualifiedType = qualifiedType;
			this.fieldName = fieldName;
		}
		public FieldInfo(boolean bCollection, String qualifiedType, String fieldName)
		{
			this.bCollection = bCollection;
			this.qualifiedType = qualifiedType;
			this.fieldName = fieldName;
		}
	}
	private static boolean isSpace(char ch)
	{
		return (ch == ' ' || ch == '\r' || ch == '\n' || ch == '\t');
	}
	private static int passSpace(String str, int idxBeg, int idxEnd, boolean bReverse)
	{
		if (idxBeg >= idxEnd || idxEnd>=str.length())
			return -1;
		
		int startIdx = idxBeg;
		int finishIdx = idxEnd;
		int step = 1;
		if (bReverse)
		{
			startIdx = idxEnd;
			finishIdx = idxBeg;
			step = -1;
		}
		
		do{
			char ch = str.charAt(startIdx);
			if (!isSpace(ch))
			{
				break;
			}
			startIdx += step;
		} while (startIdx != finishIdx);
		return startIdx;
	}
}
