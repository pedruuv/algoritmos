package Algoritmos;

import java.util.Scanner;

public class CalculoSeno {
    private static int fatorial(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * fatorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para descobrir o seno");
        int angulo = scanner.nextInt();

        seno(angulo);
    }

    private static void seno(int angulo) {
        double sinal = 1;
        double seno = 0;

        for (int i = 1; i <= angulo; i+=2){
            double fatorial = (double) Math.pow(angulo, i) /fatorial(i);
            seno += sinal * fatorial;
            sinal = -sinal;
        }

        System.out.println(seno);
    }
}
