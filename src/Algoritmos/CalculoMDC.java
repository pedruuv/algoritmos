package Algoritmos;

import java.util.Scanner;

public class CalculoMDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int mdc = calculaMDC(num1, num2);
        System.out.println(mdc);

    }

    private static int calculaMDC(int num1, int num2) {

        int quociente = 0;
        int resto = 1;
        while (resto != 0){
            quociente = num1 / num2;
            if (num1 % num2 == 0){
                break;
            }
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }

        return num2;
    }
}
