/*
 * Exercicio 1:
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

  package mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {
 
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo da Média");

        System.out.println("Informe a Nota1");
        double n1 = scanner.nextDouble();

        System.out.println("Informe a Nota2");
        double n2 = scanner.nextDouble();

        System.out.println("Informe a Nota3");
        double n3 = scanner.nextDouble();

        double ma = (n1 + n2 + n3) / 3;

        System.out.printf("A média é: %.2f", ma);

        scanner.close();


    }
 }