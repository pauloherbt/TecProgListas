package lista;

import java.util.Random;

public class Exerc16 {
	public static void povoarVetor(int vetA[]){
		Random gerador=new Random();
		for(int i=0;i<vetA.length;i++) {
			vetA[i]=gerador.nextInt(101);
		}
	}
	//Questao 16
	public static int[] polarizaçao(int vetA[]) {
		int vetResultante[]=new int[vetA.length];
		int index=0;
		for (int i = 0; i < vetA.length; i++) {
			if(!(vetA[i]%2==0)) {
				vetResultante[index]=vetA[i];
				index++;
			}
		}
		for (int i = vetA.length-1; i >=0; i--) {
			if(vetA[i]%2==0) {
				vetResultante[index]=vetA[i];
				index++;
			}
		}
		return vetResultante;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetA[]=new int[10];
		povoarVetor(vetA);
		int vetResultante[]=polarizaçao(vetA);
		for (int i = 0; i < vetResultante.length; i++) {
			System.out.print(vetResultante[i]+" ");
		}
		}
	}
