package lista4;

import java.util.Scanner;

public class Exerc06 {
	public static void calcTempo(double massa) {
		int tempoSegundos=0;
		System.out.println("A massa inicial eh: "+massa);
		for(;massa>=0.5;massa/=2) {
			tempoSegundos+=50;
		}
		int segundos=tempoSegundos%60;
		int minutos=tempoSegundos/60;
		int horas=minutos/60;
		System.out.println("A massa final eh: "+massa);
		System.out.println("segundos: "+segundos);
		System.out.println("minutos: "+minutos);
		System.out.println("horas: "+horas);
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Insira a massa(g)");
		calcTempo(input.nextDouble());
		
	}

}
