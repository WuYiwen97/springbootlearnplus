package com.wuyiwen.dao;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
	//数据库查询工具类
    private QueryRunner runner;
	//数据库连接工具类
    private ConnectionUtils connectionUtils;
    //省略 get 和 set 的方法


    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    //修改账号的方法
    public void updateAccount(Account account) {
        try{
            runner.update(connectionUtils.getThreadConnection(),
                          "update account set accountNum=?,money=? where id=?",account.getAccountNum(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	//根据账号查询 Account 对象的方法
    public Account findAccountByNum(String accountNum) {
        try{
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(),
                                                  "select * from account where accountNum = ? ",new BeanListHandler<Account>(Account.class),accountNum);
            if(accounts == null || accounts.size() == 0){
                return null;
            }
            if(accounts.size() > 1){
                throw new RuntimeException("结果集不唯一，数据有问题");
            }
            return accounts.get(0);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
