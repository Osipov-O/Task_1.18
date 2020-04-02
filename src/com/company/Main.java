package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int m, n;
        Scanner num = new Scanner(System.in);
        System.out.println("m");
        m = num.nextInt();
        System.out.println("n");
        n = num.nextInt();

        for ( int i=m; i<=n; i++) {
            System.out.print(i + " - ");
            for (int j=i-1; j>1; j-- ) {
                if ( i%j == 0 ) {
                    System.out.print(" "+j);
                }
            }
            System.out.println("");
        }

    }
}
