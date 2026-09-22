/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivegcd;

import java.util.Scanner;

/*
Description: This program calculates the Greatest Common Divisor (GCD)
using the recursive Euclidean algorithm.
Programmed by: Your Name - BSIT - Your CN - Subject
Last Modified: September 22, 2026
Version: 1.0
Acknowledgements: ChatGPT was used to help explain the recursive GCD
algorithm and review the program.
*/

public class RecursiveGCD {

    public static int gcd(int a, int b) {

        System.out.println("gcd(" + a + ", " + b + ")");

        if (b == 0) {
            return a;
        }

        System.out.println("a % b = " + (a % b));

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = input.nextInt();

        System.out.print("Enter B: ");
        int b = input.nextInt();

        int result = gcd(a, b);

        System.out.println("GCD = " + result);

        input.close();
    }
}