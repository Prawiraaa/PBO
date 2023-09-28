public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        // Create a computer account
        Q13ComputerAccount computerAccount = new Q13ComputerAccount("Prawira", "Truklrd", "oldPassword");

        // Print the initial account details
        System.out.println("Initial Account Details:");
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();

        // Change the password
        computerAccount.changePassword("291003");

        // Print the updated password
        System.out.println("Updated Password:");
        computerAccount.printPassword();
    }
}
