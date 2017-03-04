package change;

import java.util.List;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.internal.rules.BaseRules;

public class MyBaseMapperImpl extends IntrospectedTableMyBatis3Impl
{
	public MyBaseMapperImpl()
	{
		super();
	}
	
	public MyBaseMapperImpl(Context context, List<String> warnings,
            ProgressCallback callback)
	{
		setContext(context);
		FullyQualifiedTable fullyQualifiedTable = new FullyQualifiedTable("", "", 
				"n", "", null, false, "", "", "", false, context);
		setFullyQualifiedTable(fullyQualifiedTable);
		setTableConfiguration(new TableConfiguration(context));
		initialize();
		calculateClientGenerators(warnings, callback);
        setRules(new BaseRules(this) {
			@Override
			public boolean generateRecordWithBLOBsClass() {
				return false;
			}
			@Override
			public boolean generatePrimaryKeyClass() {
				return false;
			}
			@Override
			public boolean generateBaseRecordClass() {
				return true;
			}
		});
        String mapperType = context.getSqlMapGeneratorConfiguration().getTargetPackage()+"."+JavaMapperGenerator.BASE_MAPPER_CLASS_FULL;
        setMyBatis3JavaMapperType(mapperType);
        setBaseRecordType(JavaMapperGenerator.BASE_MAPPER_RECORD_TYPE);
		setExampleType(JavaMapperGenerator.BASE_MAPPER_EXAMPLE_TYPE);
		
		IntrospectedColumn column = new IntrospectedColumn();
		column.setFullyQualifiedJavaType(new FullyQualifiedJavaType(JavaMapperGenerator.BASE_MAPPER_PRIMARY_TYPE));
		column.setActualColumnName(JavaMapperGenerator.BASE_MAPPER_PRIMARY_TYPE);
		column.setJavaProperty("id");
		addColumn(column);
		addPrimaryKeyColumn(JavaMapperGenerator.BASE_MAPPER_PRIMARY_TYPE);
	}
}