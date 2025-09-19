import java.util.Scanner;

public class MayorDeEdad {
public static void main(String[] args) throws Exception {
final int MAYORIA_DE_EDAD = 18;

Scanner sc = new Scanner(System.in);
System.out.print("Introduce tu nombre: ");
String nombre = sc.nextLine();
System.out.print("Introduce tu edad: ");
int edad = sc.nextInt();
boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;
String mayorEdad;
if (mayorDeEdad == true ) {
    mayorEdad = "mayor edad";
} else {
    mayorEdad = "menor edad";
}
sc.close();
// * prueba //
System.out.print(nombre + " tu edad es " + edad + " por lo tanto eres " + mayorEdad);

}
}