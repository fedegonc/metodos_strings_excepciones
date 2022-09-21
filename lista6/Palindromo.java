/*
 4 - Palíndromo
Elabore um programa em Java para ler uma String qualquer (considere que não
serão informados acentos e pontuações), eliminar da entrada todos os espaços em
branco e mostrar a nova String gerada. Após, chamar uma função que recebe a
String como parâmetro e retorna true ou false caso a String seja um PALINDROMO.
Informe se a String é ou não um Palíndromo (diz-se de ou frase ou palavra que se
pode ler, indiferentemente, da esquerda para a direita ou vice-versa).
Exemplos de Palíndromo:
Adias a data da saída.
Missa é assim.
Rir, o breve verbo rir.
A grama é amarga.
 */
package lista6;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
         metodo();
    }
    
    
    public static void metodo() {
        System.out.println("Ingrese una palabra o frase palindromica: ");
        String s = new Scanner(System.in).nextLine();

        if (pal(s) == true) {
            System.out.println("La palabra o frase " + s + " es un palindromo");
        } else {
            System.err.println("La palabra o frase " + s + " no es un palindromo");
        }

    }

    public static boolean pal(String s) {
        boolean v = false;
        s = s.toLowerCase().replace(" ", "");
        StringBuilder s1 = new StringBuilder(s);
        String s2 = String.valueOf(s1.reverse());

        if (s.equals(s2)) {

            System.out.println(s);

            System.out.println(s2);

            v = true;

        }
        return v;

    }

}
