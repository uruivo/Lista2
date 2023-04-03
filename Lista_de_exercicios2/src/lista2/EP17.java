package lista2;
import java.util.Scanner;
public class EP17 {



	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = entrada.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = entrada.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = entrada.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3;

	        if (media >= 6.0) {
	            System.out.println("Aluno aprovado!");
	        } else if (media < 5.0) {
	            System.out.println("Aluno reprovado!");
	        } else {
	            System.out.println("Aluno em recuperação.");
	            System.out.print("Digite a nota da recuperação: ");
	            double notaRec = entrada.nextDouble();
	            double novaMedia = (media + notaRec) / 2;
	            if (novaMedia < 6.0) {
	                System.out.println("Aluno reprovado!");
	            } else {
	                System.out.println("Aluno aprovado por recuperação!");
	            }
	        }

	        entrada.close();
	    }
	}


