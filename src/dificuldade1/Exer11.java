package dificuldade1;

import java.util.Scanner;

public class Exer11 {
/*Média CursoElabore um método devolve a média de um curso de curta duração composto por 5 módulos.

	Certifique-se que o seu programa cumpre os seguintes requisitos

    Declara um array do tipo double com a dimensão 5
    Pede ao utilizador as 5 notas que lhe foram atribuídas
    Cada nota é armazenada na respectiva posição do array
    Mostre na consola a média de curso obtida
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
		System.out.println("A media é " + (soma/5));
	}
}
