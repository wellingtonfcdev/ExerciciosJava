package par_impar;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar
 */
public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");

        int numero = scanner.nextInt();
            
        if(numero % 2 == 0)
            System.out.println("Número Par");
        else
            System.out.println("Número Ímpar");

        scanner.close();
    }
}
