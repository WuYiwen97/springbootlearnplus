package com.antaiib.custom.commons.error;

import com.antaiib.commons.result.Result;

/**
 * @projectName： fsn-base-s
 * @packageName： com.antaiib.commons.result.error
 * @fileName： CustomError
 * @description： 自定义平台错误提示
 * @author： zhengrt
 * @date： 2020/2/11  17:07
 */
public class CustomError {
    public static final Result.Error CUSTOM_C0000 = new Result.Error("CUSTOM0000", "自定义数据表分类编码重复");
    public static final Result.Error CUSTOM_C0001 = new Result.Error("CUSTOM0001", "自定义数据表已存在");
    public static final Result.Error CUSTOM_C0002 = new Result.Error("CUSTOM0002", "自定义数据表编码重复");
    public static final Result.Error CUSTOM_C0003 = new Result.Error("CUSTOM0003", "自定义数据表字段已存在");
    public static final Result.Error CUSTOM_C0004 = new Result.Error("CUSTOM0004", "自定义数据表字段编码重复");
    public static final Result.Error CUSTOM_C0005 = new Result.Error("CUSTOM0005", "自定义数据表不存在");
    public static final Result.Error CUSTOM_C0006 = new Result.Error("CUSTOM0006", "新增失败");
    public static final Result.Error CUSTOM_C0007 = new Result.Error("CUSTOM0007", "更新失败");
    public static final Result.Error CUSTOM_C0008 = new Result.Error("CUSTOM0008", "删除失败");
    public static final Result.Error CUSTOM_C0009 = new Result.Error("CUSTOM0009", "sheet名称不符合规范");
    public static final Result.Error CUSTOM_C0010 = new Result.Error("CUSTOM0010", "数据表名称包含特殊符号");
    public static final Result.Error CUSTOM_C0011 = new Result.Error("CUSTOM0011", "数据表描述名称包含特殊符号");
    public static final Result.Error CUSTOM_C0012 = new Result.Error("CUSTOM0012", "数据表名称不能包含中文");
    public static final Result.Error CUSTOM_C0013 = new Result.Error("CUSTOM0013", "请新建数据表分类");
    public static final Result.Error CUSTOM_C0014 = new Result.Error("CUSTOM0014", "数据表名称为空");
    public static final Result.Error CUSTOM_C0015 = new Result.Error("CUSTOM0015", "数据表编码为空");
    public static final Result.Error CUSTOM_C0016 = new Result.Error("CUSTOM0016", "字段名称为空");
    public static final Result.Error CUSTOM_C0017 = new Result.Error("CUSTOM0017", "字段编码为空");
    public static final Result.Error CUSTOM_C0018 = new Result.Error("CUSTOM0018", "数据表分类不存在");
    public static final Result.Error CUSTOM_C0019 = new Result.Error("CUSTOM0019", "数据表导入失败，请联系管理员");
    public static final Result.Error CUSTOM_C0020 = new Result.Error("CUSTOM0020", "字段名称包含特殊符号");
    public static final Result.Error CUSTOM_C0021 = new Result.Error("CUSTOM0021", "字段描述名称包含特殊符号");
    public static final Result.Error CUSTOM_C0022 = new Result.Error("CUSTOM0022", "字段名称不能包含中文");
    public static final Result.Error CUSTOM_C0023 = new Result.Error("CUSTOM0023", "数据表已被使用，请解除绑定后再进行操作");
    public static final Result.Error CUSTOM_C0024 = new Result.Error("CUSTOM0024", "表单编码重复");
    public static final Result.Error CUSTOM_C0025 = new Result.Error("CUSTOM0025", "新增自定义数据库失败");
    public static final Result.Error CUSTOM_C0026 = new Result.Error("CUSTOM0026", "该分类下包含子分类，不可删除");
    public static final Result.Error CUSTOM_C0027 = new Result.Error("CUSTOM0027", "该分类下包含数据表，不可删除");
    public static final Result.Error CUSTOM_C0028 = new Result.Error("CUSTOM0028", "自定义SQL语句不存在");
    public static final Result.Error CUSTOM_C0029 = new Result.Error("CUSTOM0029", "自定义SQL语句有误，请检查");
    public static final Result.Error CUSTOM_C0030 = new Result.Error("CUSTOM0030", "导入模板填写有误，请按提示修改");
    public static final Result.Error CUSTOM_C0031 = new Result.Error("CUSTOM0031", "级联参数不合法");
    public static final Result.Error CUSTOM_C0032 = new Result.Error("CUSTOM0032", "数据字段名称不能为MYSQL关键字");
    public static final Result.Error CUSTOM_C0033 = new Result.Error("CUSTOM0033", "数据表名称不能为MYSQL关键字");
    public static final Result.Error CUSTOM_C0034 = new Result.Error("CUSTOM0034", "导入模板为空");
    public static final Result.Error CUSTOM_C0035 = new Result.Error("CUSTOM0035", "名称字段不存在");
    public static final Result.Error CUSTOM_C0036 = new Result.Error("CUSTOM0036", "值字段不存在");
    public static final Result.Error CUSTOM_C0037 = new Result.Error("CUSTOM0037", "自定义数据表字段有误，请检查");
    public static final Result.Error CUSTOM_C0038 = new Result.Error("CUSTOM0038", "没有权限修改数据表字段");
    public static final Result.Error CUSTOM_C0039 = new Result.Error("CUSTOM0039", "非法检索参数");
    public static final Result.Error CUSTOM_C0040 = new Result.Error("CUSTOM0040", "只能存在一个主表");
    public static final Result.Error CUSTOM_C0041 = new Result.Error("CUSTOM0041", "自定义数据从表%s与主表%s非关联关系");
    public static final Result.Error CUSTOM_C0042 = new Result.Error("CUSTOM0042", "自定义数据主表%s不存在关联关系");
    public static final Result.Error CUSTOM_C0043 = new Result.Error("CUSTOM0043", "操作失败，入参不合法");
    public static final Result.Error CUSTOM_C0044 = new Result.Error("CUSTOM0044", "非法时间段类型");
    public static final Result.Error CUSTOM_C0045 = new Result.Error("CUSTOM0045", "不存在的时间段类型");
    public static final Result.Error CUSTOM_C0046 = new Result.Error("CUSTOM0046", "非法时间类型");
    public static final Result.Error CUSTOM_C0047 = new Result.Error("CUSTOM0047", "表单分类编码重复");
    public static final Result.Error CUSTOM_C0048 = new Result.Error("CUSTOM0048", "该分类下包含表单，不可删除");
    public static final Result.Error CUSTOM_C0049 = new Result.Error("CUSTOM0049", "该分类不存在，请检查");
    public static final Result.Error CUSTOM_C0050 = new Result.Error("CUSTOM0050", "该表单不存在，请检查");
    public static final Result.Error CUSTOM_C0051 = new Result.Error("CUSTOM0051", "该表单已生成数据，无法删除");
    public static final Result.Error CUSTOM_C0052 = new Result.Error("CUSTOM0052", "自定义数据表[%s]不存在");
    public static final Result.Error CUSTOM_C0053 = new Result.Error("CUSTOM0053", "表单信息有误，请联系管理员");
    public static final Result.Error CUSTOM_C0054 = new Result.Error("CUSTOM0054", "删除失败，要删除的节点下含有子级节点且未勾选删除");
    public static final Result.Error CUSTOM_C0055 = new Result.Error("CUSTOM0055", "该表结构非树形结构自定义表，请使用二维表数据源接口");
    public static final Result.Error CUSTOM_C0056 = new Result.Error("CUSTOM0056", "查询不到当前父节点，请检查");
    public static final Result.Error CUSTOM_C0057 = new Result.Error("CUSTOM0057", "编码重复，请更换");
    public static final Result.Error CUSTOM_C0058 = new Result.Error("CUSTOM0058", "编码不能为空、0或-1，请更换");
    public static final Result.Error CUSTOM_C0059 = new Result.Error("CUSTOM0059", "删除失败，数据出现异常，请联系管理员");
    public static final Result.Error CUSTOM_C0060 = new Result.Error("CUSTOM0060", "关联字段值不能为空");
    public static final Result.Error CUSTOM_C0061 = new Result.Error("CUSTOM0061", "表单已被使用，无法修改表单结构");
    public static final Result.Error CUSTOM_C0062 = new Result.Error("CUSTOM0062", "表单名称或表单编码长度过长，请修改");
    public static final Result.Error CUSTOM_C0063 = new Result.Error("CUSTOM0063", "导入失败，没有找到[%s]sheet对应的数据表");
    public static final Result.Error CUSTOM_C0064 = new Result.Error("CUSTOM0064", "导入失败，请联系管理员配置扩展类别属性后再行导入");
    public static final Result.Error CUSTOM_C0065 = new Result.Error("CUSTOM0065", "查询扩展类别配置出错，请刷新页面或者联系管理员");
    public static final Result.Error CUSTOM_C0066 = new Result.Error("CUSTOM0066", "数据查询失败，请刷新页面或者联系管理员");
    public static final Result.Error CUSTOM_C0067 = new Result.Error("CUSTOM0067", "无法找到扩展类别");
    public static final Result.Error CUSTOM_C0068 = new Result.Error("CUSTOM0068", "树节点删除失败,存在关联基础信息");
    public static final Result.Error CUSTOM_C0069 = new Result.Error("CUSTOM0069", "删除失败,拓展表从表存在数据");
    public static final Result.Error CUSTOM_C0070 = new Result.Error("CUSTOM0070", "删除失败，需要删除数据不存在");
    public static final Result.Error CUSTOM_C0071 = new Result.Error("CUSTOM0071", "未在场景配置中查询到分类表名");
    public static final Result.Error CUSTOM_C0072 = new Result.Error("CUSTOM0072", "该分类下包含节点数据，不可删除");
    public static final Result.Error CUSTOM_C0073 = new Result.Error("CUSTOM0073", "导入错误详情表上传至dfs失败，请联系管理员");
    public static final Result.Error CUSTOM_C0074 = new Result.Error("CUSTOM0074", "基础类别不可为空");
    public static final Result.Error CUSTOM_C0075 = new Result.Error("CUSTOM0075", "类别编码不可为空");
    public static final Result.Error CUSTOM_C0076 = new Result.Error("CUSTOM0076", "操作失败，[%s]表数据入参不合法");
    public static final Result.Error CUSTOM_C0077 = new Result.Error("CUSTOM0077", "无法查到多对多关联表中的[%s]字段信息");
    public static final Result.Error CUSTOM_C0078 = new Result.Error("CUSTOM0078", "该扩展类别下存在数据，无法删除");
    public static final Result.Error CUSTOM_C0079 = new Result.Error("CUSTOM0079", "该分类下无相关数据");
    public static final Result.Error CUSTOM_C0080 = new Result.Error("CUSTOM0080", "场景信息查询有误");
    public static final Result.Error CUSTOM_C0081 = new Result.Error("CUSTOM0081", "数据表存在唯一索引，无法使用逻辑删除");
    public static final Result.Error CUSTOM_C0082 = new Result.Error("CUSTOM0082", "数据表存在逻辑删除数据，无法关闭逻辑删除");
    public static final Result.Error CUSTOM_C0083 = new Result.Error("CUSTOM0083", "数据表[%s]字段[%s]的默认值无需填写（文本类型无法设置默认值）");
    public static final Result.Error CUSTOM_C0088 = new Result.Error("CUSTOM0088", "表中默认字段不能设置成逻辑删除字段");
    public static final Result.Error CUSTOM_C0090 = new Result.Error("CUSTOM0090", "表单名称或表单编码为空，请填写");
    public static final Result.Error CUSTOM_C0091 = new Result.Error("CUSTOM0091", "表单未绑定数据表字段，请绑定");
    public static final Result.Error CUSTOM_C0092 = new Result.Error("CUSTOM0092", "请选择表单所属分类");
    public static final Result.Error CUSTOM_C0093 = new Result.Error("CUSTOM0093", "选择已有 不能添加当前已有类别");
    public static final Result.Error CUSTOM_C0094 = new Result.Error("CUSTOM0094", "类别编码或名称重复，应为全场景下唯一，请更换");
    public static final Result.Error CUSTOM_C0095 = new Result.Error("CUSTOM0095", "自动编码获取错误：[%s]");
    public static final Result.Error CUSTOM_C0096 = new Result.Error("CUSTOMC0096", "数据表编码只能包含数字、字母、下划线");
    public static final Result.Error CUSTOM_C0097 = new Result.Error("CUSTOMC0097", "数据表描述名称为空");
    public static final Result.Error CUSTOM_C0098 = new Result.Error("CUSTOMC0098", "数据表名只能包含英文小写字母、数字或下划线");
    public static final Result.Error CUSTOM_C0099 = new Result.Error("CUSTOMC0099", "数据表[%s]字段[%s]字段名只能包含英文小写字母、数字或下划线");
    public static final Result.Error CUSTOM_C0100 = new Result.Error("CUSTOMC0100", "计算公式可能存在死循环，请检查计算公式设置");
    public static final Result.Error CUSTOM_C0101 = new Result.Error("CUSTOMC0101", "解析失败,excel文件模板中存在未知字段");
    public static final Result.Error CUSTOM_C0102 = new Result.Error("CUSTOMC0102", "解析失败,excel文件模板不正确，缺少必填字段");
    public static final Result.Error CUSTOM_C0103 = new Result.Error("CUSTOMC0103", "数据表名[%s]与慧核表名重复，请更换");
    public static final Result.Error CUSTOM_C0104 = new Result.Error("CUSTOMC0104", "数据表中存在数据，不可删除");
    public static final Result.Error CUSTOM_C0105 = new Result.Error("CUSTOMC0105", "查询不到该关联配置，请检查");
    public static final Result.Error CUSTOM_C0106 = new Result.Error("CUSTOMC0106", "已存在相同表的关联配置，请检查");
    public static final Result.Error CUSTOM_C0107 = new Result.Error("CUSTOMC0107", "主表关联字段与从表关联字段不能相同，请检查");
    public static final Result.Error CUSTOM_C0108 = new Result.Error("CUSTOMC0108", "字段显示方式为自动编号必须设置显示方式");
    public static final Result.Error CUSTOM_C0109 = new Result.Error("CUSTOMC0109", "自动编号设置显示方式失败");
    public static final Result.Error CUSTOM_C0110 = new Result.Error("CUSTOMC0110", "字段设置显示方式失败");
    public static final Result.Error CUSTOM_C0111 = new Result.Error("CUSTOMC0111", "场景不存在");
    public static final Result.Error CUSTOM_C0112 = new Result.Error("CUSTOMC0112", "预设字段不允许删除");
    public static final Result.Error CUSTOM_C0113 = new Result.Error("CUSTOMC0113", "预设字段不允许修改");
    public static final Result.Error CUSTOM_C0114 = new Result.Error("CUSTOMC0114", "一张表只能添加一个编码类型字段");
    public static final Result.Error CUSTOM_C0115 = new Result.Error("CUSTOMC0115", "关联编码与关联字段不能相同，请检查");
    public static final Result.Error CUSTOM_C0116 = new Result.Error("CUSTOMC0116", "导入树形数据表需有且仅有一个字段标识为编码字段类型的字段");
    public static final Result.Error CUSTOM_C0117 = new Result.Error("CUSTOMC0117", "已存在相同表的索引配置，请检查");
    public static final Result.Error CUSTOM_C0118 = new Result.Error("CUSTOMC0118", "数据表[%s]中存在重复的字段描述名称");
    public static final Result.Error CUSTOM_C0119 = new Result.Error("CUSTOMC0119", "数据表[%s]字段[%s]长度只能为正整数");
    public static final Result.Error CUSTOM_C0120 = new Result.Error("CUSTOM0120", "数据表[%s]字段[%s]类型不能为空");
    public static final Result.Error CUSTOM_C0121 = new Result.Error("CUSTOM0121", "数据表[%s]字段[%s]显示方式不能为空");
    public static final Result.Error CUSTOM_C0122 = new Result.Error("CUSTOM0122", "数据表[%s]字段[%s]小数位数只能为正整数");
    public static final Result.Error CUSTOM_C0123 = new Result.Error("CUSTOM0123", "表单字段不可同时配置计算公式与关联对象，请检查");
    public static final Result.Error CUSTOM_C0124 = new Result.Error("CUSTOM0124", "数据表[%s]数据表类型不能为空");
    public static final Result.Error CUSTOM_C0125 = new Result.Error("CUSTOM0125", "数据表[%s]数据表类型错误");
    public static final Result.Error CUSTOM_C0126 = new Result.Error("CUSTOM0126", "数据表[%s]编码字段[%s]的显示方式仅允许设置为单行文本和自动编号");
    public static final Result.Error CUSTOM_C0127 = new Result.Error("CUSTOM0127", "数据表[%s]字段[%s]的字段标识未填写或填写不正确");
    public static final Result.Error CUSTOM_C0128 = new Result.Error("CUSTOM0128", "数据表[%s]字段[%s]的描述名称为空");
    public static final Result.Error CUSTOM_C0129 = new Result.Error("CUSTOM0129", "excel中存在重复的数据表名称[%s]");
    public static final Result.Error CUSTOM_C0130 = new Result.Error("CUSTOM0130", "excel中存在重复的数据表编码[%s]");
    public static final Result.Error CUSTOM_C0131 = new Result.Error("CUSTOM0131", "excel中存在重复的数据表描述名称[%s]");
    public static final Result.Error CUSTOM_C0132 = new Result.Error("CUSTOM0132", "数据表[%s]的所属分类未填写或填写不正确");
    public static final Result.Error CUSTOM_C0133 = new Result.Error("CUSTOM0133", "数据表中存在表关联配置，不可删除，如需删除请先删除表关联配置");
    public static final Result.Error CUSTOM_C0134 = new Result.Error("CUSTOM0134", "数据表[%s]字段[%s]的字段长度未填写或填写错误，长度为[%s]");
    public static final Result.Error CUSTOM_C0135 = new Result.Error("CUSTOM0135", "数据表[%s]字段[%s]的小数位数未填写或填写错误，位数为[%s]");
    public static final Result.Error CUSTOM_C0136 = new Result.Error("CUSTOM0136", "数据表[%s]字段[%s]的小数位数无需填写");
    public static final Result.Error CUSTOM_C0137 = new Result.Error("CUSTOM0137", "数据表[%s]字段[%s]的字段长度和小数位数无需填写");
    public static final Result.Error CUSTOM_C0138 = new Result.Error("CUSTOM0138", "存在字段未选择需要关联的字段与关联数据，请检查");
    public static final Result.Error CUSTOM_C0139 = new Result.Error("CUSTOM0139", "数据表[%s]的编码字段设置了自动编号，暂不支持导入");
    public static final Result.Error CUSTOM_C0140 = new Result.Error("CUSTOM0140", "编码[%s]与其父节点编码相同，请检查！");
    public static final Result.Error CUSTOM_C0141 = new Result.Error("CUSTOM0141", "未找到父节点编码[%s]对应编码的数据，请检查！");
    public static final Result.Error CUSTOM_C0142 = new Result.Error("CUSTOM0142", "无法查到[%s]表中的编码字段信息");
    public static final Result.Error CUSTOM_C0143 = new Result.Error("CUSTOM0143", "数据表[%s]字段[%s]编码只能包含数字、字母、下划线");
    public static final Result.Error CUSTOM_C0144 = new Result.Error("CUSTOM0144", "数据表[%s]编码字段[%s]的类型仅允许设置为字符型");
    public static final Result.Error CUSTOM_C0145 = new Result.Error("CUSTOM0145", "数据表[%s]字段[%s]的显示方式只能选择单行文本、开关、滑块、评价、单选、下拉框");
    public static final Result.Error CUSTOM_C0146 = new Result.Error("CUSTOM0146", "数据表[%s]字段[%s]的显示方式只能选择单行文本、单选、下拉框");
    public static final Result.Error CUSTOM_C0147 = new Result.Error("CUSTOM0147", "数据表[%s]字段[%s]的显示方式不能选择开关、滑块、评价、关联流程");
    public static final Result.Error CUSTOM_C0148 = new Result.Error("CUSTOM0148", "数据表[%s]字段[%s]的显示方式不能选择开关、滑块、评价");
    public static final Result.Error CUSTOM_C0149 = new Result.Error("CUSTOM0149", "数据表[%s]字段[%s]的显示方式只能选择时间");
    public static final Result.Error CUSTOM_C0150 = new Result.Error("CUSTOM0150", "编码为[%s]的数据设置了最后一层，与其填写的扩展类别[%s]不符，请填写最后一层所配置的扩展类别编码");
    public static final Result.Error CUSTOM_C0151 = new Result.Error("CUSTOM0151", "扩展类别[%s]必须是第[%s]层节点，而编码[%s]的数据填写的是第[%s]层节点，请检查。");
    public static final Result.Error CUSTOM_C0152 = new Result.Error("CUSTOM0152", "字段[%s]不存在，请检查。");
    public static final Result.Error CUSTOM_C0153 = new Result.Error("CUSTOM0153", "编码[%s]的数据的父节点设置了最后一层，最后一层级下不可再新增数据，请检查。");
    public static final Result.Error CUSTOM_C0154 = new Result.Error("CUSTOM0154", "编码[%s]的数据的扩展类别[%s]仅最后一层级可填写，请检查。");

