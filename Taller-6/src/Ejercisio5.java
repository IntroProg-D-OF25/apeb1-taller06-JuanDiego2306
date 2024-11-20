 import java.util.Scanner;

/**Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente
 *
 * @author Juan Quizhpe
 */

public class Ejercisio5 {
    public static void main(String[] args) {
        
    
    int operacion;
        
        System.out.print("INGRESA ALGUN NUMERO DE 1 AL 4:");
        Scanner teclado = new Scanner(System.in);
        
        operacion = teclado.nextInt();
       
        switch(operacion)
        {
            case 1 -> {
                System.out.println("SUMA");;
            }
            case 2 -> System.out.println("RESTA");
            case 3 -> System.out.println("MULTIPLICACION");
            case 4 -> System.out.println("DIVISION");
          
            default -> System.out.println("OPERACION NO EXISTENTE");
        }
    }
}
