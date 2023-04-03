package lista2;
import java.util.Scanner;
public class EP10 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Informe o peso (em kg): ");
	        double peso = sc.nextDouble();

	        System.out.print("Informe a altura (em metros): ");
	        double altura = sc.nextDouble();

	        double imc = peso / (altura * altura);
	        System.out.printf("IMC: %.2f\n", imc);

	        if (imc < 18.5) {
	            System.out.println("Classificação: Abaixo do peso");
	        } else if (imc < 25) {
	            System.out.println("Classificação: Peso normal");
	        } else if (imc < 30) {
	            System.out.println("Classificação: Sobrepeso");
	        } else if (imc < 35) {
	            System.out.println("Classificação: Obesidade grau 1");
	        } else if (imc < 40) {
	            System.out.println("Classificação: Obesidade grau 2");
	        } else {
	            System.out.println("Classificação: Obesidade grau 3");
	        }
	    }
	}