    public static final Result.Error CUSTOM_C0155 = new Result.Error("CUSTOM0155", "批量更新，参数集合字段应保持一致，请检查。");
    public static final Result.Error CUSTOM_C0156 = new Result.Error("CUSTOM0156", "编码[ %s ]重复，请更换");
    public static final Result.Error CUSTOM_C0157 = new Result.Error("CUSTOM0157", "自定义SQL语句[%s]有误，请检查");
    public static final Result.Error CUSTOM_C0158 = new Result.Error("CUSTOM0158", "自定义SQL语句[%s]不存在");
    public static final Result.Error CUSTOM_C0159 = new Result.Error("CUSTOM0159", "操作太快了，请稍后重试");
    public static final Result.Error CUSTOM_C0160 = new Result.Error("CUSTOM0160", "字典管理只能使用字符型和文本型，[%s]类型不匹配，请重新选择");

    public static final Result.Error CUSTOM_C0161 = new Result.Error("CUSTOM0161", "表单分类新增时，所属模块及业务分类必须和父节点保持一致（一级子节点除外）");
    public static final Result.Error CUSTOM_C0162 = new Result.Error("CUSTOM0162", "表单分类不存在");
    public static final Result.Error CUSTOM_C0163 = new Result.Error("CUSTOM0163", "新增表单时，表单、表单分类和表单使用数据表需属于同一模块的同一业务分类下");
    public static final Result.Error CUSTOM_C0164 = new Result.Error("CUSTOM0164", "业务模块下查无此业务分类");
    public static final Result.Error CUSTOM_C0165 = new Result.Error("CUSTOM0165", "业务模块不存在");
    public static final Result.Error CUSTOM_C0166 = new Result.Error("CUSTOM0166", "业务模块已禁用，无法该在模块下新增数据");

