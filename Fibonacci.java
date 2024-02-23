


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        System.out.print(fib1 + " " + fib2);
        for (int i = 2; a > i; i++) {
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            System.out.print(" " + fib);
        }
    }
}
