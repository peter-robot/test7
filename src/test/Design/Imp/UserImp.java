package test.Design.Imp;

import test.Design.Load;
import test.Design.Servlet.User;

public class UserImp  implements User{

    @Override
    public void addUser(Load load) {
        System.out.println("Run addUser Method ...");
    }

    @Override
    public void updateUser(Load load) {
        System.out.println("Run updateUser Method ...");

    }

    @Override
    public void findOne(Load load) {
        System.out.println("Run findOne Method ...");

    }
}
