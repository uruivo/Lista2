package lista2;
import java.util.Scanner;
public class EP13 {


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        
	        int horaInicio, minutoInicio, horaFim, minutoFim, duracaoHora, duracaoMinuto;
	        
	        System.out.print("Informe a hora de início do jogo (hora e minuto separados por espaço): ");
	        horaInicio = entrada.nextInt();
	        minutoInicio = entrada.nextInt();
	        
	        System.out.print("Informe a hora de término do jogo (hora e minuto separados por espaço): ");
	        horaFim = entrada.nextInt();
	        minutoFim = entrada.nextInt();
	        
	        if (horaInicio == horaFim && minutoInicio == minutoFim) {
	            duracaoHora = 24;
	            duracaoMinuto = 0;
	        } else {
	            int horaTotal = (horaFim - horaInicio + 24) % 24;
	            int minutoTotal = (minutoFim - minutoInicio + 60) % 60;
	            
	            if (horaTotal == 0 && minutoTotal == 0) {
	                duracaoHora = 24;
	                duracaoMinuto = 0;
	            } else {
	                duracaoHora = horaTotal;
	                duracaoMinuto = minutoTotal;
	            }
	        }
	        
	        System.out.printf("Duração do jogo: %d hora(s) e %d minuto(s)\n", duracaoHora, duracaoMinuto);
	        
	        entrada.close();
	    }
	}


