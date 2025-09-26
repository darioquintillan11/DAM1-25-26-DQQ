import java.util.Scanner;


public class EP0111_IVA {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);
System.out.print("Introduce el numero para calcular su iva: ");

double numero = sc.nextDouble();
System.out.print("Introduce el iva: ");

double iva = sc.nextDouble();
sc.close();
double resultado = numero * iva / 100;
System.out.println("El importe del iva es: " + resultado);
System.out.println("El importe total es: " + (resultado + numero));



}
}
