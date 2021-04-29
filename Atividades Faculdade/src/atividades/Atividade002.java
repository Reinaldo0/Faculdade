package atividades;

import java.util.Scanner;

public class Atividade002 {

	public static void main(String[] args) {
		
  		//Declaração das variáveis.
  		int V1; 
  		int V2;
  		int V3;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
	  	V1 = teclado.nextInt();	  	
	  	
	  	System.out.println("Digite o numero 2:");	  	
	  	V2 = teclado.nextInt();
	  	
	  	System.out.println("Digite o numero 2:");	  	
	  	V3 = teclado.nextInt();		  	
	  		
	  	//Processamento e Saída
 		System.out.println("Operação 1:" + (V1 + V2));
 		System.out.println("Operação 2:" + (V2 - V1));
 		System.out.println("Operação 3:" + (V3 * V1));
 		System.out.println("Operação 4:" + (V3 + V2));
 		System.out.println("Operação 5:" + (V3 - V2));
 		System.out.println("Operação 6:" + (V1 + V2 + V3));
 		
 		teclado.close();
	}	

}

