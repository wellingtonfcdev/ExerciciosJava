package areageometrica;

import java.util.Scanner;

/*
 * Dada uma figura geométrica (retângulo, triângulo, círculo), informar a sua área.
 * 
 * retangulo = base x altura
 * triangulo = (base x altura) / 2
 * circulo = pi x (raio * raio)
 */
public class AreaFiguraGeometrica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe qual a figura geométrica: (retangulo, triangulo ou circulo)");

        String figuraGeometrica = scanner.next();

        switch(figuraGeometrica){
            case "retangulo" -> {
                System.out.println("Informe o valor da base:");
                int base = scanner.nextInt();

                System.out.println("Informe a altura: ");
                int altura = scanner.nextInt();
                int area = base * altura;
                System.out.println(area);
            }
            case "triangulo" ->{
                System.out.println("Informe o valor da base:");
                int base = scanner.nextInt();

                System.out.println("Informe a altura: ");
                int altura = scanner.nextInt();

                double area = (base * altura) / 2.0;
                System.out.println(area);
            }
            case "circulo" ->{
                System.out.println("Informe o raio: ");
                int raio = scanner.nextInt();

                double area = 3.14 * (raio * raio);
                System.out.println(area);

            }
            default -> System.out.println("Figura não suportada!");
        }
        scanner.close();
        
    }
}
