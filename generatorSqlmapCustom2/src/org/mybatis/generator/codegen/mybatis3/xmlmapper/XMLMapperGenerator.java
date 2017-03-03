/*
 *  Copyright 2009 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mybatis.generator.codegen.mybatis3.xmlmapper;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.XmlConstants;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.BaseColumnListElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.BlobColumnListElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.CountByExampleElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.DeleteByExampleElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.DeleteByPrimaryKeyElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ExampleWhereClauseElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ResultMapWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ResultMapWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByExampleWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByExampleWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByPrimaryKeyElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleSelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByExampleWithoutBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeySelectiveElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeyWithBLOBsElementGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.UpdateByPrimaryKeyWithoutBLOBsElementGenerator;
import org.mybatis.generator.config.PropertyRegistry;

import change.MyExampleWhereClauseElementGenerator;
import change.OtherColumnListElementGenerator;
import change.ResultMapWithBLOBsVoElementGenerator;
import change.UnionTableListElementGenerator;
import change.VoUtil;


/**
 * 
 * @author Jeff Butler
 * 
 */
public class XMLMapperGenerator extends AbstractXmlGenerator {

    public XMLMapperGenerator() {
        super();
    }

    protected XmlElement getSqlMapElement() {
        FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
        progressCallback.startTask(getString(
                "Progress.12", table.toString())); //$NON-NLS-1$
        XmlElement answer = new XmlElement("mapper"); //$NON-NLS-1$
        String namespace = introspectedTable.getMyBatis3SqlMapNamespace();
        answer.addAttribute(new Attribute("namespace", //$NON-NLS-1$
                namespace));
        
        context.getCommentGenerator().addRootComment(answer);

        addResultMapWithoutBLOBsElement(answer);
        addResultMapWithBLOBsElement(answer);
        
        String voQualifiedName = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_VO_CLASS);
      //  if (null != voQualifiedName)
        {
        	List<VoUtil.FieldInfo> fullyQualifiedJavaTypes = null;
        	try {
        		fullyQualifiedJavaTypes = VoUtil.praseFullyQualifiedJavaTypes(voQualifiedName);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	List<IntrospectedTableInfo> introspectedTables = new ArrayList<>();
        	for (VoUtil.FieldInfo qualified : fullyQualifiedJavaTypes)
        	{
        		IntrospectedTable intrTable = context.getIntrospectedTableByType(qualified.qualifiedType);
        		if (null == intrTable)
        			continue;
        		introspectedTables.add(new IntrospectedTableInfo(intrTable, qualified.bCollection, qualified.fieldName));
        	}
        	
        	addResultMapWithBLOBsVoElement(answer, voQualifiedName, introspectedTables);
        }
        
        addExampleWhereClauseElement(answer);
        addMyExampleWhereClauseElement(answer);
        addMyBatis3UpdateByExampleWhereClauseElement(answer);
        addBaseColumnListElement(answer);
        addBlobColumnListElement(answer);
        addOtherColumnListElement(answer);
        addUnionTableListElement(answer);
        addSelectByExampleWithBLOBsElement(answer);
        addSelectByExampleWithoutBLOBsElement(answer);
        addSelectByPrimaryKeyElement(answer);
        addDeleteByPrimaryKeyElement(answer);
        addDeleteByExampleElement(answer);
        addInsertElement(answer);
        addInsertSelectiveElement(answer);
        addCountByExampleElement(answer);
        addUpdateByExampleSelectiveElement(answer);
        addUpdateByExampleWithBLOBsElement(answer);
        addUpdateByExampleWithoutBLOBsElement(answer);
        addUpdateByPrimaryKeySelectiveElement(answer);
        addUpdateByPrimaryKeyWithBLOBsElement(answer);
        addUpdateByPrimaryKeyWithoutBLOBsElement(answer);

        return answer;
    }
    public class IntrospectedTableInfo {
    	public IntrospectedTable introspectedTable;
    	public boolean bCollection;
    	public String fieldName;
		public IntrospectedTableInfo(IntrospectedTable introspectedTable, boolean bCollection, String fieldName) {
			super();
			this.introspectedTable = introspectedTable;
			this.bCollection = bCollection;
			this.fieldName = fieldName;
		}
    	
    }

    protected void addResultMapWithoutBLOBsElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new ResultMapWithoutBLOBsElementGenerator(false);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addResultMapWithBLOBsElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new ResultMapWithBLOBsElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addResultMapWithBLOBsVoElement(XmlElement parentElement, String returnTypeQualified, List<IntrospectedTableInfo> introspectedTables) {
    	AbstractXmlElementGenerator elementGenerator = new ResultMapWithBLOBsVoElementGenerator(returnTypeQualified, introspectedTables);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
    

    protected void addExampleWhereClauseElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(
                false);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
    
    protected void addMyExampleWhereClauseElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new MyExampleWhereClauseElementGenerator(
                false);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addMyBatis3UpdateByExampleWhereClauseElement(
            XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(
                true);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addBaseColumnListElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new BaseColumnListElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addBlobColumnListElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new BlobColumnListElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
    
    protected void addOtherColumnListElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new OtherColumnListElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }
    
    protected void addUnionTableListElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new UnionTableListElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addSelectByExampleWithoutBLOBsElement(
            XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithoutBLOBsElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addSelectByExampleWithBLOBsElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithBLOBsElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addSelectByPrimaryKeyElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new SelectByPrimaryKeyElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addDeleteByExampleElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new DeleteByExampleElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addDeleteByPrimaryKeyElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new DeleteByPrimaryKeyElementGenerator(false);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addInsertElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new InsertElementGenerator(false);
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addInsertSelectiveElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new InsertSelectiveElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addCountByExampleElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new CountByExampleElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addUpdateByExampleSelectiveElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new UpdateByExampleSelectiveElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void addUpdateByExampleWithBLOBsElement(XmlElement parentElement) {
    	AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithBLOBsElementGenerator();
        initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

	protected void addUpdateByExampleWithoutBLOBsElement(XmlElement parentElement) {
		AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithoutBLOBsElementGenerator();
		initializeAndExecuteGenerator(elementGenerator, parentElement);
	}

	protected void addUpdateByPrimaryKeySelectiveElement(XmlElement parentElement) {
		AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeySelectiveElementGenerator();
		initializeAndExecuteGenerator(elementGenerator, parentElement);
	}

	protected void addUpdateByPrimaryKeyWithBLOBsElement(XmlElement parentElement) {
		AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyWithBLOBsElementGenerator();
		initializeAndExecuteGenerator(elementGenerator, parentElement);
	}

	protected void addUpdateByPrimaryKeyWithoutBLOBsElement(XmlElement parentElement) {
		AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyWithoutBLOBsElementGenerator(false);
		initializeAndExecuteGenerator(elementGenerator, parentElement);
    }

    protected void initializeAndExecuteGenerator(
            AbstractXmlElementGenerator elementGenerator,
            XmlElement parentElement) {
        elementGenerator.setContext(context);
        elementGenerator.setIntrospectedTable(introspectedTable);
        elementGenerator.setProgressCallback(progressCallback);
        elementGenerator.setWarnings(warnings);
        elementGenerator.addElements(parentElement);
    }

    @Override
    public Document getDocument() {
        Document document = new Document(
                XmlConstants.MYBATIS3_MAPPER_PUBLIC_ID,
                XmlConstants.MYBATIS3_MAPPER_SYSTEM_ID);
        document.setRootElement(getSqlMapElement());

        if (!context.getPlugins().sqlMapDocumentGenerated(document,
                introspectedTable)) {
            document = null;
        }

        return document;
    }
}
