package test.Proxy;

import test.Design.Servlet.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Myhanler implements InvocationHandler{
    //引入被增强的类
    private User user;
    public Myhanler(User u){
        this.user=u;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().contains("addUser")||method.getName().contains("updateUser")){

            System.out.println("Proxy is Runing ....");

        }

        return method.invoke(user,args);
    }
}
