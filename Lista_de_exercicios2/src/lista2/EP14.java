package lista2;
import java.util.Scanner;
public class EP14 {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Digite o valor do saque: ");
	        int saque = input.nextInt();
	        int notas100 = saque / 100;
	        saque = saque % 100;
	        int notas50 = saque / 50;
	        saque = saque % 50;
	        int notas20 = saque / 20;
	        saque = saque % 20;
	        int notas10 = saque / 10;
	        saque = saque % 10;
	        int notas5 = saque / 5;
	        saque = saque % 5;
	        int notas2 = saque / 2;
	        System.out.println("Serão necessárias:");
	        System.out.println(notas100 + " notas de 100 reais");
	        System.out.println(notas50 + " notas de 50 reais");
	        System.out.println(notas20 + " notas de 20 reais");
	        System.out.println(notas10 + " notas de 10 reais");
	        System.out.println(notas5 + " notas de 5 reais");
	        System.out.println(notas2 + " notas de 2 reais");
	    }

	}


