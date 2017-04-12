package dificuldade1;

import java.util.Scanner;

public class Exer5 {
	/*Indique o código em que:

    Vai pedindo números a um utilizador
    Soma cada valor recebido
    Interrompe quando o utilizador introduz o número 0
    Mostra no ecrã a soma de todos os números introduzidos
	*/
	public Exer5(){
	int numero = 0, soma=0;
	Scanner n = new Scanner(System.in);
	do {
	
		System.out.println(" Insira um numero: ");
		numero=n.nextInt();
		soma+=numero;
	}while(numero!=0);	
		
	System.out.println(" A soma dos numeros é : " + soma);	
	}

}
