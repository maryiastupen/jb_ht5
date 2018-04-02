package com.epam.java_basics.ht5;

import java.io.BufferedReader;
import java.io.IOException;

public class FractionReceiver {

    private BufferedReader bufferedReader;

    public FractionReceiver(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public int receiveNumberOfFractions() throws IOException {
        int fractionsInputNumber;

        System.out.print("Please, enter the number of fractions you want to create: ");
        fractionsInputNumber = Integer.parseInt(bufferedReader.readLine());

        return fractionsInputNumber;
    }

    public Fraction receiveFraction() throws IOException {
        int numerator, denominator;

        System.out.print("Please, enter the fraction's numerator: ");
        numerator = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Please, enter the fraction's denominator: ");
        denominator = Integer.parseInt(bufferedReader.readLine());

        return new Fraction(numerator, denominator);
    }
}
