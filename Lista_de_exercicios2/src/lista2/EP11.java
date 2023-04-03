package lista2;
import java.util.Scanner;
public class EP11 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor do lado X: ");
	        double x = sc.nextDouble();
	        System.out.print("Digite o valor do lado Y: ");
	        double y = sc.nextDouble();
	        System.out.print("Digite o valor do lado Z: ");
	        double z = sc.nextDouble();

	        if (x < y + z && y < x + z && z < x + y) { // verifica se forma um triângulo
	            if (x == y && y == z) {
	                System.out.println("É um triângulo equilátero.");
	            } else if (x == y || x == z || y == z) {
	                System.out.println("É um triângulo isósceles.");
	            } else {
	                System.out.println("É um triângulo escaleno.");
	            }
	        } else {
	            System.out.println("Não é possível formar um triângulo com esses valores.");
	        }

	        sc.close();
	    }
	}


