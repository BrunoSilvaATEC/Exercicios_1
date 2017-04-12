package dificuldade1;

import java.util.Scanner;

public class Exer1 {
	
/*	Indique o código em que:
	    é pedido ao utilizador 5 valores entre 1 a 100 ao utilizador entre 1 e 100;
	    os valores são gravados num array;
	    Através de um ciclo, determine qual é o maior valor e o menor.*/
	
	public Exer1 (){
		int[] numeros ;
		int maior=0, menor = 100;
		numeros = new int[10];
	
		for (int i = 1; i<=5;i++)
		{
			Scanner n = new Scanner (System.in);
					
		    System.out.println("Insira " + i + " numero entre 1 e 100 ");
			numeros[i]=n.nextInt();
			
		
			 if (maior<numeros[i])
			{
				 maior=numeros[i];
			}
			if (menor>numeros[i])
			{
				menor=numeros[i];
			}
			 
		}
		
		System.out.println(" Numero menor: " + menor + "\n Numero maior : " + maior );
	}


}