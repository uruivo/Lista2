package lista2;
import java.util.Scanner;
public class EP3 {


	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Digite o nome do aluno: ");
	      String nome = sc.nextLine();
	      System.out.print("Digite a primeira nota: ");
	      double nota1 = sc.nextDouble();
	      System.out.print("Digite a segunda nota: ");
	      double nota2 = sc.nextDouble();
	      System.out.print("Digite a terceira nota: ");
	      double nota3 = sc.nextDouble();
	      System.out.print("Digite a quarta nota: ");
	      double nota4 = sc.nextDouble();

	      double media = (nota1 + nota2 + nota3 + nota4) / 4;
	      String classificacao = "";

	      if (media >= 9.0) {
	         classificacao = "Excelente";
	      } else if (media >= 7.0 && media < 9.0) {
	         classificacao = "Bom";
	      } else if (media >= 5.0 && media < 7.0) {
	         classificacao = "Regular";
	      } else {
	         classificacao = "Insuficiente";
	      }

	      System.out.println("\nNome do aluno: " + nome);
	      System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
	      System.out.println("Média: " + media);
	      System.out.println("Classificação: " + classificacao);
	   }
	}


