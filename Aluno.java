class Aluno {
	// atributos da classe
	String nome;
	int idade;
	String cpf;
	String curso;
	
	// criando um metodo para mostrar
	public void mostrarAluno(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d \n", idade);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("-----------------\n");
	}
	
	public static void main (String args[]) {
		// criando uma instancia da classe aluno
		
		// o operador new cria um novo aluno
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Luiza";
		aluno1.idade = 16;
		aluno1.cpf = "045.134.567-89";
		aluno1.curso = "Técnico em informática";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Gabriel";
		aluno2.idade = 16;
		aluno2.cpf = "987.654.321-10";
		aluno2.curso = "Técnico em informática";
		
		aluno2.mostrarAluno();
		
		aluno1.mostrarAluno();
	}
}
