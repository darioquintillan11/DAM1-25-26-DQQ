import java.util.Scanner;

public class AreaTriangulo {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

    
Scanner sc = new Scanner(System.in);
System.out.print("Introduce el primer numero para calcular el área ");
double n1 = sc.nextDouble();
System.out.print("Introduce el segundo numero para calcular el área ");
double n2 = sc.nextDouble();

double area = (n1 * n2) / 2;
System.out.println(area);

}
}