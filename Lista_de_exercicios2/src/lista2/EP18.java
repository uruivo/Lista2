package lista2;
import java.util.Scanner;
public class EP18 {



	    public static void main(String[] args) {
	        
	        // cria um objeto Scanner para ler as entradas do usuário
	        Scanner sc = new Scanner(System.in);
	        
	        // lê as 4 notas do aluno
	        System.out.println("Digite as 4 notas do aluno (separadas por espaço):");
	        int nota1 = sc.nextInt();
	        int nota2 = sc.nextInt();
	        int nota3 = sc.nextInt();
	        int nota4 = sc.nextInt();
	        
	        // calcula a média das notas
	        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
	        
	        // lê a quantidade de aulas dadas e a quantidade de presenças do aluno
	        System.out.println("Digite a quantidade total de aulas dadas:");
	        int totalAulas = sc.nextInt();
	        System.out.println("Digite a quantidade de presenças do aluno:");
	        int presencas = sc.nextInt();
	        
	        // verifica qual prêmio o aluno ganhou
	        if (media > 80 && presencas == totalAulas) {
	            System.out.println("O aluno ganhou uma excursão!");
	        } else if (media > 80 || presencas == totalAulas) {
	            System.out.println("O aluno ganhou uma camiseta!");
	        } else if (media >= 70 && media <= 80 && presencas == totalAulas) {
	            System.out.println("O aluno ganhou um squeeze!");
	        } else if (media >= 70 && media <= 80 || presencas == totalAulas) {
	            System.out.println("O aluno ganhou uma caneta personalizada!");
	        } else {
	            System.out.println("Não há prêmios para esse aluno.");
	        }
	        
	        // fecha o objeto Scanner
	        sc.close();
	    }
	}


