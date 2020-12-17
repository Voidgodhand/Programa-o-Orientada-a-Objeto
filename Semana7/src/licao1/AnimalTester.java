package licao1;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m1 = new Mamifero();
		m1.setPeso(100.0f);
		m1.setIdade(7);
		m1.setQtdMembros(5);
		m1.setCorPelo("Laranja");
		System.out.println(m1.toString());
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		Reptil r1 = new Reptil();
		r1.setPeso(400.0f);
		r1.setIdade(28);
		r1.setQtdMembros(10);
		r1.setCorEscama("Verde");
		System.out.println(r1.toString());
		r1.locomover();
		r1.alimentar();
		r1.emitirSom();
		Peixe p1 = new Peixe();
		p1.setPeso(2.0f);
		p1.setIdade(2);
		p1.setQtdMembros(20);
		p1.setCorEscama("Preto");
		System.out.println(p1.toString());
		p1.soltarBolha();
		p1.locomover();
		p1.alimentar();
		p1.emitirSom();
		Ave a1 = new Ave();
		a1.setPeso(0.3f);
		a1.setIdade(5);
		a1.setQtdMembros(10);
		a1.setCorPena("Azul");
		System.out.println(a1.toString());
		a1.fazerNinho();
		a1.locomover();
		a1.alimentar();
		a1.emitirSom();
	}

}
