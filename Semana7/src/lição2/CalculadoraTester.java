package lição2;

public class CalculadoraTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		System.out.println("Soma = "+calc.somar(1, 10));
		System.out.println("Soma = "+calc.somar(1.5f, 10.0f));
		System.out.println("Soma = "+calc.somar("Boa", "Noite"));
		System.out.println("Soma = "+calc.somar(1.0f, 10.0f, 5.4f));
	}

}
