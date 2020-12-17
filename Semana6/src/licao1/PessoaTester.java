package licao1;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* classe abstrata
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Alex");
		p1.setIdade(20);
		p1.setSexo("M");
		*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Maria");
		a1.setIdade(30);
		a1.setMatricula("005001000");
		a1.setCurso("SI");
		a1.setSexo("F");
		a1.fazerAniversario();
		a1.pagarMensalidade(1000);
		
		Professor p1 = new Professor();
		p1.setNome("Marcelo");
		p1.setIdade(35);
		p1.setSexo("M");
		p1.setSalario(1000);
		p1.setEspecialidade("Mestre");
		p1.receberAumento(1000);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Luiz");
		f1.setSexo("M");
		f1.setIdade(40);
		f1.setSetor("TI");
		f1.setTrabalhando(true);
		f1.mudarTrabalho();
		
		Visitante v1 = new Visitante();
		v1.setNome("Jose");
		v1.setIdade(10);
		v1.setSexo("M");
		
		Bolsista b1 = new Bolsista();
		b1.setBolsa(100);
		b1.setNome("Mario");
		b1.setIdade(22);
		b1.setSexo("M");
		b1.setMatricula("005002000");
		b1.setCurso("Direito");
		b1.renovarBolsa();
		b1.pagarMensalidade(500);
		
		Tecnico t1= new Tecnico();
		t1.setRegistroProfissional("CREF 123456-G/RJ");
		t1.setNome("Midoriya");
		t1.setIdade(14);
		t1.setSexo("M");
		t1.setMatricula("005003000");
		t1.setCurso("Arquitetura");
		t1.praticar();
		t1.pagarMensalidade(1000);
		
		System.out.println(a1.toString());
		System.out.println(p1.toString());
		System.out.println(f1.toString());
		System.out.println(v1.toString());
		System.out.println(b1.toString());
		System.out.println(t1.toString());
        
	}

}