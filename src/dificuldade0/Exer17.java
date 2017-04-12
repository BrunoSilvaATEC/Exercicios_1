package dificuldade0;

import java.util.Scanner;

public class Exer17 {
	/*Indique o código em que:

    Pede ao utilizador 2 números
    Mostra no ecrã
    Que número é o maior
    A média desses números
*/
	public Exer17(){
		int num1,num2;
		Scanner n = new Scanner(System.in);
		System.out.println("  Insira um numero: ");
		num1=n.nextInt();
		System.out.println("   Insira outro numero: ");
		num2=n.nextInt();
		
		if (num1<num2)
		{
			System.out.println("  O numero maior é o " + num2+ " media: " + ((num2+num1)/2)); 
		}
		else if (num1>num2)
		{
			System.out.println("  O numero maior é o " + num1+ " media: " + ((num2+num1)/2)); 
		}
		else 
		{
			System.out.println("  São iguais"); 
			
		}
	}

}
