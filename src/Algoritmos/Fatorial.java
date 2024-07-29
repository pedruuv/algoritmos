package Algoritmos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial:\n");
        int num = scanner.nextInt();
        int fatorial = fatorial(num);
        System.out.println(fatorial);
    }

    private static int fatorial(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
