class Aluno {
	String nome;
	int idade;
	String curso;
	String cpf;
	
	// método para mostrar as informações (atributos) da classe (aluno)
	public void mostrar(){
		System.out.printf("Nome: %s \n", nome); // nome é o atributo
		System.out.printf("Idade: %d \n", idade);
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("CPF: %s \n", cpf);
	
	}

	// método construtor da classe tem a função de iniciar os atribuos da classe
	// ele sempre será executado ao criar uma instancia da classe
	public Aluno(String nome, int idade, String curso, String cpf) {
		// a referencia this serve para resolver a ambiguidade entre o nome de um atributo e um parametro
		// this.nome refere-se ao atributo da classe enquanto nome refere-se ao parametro
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.cpf = cpf;
	}

	public static void main(String[] args){
		// criando o primeiro aluno
		// o operador new (responsável por criar o objeto) chama o método construtor da classe
		Aluno al1 = new Aluno ("Miguel", 16, "Técnico em informática", "987.123.456-78");
		
		// chamando o método mostrar, que irá mostrar as informações (dados/atributos) do al1
		al1.mostrar();
		
		Aluno al2 = new Aluno ("Giovana", 16, "Técnico em informática", "796.123.432.435-44");
				
		al2.mostrar();
		/* Tarefa de casa: 
		 * Criar uma classe para representar horários no 
		 contexto computacional. Para testar o código, crie duas
		 instências da classe para representar o horário que 
		 você acorda e o horário que voce chega em casa, chamando
		 o método para printar as informações.
		*/
	}
		
}
