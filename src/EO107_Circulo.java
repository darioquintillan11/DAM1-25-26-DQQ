import java.util.Scanner;

public class EO107_Circulo {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

    
Scanner sc = new Scanner(System.in);
System.out.print("Introduce el radio de un numero para calcular el perimetro y el area: ");
double radio = sc.nextDouble();

double perimetro = radio * 2 * 3.14;
System.out.println("El perímetro del circulo es " + perimetro);
double area = 3.14 * radio * radio;
System.out.println("El área del circulo es " + area);
}
}
