package OOPovningar;

public class User {

    private String userName, password;

    public User(String anv, String pwd) {
        userName = anv;
        password = pwd;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
