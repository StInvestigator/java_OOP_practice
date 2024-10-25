package oop.practice.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println("\n"+numerator + "/" + denominator);
    }

    private int findLeastCommonMultiple(int denominator) {
        if (this.denominator == denominator) {
            return denominator;
        }
        int min = Math.min(this.denominator, denominator);
        int max = Math.max(this.denominator, denominator);
        for (int i = max; i <= min * max; i++) {
            if (denominator % i == 0 && this.numerator % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public void plus(int number) {
        numerator += number * denominator;
    }

    public void plus(int numerator, int denominator) {
        int LCM = this.findLeastCommonMultiple(denominator);
        int toMultiply1 = LCM / this.denominator;
        int toMultiply2 = LCM / denominator;
        this.denominator = LCM;
        this.numerator = this.numerator * toMultiply1 + numerator * toMultiply2;
    }

    public void minus(int number) {
        numerator -= number * denominator;
    }

    public void minus(int numerator, int denominator) {
        int LCM = this.findLeastCommonMultiple(denominator);
        int toMultiply1 = LCM / this.denominator;
        int toMultiply2 = LCM / denominator;
        this.denominator = LCM;
        this.numerator = this.numerator * toMultiply1 - numerator * toMultiply2;
    }

    public void multiply(int number) {
        numerator *= number;
    }

    public void multiply(int numerator, int denominator) {
        numerator *= numerator;
        denominator *= denominator;
    }

    public void divide(int number) {
        denominator *= number;
    }

    public void divide(int numerator, int denominator) {
        numerator *= denominator;
        denominator *= numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
