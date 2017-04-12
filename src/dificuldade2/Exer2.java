package dificuldade2;

import java.util.Scanner;

public class Exer2 {
	/*Indique o código em que:

    É pedido ao utilizador que introduza 5 caracteres ;
    Os valores são gravados num array de char;
    Quantos caracteres correspondem a um número entre 0 e 9
	*/	
	public Exer2(){
		char [] caracteres = new char [1] ;
		int count = 0;
		Scanner n = new Scanner (System.in);
		for (int i = 1; i<=5;i++)
		{
			
		    System.out.println("Insira " + i + " caracter ");
		    caracteres[0] = n.next().charAt(0);
		   
		    if (Character.isDigit(caracteres[0])){
		    	count++;
		    }
		   
		}
		System.out.println("Numero de numeros: " + count);
	} 
}