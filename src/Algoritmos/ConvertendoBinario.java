package Algoritmos;

import java.util.Scanner;

public class ConvertendoBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para converter em Binário:\n");
        int num = scanner.nextInt();

        converteBinario(num);

    }

    private static void converteBinario(int num) {
        if (num > 0){
            converteBinario(num / 2);
            System.out.print(num % 2);
        }
    }
}
