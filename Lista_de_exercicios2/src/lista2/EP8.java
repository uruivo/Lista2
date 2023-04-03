package lista2;
import java.util.Scanner;
public class EP8 {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor do salário base: ");
	        double salarioBase = sc.nextDouble();

	        System.out.print("Digite o valor da gratificação: ");
	        double gratificacao = sc.nextDouble();

	        double salarioBruto = salarioBase + gratificacao;
	        double imposto;
	        if (salarioBruto < 2500.0) {
	            imposto = salarioBruto * 0.1;
	        } else {
	            imposto = salarioBruto * 0.15;
	        }
	        double salarioLiquido = salarioBruto - imposto;

	        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
	        System.out.printf("Gratificação: R$ %.2f%n", gratificacao);
	        System.out.printf("Imposto: R$ %.2f%n", imposto);
	        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

	        sc.close();
	    }
	}


