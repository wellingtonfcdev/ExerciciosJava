package calculadoraimc;
/*
 * Crie uma calculadora de IMC que mostra em que classificação a pessoa está:
 * 
 * Menor que 18,5       -> Magreza
 * Entre 18,5 e 24,9    -> Normal
 * Entre 25 e 29,9      -> Sobrepeso
 * Entre 30 e 39,9      -> Obesidade Grave
 * 
 * IMC = peso / altura * altura
 */

import java.util.Scanner;

public class CalculadoraIMC{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso: ");
        
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("MAGREZA");
        }else if(imc > 18.5 && imc <= 24.9){
            System.out.println("NORMAL");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("SOBREPESO");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("OBESIDADE.");
        
        }else{
            System.out.println("OBESIDADE GRAVE.");
        }
        System.out.println("O seu IMC é: " + imc);

        scanner.close();
    }
}