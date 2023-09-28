public class Q15Weight {
    private double pounds;

    // Constructor to initialize the weight in pounds
    public Q15Weight(double p) {
        pounds = p;
    }

    // Method to get the weight in pounds
    public double getPounds() {
        return pounds;
    }

    // Method to convert and get the weight in kilograms
    public double getKilograms() {
        return pounds * 0.45359237;
    }
}