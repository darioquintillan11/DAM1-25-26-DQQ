public class App {
/**
 * Programa principal
 * 
 */
public static void main(String[] args) throws Exception {
final int MAYORIA_DE_EDAD = 21;
/* Mensajes iniciales para el usuario
 * 
 *Saludamos al usuario y le decimos lo que vamos a hacer
*/

System.out.println("Hello, World! My name is DQQ");
System.out.print("Vamos a a prender java. ");
System.out.println("Comenzamos con los elementos del lenguaje");

int edad;
edad = 18;
boolean mayorDeEdad = false;
mayorDeEdad = edad >= MAYORIA_DE_EDAD;

System.out.println(edad);
String nombre = null;

double importe = 123.56;


char letra = 'A';


System.out.print("tengo " + edad + " años ");
// System.out.println("y " + importe + " euros");

System.out.println("Tengo " + edad +" años la mayoría de edad es a los " + MAYORIA_DE_EDAD + " años");
System.out.println("Soy mayor de edad? " + mayorDeEdad);
        





}
}