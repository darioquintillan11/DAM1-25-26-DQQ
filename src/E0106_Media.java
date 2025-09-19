import java.util.Scanner;

public class E0106_Media {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

    
Scanner sc = new Scanner(System.in);
System.out.print("Introduce el primer numero para calcular la media ");
double n1 = sc.nextDouble();

System.out.print("Introduce el segundo ");
double n2 = sc.nextDouble();

System.out.print("Introduce el tercero ");
double n3 = sc.nextDouble();

double suma = n1 + n2 + n3;
double media = suma / 3;
System.out.println(media);

}
}