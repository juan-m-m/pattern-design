package com.jmontano.patterndesign;

import com.jmontano.patterndesign.creational.factory.Payment;
import com.jmontano.patterndesign.creational.factory.PaymentFactory;
import com.jmontano.patterndesign.creational.factory.TypePayment;
import com.jmontano.patterndesign.creational.singleton.Card;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternDesignApplication.class, args);
        //printFactoryMethod();
        probarSingleton();
    }

    private static void probarSingleton() {
        Card.getINSTANCE().setCardNumber("123-123-123");
        System.out.println(Card.getINSTANCE().getCardNumber());
    }

    private static void printFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }

}