    public static final Result.Error CUSTOM_C0167 = new Result.Error("CUSTOM0167", "错误的数据源配置，请联系管理员");
    public static final Result.Error CUSTOM_C0168 = new Result.Error("CUSTOM0168", "数据表[%s]信息有误，请联系管理员");
    public static final Result.Error CUSTOM_C0169 = new Result.Error("CUSTOM0169", "[%s]字典分类下无数据，请重新选择");
    public static final Result.Error CUSTOM_C0170 = new Result.Error("CUSTOM0170", "数据表导入格式有误，请联系管理员");
    public static final Result.Error CUSTOM_C0171 = new Result.Error("CUSTOM0171", "智圭不支持导入系统级表，请在基础平台导入");
    public static final Result.Error CUSTOM_C0172 = new Result.Error("CUSTOM0172", "流程使用系统级表[%s]，请在基础平台导入表");
    public static final Result.Error CUSTOM_C0173 = new Result.Error("CUSTOM0173", "表单编码[%s]已存在");
    public static final Result.Error CUSTOM_C0174 = new Result.Error("CUSTOM0174", "已存在相同数据表[%s]且与导入表不同，无法导入流程或表单");
    public static final Result.Error CUSTOM_C0175 = new Result.Error("CUSTOM0175", "无法导入数据表[%s]，请检测是否存在关联关系");
    public static final Result.Error CUSTOM_C0176 = new Result.Error("CUSTOM0176", "无法导入数据表[%s]，请检测是否已存在");
    public static final Result.Error CUSTOM_C0177 = new Result.Error("CUSTOM0177", "该字段数据最大值超过修改的字段长度，不允许修改");
    public static final Result.Error CUSTOM_C0178 = new Result.Error("CUSTOM0178", "数据表字符字段总长度过长，请确认各字符字段实际使用大小，过长的字段请改为文本型！");
    public static final Result.Error CUSTOM_C0179 = new Result.Error("CUSTOM0179", "字段[%s]的类型为空，请联系管理员");
    public static final Result.Error CUSTOM_C0180 = new Result.Error("CUSTOM0180", "未查询到该表信息，请刷新页面后重试！");
    public static final Result.Error CUSTOM_C0181 = new Result.Error("CUSTOM0181", "主表的关联字段[%s（%s）]未填写，请联系管理员设置必填或自动编号!");
    public static final Result.Error CUSTOM_C0182 = new Result.Error("CUSTOM0182", "表[%s]和主表的关联关系为一对一，最多仅能新增一条数据!");
    public static final Result.Error CUSTOM_C0183 = new Result.Error("CUSTOM0183", "保存失败，仅显示方式为『单行文本』的字段才可设置为从表关联字段！");
    public static final Result.Error CUSTOM_C0184 = new Result.Error("CUSTOM0184", "保存失败，字段[%s]为从表关联字段，显示方式仅可设置为『单行文本』！");
    public static final Result.Error CUSTOM_C0185 = new Result.Error("CUSTOM0185", "[%s]字段为动态权限字段，无法修改或删除");
    public static final Result.Error CUSTOM_C0186 = new Result.Error("CUSTOM0186", "动态权限字段显示方式必须为“人员选择”，且选择类型须为“用户选择”，请检查后重试");

