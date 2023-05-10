package top.fiun;

public class GitAccount {
    private String name;
    private String email;

     public GitAccount(String name, String email) {
          this.name = name;
          this.email = email;
     }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
