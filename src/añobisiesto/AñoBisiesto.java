package añobisiesto;

import java.util.*;

public class AñoBisiesto {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int año;
        System.out.print("Ingresa un numero");
        año = sc.nextInt();
        if (esBisiesto(año))//llama al metodo
        {
            System.out.println("javaAñoBisiesto");
        } else {
            System.out.println("No es AñoBisiesto");
        }
    }

    /**
     * metodo para calcular si el aï¿½o es bisiesto o no
     */
    public static boolean esBisiesto(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
