import java.util.Scanner;

class Aluno {
	// atributos da classe
	String nome;
	float nota1; // nota 1º trimestre
	float nota2; // nota 2º trimestre
	float nota3; // nota 3º trimestre
	
	// método construtor - é um método especial que é executado automaticamente ao criar uma instancia da classe (new)
	// ele sempre tem o mesmo nome que a classe
	public Aluno(String nome) {
		System.out.println("Executou o método construtor");		// print apenas para demonstrar que ele é executado ao criar um novo aluno (new Aluno)
		this.nome = nome;
		
	}
	
	// método do tipo void: ele não tem retorno
	// métodos sem retorno são frequentemente usados para executar ações que não precisam devolver um resultado, 
	// como imprimir mensagens na tela, alterar o estado de um objeto, atualizar uma interface de usuário ou gravar dados em um arquivo.
	public void lerTeclado() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a nota do %s do 1º trimestre\n", nome);
		nota1 = sc.nextFloat();
		
		System.out.printf("Digite a nota do %s do 2º trimestre\n", nome);
		nota2 = sc.nextFloat();
		
		System.out.printf("Digite a nota do %s do 3º trimestre\n", nome);
		nota3 = sc.nextFloat();		
		
	}	
	
	// outro método sem retorno
	public void imprimirBoletim(){
		System.out.printf("Estudate: %s \n", nome);
		System.out.printf("Média 1º tri: %.2f \n", nota1);
		System.out.printf("Média 2º tri: %.2f \n", nota2);
		System.out.printf("Média 3º tri: %.2f \n", nota3);
	}
	
	// método com retorno: ele irá executar uma ação e ao fim da execução, ele devolve um valor (return)
	// a tarefa de calcular a média aritmética é simples, mas aqui é um exemplo de utilização
	// Por mais que os numeros possam ser inteiros, a divisão tende a resultar em um float, por exemplo, 10 / 3 = 3,333 (float)
	public float calcularMedia() {
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		return media;	// devolve o resultado gerado aqui dentro
		
	}
	
	public static void main (String args[]) {
		// cria um novo aluno e passa seu nome como parametro
		// o nome está sendo usado para pernalizar a leitura do teclado, dizendo "Digite a nota do Fulano..." 
		Aluno al1 = new Aluno("Carlos");	
		
		al1.lerTeclado();	// manda executar o método responsável por ler os dados do teclado. Depois de fazer executar a última linha, o fluxo de execução do programa volta para cá
		
		float media = al1.calcularMedia();	// chama o método calcularMédia. Como o método retorna (devolve) um valor após ter sido executado, esse valor retornado pode ser armazenado em uma variavel para ser usado posteriormente
		
		al1.imprimirBoletim();	// printa os atributos da classe
		
		// faz os devidos testes com a média do aluno, para saber qual é o seu status, que pode ser: aprovado, em exame ou reprovado.
		if (media >= 7) {
			System.out.printf("O aluno está aprovado com a média %.2f\n", media);
		} else if (media <= 1.7f) {
			System.out.printf("O aluno está reprovado com a média %.2f\n", media);
		} else {
			System.out.printf("O aluno está em exame com a media %.2f\n", media);
		}
		
	}
}
