// importa a classe Scanner para fazer a leitura do teclado
import java.util.Scanner;	

class Aula02{
	
	public static void main (String args[]) {
		// cria a variavel do tipo scanner para poder fazer a leitura
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Digite seu nome: \n");
		
		// sc.nextLine() faz a leitura de uma string do teclado
		String nome = sc.nextLine();
		
		System.out.printf("Digite sua idade: \n");
		int idade = sc.nextInt();	// lê um inteiro
		
		System.out.printf("Digite sua altura: \n");
		float altura = sc.nextFloat();
		
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d \n", idade);
		System.out.printf("Altura: %.2f \n", altura);
		
		if (idade >= 18){
			System.out.printf("É maior de idade");
		} else {
			System.out.printf("É menor de idade");
		}
		
		/* Exercício:
		 leia duas variveis numéricas e escreva
		 a maior delas
		*/
		
		System.out.printf("Digite o num1: ");
		float n1 = sc.nextFloat();
		
		System.out.printf("Digite o num2: ");
		float n2 = sc.nextFloat();
		
		if (n1 > n2)
			System.out.printf("%f é o maior", n1);
		else
			System.out.printf("%f é o maior", n2);
		
		int diaSemana = 0;
		
		if (diaSemana == 2)
			System.out.printf("Segunda-feira");
		else if (diaSemana == 3)
			System.out.printf("Terça-feira");
		else if (diaSemana == 4)
			System.out.printf("Quarta-feira");
		else if (diaSemana == 5)
			System.out.printf("Quinta-feira");
		else if (diaSemana == 6)
			System.out.printf("Sexta-feira");
		else if (diaSemana == 7)
			System.out.printf("Sábado");
		else 
			System.out.println("Domingo");
			
		/* Exercício:
		 leia três variveis numéricas e escreva
		 a maior delas
		*/
	}
}
