package licao3;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		int i, maior = 0, m = 0;
		for(i=0; i<5; i++)
		{
			System.out.println("Entre com o numero " + (i+1));
			num[i] = input.nextInt();
		}
		//calcule o maior numero lido
		for(i=0; i<5; i++)
		{
			if (num[i]>=m)
			{
			    m=num[i];
			}
		}
		maior=m;
		System.out.println("Maior numero = " + maior);
		input.close();
	}

}
