public class Q15WeightTest {
    public static void main(String[] args) {
        // Test your class: Q15Weight in here
        Q15Weight weightInPounds = new Q15Weight(10.0); // Creating a weight object with 10 pounds
        double pounds = weightInPounds.getPounds(); // Get weight in pounds
        double kilograms = weightInPounds.getKilograms(); // Get weight in kilograms

        System.out.println("Weight in pounds: " + pounds);
        System.out.println("Weight in kilograms: " + kilograms);
    }
}