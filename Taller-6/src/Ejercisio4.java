import java.util.Scanner;
/**
 *
 * @author Juan Quizhpe
 */
public class Ejercisio4 {
    public static void main(String[] args) {
        
        int mes;
         
        System.out.print("INGRESE ALGUN NUMERO DE 1 al 12:");
        Scanner teclado = new Scanner(System.in);
        
        mes = teclado.nextInt();
        switch(mes)
        {
            case 1:
                System.out.println("ENERO");;
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
             case 6:
                 System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
             case 11:
                 System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default: 
                System.out.println("MES NO EXISTENTE");
                break;
        }
    }
    }
    /***
     * debug:
     * INGRESE ALGUN NUMERO DE 1 al 12: 6
       JUNIO
       BUILD SUCCESSFUL (total time: 5 seconds)
     */
