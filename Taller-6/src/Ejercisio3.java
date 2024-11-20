import java.util.Scanner;

/**Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 *
 * @author Juan Quizhpe
 */
public class Ejercisio3 {
    public static void main(String[] args) {
          double pes, cost;
        String ubicac;
        cost = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("INGRESAR PESO DE PAQUETE:");
        pes = teclado.nextDouble();
        System.out.print("INGRESE LUGAR DE DESTINO (1.NACIONAL. 2. INTERNACIONAL. 3.LOCAL.):");
        ubicac = teclado.next();
        
        if (pes > 5 && pes <= 10 && ubicac.equals("Nacional"))
        {
            cost = 10;
        }
        else if ( pes <= 5 && ubicac.equals("Local"))
        {
            cost = 5;
        }
        else 
        {
            cost = 15;
        }
       
        System.out.printf("Costo de envio del paquete: $%.2f\n", cost);
    }
 
    }

    /***
    * debug:
    * INGRESAR PESO DE PAQUETE:6
      INGRESE LUGAR DE DESTINO (1.NACIONAL. 2. INTERNACIONAL. 3.LOCAL.):2
      Costo de envio del paquete: $15,00
      BUILD SUCCESSFUL (total time: 6 seconds)
    */
    
    
    

