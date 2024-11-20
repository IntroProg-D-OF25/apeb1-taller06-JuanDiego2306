import java.util.Scanner;

/** Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo.
 *
 * @author Juan Quizhpe
 */
         public class Ejercisio2 {
             public static void main(String[] args) {                                      
        double n12, n13, n14;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESA EL PRIMER LADO DEL TRIANGULO: ");
        n12 = teclado.nextDouble();
        System.out.print("INGRESA EL SEGUNDO LADO DEL TRIANGULO : ");
                 double nl3 = teclado.nextDouble();
        System.out.print("INGRESA EL TERCER LADO DEL TRIANGULO: ");
                 double nl4 = teclado.nextDouble();
                 double nl2 = 0;

        if (nl2 + nl3 > nl4 && nl2 + nl4 > nl3 && nl3 + nl4 > nl2) {
            String tipotriangulo;
            if (nl2 == nl3 && nl3 == nl4) {
                tipotriangulo = "Equilatero";
            } else if (nl2 == nl3 || nl2 == nl4 || nl3 == nl4) {
                tipotriangulo = "Isosceles";
            } else {
                tipotriangulo = "Escaleno";
            }

            System.out.printf("Es un triangulo: %s\n", tipotriangulo);
        } else {
            System.out.println("No es un triángulo");
        }
    }
}
/***
 * debug:
 * INGRESA EL PRIMER LADO DEL TRIANGULO: 9
INGRESA EL SEGUNDO LADO DEL TRIANGULO : 6
INGRESA EL TERCER LADO DEL TRIANGULO: 9
No es un triángulo
BUILD SUCCESSFUL (total time: 5 seconds)
 */
