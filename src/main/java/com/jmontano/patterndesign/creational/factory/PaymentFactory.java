package com.jmontano.patterndesign.creational.factory;

/**
 * @author Juan Montaño
 */
public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment) {
        switch (typePayment) {
            case CARD:
                return new CardPayment();
            case GOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }
    }
}
