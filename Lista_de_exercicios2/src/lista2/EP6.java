package lista2;
import java.util.Scanner;
public class EP6 {


	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Informe o seu sexo (M para Masculino e F para Feminino): ");
	      String sexo = sc.next();
	      System.out.print("Informe a sua altura em centímetros: ");
	      double altura = sc.nextDouble();
	      
	      double pesoIdeal = 0;
	      if (sexo.equals("M")) {
	         pesoIdeal = 52 + (0.75 * (altura - 152.4));
	      } else if (sexo.equals("F")) {
	         pesoIdeal = 52 + (0.67 * (altura - 152.4));
	      }
	      
	      System.out.printf("O seu peso ideal é %.2f kg", pesoIdeal);
	   }
	}


