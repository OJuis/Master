package top.fiun;

public enum UserStatus {
    Manager,
    Developer,
    Censer,
    Deployer,
    Operator;

    public static boolean verify(UserStatus standardStatus,UserStatus targetStatus) {
        return standardStatus == targetStatus;
    }
}
