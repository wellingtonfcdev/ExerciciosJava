package conversordolar;

import java.util.Scanner;

/*
 * Faça um programa que converta um valo em dólar em reais.
 * 
 * Ex. Dólares = 100, Contação = 4,92 => 0 valor em reais é R$ 492,00
 */
public class ConversorDolarReal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Informe o valor em dólar"));
        double dolar = scanner.nextDouble();

        System.out.println(("Informe a cotação do dólar"));
        double cotacaoDolar = scanner.nextDouble();

        double valorEmReais = dolar * cotacaoDolar;

        System.out.printf("Valor em reais é R$ %.2f",valorEmReais);

        scanner.close();
        
    }
}
