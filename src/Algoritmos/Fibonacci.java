package Algoritmos;

import java.util.Scanner;

public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos números deseja obter da Sequência de Fibonacci");
        int num = scanner.nextInt();

        fibonacciCache = new long[num +1];

        for (int i = 0; i <= num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int num) {
        if (num <= 1){
            return num;
        }

        if (fibonacciCache[num] != 0){
            return fibonacciCache[num];
        }

        long nthFibonacciNumber = fibonacci(num-1) + fibonacci(num-2);
        fibonacciCache[num] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
