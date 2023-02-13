package com.antaiib.custom.data.utils;

import cn.hutool.core.date.DateUtil;
import com.alibaba.druid.filter.FilterAdapter;
import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.proxy.jdbc.JdbcParameter;
import com.alibaba.druid.proxy.jdbc.StatementProxy;
import com.alibaba.druid.sql.SQLUtils;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
    用于SQL日志打印
    author: Timor
    date: 2020/7/12 0012
*/
@Slf4j
public class MyDruidFilter extends FilterAdapter {
    private boolean formatSQL = false;

    public MyDruidFilter() {
    }

    public MyDruidFilter(boolean formatSQL) {
        this.formatSQL = formatSQL;
    }

    @Override
    public void statement_close(FilterChain chain, StatementProxy statement) throws SQLException {
        super.statement_close(chain, statement);
        String sql = statement.getBatchSql();

        // 不输出无意义的内容
        if (sql.isEmpty()) {
            return;
        }

        int parametersSize = statement.getParametersSize();
        if (parametersSize > 0) {
            List<Object> parameters = new ArrayList<>(parametersSize);

            for (int i = 0; i < parametersSize; ++i) {
                JdbcParameter jdbcParam = statement.getParameter(i);
                parameters.add(jdbcParam != null ? jdbcParam.getValue() : null);
            }
            // 这里可以使用数据库类型常量
            String dbType = statement.getConnectionProxy().getDirectDataSource().getDbType();
            if (formatSQL) {
                sql = SQLUtils.format(sql, dbType, parameters, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION);
            }
        }

        // 打印sql
        printSQL(sql);
    }

    public void printSQL(String sql) {
        String sb = "\n"
                + "------------------------ SQL report " + DateUtil.now() + " ------------------------\n"
                + sql.trim()
                + "\n--------------------------------------------------------------------------------\n";
        System.out.println(sb);
    }
}