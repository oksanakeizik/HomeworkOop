package lt.bit.hw.calculatorOP_024;

import java.util.Scanner;

public class Calculator extends ArithmeticOperations {
    double numberOne;
    String operator;
    double numberTwo;

    public void getValues() {
        try {
            Scanner user_input = new Scanner(System.in);
            System.out.print("Please enter number One:   ");
            numberOne = user_input.nextDouble();
            System.out.print("Please choose and enter arithmetic operator (+, -, *, / or %):   ");
            operator = user_input.next();
            System.out.print("Please enter number Two:   ");
            numberTwo = user_input.nextDouble();
        } catch (Exception ex) {
            System.out.println("Upss..error");
        }
    }

    public void result() {
        String result;
        switch (operator) {
            case "+":
                result = "Addition = " + addition(numberOne, numberTwo);
                break;
            case "-":
                result = "Subtraction = " + subtraction(numberOne, numberTwo);
                break;
            case "*":
                result = "Multiplication = " + multiplication(numberOne, numberTwo);
                break;
            case "/":
                result = "Division = " + division(numberOne, numberTwo);
                break;
            case "%":
                result = "Modulus = " + modulus(numberOne, numberTwo);
                break;
            default:
                result = "upss...unknown";
        }
        System.out.println(result);
    }
}
