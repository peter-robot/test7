package test.Design;

import org.junit.Test;
import test.Design.Imp.Decorate;
import test.Design.Imp.UserImp;
import test.Design.Servlet.User;
import test.Proxy.Myhanler;

import java.lang.reflect.Proxy;


public class TestDesign {

    //装饰器模式一
    @Test
    public void test(){
        UserImp userImp = new UserImp();

        Decorate decorate = new Decorate(userImp);
        decorate.addUser(new Load());

    }
    //装饰器模式二
    @Test
    public void test2(){
        UserImp userImp = new UserImp();
        Decorate decorate = new Decorate(userImp);

        decorate.findOne(new Load());
    }

    //动态代理模式一
    @Test
    public void test3(){
        //准备三个参数
        ClassLoader Loader = TestDesign.class.getClassLoader();
        Class[] interfaces = {User.class};
        User user = new UserImp();
        Myhanler myhanler =new Myhanler(user);

        User u = (User)Proxy.newProxyInstance(Loader, interfaces, myhanler);

        u.addUser(new Load());
        System.out.println("===============");
        u.findOne(new Load());
        System.out.println("===============");
        u.updateUser(new Load());

    }

}
