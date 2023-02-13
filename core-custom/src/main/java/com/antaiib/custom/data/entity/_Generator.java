package com.antaiib.custom.data.entity;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.druid.DruidPlugin;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Model、BaseModel、_MappingKit 生成器
 */
public class _Generator {

	/**
	 * 部分功能使用 Db + Record 模式实现，无需生成 entity 的 table 在此配置
	 */
	//平台的数据表,需要生成哪张表直接取消注释即可
	private static final List<String> CUSTOM_PLATFORM_TABLE = Arrays.asList(
			// "custom_app_database",
			//  "custom_field",
			// "custom_field_cascade",
			// "custom_field_show",
			// "custom_field_validate",
			// "custom_table",
			// "custom_table_classify",
			// "custom_table_field_log",
			// "custom_table_fieldcontrol",
			// "custom_table_sql",
			"custom_table_table_rltn"
			// "custom_scene",
//			 "custom_table_table_config"
			// "custom_tree_bind_table_conf",
			// "custom_tree_expand_type",
			//"custom_table_index"
//			"custom_form_access_formula_conf"
//			"custom_form_formula_operator"
//			"custom_common_phrase",
//			"custom_scene_tag_rule"
//			"custom_person_datatype",
//			"custom_module",
// 			"custom_module_variable",
// 			"custom_sys_table_expand_conf"
	);
	/**
	 * 重用 JFinalClubConfig 中的数据源配置，避免冗余配置
	 */
	public static DataSource getDataSource() {

		//本地环境
		//DruidPlugin druidPlugin = CustomDataSourceConfig.createPlatformDruidPlugin();
		//模拟环境
		DruidPlugin druidPlugin = new DruidPlugin("jdbc:mysql://192.168.34.72:3306/fsn_core_custom?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true",
				"root",
				"mypwd123",
				"com.mysql.cj.jdbc.Driver");

		druidPlugin.start();
		return druidPlugin.getDataSource();
	}

	public static void main(String[] args) {
		// base entity 所使用的包名
		String baseModelPackageName = "com.antaiib.custom.data.entity.base";
		// base entity 文件保存路径
		String baseModelOutputDir = PathKit.getWebRootPath()
				+ "/src/main/java/com/antaiib/custom/data/entity/base";

		System.out.println("输出路径："+ baseModelOutputDir);

		// entity 所使用的包名 (MappingKit 默认使用的包名)
		String modelPackageName = "com.antaiib.custom.data.entity";
		// entity 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
		String modelOutputDir = baseModelOutputDir + "/..";

		// 创建生成器
		DataSource dataSource = getDataSource();
		List<String> allTables = new ArrayList<>();
		try {
			ResultSet resultSet = dataSource.getConnection().createStatement().executeQuery("show tables;");
			while(resultSet.next()){
				allTables.add(resultSet.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//排除智圭平台的数据表，剩下的就是系统级的自定义表，则不需要生成MODEL等
		allTables.removeAll(CUSTOM_PLATFORM_TABLE);

		Generator gen = new Generator(dataSource, baseModelPackageName, baseModelOutputDir, modelPackageName, modelOutputDir);

		// 设置数据库方言
		gen.setDialect(new MysqlDialect());
		
		// 设置是否生成字段备注
		gen.setGenerateRemarks(true);
		
		// 添加不需要生成的表名
		for (String table : allTables) {
			gen.addExcludedTable(table.trim());
		}

		// 设置是否在 Model 中生成 dao 对象
		gen.setGenerateDaoInModel(false);
		
		// 设置是否生成字典文件
		gen.setGenerateDataDictionary(false);
		
		// 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
		// gernerator.setRemovedTableNamePrefixes("t_");
		
		// 生成
		gen.generate();
	}
}
