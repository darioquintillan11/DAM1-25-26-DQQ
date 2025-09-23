import java.util.Scanner;


public class EO108_Par {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);
System.out.print("Introduce el numero para calcular si es par o impar: ");
double numero = sc.nextDouble();
sc.close();
boolean esPar = numero % 2 == 0;
System.out.println(esPar);


}
}

