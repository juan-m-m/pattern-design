package com.jmontano.patterndesign.creational.factory;

/**
 * @author Juan Montaño
 */
public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("pagando con google payment");
    }
}
