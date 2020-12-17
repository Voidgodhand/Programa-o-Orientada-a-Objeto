package exercicio1;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno al = new Aluno();
        String matricula, nome, curso;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a matricula: ");
        al.setMatricula(input.next());
        System.out.println("Entre com o nome: ");
        al.setNome(input.next());
        System.out.println("Entre com o curso: ");
        al.setCurso(input.next());
        al.listar();
        input.close();
	}

}
