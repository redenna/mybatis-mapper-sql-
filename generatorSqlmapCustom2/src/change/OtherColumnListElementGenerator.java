package change;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

public class OtherColumnListElementGenerator extends AbstractXmlElementGenerator {
	public OtherColumnListElementGenerator() {
		super();
	}

	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("sql"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "Other_Column_List")); //$NON-NLS-1$
		context.getCommentGenerator().addComment(answer);

		XmlElement outerForEachElement = new XmlElement("foreach"); //$NON-NLS-1$
		outerForEachElement.addAttribute(new Attribute("collection", "otherColumns"));
		outerForEachElement.addAttribute(new Attribute("item", "column")); //$NON-NLS-1$ //$NON-NLS-2$
		outerForEachElement.addAttribute(new Attribute("separator", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		outerForEachElement.addElement(new TextElement("${column}"));
		answer.addElement(outerForEachElement);
		
		parentElement.addElement(answer);
		
		
		answer = new XmlElement("sql"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", "Other_Blob_Column_List")); //$NON-NLS-1$
		context.getCommentGenerator().addComment(answer);

		outerForEachElement = new XmlElement("foreach"); //$NON-NLS-1$
		outerForEachElement.addAttribute(new Attribute("collection", "otherBlobColumns"));
		outerForEachElement.addAttribute(new Attribute("item", "column")); //$NON-NLS-1$ //$NON-NLS-2$
		outerForEachElement.addAttribute(new Attribute("separator", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		outerForEachElement.addElement(new TextElement("${column}"));
		answer.addElement(outerForEachElement);
		
		parentElement.addElement(answer);
	}
}
