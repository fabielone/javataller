// 4. Escriba un programa que reciba como entrada un valor entero n y que muestre los
// números primos hasta el valor n.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);

       
            // solicitar al usuario un valor entero
            System.out.println("Ingrese un valor entero: ");
           
            int n = scanner.nextInt();
            // cerrar el objeto scanner
            scanner.close();
            // asegurarse de que el valor entero ingresado por el usuario sea positivo
            if (n < 1) {
                System.out.println("El valor entero debe ser positivo.");
                return;
            }
            
            // mostrar los números primos hasta el valor n
            System.out.println("Los números primos hasta " + n + " son:");
            for (int i = 2; i <= n; i++) {
                    if(i==2){
                        System.out.print(i + " ");
                    }
                    if(i==3){
                        System.out.print(i + " ");
                    }

                
                    if (i % 2 == 0) {
                        continue;
                
                    }
                    if (i % 3 == 0) {
                        continue;
                    }
                
                    System.out.print(i + " ");
                
            }
        } 
      
    

    
}