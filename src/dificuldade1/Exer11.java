package dificuldade1;

import java.util.Scanner;

public class Exer11 {
/*M�dia CursoElabore um m�todo devolve a m�dia de um curso de curta dura��o composto por 5 m�dulos.

	Certifique-se que o seu programa cumpre os seguintes requisitos

    Declara um array do tipo double com a dimens�o 5
    Pede ao utilizador as 5 notas que lhe foram atribu�das
    Cada nota � armazenada na respectiva posi��o do array
    Mostre na consola a m�dia de curso obtida
 */
	public Exer11(){
		double [] notas =  new double [5];
		double soma = 0;
		Scanner n = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			System.out.println("Insira " + (i+1) + " nota: ");
			notas[i]=n.nextDouble();
			soma+=notas[i];
		}
		System.out.println("A media � " + (soma/5));
	}
}
