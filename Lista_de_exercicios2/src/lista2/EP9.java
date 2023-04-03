package lista2;
import java.util.Scanner;
public class EP9 {

	    public static void main(String[] args) {
	        double salario, novoSalario;
	        int bonus = 500, auxilioEscola = 300;
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Informe o salário atual do funcionário: R$ ");
	        salario = entrada.nextDouble();

	        novoSalario = salario + bonus + auxilioEscola;

	        System.out.println("O novo salário do funcionário é R$ " + novoSalario);
	        System.out.println("Este valor inclui um bônus de R$ " + bonus + " e um auxílio escola de R$ " + auxilioEscola);
	    }
	}


