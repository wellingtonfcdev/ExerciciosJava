package idade;

import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima essa idade em dias
 * 
 * Ex: 1 ano => 365 dias de idade
 */
public class DiasDeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();

        int idadeEmDias = idade * 365;

        System.out.println("A idade em dias é: " + idadeEmDias);

        scanner.close();
    }
    
}
