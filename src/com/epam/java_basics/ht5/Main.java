package com.epam.java_basics.ht5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        FractionReceiver fractionReceiver = new FractionReceiver(bufferRead);
        Fraction[] fractionStorage;

        try {
            fractionStorage = createFractionStorage(bufferRead, fractionReceiver);
            printOutFractionStorage(fractionStorage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Fraction[] createFractionStorage(BufferedReader bufferRead, FractionReceiver fractionReceiver) throws IOException {
        int fractionsInputNumber = new FractionReceiver(bufferRead).receiveNumberOfFractions();
        Fraction[] fractionStorage = new Fraction[fractionsInputNumber];

        int storageSize = 0;
        for (int i = 0; i < fractionStorage.length; i++) {
            fractionStorage[storageSize++] = fractionReceiver.receiveFraction();
        }
        return fractionStorage;
    }

    public static void printOutFractionStorage(Fraction[] fractionStorage) {
        for (Fraction fraction : fractionStorage) {
            new FractionPrinter(fraction).print();
        }
    }
}

