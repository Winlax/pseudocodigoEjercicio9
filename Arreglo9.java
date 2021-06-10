import java.util.*;

public class Arreglo9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double T1;
        double T2;
        double promedio;

        do {
            System.out.println("Ingresa 1ra. temperatura");
            T1 = teclado.nextInt();

            if (T1 >= 5 && T1 <= 15) {

            System.out.println("Ingresa 2da. temperatura");
            T2 = teclado.nextInt();

            if (T2 >= 5 && T2 <= 15) {

                promedio = (T1+T2) / 2;
                System.out.println("El promedio de las temperaturas es: "+promedio+"°");

            } else{
                System.out.println("La temperatura tiene que estar entre 5° y 15°");
            }

            } else{
                System.out.println("La temperatura tiene que estar entre 5° y 15°");
            }
        } while(T1 != 0);

    }
}