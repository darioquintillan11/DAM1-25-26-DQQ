import java.util.Scanner;


public class EP0121_CelsiusAFarenheit {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Introduce los grados celsius: ");
double celsius = sc.nextDouble();
sc.close();
double fahrenheit = celsius * (9/5.) + 32;
System.out.println(fahrenheit);
}
}