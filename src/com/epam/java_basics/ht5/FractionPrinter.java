package com.epam.java_basics.ht5;

public class FractionPrinter {
    public Fraction fraction;

    public FractionPrinter(Fraction fraction) {
        this.fraction =  fraction;
    }

    public void print() {
        System.out.println("The fraction's numerator is " + fraction.getNumerator() + ", denominator is " + fraction.getDenominator());
    }

}
