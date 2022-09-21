package lista6;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
         metodo();
    }
    
    
    public static void metodo() {

        int tamaño;

        System.out.println("Ingrese el tamaño de la piramide: ");

        while (true) {
            try {
                tamaño = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero: ");
            }
        }
        
        
        for (int i = 0; i <= tamaño; i++) {

            for (int j = 0; j < i; j++) {
                System.out.printf("%02d ", i);
            }System.out.println("");
        }

        

    }
}
