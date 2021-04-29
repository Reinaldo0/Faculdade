package atividades;

import java.util.Scanner;

public class Atividade006 {

	public static void main(String[] args) {

		final double VALOR_HORA = 32.00;
		
  		String nome; 
  		int numeroHoras;
  		int dependentes;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Nome:");
  		nome = teclado.next();

  		System.out.println("Horas:");
  		numeroHoras = teclado.nextInt();
  		
  		System.out.println("Dependentes:");
  		dependentes = teclado.nextInt();  
  		

  	    double salarioBruto   = numeroHoras * VALOR_HORA + dependentes * 40;
  	    double valorINSS      = salarioBruto * 8.5 / 100;
  	    double valorIR        = salarioBruto * 5 / 100;
  	    double salarioLiquido = salarioBruto - valorINSS - valorIR;  	
  	    
	  	//Saída
  	    System.out.println("Nome:" + nome);
 		System.out.println("Bruto:" + salarioBruto);
 		System.out.println("INSS:" + valorINSS);
 		System.out.println("IR:" + valorIR);
 		System.out.println("Liquido:" + salarioLiquido);
 		
  		teclado.close();
	}
	
}
