package estoquemedio;

import java.util.Scanner;
/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 * Passos:
 * 1. Ler a quantidade mínima e máxima do produto
 * 2. Calcular o estoque médio
 * 3. Imprimir uma mensagem para o usuário com o resultado.
 */
public class EstoqueMedio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade minima");
        int quantidadeMinima = scanner.nextInt();

        System.out.println("Informe a quantidade máxima");
        int quantidadeMaxima = scanner.nextInt();

        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("O estoque médio é de %d unidades", estoqueMedio);

        scanner.close();
    }
}
