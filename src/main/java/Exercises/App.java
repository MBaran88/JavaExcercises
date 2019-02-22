package Exercises;

import java.util.Scanner;

/**
 * Hello world! ... and some other exercises
 */
public class App {
    public static void main(String[] args) {

        Addition additionClass = new Addition();
        Subtraction subtractionClass = new Subtraction();
        Multiplication multiplicationClass = new Multiplication();
        Division divisionClass = new Division();

        Scanner calcReader = new Scanner(System.in);
        System.out.println("Wybierz numer odpowiadający działaniu obok: ");
        System.out.println("Dodawanie 1");
        System.out.println("Odejmowanie 2");
        System.out.println("Mnożenie 3");
        System.out.println("Dzielenie 4");

        int switchNumber = calcReader.nextInt();


        System.out.println("Wybierz pierwszą cyfrę: ");
        Scanner firstDigitScanner = new Scanner(System.in);
        double num1 = firstDigitScanner.nextDouble();

        System.out.println("Wybierz drugą cyfrę: ");
        Scanner secondDigitScanner = new Scanner(System.in);
        double num2 = secondDigitScanner.nextDouble();


        switch (switchNumber) {
            case 1:
                System.out.println("wynik to: " + additionClass.addition(num1, num2));
                break;
            case 2:
                System.out.println("wynik to: " + subtractionClass.subtraction(num1, num2));
                break;
            case 3:
                System.out.println("wynik to: " + multiplicationClass.multiplication(num1, num2));
                break;
            case 4:
                System.out.println("wynik to: " + divisionClass.division(num1, num2));
                break;
            default:
                System.out.println("coś poszło nie tak :(");
                break;
        }

        calcReader.close();
        firstDigitScanner.close();
        secondDigitScanner.close();
    }
}
