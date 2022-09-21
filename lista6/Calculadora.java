/*
 5 – Calculadora
Faça uma classe com os seguintes métodos:
método principal:
Solicita ao usuário 2 números e após, uma das seguintes opções:
Abre um menu com as seguintes opções:
1 – Soma
2 – Subtrai
3 – Multiplica
4 – Divide
Crie uma exceção para tratar diferentes tipos de entrada.
Cada opção de menu deve chamar um dos seguintes métodos:

1 – método Soma
Recebe 2 inteiros, soma e passa o resultado para a método Imprime.
2 – método Subtrai
Recebe 2 inteiros, subtrai e passa o resultado para a método Imprime.
3 – método Multiplica
Recebe 2 inteiros, multiplica e passa o resultado para a método Imprime.
4 – método Divide
Recebe 2 inteiros, divide e passa o resultado para a método Imprime.

método 

Imprime - Recebe um inteiro e imprime. */
package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        metodo();
    }
    
    
    public static void metodo() {

        int x, y, res;

        System.out.println("Ingrese un numero x");

        while (true) {
            try {
                x = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero: ");
            }
        }

        System.out.println("Ingrese un numero y");

        while (true) {
            try {
                y = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero: ");
            }
        }

        int varmenu = 0;
        while (varmenu != 5) {

            Scanner input = new Scanner(System.in);
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            while (true) {
                try {
                    input = new Scanner(System.in);
                    varmenu = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe um numero");
                }
            }

            switch (varmenu) {
                case 1:
                    res = suma(x, y);
                    System.out.println(res);
                    break;

                case 2:
                    res = resta(x, y);
                    System.out.println(res);
                    break;

                case 3:
                    res = multiplicar(x, y);
                    System.out.println(res);

                    break;

                case 4:

                    double s = x;
                    double h = y;
                    double div;

                    div = dividir(s, h);
                    System.out.printf("%.1f \n", div);

                    break;
            }

        }

    }

    public static int suma(int n1, int n2) {

        int res = n1 + n2;
        return res;

    }

    public static int resta(int n1, int n2) {
        int res = n1 - n2;
        return res;
    }

    public static int multiplicar(int n1, int n2) {
        int res = n1 * n2;
        return res;
    }

    public static double dividir(double n1, double n2) {

        double res = n1 / n2;
        return res;
    }

}
