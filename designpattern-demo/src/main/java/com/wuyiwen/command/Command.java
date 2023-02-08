package com.wuyiwen.command;

public interface Command {//命令接口定义，所有的命令对象均需要实现该接口
    void execute();  // 执行方法
}