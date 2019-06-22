package test.Demo;

import java.lang.reflect.InvocationTargetException;

public class Demo_01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
//
//        test01 t1 = new test01();
//        Class<? extends test01> t1Class = t1.getClass();
//        t1Class.getMethod("getFile").invoke(t1);
//
//        System.out.println("==================");

//        test01 test01 = new test01();
//
//        Class t2 = test01.class;
//
//        t2.getMethod("getFile").invoke(test01);

        System.out.println("=================");

        test01 t = new test01();

        Class.forName("test.Demo.test01").getMethod("getFile").invoke(t);


    }
}
