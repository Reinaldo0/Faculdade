package atividades;

import java.util.Scanner;

public class Atividade004 {

	public static void main(String[] args) {
  		//Declara��o das vari�veis.
  		double valor; 
  		double valorNovo;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o valor:");
  		valor = teclado.nextDouble();
  		
  		valorNovo = (valor + (valor * (15.8/100)));
  		
  		//Caso de teste 1486,45 deve gerar como resultado 1721,3091.
  		
	  	//Processamento e Sa�da
 		System.out.println("Valor novo:" + valorNovo);
 		
 		teclado.close();
	}

}
