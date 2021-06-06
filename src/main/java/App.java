/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String euros = app.readEuros();
        String exchangeRate = app.readExchange();
        float euroToUs= app.Calc(euros,exchangeRate);
        app.printOutput(euroToUs,euros,exchangeRate);
    }

    private void printOutput(float euroToUs,String euros,String exchangeRate ) {
        String message = String.format("%s euros at an exchange rate of %s is\n" +
                "%.2f U.S. dollars.", euros, exchangeRate,euroToUs);
        System.out.print(message);

    }

    private float Calc(String euros, String exchangeRate) {
        int euroInt = Integer.parseInt(euros);
        float exchangeRateToInt = Float.parseFloat(exchangeRate);
        float calc = exchangeRateToInt*euroInt;
        return calc;
    }

    private String readEuros() {
        System.out.print("How many euros are you exchanging? ");
        String euros = in.nextLine();
        return euros;
    }

    private String readExchange() {
        System.out.print("What is the exchange rate? ");
        String exchangeRate = in.nextLine();
        return exchangeRate;
    }
}
