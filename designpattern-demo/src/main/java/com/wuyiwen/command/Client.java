package com.wuyiwen.command;

public class Client {
    public static void main(String[] args) {
        assemble();//客户端使用者调用不是上面所说的Client对象
    }

    public static void assemble() {//该函数就是上面所说的Client对象
        Receiver receiver = new Receiver(); //创建接收者
        Command command = new ConcreteCommand(receiver);//创建命令对象，设定它的接收者
        Invoker invoker = new Invoker(command);//创建请求者，把命令对象设置进去
        invoker.action();//执行方法
    }
}