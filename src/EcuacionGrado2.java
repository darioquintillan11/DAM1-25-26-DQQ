import java.util.Scanner;

public class EcuacionGrado2 {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.print("Introduce el valor de a: ");
double a = sc.nextDouble();
System.out.print("Introduce el valor de b: ");
double b = sc.nextDouble();
System.out.print("Introduce el valor de c: ");
double c = sc.nextDouble();
sc.close();
double raiz = Math.pow(b,2)-(4*a*c);
double resultadoRaiz = Math.sqrt(-raiz);
double x = (-b + raiz)/(2.*a);
System.out.println(raiz);
System.out.println(resultadoRaiz);
System.out.println(x);
}
}    

