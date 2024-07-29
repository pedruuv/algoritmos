package Algoritmos;

import java.util.Scanner;

public class NumeroNeperiano {
    private static int fatorial(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * fatorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = scanner.nextInt();


        double e = 0;
        for (int i = 0; i <= num; i++){
            double fatorial = (double) 1 /fatorial(i);
            e += fatorial;
        }

        System.out.println("e = " + e);
    }
}
