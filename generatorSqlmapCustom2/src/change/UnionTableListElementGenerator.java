package change;


import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

public class UnionTableListElementGenerator extends AbstractXmlElementGenerator {

	public UnionTableListElementGenerator() {
		super();
	}

	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("sql"); //$NON-NLS-1$

		answer.addAttribute(new Attribute("id", "Union_Table_List")); //$NON-NLS-1$

		context.getCommentGenerator().addComment(answer);

		XmlElement outerForEachElement = new XmlElement("foreach"); //$NON-NLS-1$
		outerForEachElement.addAttribute(new Attribute("collection", "unionTables"));
		outerForEachElement.addAttribute(new Attribute("item", "table")); //$NON-NLS-1$ //$NON-NLS-2$
		outerForEachElement.addAttribute(new Attribute("separator", ",")); //$NON-NLS-1$ //$NON-NLS-2$
		answer.addElement(outerForEachElement);
		
		outerForEachElement.addElement(new TextElement("${table}"));

		parentElement.addElement(answer);
	}

}