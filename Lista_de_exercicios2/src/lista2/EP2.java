package lista2;
import java.util.Scanner;
public class EP2 {

	

	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o primeiro número: ");
	    int num1 = input.nextInt();
	    
	    System.out.print("Digite o segundo número: ");
	    int num2 = input.nextInt();
	    
	    System.out.print("Digite o terceiro número: ");
	    int num3 = input.nextInt();
	    
	    int menor = num1; // inicializa a variável menor com o primeiro número
	    
	    // verifica se o segundo número é menor que o atual menor
	    if (num2 < menor) {
	      menor = num2;
	    }
	    
	    // verifica se o terceiro número é menor que o atual menor
	    if (num3 < menor) {
	      menor = num3;
	    }
	    
	    System.out.println("O menor número é: " + menor);
	  }
	}