    public static final Result.Error CUSTOM_C0190 = new Result.Error("CUSTOM0190", "字段[%s]为必填项，请填写！");
    public static final Result.Error CUSTOM_C0191 = new Result.Error("CUSTOM0191", "字段%s数据重复，请重新填写！");
    public static final Result.Error CUSTOM_C0192 = new Result.Error("CUSTOM0192", "此系统表不支持创建该类型表单");
    public static final Result.Error CUSTOM_C0193 = new Result.Error("CUSTOM0193", "表单未选择必选字段，请选择!");
    public static final Result.Error CUSTOM_C0194 = new Result.Error("CUSTOM0194", "表单模板不可以被删除");
    public static final Result.Error CUSTOM_C0195 = new Result.Error("CUSTOM0195", "索引编码重复！");
    public static final Result.Error CUSTOM_C0196 = new Result.Error("CUSTOM0196", "字段[ %s ]在表关联中被使用，请先解除关联后再行删除。%s");
    public static final Result.Error CUSTOM_C0197 = new Result.Error("CUSTOM0197", "字段[ %s ]删除失败，原因：%s");
    public static final Result.Error CUSTOM_C0198 = new Result.Error("CUSTOM0198", "内部调用入参不合法！");


    public static final Result.Error CUSTOM_C0199 = new Result.Error("CUSTOM0199", "数据表不存在或当前表单不能切换数据表");
    public static final Result.Error CUSTOM_C0200 = new Result.Error("CUSTOM0200", "内置表单模板不支持修改");
    public static final Result.Error CUSTOM_C0201 = new Result.Error("CUSTOM0201", "数据表不存在或表单模板不能复制");
    public static final Result.Error CUSTOM_C0202 = new Result.Error("CUSTOM0202", "内置表单模板不支持此操作");

