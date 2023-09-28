public class Q13ComputerAccount {
    // Properties/fields
    private String realName;
    private String userName;
    private String password;

    // Constructor to create a computer account
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    // Getter for realName
    public String getRealName() {
        return realName;
    }

    // Getter for userName
    public String getUserName() {
        return userName;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Method to print realName
    public void printRealName() {
        System.out.println("Real Name: " + realName);
    }

    // Method to print userName
    public void printUserName() {
        System.out.println("User Name: " + userName);
    }

    // Method to print password
    public void printPassword() {
        System.out.println("Password: " + password);
    }

    // Method to change password
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password changed successfully!");
    }
}