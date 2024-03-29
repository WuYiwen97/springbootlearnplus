package v;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Demo {

    public static void main(String[] args) {
        /**
         * new一个子类对象
         * 我们知道，子类对象实例化时，会隐式调用父类的无参构造
         * 所以Father里的System.out.println()会执行
         * 猜猜打印的内容是什么？
         */
        Son son = new Son();
        Father father = son;
        father.fun();

        Daughter daughter = new Daughter();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    }

}

class Father{
    /**
     * 父类构造器
     */
    public Father(){
        // 打印当前对象所属Class的名字
        System.out.println(this.getClass().getName());
    }

    public void fun(){}
}

class Son extends Father {
    public void fun1(){}
}

class Daughter extends Father {
    public void fun2(){}
}