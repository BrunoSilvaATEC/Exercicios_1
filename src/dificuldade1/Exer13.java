package dificuldade1;

import java.util.Scanner;

public class Exer13 {
	/*Indique o código em que:

    Declare 4 variáveis do tipo inteiro correspondentes ao número de golos que um dado avançado marcou em 4 jogos
    Inicialize as 4 variáveis com valores a seu gosto
    Mostre na consola a média de golos que esse avançado tem por jogo
	*/
	
	public Exer13(){
		int [] golos =  {2,3,8,4};	
		int soma=0;
		Scanner n = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			soma+=golos[i];
		}
		
		System.out.println("A media de golos é " + (soma/4));
		
	}
}
