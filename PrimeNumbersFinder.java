/**
 * Java Program to discover all prime numbers up to that value
 * Author: Narasimman K
 */

import java.util.Scanner;

public class PrimeNumbersFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)

            // The next line of code will request input from the user.
            System.out.print("Please input a number to discover all prime numbers up to that value: ");
            int n = scanner.nextInt();
    
            // The next line of code will locate and display all prime numbers up to n.
            System.out.print("Prime numbers are: ");
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
    }

    // The method outlined below to determine if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
