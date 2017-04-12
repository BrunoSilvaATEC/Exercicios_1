package dificuldade1;

import java.util.Scanner;

public class Exer20 {
	/*Crie um programa que

    Pede ao utilizador que idade tem
    Mostra na consola em que ano nasceu
    Pede ao utilizador um ano futuro
    Mostra ao utilizador que idade terá nesse ano
	 */
	public Exer20(){
		int idade,ano;
		Scanner n = new Scanner(System.in);
		System.out.println("  Insira a sua idade: ");
		idade=n.nextInt();
		System.out.println("  Nasceu em " + (2017-idade));
		
		System.out.println("  Insira um ano futuro: ");
		ano=n.nextInt();
		System.out.println("  Ira ter " + ((ano-2017)+idade));
		
		
	}
}