    public static final Result.Error CUSTOM_C0203 = new Result.Error("CUSTOM0203", "不可操作通用数据！");
    public static final Result.Error CUSTOM_C0204 = new Result.Error("CUSTOM0204", "[%s]表中不存在编码字段，无法开启动态属性！");
    public static final Result.Error CUSTOM_C0205 = new Result.Error("CUSTOM0205", "[%s]表已存在且有字段冲突，无法开启动态属性！");
    public static final Result.Error CUSTOM_C0206 = new Result.Error("CUSTOM0206", "所有开启动态属性表的编码需保证唯一，编码 [%s] 在 [%s] 表中已存在，请检查！");
    public static final Result.Error CUSTOM_C0207 = new Result.Error("CUSTOM0207", "开启动态属性的表的编码位数需在15位以内，请检查！");
    public static final Result.Error CUSTOM_C0208 = new Result.Error("CUSTOM0208", "编码仅可包含数字、字母、下划线和减号，请检查！");
    public static final Result.Error CUSTOM_C0209 = new Result.Error("CUSTOM0209", "动态属性流水号不可为空，且必须是7位以内的数字或字母");
    public static final Result.Error CUSTOM_C0210 = new Result.Error("CUSTOM0210", "动态属性流水号[%s]重复");
    public static final Result.Error CUSTOM_C0211 = new Result.Error("CUSTOM0211", "关闭动态属性前需先在【表关联设置】中解除与动态属性表的关联关系");
    public static final Result.Error CUSTOM_C0212 = new Result.Error("CUSTOM0212", "请选择动态属性的测点类型！");
    public static final Result.Error CUSTOM_C0213 = new Result.Error("CUSTOM0213", "请选择动态属性的派生类型！");
    public static final Result.Error CUSTOM_C0214 = new Result.Error("CUSTOM0214", "请填写动态属性的属性名称！");
    public static final Result.Error CUSTOM_C0215 = new Result.Error("CUSTOM0215", "保存失败！主表[%s]开启了动态属性，但缺少相关入参。");
    public static final Result.Error CUSTOM_C0216 = new Result.Error("CUSTOM0216", "开启动态属性后不支持修改自动编号设置");
    public static final Result.Error CUSTOM_C0217 = new Result.Error("CUSTOM0217", "[%s]表开启了动态属性但未配置相应的关联关系！");
    public static final Result.Error CUSTOM_C0218 = new Result.Error("CUSTOM0218", "参数的个数不一致！");
    public static final Result.Error CUSTOM_C0219 = new Result.Error("CUSTOM0219", "每组参数的个数不能大于10！");
    public static final Result.Error CUSTOM_C0220 = new Result.Error("CUSTOM0220", "测点位号 %s 已自动生成，不可再手动绑定！");
    public static final Result.Error CUSTOM_C0221 = new Result.Error("CUSTOM0221", "自定义平台开启失败！");
    public static final Result.Error CUSTOM_C0222 = new Result.Error("CUSTOM0222", "测点 %s 为自动生成，不可解绑！");
    public static final Result.Error CUSTOM_C0223 = new Result.Error("CUSTOM0223", "识别码-测点类型[%s]填写不合法，请参照【A-1O,0-1AM】等格式填写");
    public static final Result.Error CUSTOM_C0224 = new Result.Error("CUSTOM0224", "[%s]中存在多张[%s]，请检查！");
    public static final Result.Error CUSTOM_C0225 = new Result.Error("CUSTOM0225", "仅模拟量测点可选择派生类型，其他类型测点请选择”无“！");
    public static final Result.Error CUSTOM_C0226 = new Result.Error("CUSTOM0226", "请选择动态属性的识别码！");



    public static final Result.Error CUSTOM_C0300 = new Result.Error("CUSTOM0300", "发布失败，请稍后重试");
    public static final Result.Error CUSTOM_C0301 = new Result.Error("CUSTOM0301", "连接ftp服务器失败");
    public static final Result.Error CUSTOM_C0302 = new Result.Error("CUSTOM0302", "ftp操作异常: [%s]");
    public static final Result.Error CUSTOM_C0303 = new Result.Error("CUSTOM0303", "表单不存在，请先保存表单");

    public static Result.Error getCustomError(Result.Error error, Object... pb) {
        return new Result.Error(error.getCode(), String.format(error.getMsg(), pb));
    }
}
