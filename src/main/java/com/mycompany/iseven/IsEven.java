/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iseven;

/**
 *
 * @author Naweed
 */

import java.util.Scanner;

public class IsEven {
    
    public static boolean isEvenOdd(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or enter 'q' to QUIT): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("YOU HAVE SUCCESFULLY QUIT! Have a nice day.");
                break;
            }

            try {
                int num = Integer.parseInt(input);
                boolean isEvenOdd = isEvenOdd(num);
                System.out.println(num + " is " + (isEvenOdd ? "EVEN!" : "ODD!"));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input... PLEASE TRY AGAIN!");
            }
        }

        scanner.close();
    }
}
