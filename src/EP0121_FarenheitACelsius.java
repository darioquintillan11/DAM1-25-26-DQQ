import java.util.Scanner;


public class EP0121_FarenheitACelsius {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Introduce los grados fahrenheit: ");
double fahrenheit = sc.nextDouble();
sc.close();
double celsius = (5/9.) * (fahrenheit - 32);
System.out.println(celsius);
}
}