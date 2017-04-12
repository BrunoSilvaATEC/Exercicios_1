package dificuldade2;

import java.io.InputStream;
import java.util.Scanner;

public class Exer7 {
	/*
	Uma equipa de Formula 1 quer comparar os tempos de volta dos seus tr�s pilotos.
	Indique o c�digo em que:
    Pede os tempos de volta de cada um dos pilotos
    Compara os tr�s tempos e indica qual dos 3 foi o mais r�pido e qual dos 3 � desclassificado
    Mostra na consola
        Qual dos tr�s pilotos foi o mais r�pido
        Que piloto ficou desclassificado, com o pior tempo
        A soma dos 3 tempos

	 */
	public Exer7(){
		
		double [] tempos =  new double [8];
		double rapido = 88880, desc = 0;
		int rapidopil = 0, descpil=0; 
		
		Scanner n = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			System.out.println(" Insira o tempo do " + (i+1) + " piloto");
			tempos[i]=n.nextDouble();
			
			if (rapido>tempos[i])
			{
				rapido=tempos[i];
				rapidopil=i;
			}
			if (desc<tempos[i])
			{
				desc=tempos[i];
				descpil=i;
			}
		}
		System.out.println(" O mais rapido foi o "+ (rapidopil+1) + " piloto e o piloto desclassificado foi o " + (descpil+1));
	}

	

}
