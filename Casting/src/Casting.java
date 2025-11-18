import java.util.Scanner;

public class Casting {

     public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Digit um numero:");
         double numero = (double) sc.nextDouble();
         System.out.println(numero);
         sc.close();


     }

}
