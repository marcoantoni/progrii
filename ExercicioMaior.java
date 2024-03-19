import java.util.Scanner;

class ExercicioMaior{
	
	public static void main(String args[]) {
		/* Exercício:
		 leia três variveis numéricas e escreva
		 a maior delas
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o número 1\n");
		float num1 = sc.nextFloat();
		
		System.out.printf("Informe o número 2\n");
		float num2 = sc.nextFloat();
		
		System.out.printf("Informe o número 3\n");
		float num3 = sc.nextFloat();
		
		// iniciando a variavel com o primeiro valor lido
		float maior = num1;
		
		if (num2 > maior){
			maior = num2;
		} 
		
		if (num3 > maior) {
			maior = num3;
		}
		
		System.out.printf("O maior número é %f ", maior);
		
		
	}
}
