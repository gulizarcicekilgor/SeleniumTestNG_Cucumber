package com.testNGexample.utilities;

public class ReusableMethods {

    public static void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
