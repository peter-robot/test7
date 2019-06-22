package test.Demo2;

public class User {
    private String username;
    private int Uid;

    public User(String username, int uid) {
        this.username = username;
        Uid = uid;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }


    public void Demo_method(){
        System.out.println("Method1 执行了..");
    }

    public void Demo_method2(String name,int Uid){
        System.out.println("Method2 执行了..."+name+"Uid is"+Uid);
    }
}
