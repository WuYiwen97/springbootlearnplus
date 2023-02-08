package com.wuyiwen.command;

public class ConcreteCommand implements Command {
    private Receiver receiver = null;//持有相应的接收者对象

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;  //构造方法中需要设置接收者
    }

    public void execute() {
        receiver.action(); //通常会转调接收者对象的相应方法，让接收者来真正执行功能
    }
}