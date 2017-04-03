package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a;
        int b;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa A");
        a = entrada.nextInt();
        System.out.println("Ingresa B");
        b = entrada.nextInt();
        System.out.println("SUMA " + suma(a, b));
    }

    private static int suma(int ax, int bx) {

        if (bx == 0) {
            return ax;
        } else if (ax == 0) {
            return bx;
        } else {
            return 1 + suma(ax, bx - 1);
        }

    }
}
