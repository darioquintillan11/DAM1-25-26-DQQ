    import java.util.Scanner;

public class DistanciaEntreDosPuntos {
/**
 * @author Darío
 * 
 */
public static void main(String[] args) throws Exception {

    
Scanner sc = new Scanner(System.in);
System.out.print("Introduce x1 ");
double x1 = sc.nextDouble();
System.out.print("Introduce x1 ");
double y1 = sc.nextDouble();
System.out.print("Introduce x2 ");
double x2 = sc.nextDouble();
System.out.print("Introduce y2 ");
double y2 = sc.nextDouble();
        sc.close();

double distancia = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
System.out.println(distancia);

}
}

