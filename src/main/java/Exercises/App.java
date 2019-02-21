package Exercises;

import java.util.Scanner;

/**
 * Hello world! ... and some other exercises
 */
public class App {
    public static void main(String[] args){

        int switchNumber = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Wybierz numer odpowiadający działaniu obok: ");
        System.out.println("Dodawanie 1");
        System.out.println("Odejmowanie 2");
        System.out.println("Mnożenie 3");
        System.out.println("Dzielenie 4");

        int selectedOperation = reader.nextInt();

        switch (switchNumber) {
            case 1:
                Addition addition = new Addition();
        }



}
}
