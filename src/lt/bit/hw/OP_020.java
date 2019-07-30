package lt.bit.hw;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * LT Parašykite programą, kuri rušiuoja String tipo masyvą.
 * EN Write a program that sorts a String array.
 */

public class OP_020 {
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings you would like to enter: ");
        count = scanner.nextInt();
        String string[] = new String[count];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the String one by one: ");
        for (int i = 0; i < count; i++) {
            string[i] = scanner1.nextLine();
        }
        scanner.close();
        scanner1.close();
        for (int i = 0; i < count; i++) {
            for (int k = i + 1; k < count; k++) {
                if (string[i].compareTo(string[k]) > 0) {
                    temp = string[i];
                    string[i] = string[k];
                    string[k] = temp;
                }
            }
        }
        System.out.print("Strings in Alphabetical Order: ");
        for (int i = 0; i <= count - 1; i++) {
            System.out.print(string[i] + ", ");
        }
    }
}
