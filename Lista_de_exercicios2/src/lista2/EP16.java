package lista2;
import java.util.Scanner;
public class EP16 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um ano: ");
	        int ano = sc.nextInt();

	        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
	            System.out.println(ano + " é um ano bissexto");
	        } else {
	            int proximoBissexto = ano;
	            while ((proximoBissexto % 4 != 0) || (proximoBissexto % 100 == 0 && proximoBissexto % 400 != 0)) {
	                proximoBissexto++;
	            }
	            System.out.println(ano + " não é um ano bissexto. O próximo ano bissexto é " + proximoBissexto);
	        }

	        sc.close();
	    }
	}

