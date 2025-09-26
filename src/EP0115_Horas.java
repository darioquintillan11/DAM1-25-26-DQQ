import java.util.Scanner;


public class EP0115_Horas {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Introduce el numero de segundos: ");
double segundos = sc.nextDouble();
sc.close();

double horas = segundos / 3600;

double minutos = segundos / 60;

System.out.println("Son un total de: " + horas + " horas");
System.out.println("Son un total de: " + minutos + " minutos");
System.out.println("Son un total de: " + segundos + " segundos");


}
}