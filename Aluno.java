class Aluno {
	String nome;
	Data nascimento;	// reutilizando o tipo Data para criar um novo atributo
	String curso;
	String cpf;
	
	// método para mostrar as informações (atributos) da classe (aluno)
	public void mostrar(){
		System.out.printf("Nome: %s \n", nome); // nome é o atributo
		System.out.printf("Nascimento: %s \n", nascimento.escreverData());
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("CPF: %s \n", cpf);
	
	}
	
	// reescrevendo o método mostrar para utilizar os métodos get da classe Data
	public void mostrar2(){
		System.out.printf("Nome: %s \n", nome);
		
		String msg = nascimento.getDia() + "/" + nascimento.getMes() + 
			"/" + nascimento.getAno();
		System.out.printf("Nascimento: %s \n", msg);
		
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("CPF: %s \n", cpf);
	}

	// método construtor da classe tem a função de iniciar os atribuos da classe
	// ele sempre será executado ao criar uma instancia da classe
	public Aluno(String nome, Data nasc, String curso, String cpf) {
		// a referencia this serve para resolver a ambiguidade entre o nome de um atributo e um parametro
		// this.nome refere-se ao atributo da classe enquanto nome refere-se ao parametro
		this.nome = nome;
		this.nascimento = nasc;
		this.curso = curso;
		this.cpf = cpf;
	}

	public static void main(String[] args){
		// criando o primeiro aluno
		// o operador new (responsável por criar o objeto) chama o método construtor da classe
		
		Data nascAl1 = new Data(14, 8, 2008);	// criando um atributo do tipo data
		
		Aluno al1 = new Aluno ("Miguel", nascAl1, "Técnico em informática", "987.123.456-78");
		
		// chamando o método mostrar, que irá mostrar as informações (dados/atributos) do al1
		al1.mostrar2();
		
		/* Tarefa de casa: 
		 * Criar uma classe para representar horários no 
		 contexto computacional. Para testar o código, crie duas
		 instências da classe para representar o horário que 
		 você acorda e o horário que voce chega em casa, chamando
		 o método para printar as informações.
		*/
	}
		
}


