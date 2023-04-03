package lista2;
import java.util.Scanner;
public class EP12 {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int opcao = 0;

	        while (opcao != 4) {

	            System.out.println("**** Menu de Opções *****");
	            System.out.println("1. Somar dois números");
	            System.out.println("2. Raiz quadrada de um número");
	            System.out.println("3. Elevar um número a uma potência");
	            System.out.println("4. Sair");
	            System.out.println("**************************");

	            System.out.print("Digite a opção desejada: ");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o primeiro número: ");
	                    double num1 = sc.nextDouble();
	                    System.out.print("Digite o segundo número: ");
	                    double num2 = sc.nextDouble();
	                    double resultadoSoma = num1 + num2;
	                    System.out.println("O resultado da soma é: " + resultadoSoma);
	                    break;

	                case 2:
	                    System.out.print("Digite o número: ");
	                    double num = sc.nextDouble();
	                    double resultadoRaiz = Math.sqrt(num);
	                    System.out.println("A raiz quadrada de " + num + " é: " + resultadoRaiz);
	                    break;

	                case 3:
	                    System.out.print("Digite o número: ");
	                    double base = sc.nextDouble();
	                    System.out.print("Digite o expoente: ");
	                    double expoente = sc.nextDouble();
	                    double resultadoPotencia = Math.pow(base, expoente);
	                    System.out.println(base + " elevado a " + expoente + " é: " + resultadoPotencia);
	                    break;

	                case 4:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	                    break;
	            }

	            System.out.println();
	        }

	        sc.close();
	    }

	}

	
