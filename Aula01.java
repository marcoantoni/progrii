public class Aula01 {
	
	public static void main (String[] args) {
		
		// isso é um comentário
		
		/*
			isso também é um comentário
			comentários de mais de uma linha podem 
			ser feitos assim
		*/
		
		String nome = "Sophia"; // declaração de uma variavel do tipo String
		
		int idade = 17;	// declaracao de um int
		
		float peso = 53.8f; // declaracao de um float
		
		char sexo = 'f'; // declaracao de um char
		
		// printando as informações na tela
		
		System.out.printf("Nome: %s \n", nome);	// exibindo uma String
		
		System.out.printf("Idade: %d \n", idade);	// exibindo um int
		
		System.out.printf("Peso: %.2f \n", peso);	// exibindo um float e formatando a saida com duas casas decimais
		
		System.out.printf("Sexo: %s \n", sexo);	// exibindo um char
	}
}
