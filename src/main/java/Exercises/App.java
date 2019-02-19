package Exercises;


import java.util.Scanner;

/**
 * Hello world! ... and some other exercises
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );

//        int A = 50;
//        int B = 3;
//        int result = 5 + ((15 / 3) * 2) - (8 % 3);
//        System.out.println(result);

//        System.out.println("Enter first number:");
//        Scanner sc1 = new Scanner(System.in);
//        int firstNumber = sc1.nextInt();
//
//        System.out.println("Enter second number:");
//        Scanner sc2 = new Scanner(System.in);
//        int secondNumber = sc2.nextInt();
//
//        int resultAddition = firstNumber + secondNumber;
//        int resultSubtraction = firstNumber - secondNumber;
//        int resultMultiplication = firstNumber * secondNumber;
//        int resultDivision = firstNumber / secondNumber;
//        int resultModulo = firstNumber % secondNumber;
//
//        System.out.println(firstNumber + " + " + secondNumber + " equals " + resultAddition);
//        System.out.println(firstNumber + " - " + secondNumber + " equals " + resultSubtraction);
//        System.out.println(firstNumber + " * " + secondNumber + " equals " + resultMultiplication);
//        System.out.println(firstNumber + " / " + secondNumber + " equals " + resultDivision);
//        System.out.println(firstNumber + " % " + secondNumber + " equals " + resultModulo);

//        System.out.println("Enter input number:");
//        Scanner input = new Scanner(System.in);
//        int inputNumber = input.nextInt();
//        int timesOne = inputNumber * 1;
//        int timesTwo = inputNumber * 2;
//        int timesThree = inputNumber * 3;
//        int timesFour = inputNumber * 4;
//        int timesFive = inputNumber * 5;
//        int timesSix = inputNumber * 6;
//        int timesSeven = inputNumber * 7;
//        int timesEight = inputNumber * 8;
//        int timesNine = inputNumber * 9;
//        int timesTen = inputNumber * 10;
//
//        System.out.println("Results:");
//        System.out.println(inputNumber + " x 1 = " + timesOne);
//        System.out.println(inputNumber + " x 2 = " + timesTwo);
//        System.out.println(inputNumber + " x 3 = " + timesThree);
//        System.out.println(inputNumber + " x 4 = " + timesFour);
//        System.out.println(inputNumber + " x 5 = " + timesFive);
//        System.out.println(inputNumber + " x 6 = " + timesSix);
//        System.out.println(inputNumber + " x 7 = " + timesSeven);
//        System.out.println(inputNumber + " x 8 = " + timesEight);
//        System.out.println(inputNumber + " x 9 = " + timesNine);
//        System.out.println(inputNumber + " x 10 = " + timesTen);

//        System.out.println("   J    a   v     v  a");
//        System.out.println("   J   a a   v   v  a a");
//        System.out.println("J  J  aaaaa   V V  aaaaa");
//        System.out.println(" JJ  a     a   V  a     a");

//        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//        System.out.println(result);

//    double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(result);

//        double radius=7.5;
//        double diameter=2 * radius;
//        double pi = 3.14;
//        DecimalFormat df = new DecimalFormat(".####");
//
//        double perimeterResult = 2 * pi * radius;
//        double areaResult = pi * Math.pow(radius,2);
//
//        df.format(perimeterResult);
//
//        System.out.println("area is: "+ df.format(areaResult));
//        System.out.println("perimeter is: "+ df.format(perimeterResult));

//        df.setRoundingMode(java.math.RoundingMode.DOWN);
//        System.out.println(df.format(perimeterResult));

        //two variables to hold two input variable numbers

//Two variables to hold two input binary numbers
/*        long ten, eleven;
        int i = 0, carry = 0;

        //This is to hold the output binary number
        int[] sum = new int[10];

        //To read the input binary numbers entered by user
        Scanner scanner = new Scanner(System.in);

        //getting first binary number from user
        System.out.print("Enter first binary number: ");
        ten = scanner.nextLong();
        //getting second binary number from user
        System.out.print("Enter second binary number: ");
        eleven = scanner.nextLong();

        //closing scanner after use to avoid memory leak
        scanner.close();
        while (ten != 0 || eleven != 0)
        {
            sum[i++] = (int)((ten % 10 + eleven % 10 + carry) % 2);
            carry = (int)((ten % 10 + eleven % 10 + carry) / 2);
            ten = ten / 10;
            eleven = eleven / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
*/

//        long binary1, binary2, multiply = 0;
//        int digit, factor = 1;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input the second binary number: ");
//        binary2 = in.nextLong();
//        while (binary2 != 0) {
//            digit = (int) (binary2 % 10);
//            if (digit == 1) {
//                binary1 = binary1 * factor;
//                multiply = binaryproduct((int) binary1, (int) multiply);
//            } else {
//                binary1 = binary1 * factor;
//            }
//            binary2 = binary2 / 10;
//            factor = 10;
//        }
//        System.out.print("Product of two binary numbers: " + multiply + "\n");
//    }
//
//    static int binaryproduct(int binary1, int binary2) {
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        int binary_prod_result = 0;
//
//        while (binary1 != 0 || binary2 != 0) {
//            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
//            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        while (i >= 0) {
//            binary_prod_result = binary_prod_result * 10 + sum[i--];
//        }
//        return binary_prod_result;
//    }

    }
