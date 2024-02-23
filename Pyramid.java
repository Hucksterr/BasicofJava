package main;


import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; a > i; i++) {
            for (int j=1;a-i>j;j++){
                System.out.print(" ");
            }
            for (int k=0;i*2+1>k;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
