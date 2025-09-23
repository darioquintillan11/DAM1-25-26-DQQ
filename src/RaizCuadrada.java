import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        double raiz = Math.sqrt(num);

        sc.close();

        System.out.println("La raíz cuadrada de " + num + " es " + raiz);

    }
}
