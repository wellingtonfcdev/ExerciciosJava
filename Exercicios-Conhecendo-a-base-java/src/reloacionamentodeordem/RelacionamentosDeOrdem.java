package reloacionamentodeordem;

import java.util.Scanner;

/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre dois números:
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler 2 números
 * 2. Imprimir relacionamentos de ordem
 */
public class RelacionamentosDeOrdem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número 1: ");
        double numero1 = scanner.nextInt();

        System.out.println("Informe o número 2: ");
        double numero2 = scanner.nextInt();

        boolean ehIgual = numero1 == numero2;
        //System.out.println(ehIgual);
        boolean ehIMaior = numero1 > numero2;
        //System.out.println(ehIMaior);

        boolean ehIMenor = numero1 < numero2;
        //System.out.println(ehIMenor);

        boolean ehIMaiorIgual = numero1 >= numero2;
        //System.out.println(ehIMaiorIgual);

        boolean ehIMenorIgual = numero1 <= numero2;
        System.out.println(ehIMenorIgual);

        scanner.close();

    }
}
