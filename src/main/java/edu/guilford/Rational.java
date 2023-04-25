package edu.guilford;

import java.util.Random;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() { 
        Random rand = new Random();
        numerator = rand.nextInt(201) - 100; 
        do {
            denominator = rand.nextInt(201) - 100;
        } while (denominator == 0);
        //reduce the fraction to lowest terms 
        reduce(); 
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be 0");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Rational(int i) {
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void negate() {
        numerator = -numerator;
    }

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
        System.out.printf("The reduced fraction is %d/%d\n", this.numerator , this.denominator);
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        return new Rational(newNumerator/gcd, newDenominator/gcd);
    }

    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        return new Rational(newNumerator/gcd, newDenominator/gcd);
    }

    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        return new Rational(newNumerator/gcd, newDenominator/gcd);
    }

    public Rational divide(Rational other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        int gcd = gcd(newNumerator, newDenominator);
        return new Rational(newNumerator/gcd, newDenominator/gcd);
    }

    public String toDouble() {
        return String.valueOf((double) numerator / denominator);
    }

    public String toString() {
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
}