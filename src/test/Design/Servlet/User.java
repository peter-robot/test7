package test.Design.Servlet;

import test.Design.Load;

public interface User {
    public void addUser(Load load);

    public void updateUser(Load load);

    public void findOne(Load load);
}
