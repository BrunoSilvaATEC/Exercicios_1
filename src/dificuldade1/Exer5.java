package dificuldade1;

import java.util.Scanner;

public class Exer5 {
	/*Indique o c�digo em que:

    Vai pedindo n�meros a um utilizador
    Soma cada valor recebido
    Interrompe quando o utilizador introduz o n�mero 0
    Mostra no ecr� a soma de todos os n�meros introduzidos
	*/
	public Exer5(){
	int numero = 0, soma=0;
	Scanner n = new Scanner(System.in);
	do {
	
		System.out.println(" Insira um numero: ");
		numero=n.nextInt();
		soma+=numero;
	}while(numero!=0);	
		
	System.out.println(" A soma dos numeros � : " + soma);	
	}

}
