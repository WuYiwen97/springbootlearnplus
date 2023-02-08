package com.wuyiwen.command;

public class Invoker {
    private Command command = null;//持有命令对象

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() { //行动方法
        command.execute();//命令调度者负责命令的调度工作
    }
}