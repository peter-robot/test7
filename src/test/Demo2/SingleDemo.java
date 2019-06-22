package test.Demo2;

public class SingleDemo {

    private static SingleDemo demo=  new SingleDemo();

    private SingleDemo() {
        System.out.println("单例饿汉模式...");
    }

    public  static SingleDemo getDemo(){

        return demo;
    }
}
