package licao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continua = true;
		while(continua)
		{
		    try{
			    System.out.println("Entre com o valor da base do retângulo: ");
			    float base= input.nextFloat();
			    System.out.println("Entre com o valor da altura do retângulo: ");
			    float altura= input.nextFloat();
			    Retangulo retangulo = new Retangulo(base, altura);
			    retangulo.imprimir();
			    continua=false;
		    }
		    catch(InputMismatchException e)
		    {
			    System.out.println("Digite apenas numero.");
			    input.nextLine();
		    }
		    catch(Exception e)
		    {
			    System.out.println("Erro no sistema.");
		    }
		    finally {
		    	if(!continua)
			        System.out.println("Fim do programa.");
		    }
		}
		input.close();
	}

}