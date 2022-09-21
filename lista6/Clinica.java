package lista6;

/*
Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso,
a idade e a altura. Pergunte quantos pacientes serão informados no inicio da
execução da classe. Trate os possíveis erros de tipos de dados informados pelo
usuário com exceções.
Exiba um relatório contendo:

i. a quantidade de pacientes.
ii. a média de idade dos homens.
iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv. a quantidade de pessoas com idade entre 18 e 25.
v. o nome do paciente mais velho.
vi. o nome da mulher mais baixa.
 */
import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {
         metodo();
    }
    
    
    public static void metodo() {
        int cantidad, sumaedad = 0, contMAP = 0, contE = 0, auxE = 0, s = 0;
        double media = 0, auxA = 100;
        String nombreMayor = " ";
        String nombreBaja = " ";

        while (true) {
            try {

                System.out.println("Ingrese la cantidad de pacientes: ");
                cantidad = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.err.print("Alerta: Ingrese un numero entero: ");

            }
        }

        String nombre[] = new String[cantidad];
        int edad[] = new int[cantidad];
        String sexo[] = new String[cantidad];
        double altura[] = new double[cantidad];
        double peso[] = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el nombre del paciente: ");
            nombre[i] = new Scanner(System.in).nextLine();

            while (true) {
                try {

                    System.out.println("Ingrese la edad del paciente: ");
                    edad[i] = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.err.print("Alerta: Ingrese un numero entero: ");

                }
            }

            System.out.println("Ingrese sexo del paciente F/M: ");
            sexo[i] = new Scanner(System.in).next();

            while (true) {
                try {
                    System.out.println("Ingrese la altura del paciente: ");
                    altura[i] = new Scanner(System.in).nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Ingrese un numero con coma");
                }

            }

            while (true) {
                try {
                    System.out.println("Ingrese el peso del paciente: ");
                    peso[i] = new Scanner(System.in).nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Ingrese un numero con coma");
                }
            }

        }

        for (int i = 0; i < cantidad; i++) {

            if (sexo[i].toLowerCase().equals("f") && altura[i] > 1.6 && altura[i] < 1.7 && peso[i] > 70) {
                contMAP++;
            }

            if (edad[i] > 18 && edad[i] < 25) {
                contE++;
            }

            if (edad[i] > auxE) {
                auxE = edad[i];
                nombreMayor = nombre[i];

            }

            if (sexo[i].equals("f")) {
                if (altura[i] < auxA) {
                    auxA = altura[i];
                    nombreBaja = nombre[i];
                }

            }

            if (sexo[i].equals("m")) {
                sumaedad = sumaedad + edad[i];
                s++;
            }

        }
        if(s != 0){
            media = sumaedad / s;
        }
        

        System.out.println("La cantidad de pacientes es: " + cantidad);

        System.out.println("La media de la edad de los hombres es: " + media);

        System.out.println("La cantidad de personas con la edad entre 18 y 25 es: " + contE);

        System.out.println("La cantidad de mujeres con altura entre 1.6 y 1.7 y peso mayor a 70 es: " + contMAP);

        System.out.println("El nombre del paciente mas viejo es: " + nombreMayor);

        System.out.println("El nombre de la paciente mas baja: " + nombreBaja);

        System.out.println("\n ");

        for (int i = 0; i < cantidad; i++) {

            System.out.printf("%s %d %s %.1f %.1f  \n", nombre[i], edad[i], sexo[i], altura[i], peso[i]);

        }
    }

}
