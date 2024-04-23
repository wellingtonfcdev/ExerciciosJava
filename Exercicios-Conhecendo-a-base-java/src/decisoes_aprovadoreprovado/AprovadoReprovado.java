/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.io.Console;
import java.util.Scanner;

public class AprovadoReprovado{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Informe a nota 1:");
            
         double nota1 = scanner.nextDouble();

         System.out.println("Informe a nota 2:");
            
         double nota2 = scanner.nextDouble();

         System.out.println("Informe a nota 3:");
            
         double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7)
            System.out.println("Aluno aprovado. Média: " + media);
        else
            System.out.println("Aluno reprovado. Média: " + media);
        
    }
}