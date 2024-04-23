package ordem_crescente;

import java.util.Scanner;

/*
 * Leia 3 números e imprima-os em ordem crescente
 */
public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 3 números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        //Imprimir o menor número em ordem crescente
        if(n1 < n2 && n1 < n3){
            System.out.println(n1);

            if(n2 < n3){
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n2);
            }

        }else if(n2 < n1 && n2 < n3){
            System.out.println(n2);

            if(n1 < n3){
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }else{
            System.out.println(n3);

            if(n1 < n2){
                System.out.println(n1);
                System.out.println(n2);
            }else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }
      
    }
        
}

