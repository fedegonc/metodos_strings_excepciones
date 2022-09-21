package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;
import static lista6.Calculadora.dividir;
import static lista6.Calculadora.multiplicar;
import static lista6.Calculadora.resta;
import static lista6.Calculadora.suma;

/*
 Crie uma classe com as seguintes opções de menu:
1 - Pirâmide
2 – ParImpar
3 - Clínica
4- Palíndromo
5- Calculadora
6- Encerrar
Crie uma exceção para tratar diferentes tipos de entrada.
Cada opção de menu deve chamar um dos seguintes exercícios:
 */
public class Menu {

    public static void main(String[] args) {

        int varmenu = 0;
        while (varmenu
                != 6) {

            Scanner input = new Scanner(System.in);
            System.out.println("1-Piramide");
            System.out.println("2-ParImpar");
            System.out.println("3-Clinica");
            System.out.println("4-Palindromo");
            System.out.println("5-Calculadora");
            System.out.println("6-Salir");

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
                    Piramide.metodo();
                    break;

                case 2:
                    ParImpar.metodo();

                    break;

                case 3:

                    Clinica.metodo();
                    break;

                case 4:

                    Palindromo.metodo();

                    break;
                case 5:

                    Calculadora.metodo();

                    break;

            }

        }
    }
}
