public class Q16FractionTest {
    public static void main(String[] args) {
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);

        System.out.println("f1.toString(): " + f1.toString()); // Should print "1/2"
        System.out.println("f2.getProduct(f1): " + f2.getProduct(f1)); // Should print "3/14"
        System.out.println("f2.getSum(f1): " + f2.getSum(f1)); // Should print "13/14"
    }
}
