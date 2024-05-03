package org.howard.edu.lsp.oopfinal.question2;

// Interface for payment strategy
// interface PaymentStrategy is the interface that is gonna be used for rest of the Concrete class
interface PaymentStrategy {
    void processPayment(double amount);
}

// Concrete class for credit card payment
class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using credit card " + creditCardNumber);
    }
}

// Concrete class for PayPal payment
class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + emailAddress);
    }
}

// Concrete class for Bitcoin payment
class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin address " + bitcoinAddress);
    }
}

// Shopping cart class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

// Main class to demonstrate payment strategy
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Testing of the Credit card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        // Testing of the PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        // Bitcoin payment test stratedegy
        cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}
