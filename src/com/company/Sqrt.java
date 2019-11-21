package com.company;

import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {
        // write your code her

        double a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c= scanner.nextDouble();

        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1,x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (+b - Math.sqrt(d)) / (2 * a);
            System.out.println("SQRT of: x1 = " + x1 + " , x2 = " + x2);
        }
         else if (d == 0){
             double x;
             x = -b / (2 * a);
            System.out.println("SQRT of x = " + x);
        }
         else {
            System.out.println("NO SQRT");
        }
    }
}
