package top.fiun;

public class User {
    private Account account;
    private UserStatus userStatus;

    public User(Account account,UserStatus userStatus) {
        this.account = account;
        this.userStatus = userStatus;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
