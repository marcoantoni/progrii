class Aula3{

	public static void main(String args[]){
		
		int diaSemana = 9;
		
		switch(diaSemana){
			case 2:
				System.out.printf("Segunda-feira");
				break;
			case 3:
				System.out.printf("Terça-feira");
				break;
			case 4: 
				System.out.printf("Quarta-feira");
				break;
			case 5:
				System.out.printf("Quinta-feira");
				break;
			case 6:
				System.out.printf("Sexta-feira");
				break;
			case 7:
				System.out.printf("Sábado");
				break;
			default: 
				System.out.printf("Domingo");
		}
				
		String nome = "Ana";
		
		String segundoNome = "Carolina"; 
		
		String sobrenome = "Fischer da Silva";
		
		// exemplo de concatenação de string
		
		String nomeCompleto = nome + " " + segundoNome + " " + sobrenome;
		
		System.out.printf("\nNome completo: %s", nomeCompleto); 
	
		/* faça um programa que tenha 3 variaveis do tipo inteiro
		 * para representar uma data qualquer, em seguida, a data
		 * deve ser escrita por extenso: exemplo
		 * para dia = 19, mes = 3, ano = 2024
		 * deve ser escrito: 19 de março de 2024
		*/
	
		// alternativa para programar sem o jdk na maquina jdoodle.com
	}
}
