package dificuldade1;

import java.util.Scanner;

public class Exer13 {
	/*Indique o c�digo em que:

    Declare 4 vari�veis do tipo inteiro correspondentes ao n�mero de golos que um dado avan�ado marcou em 4 jogos
    Inicialize as 4 vari�veis com valores a seu gosto
    Mostre na consola a m�dia de golos que esse avan�ado tem por jogo
	*/
	
	public Exer13(){
		int [] golos =  {2,3,8,4};	
		int soma=0;
		Scanner n = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			soma+=golos[i];
		}
		
		System.out.println("A media de golos � " + (soma/4));
		
	}
}
