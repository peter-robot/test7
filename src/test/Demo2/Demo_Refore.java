package test.Demo2;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo_Refore {


    @Test
    public void test() throws Exception {

//        Class<User> userClass = (Class<User>) Class.forName("test.Demo2.User");
//        User user = userClass.newInstance();
//        userClass.getMethod("Demo_method").invoke(user);

        System.out.println("===============");

        Class<User> userClass = (Class<User>) Class.forName("test.Demo2.User");
        User user = userClass.newInstance();

        Method m2 = userClass.getMethod("Demo_method2", String.class, int.class);

        m2.invoke(user,"Hello",111);



    }
}
