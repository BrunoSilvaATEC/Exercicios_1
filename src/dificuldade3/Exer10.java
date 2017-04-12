package dificuldade3;

import java.util.Scanner;

public class Exer10 {
	/*Elabore um método que visa representar uma calculadora.

	A calculadora deve cumprir os seguintes requisitos

    Pede ao utilizador um número 1
    Pede ao utilizador uma operação
        '+' : soma os dois números
        '-' : subtrai o segundo ao primeiro número
        '*' : multiplica os dois números
        '/' : divide o primeiro número pelo segundo
        '0' : sai do programa
    Pede ao utilizador um número 2
    Mostra na consola o resultado da operação
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
		System.out.println(" O resultado da soma é " + num1);break;	
	case 2:
			if (num1<num2)
			{
				System.out.println(" Insira outro numero: ");	
				num2=n.nextInt();	
				num1=num2-num1;
				System.out.println(" O resultado da subtração é " + num1);break;
			}
			else 
			{
				System.out.println(" Insira outro numero: ");	
				num2=n.nextInt();	
				num1=num1-num2;
				System.out.println(" O resultado da subtração é " + num1);break;
			}
	case 3:
		System.out.println(" Insira outro numero: ");	
		num2=n.nextInt();	
		num1=num1*num2;
		System.out.println(" O resultado da multiplicação é " + num1);break;
	case 4: 
		System.out.println(" Insira outro numero: ");	
		num2=n.nextInt();	
		num1=num1/num2;
		System.out.println(" O resultado da divição é " + num1);break;
	}
  }while(opcao!=0);
}
	
}
