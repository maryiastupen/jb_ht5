package com.epam.java_basics.ht5;

public final class Fraction {
    private int numerator;
    private int denominator;

    protected Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
