package lista2;
import java.util.Scanner;
public class EP1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = scanner.nextInt();

	        if (num1 > num2) {
	            System.out.println(num1 + " é o maior número.");
	        } else if (num2 > num1) {
	            System.out.println(num2 + " é o maior número.");
	        } else {
	            System.out.println("Os números são iguais.");
	        }

	        scanner.close();
	    }
	}


