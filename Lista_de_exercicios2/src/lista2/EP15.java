package lista2;
import java.util.Scanner;
public class EP15 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leitura dos valores literais
	        System.out.print("Digite o valor da primeira variável: ");
	        String var1 = scanner.nextLine();

	        System.out.print("Digite o valor da segunda variável: ");
	        String var2 = scanner.nextLine();

	        // Troca de conteúdos
	        String temp = var1;
	        var1 = var2;
	        var2 = temp;

	        // Impressão dos novos valores das variáveis
	        System.out.println("Novo valor da primeira variável: " + var1);
	        System.out.println("Novo valor da segunda variável: " + var2);

	        scanner.close();
	    }
	}


