package caltulatorUtil;

import java.util.Scanner;


public class Calculator {

    public static double calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("import a");
        double a = sc.nextDouble();
        System.out.println("import b");
        double b = sc.nextDouble();
        System.out.println("import operation");
        int operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = MathUtil.addition(a, b);
                break;
            case 2:
                result = MathUtil.division(a, b);
                break;
            case 3:
                result = MathUtil.multiply(a, b);
                break;
            case 4:
                result = MathUtil.subtraction(a, b);
                break;
            default:
                System.out.println("operation is not valid");
                break;
        }

        return result;


    }
}





