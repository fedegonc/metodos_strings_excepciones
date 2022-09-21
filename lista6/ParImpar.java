package lista6;

public class ParImpar {

    public static void main(String[] args) {
         metodo();
    }
    
    
    public static void metodo() {
        int par[] = new int[10];
        int impar[] = new int[10];
        int contadorpar = 0;
        int contadorimpar = 0;
        int numero = 0;

        boolean adicionar, avancar;

        for (int i = 0; i < 20; i++) {

            avancar = false;

            while (!avancar) {

                adicionar = true;
                numero = (int) (10 + Math.random() * 21);

                if (numero % 2 == 0) {
                    for (int x : par) {
                        if (numero == x) {
                            adicionar = false;
                        }

                    }
                    if (adicionar && contadorpar < 10) {
                        par[contadorpar] = numero;
                        contadorpar++;
                        avancar = true;

                    }

                }
                if (numero % 2 != 0) {

                    for (int x : impar) {
                        if (numero == x) {
                            adicionar = false;
                        }
                    }
                    if (adicionar && contadorimpar < 10) {
                        impar[contadorimpar] = numero;
                        contadorimpar++;
                        avancar = true;

                    }
                }

            }
        }
        for (int i : par) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
        for (int i : impar) {
            System.out.printf("%d ", i);
        }

    }
}
