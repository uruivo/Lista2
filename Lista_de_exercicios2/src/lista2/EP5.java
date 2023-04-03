package lista2;
import java.util.Scanner;
public class EP5 {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Lê os 3 valores do usuário
	        System.out.print("Digite o primeiro valor: ");
	        int valor1 = input.nextInt();
	        System.out.print("Digite o segundo valor: ");
	        int valor2 = input.nextInt();
	        System.out.print("Digite o terceiro valor: ");
	        int valor3 = input.nextInt();

	        // Verifica se o terceiro valor está entre os dois primeiros
	        if (valor3 > valor1 && valor3 < valor2 || valor3 > valor2 && valor3 < valor1) {
	            System.out.println("O terceiro valor está entre os dois primeiros.");
	        } else {
	            System.out.println("O terceiro valor não está entre os dois primeiros.");
	        }

	        input.close();
	    }
	}


