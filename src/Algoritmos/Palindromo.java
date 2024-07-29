package Algoritmos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

        int num = scanner.nextInt();

        if (palindromo(num)){
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Os números não são palíndromos");
        }
    }

    private static boolean palindromo(int num) {
        int numInverso = 0;
        int numCopia = num;
        while (numCopia != 0){
            int digito = numCopia % 10;
            numInverso = numInverso * 10 + digito;
            numCopia /= 10;
        }

        return num == numInverso;
    }
}
