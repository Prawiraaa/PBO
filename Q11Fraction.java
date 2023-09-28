public class Q11Fraction {
    private int numerator;   // numerator of the fraction
    private int denominator; // denominator of the fraction

    // Constructor to initialize the fraction
    public Q11Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to compute the sum of two fractions
    public Q11Fraction add(Q11Fraction other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Q11Fraction(newNumerator, newDenominator);
    }

    // Method to compute the product of two fractions
    public Q11Fraction multiply(Q11Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Q11Fraction(newNumerator, newDenominator);
    }

    // Method to simplify the fraction
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Method to compute the greatest common divisor (GCD) using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to display the fraction as a string
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        // Test your class here
        Q11Fraction fraction1 = new Q11Fraction(1, 2);
        Q11Fraction fraction2 = new Q11Fraction(1, 3);

        // Compute the sum of fractions
        Q11Fraction sumResult = fraction1.add(fraction2);
        System.out.println("Sum: " + sumResult);

        // Compute the product of fractions
        Q11Fraction productResult = fraction1.multiply(fraction2);
        System.out.println("Product: " + productResult);
    }
}