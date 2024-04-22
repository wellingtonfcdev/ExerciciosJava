package precodesconto;

import java.util.Scanner;

/* 
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimit novo preço e valor economizado em reais
 * 
 * Ex. R$100,00 com 10% de desconto = 0 preço com desconto é R$90,00
 * e o valor economizado foi R$10,00
*/
public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto");

        double numero1 = scanner.nextDouble();
       
        System.out.println("Informe o valor do desconto %");
        double valorDoDesconto = scanner.nextDouble();

        double valorProdutoComDesconto = numero1 - (numero1 * valorDoDesconto)/100;

        double valorEconomizado = (numero1 * valorDoDesconto)/100;

        System.out.printf("O novo preço do produto com desconto é R$ %.2f", valorProdutoComDesconto);
        System.out.printf("\nValor economizado foi R$ %.2f", valorEconomizado);


        scanner.close();
    }
}
