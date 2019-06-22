package test.Design.Imp;

import test.Design.Load;
import test.Design.Servlet.User;

public class Decorate implements User{
    //1.引入被装饰类
    private User user=null;

    //利用构造器加载装饰器
    public  Decorate(User send){
        this.user=send;
    }


    //赋写被装饰类的所有方法
    @Override
    public void addUser(Load l) {
        System.out.println("Decorate Model addUser run ...");
        user.addUser(l);
    }

    @Override
    public void updateUser(Load l) {
        System.out.println("Decorate Model updateUser run ...");
        user.updateUser(l);
    }

    @Override
    public void findOne(Load l) {
        System.out.println("Decorate Model findOne run ...");
        user.findOne(l);
    }
}
