package dificuldade3;

import java.util.Scanner;

public class Exer10 {
	/*Elabore um m�todo que visa representar uma calculadora.

	A calculadora deve cumprir os seguintes requisitos

    Pede ao utilizador um n�mero 1
    Pede ao utilizador uma opera��o
        '+' : soma os dois n�meros
        '-' : subtrai o segundo ao primeiro n�mero
        '*' : multiplica os dois n�meros
        '/' : divide o primeiro n�mero pelo segundo
        '0' : sai do programa
    Pede ao utilizador um n�mero 2
    Mostra na consola o resultado da opera��o
	 */
	public Exer10(){
		int num1,num2 = 0,opcao;
		Scanner n = new Scanner (System.in);
		do{
	System.out.println(" Insira um numero: ");	
	num1=n.nextInt();	
	
	System.out.println("1: +\n 2: -\n 3:*\n 4:/\n 0-Sair");
	opcao=n.nextInt();

	switch (opcao){
	case 1: 
		System.out.println(" Insira outro numero: ");	
		num2=n.nextInt();	
		num1=num1+num2;
		System.out.println(" O resultado da soma � " + num1);break;	
	case 2:
			if (num1<num2)
			{
				System.out.println(" Insira outro numero: ");	
				num2=n.nextInt();	
				num1=num2-num1;
				System.out.println(" O resultado da subtra��o � " + num1);break;
			}
			else 
			{
				System.out.println(" Insira outro numero: ");	
				num2=n.nextInt();	
				num1=num1-num2;
				System.out.println(" O resultado da subtra��o � " + num1);break;
			}
	case 3:
		System.out.println(" Insira outro numero: ");	
		num2=n.nextInt();	
		num1=num1*num2;
		System.out.println(" O resultado da multiplica��o � " + num1);break;
	case 4: 
		System.out.println(" Insira outro numero: ");	
		num2=n.nextInt();	
		num1=num1/num2;
		System.out.println(" O resultado da divi��o � " + num1);break;
	}
  }while(opcao!=0);
}
	
}
