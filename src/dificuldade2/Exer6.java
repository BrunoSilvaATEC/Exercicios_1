package dificuldade2;

import java.util.Scanner;

public class Exer6 {
	/*
    Declare duas variaveis do tipo inteiro
    Peça ao utilizador para introduzir dois números diferentes
    Mostre todos os números pares entre os números introduzidos
	*/
	public Exer6(){
		int num1 = 0, num2=0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		num1=n.nextInt();
		System.out.print("Insira um numero: ");
		num2=n.nextInt();
		
		if (num1>num2)
		{
			for (int i =num2 ;i<=num1;i++)
				{ 
					if (i%2==0)
					{
					System.out.println(i);
					}
				}
		}
		
	if (num1<num2)
	{
		for (int i=num1 ;i<=num2;i++)
		{ 
			if (i%2==0)
			{
			System.out.println(i);
			}
		}
	}
 }
}
