package org.example;

import java.io.IOException;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calc {
    public static void main(String[] args) throws IOException {
        double n = 0;
        double d = 0;
        double result;
        Logger logger = Logger.getLogger(Calc.class.getName());
        FileHandler fHandler = new FileHandler("log.txt", true);
        SimpleFormatter sForm = new SimpleFormatter();

        fHandler.setFormatter(sForm);
        logger.addHandler(fHandler);


        Scanner nScanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");


            n = nScanner.nextDouble();
            logger.info("Первое введенное число;" + (n));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "вы ввели неверно", e);
        }


        try {


            System.out.println("Введите второе число: ");
            d = nScanner.nextDouble();
            logger.info("Первое введенное число;" + (d));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "вы ввели неверно", e);

        }


        Scanner chScanner = new Scanner(System.in);
        System.out.println("Введите операцию + или - или / или *: ");
        String ch = chScanner.nextLine();


        switch (ch) {
            case "+":

                result = n + d;
                System.out.println(n + "+" + d + "=" + result);


                break;

            case "-":
                result = n - d;
                System.out.println(n + "-" + d + "=" + result);
                break;

            case "/":
                result = n / d;
                System.out.println(n + "/" + d + "=" + result);
                break;


            case "*":
                result = n * d;
                System.out.println(n + "*" + d + "=" + result);
                break;
            default:
                System.out.println("The operator you have selected is invalid");
                break;


        }


    }
}





















