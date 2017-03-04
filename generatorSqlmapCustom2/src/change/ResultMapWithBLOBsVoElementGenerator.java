package change;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator.IntrospectedTableInfo;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

public class ResultMapWithBLOBsVoElementGenerator extends AbstractXmlElementGenerator {
	private String returnTypeQualified;
	private List<IntrospectedTableInfo> subIntrospectedTables;
	public ResultMapWithBLOBsVoElementGenerator(String returnTypeQualified, List<IntrospectedTableInfo> subIntrospectedTables) {
		super();
		this.returnTypeQualified = returnTypeQualified;
		this.subIntrospectedTables = subIntrospectedTables;
	}

	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("resultMap"); //$NON-NLS-1$

		answer.addAttribute(new Attribute("id", //$NON-NLS-1$
				introspectedTable.getResultMapWithBLOBsVoId()));

		String returnType = returnTypeQualified;
		if (null == returnType)
		{
			if (introspectedTable.getRules().generateRecordWithBLOBsClass()) {
	            returnType = introspectedTable.getRecordWithBLOBsType();
	        } else {
	            // table has BLOBs, but no BLOB class - BLOB fields must be
	            // in the base class
	            returnType = introspectedTable.getBaseRecordType();
	        }
		}

		answer.addAttribute(new Attribute("type", //$NON-NLS-1$
				returnType));

		//not understand what mean of ConstructorBased, so do not change it
		if (!introspectedTable.isConstructorBased()) {
			answer.addAttribute(new Attribute("extends", //$NON-NLS-1$
					introspectedTable.getResultMapWithBLOBsId()));
		}

		context.getCommentGenerator().addComment(answer);

		if (introspectedTable.isConstructorBased()) {
			addResultMapConstructorElements(answer);
		} else {
			addResultMapElements(answer);
		}

//		if (context.getPlugins().sqlMapResultMapWithBLOBsElementGenerated(
//				answer, introspectedTable)) {
//			parentElement.addElement(answer);
//		}
		parentElement.addElement(answer);
	}

	private void addResultMapElements(XmlElement answer) {
		if (null == subIntrospectedTables)
			return;
		for (IntrospectedTableInfo introspectedTableInfo : subIntrospectedTables)
		{
			IntrospectedTable introspectedTable = introspectedTableInfo.introspectedTable;
			String xmlElementStr = "association";
			String typeAttrName = "javaType";
			if (introspectedTableInfo.bCollection)
			{
				xmlElementStr = "collection";
				typeAttrName = "ofType";
			}
			XmlElement assoElement = new XmlElement(xmlElementStr);
			String returnType  = introspectedTable.getFullyQualifiedObj();
			assoElement.addAttribute(new Attribute("property", introspectedTableInfo.fieldName));
			assoElement.addAttribute(new Attribute(typeAttrName, returnType));
			String resultMap = introspectedTable.getMapperNamespace() + ".ResultMapWithBLOBsVo";
			assoElement.addAttribute(new Attribute("resultMap", resultMap));
			
			answer.addElement(assoElement);
		}
			
	}

	private void addResultMapConstructorElements(XmlElement answer) {
		XmlElement constructor = new XmlElement("constructor"); //$NON-NLS-1$

		for (IntrospectedColumn introspectedColumn : introspectedTable
				.getPrimaryKeyColumns()) {
			XmlElement resultElement = new XmlElement("idArg"); //$NON-NLS-1$

			resultElement
					.addAttribute(new Attribute(
							"column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn))); //$NON-NLS-1$
			resultElement.addAttribute(new Attribute(
					"jdbcType", introspectedColumn.getJdbcTypeName())); //$NON-NLS-1$
			resultElement.addAttribute(new Attribute("javaType", //$NON-NLS-1$
					introspectedColumn.getFullyQualifiedJavaType()
							.getFullyQualifiedName()));

			if (stringHasValue(introspectedColumn.getTypeHandler())) {
				resultElement.addAttribute(new Attribute(
						"typeHandler", introspectedColumn.getTypeHandler())); //$NON-NLS-1$
			}

			constructor.addElement(resultElement);
		}

		for (IntrospectedColumn introspectedColumn : introspectedTable
				.getNonPrimaryKeyColumns()) {
			XmlElement resultElement = new XmlElement("arg"); //$NON-NLS-1$

			resultElement
					.addAttribute(new Attribute(
							"column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn))); //$NON-NLS-1$
			resultElement.addAttribute(new Attribute(
					"jdbcType", introspectedColumn.getJdbcTypeName())); //$NON-NLS-1$

			if (introspectedColumn.getFullyQualifiedJavaType().isPrimitive()) {
				// need to use the MyBatis type alias for a primitive byte
				StringBuilder sb = new StringBuilder();
				sb.append('_');
				sb.append(introspectedColumn.getFullyQualifiedJavaType()
						.getShortName());
				resultElement.addAttribute(new Attribute("javaType", //$NON-NLS-1$
						sb.toString()));

			} else if ("byte[]".equals(introspectedColumn.getFullyQualifiedJavaType() //$NON-NLS-1$
							.getFullyQualifiedName())) {
				// need to use the MyBatis type alias for a primitive byte arry
				resultElement.addAttribute(new Attribute("javaType", //$NON-NLS-1$
						"_byte[]")); //$NON-NLS-1$
			} else {
				resultElement.addAttribute(new Attribute("javaType", //$NON-NLS-1$
						introspectedColumn.getFullyQualifiedJavaType()
								.getFullyQualifiedName()));
			}

			if (stringHasValue(introspectedColumn.getTypeHandler())) {
				resultElement.addAttribute(new Attribute(
						"typeHandler", introspectedColumn.getTypeHandler())); //$NON-NLS-1$
			}

			constructor.addElement(resultElement);
		}

		answer.addElement(constructor);
	}
}
