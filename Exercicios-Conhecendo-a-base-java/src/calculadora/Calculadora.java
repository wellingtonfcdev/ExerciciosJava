package calculadora;

import java.util.Scanner;

/*
 * Crie uma calculadora que dados 2 números e uma operação
 * (adição, subtração, multiplicação e divisão), retorne o resultado
 * dessa operação entre os dois números.
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 2 números: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int opcao = scanner.nextInt();

        String mensagem = switch(opcao){
            case 1 -> "O resultado da Soma é: " + soma;
            case 2 -> "O resultado da Subtração é: " + subtracao;
            case 3 -> "O resultado da Multiplicação é: " + multiplicacao;
            case 4 -> "O resultado da Divisão é: " + divisao;
            default -> "Opção inválida";
        };
        System.out.println(mensagem);
        scanner.close();
    }
}
