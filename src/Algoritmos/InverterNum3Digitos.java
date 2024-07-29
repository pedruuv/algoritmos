package Algoritmos;

import java.util.Scanner;

public class InverterNum3Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 3 dígitos:\n");
        int num = scanner.nextInt();

        int numInvertido = inverteNum(num);
        System.out.println(numInvertido);
    }

    private static int inverteNum(int num) {
        int invertido = 0;

        while (num != 0){
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return invertido;

    }
}
