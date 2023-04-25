package edu.guilford;

/**
 * Hello world!
 *
 */
public class driver 
{
    public static void main( String[] args )
    {
        // constructor that takes no arguments and sets the numerator to 0 and the denominator to 1
        Rational r1 = new Rational();
        System.out.println("r1 = " + r1.getNumerator() + "/" + r1.getDenominator());

        // constructor that takes one argument and sets the numerator to that argument and the denominator to 1
        Rational r2 = new Rational(3);
        System.out.println("r2 = " + r2.getNumerator() + "/" + r2.getDenominator());

        // constructor that takes two arguments and sets the numerator to the first argument and the denominator to the second argument
        Rational r3 = new Rational(3, 4);
        System.out.println("r3 = " + r3.getNumerator() + "/" + r3.getDenominator());

        // toString method that displays a rational object in a reasonable format
        System.out.println("r3 = " + r3);

        // test the second constructor that takes two arguments and uses them to initalize the attributes
        System.out.println("r3 = " + r3.getNumerator() + "/" + r3.getDenominator());

        // test the negate method
        r3.negate();
        System.out.println("r3 = " + r3.getNumerator() + "/" + r3.getDenominator());

        // test the invert method
        r3.invert();
        System.out.println("r3 = " + r3.getNumerator() + "/" + r3.getDenominator());

        // test the reduce method
        r3.reduce();
        System.out.println("r3 = " + r3.getNumerator() + "/" + r3.getDenominator());

        // test the add method
        Rational r4 = new Rational(1, 2);
        Rational r5 = new Rational(1, 3);
        Rational r6 = r4.add(r5);
        System.out.println("r6 = " + r6.getNumerator() + "/" + r6.getDenominator());

        // test the subtract method
        Rational r7 = r4.subtract(r5);
        System.out.println("r7 = " + r7.getNumerator() + "/" + r7.getDenominator());

        // test the multiply method
        Rational r8 = r4.multiply(r5);
        System.out.println("r8 = " + r8.getNumerator() + "/" + r8.getDenominator());

        // test the divide method
        Rational r9 = r4.divide(r5);
        System.out.println("r9 = " + r9.getNumerator() + "/" + r9.getDenominator());

        // test the equals method
        System.out.println("r4.equals(r5) = " + r4.equals(r5));
        System.out.println("r4.equals(r4) = " + r4.equals(r4));

        // test the static gcd method
        System.out.println("gcd(3, 4) = " + Rational.gcd(3, 4));
        System.out.println("gcd(4, 3) = " + Rational.gcd(4, 3));
        System.out.println("gcd(3, 3) = " + Rational.gcd(3, 3));
        System.out.println("gcd(0, 3) = " + Rational.gcd(0, 3));
        System.out.println("gcd(3, 0) = " + Rational.gcd(3, 0));



    }
}
