package Algoritmos;

public class Tabuada {
    public static void main(String[] args) {
        tabuada();
    }

    private static void tabuada() {
        int i = 1;
        while (i <= 10){
            int j = 1;
            while (j <= 10){
                System.out.println(i + " x " + j + " = " + (i*j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
