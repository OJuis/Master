package top.fiun;

public class Account {
    private String userName;
    private String email;
    private String passwordHash;

    public Account(String userName, String email, String password) throws HashException {
        this.userName = userName;
        this.email = email;
        this.passwordHash = Hash.getHashString(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String password) throws HashException {
        this.passwordHash = Hash.getHashString(password);
    }

}
