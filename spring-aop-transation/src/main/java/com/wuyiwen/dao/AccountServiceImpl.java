package com.wuyiwen.dao;

public class AccountServiceImpl implements IAccountService {
	//持久层对象
    private IAccountDao accountDao;
    //省略 set 和 get 方法


    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //转账的方法
    public void transfer(String sourceAccount, String targetAccount, Integer money) {
		//查询原始账户
        Account source = accountDao.findAccountByNum(sourceAccount);
        //查询目标账户
        Account target = accountDao.findAccountByNum(targetAccount);
        //原始账号减钱
        source.setMoney(source.getMoney()-money);
        //目标账号加钱
        target.setMoney(target.getMoney()+money);
        //更新原始账号
        accountDao.updateAccount(source);
        //更新目标账号
        accountDao.updateAccount(target);
        System.out.println("转账完毕");

    }
}
