package lg;

import java.util.Scanner;

public class TalleEcuaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Taller de Ecuaciones ---");
        System.out.println("1. Ecuación 1");
        System.out.println("2. Ecuación 2");
        System.out.print("Seleccione una opción (1 o 2): ");
        
        int choice = input.nextInt();

        if (choice == 1 || choice == 2) {
            
            System.out.print("Ingrese el valor de X: ");
            double x = input.nextDouble();

            System.out.print("Ingrese el valor de Z: ");
            double z = input.nextDouble();

            double y = 0;

            if (choice == 1) {
                // Ecuación 1
                double num = (3 * x) / (1 + (3 * x) / (3 * Math.pow(z, 2) + 2));
                double den = 1 / (1 / (1 + z) + 3 * Math.pow(x, 2) + 2 * z + 3);
                y = num / den;
                System.out.println("\nResultado Ecuación 1: y = " + y);
            } else {
                // Ecuación 2
                double partA = (Math.pow(x, 2) + 3 * z + 2) / (2 + 1 / (1 + 2 * z));
                double numB = 2 / (1 + 3 * x + 3 * z + 2);
                double denB_sub1 = 1 / (1 + 3 * x);
                double denB_sub2 = (3 * x + 1) / (2 * z + 3 / (1 + 5 / z));
                double denB = 1 / (denB_sub1 + denB_sub2);

                double partB = numB / denB;
                y = partA + partB;
                System.out.println("\nResultado Ecuación 2: y = " + y);
            }

            System.out.println("\n--- Evaluación de 8 Condiciones ---");
            System.out.println("1. ¿X es mayor que Z? -> " + (x > z));
            System.out.println("2. ¿X es igual a Z? -> " + (x == z));
            System.out.println("3. ¿El resultado Y es positivo? -> " + (y > 0));
            System.out.println("4. ¿X es menor o igual a 0? -> " + (x <= 0));
            System.out.println("5. ¿Z es mayor a 100? -> " + (z > 100));
            System.out.println("6. ¿Y es un número finito? -> " + Double.isFinite(y));
            System.out.println("7. ¿La suma de X + Z es mayor que Y? -> " + ((x + z) > y));
            System.out.println("8. ¿X es diferente de Z? -> " + (x != z));

        } else {
            System.out.println("Opción no válida. Reinicie el programa y elija 1 o 2.");
        }

        System.out.println("\nPrograma finalizado.");
        input.close();
    }
}
