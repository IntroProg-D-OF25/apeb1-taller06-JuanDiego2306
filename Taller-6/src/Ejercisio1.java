import java.util.Scanner;
/**Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
 *
 * @author Juan Quizhpe
 */
public class Ejercisio1 { 
    public static void main(String[] args) {
        // DEFINIR EL PRECIO DE LOS PRODUCTOS
        double precProduct1 = 900;
        double precProduct2 = 1500;
        double iva = 0.20;  // IVA del 20%
        double costoEnvio = 40;  // COSTO ENVIO APLICABLE
        double subtotal, totConIva, descu = 0, totalFinal;
        int cantProduct1, cantProduct2;

        Scanner teclado = new Scanner(System.in);

        // SOLICITO LA CANTIDAD DE LOS PRODUCTOS
        System.out.print("Ingrese la cantidad del producto 1 (precio $900): ");
        cantProduct1 = teclado.nextInt();

        System.out.print("Ingrese la cantidad del producto 2 (precio $1500): ");
        cantProduct2 = teclado.nextInt();

        subtotal = (cantProduct1 * precProduct1) + (cantProduct2 * precProduct2);

        // Calcular el total con IVA (10%)
        totConIva = subtotal + (subtotal * iva);

        // VERIFICAR DESCUENTO
        if (totConIva > 5000) {
            // SI LA COMPRA SUPERA LOS 5000, EL ENVIO ES GRATIS
            costoEnvio = 0;
            descu = 0;  // NO APLICA DESCUENTO ADICIONAL, SI TIENE ENVIO GRATIS
        } else if (totConIva > 1000) {
            // TOTAL CON IVA SUPERA LOS 1000, APLICA 20% DESCUENTO
            descu = totConIva * 0.20;
        } else if (totConIva >= 1000) {
            // SI EL TOTAL CON IVA ES 1000, PERO MENOS DE 5000, APLICA 5% DE DESCUENTO
            descu = totConIva * 0.05;
        }

        // Calcular el total final después de aplicar el descuento y añadir el costo de envío
        totalFinal = totConIva - descu + costoEnvio;

        System.out.printf("\nDetalles de la compra:\n");
        System.out.printf("Producto 1 (cantidad: %d) a $%.2f cada uno: $%.2f\n", cantProduct1, precProduct1, cantProduct1 * precProduct1);
        System.out.printf("Producto 2 (cantidad: %d) a $%.2f cada uno: $%.2f\n", cantProduct2, precProduct2, cantProduct2 * precProduct2);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA (10%%): $%.2f\n", subtotal * iva);
        System.out.printf("Descuento aplicado: $%.2f\n", descu);
        System.out.printf("Costo de envio: $%.2f\n", costoEnvio);
        System.out.printf("Total a pagar: $%.2f\n", totalFinal);
    }
 }

    /**
 * Salida: debug:
Ingrese la cantidad del producto 1 (precio $900): 1100
Ingrese la cantidad del producto 2 (precio $1500): 2300

Detalles de la compra:
Producto 1 (cantidad: 1100) a $900,00 cada uno: $990000,00
Producto 2 (cantidad: 2300) a $1500,00 cada uno: $3450000,00
Subtotal: $4440000,00
IVA (10%): $888000,00
Descuento aplicado: $0,00
Costo de envio: $0,00
Total a pagar: $5328000,00
BUILD SUCCESSFUL (total time: 1 minute 15 seconds)
 */

