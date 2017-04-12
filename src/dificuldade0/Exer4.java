package dificuldade0;

public class Exer4 {
	/*Indique o código que resolve o seguinte

    Declarar um array com valores 3, 5, 6, 1
    Crie um ciclo que soma os valores do array que criou
    Mostre na consola o valor da soma do array

 	O valor da soma dos valores declarados no array é de: 15. */
	public Exer4(){
		int[] numeros = {3,5,6,1};
		int soma=0;
		
		
		for (int i =0;i<=3;i++)
		{
			soma+=numeros[i];
		}
		System.out.println(" A soma é " + soma);
	}
}
