package calculadora;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 2 números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Digite uma operação (+, -, *, /)");
        String operador = scanner.next();

        switch (operador) {
           case "+" -> System.out.printf("%d %s %d = %d", n1, operador, n2, n1 + n2);
           case "-" -> System.out.printf("%d %s %d = %d", n1, operador, n2, n1 - n2);
           case "*" -> System.out.printf("%d %s %d = %d", n1, operador, n2, n1 * n2);
           case "/" -> System.out.printf("%d %s %d = %d", n1, operador, n2, n1 / n2);
           default -> System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}
