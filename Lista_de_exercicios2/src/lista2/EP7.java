package lista2;
import java.util.Scanner;
public class EP7 {



	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        int nota1, nota2, nota3;
	        double media;
	        
	        System.out.println("Digite a primeira nota:");
	        nota1 = entrada.nextInt();
	        
	        System.out.println("Digite a segunda nota:");
	        nota2 = entrada.nextInt();
	        
	        System.out.println("Digite a terceira nota:");
	        nota3 = entrada.nextInt();
	        
	        if(nota1 >= nota2 && nota1 >= nota3) {
	            media = (nota1*4 + nota2*2 + nota3*2) / 8.0;
	        } else if(nota2 >= nota1 && nota2 >= nota3) {
	            media = (nota2*4 + nota1*2 + nota3*2) / 8.0;
	        } else {
	            media = (nota3*4 + nota1*2 + nota2*2) / 8.0;
	        }
	        
	        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
	        System.out.println("Média: " + media);
	        
	        if(media >= 50) {
	            System.out.println("Situação: APROVADO");
	        } else if(media >= 45) {
	            System.out.println("Situação: RECUPERAÇÃO");
	        } else {
	            System.out.println("Situação: REPROVADO");
	        }
	        
	        entrada.close();
	    }

	}


