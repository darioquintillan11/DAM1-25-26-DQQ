import java.util.Scanner;


public class EP0114_Segundos {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Introduce el numero de horas: ");
double horas = sc.nextDouble();

System.out.print("Introduce el numero de minutos: ");
double minutos = sc.nextDouble();

System.out.print("Introduce el numero de segundos: ");
double segundos = sc.nextDouble();
sc.close();
double segundosTotales = (horas * 3600) + (minutos * 60) + segundos;

System.out.println("Son un total de: " + segundosTotales + " segundos");



}
}
