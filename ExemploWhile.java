import java.util.Scanner;

class ExemploWhile{
	
	public static void main (String args[]) {
		
		int i = 1;	// iniciando a variavel que será a condição do while
		// se a variavel i tiver um valor >= 10 o laço não será executado
		while (i < 10){
			System.out.printf("%d", i);
			i++;
		}
		
		float altura = 1;
		Scanner sc = new Scanner(System.in);
		
		// Faça um algoritmo que leia o nome e 
		// a altura de uma pessoa e ao final, 
		// diga o nome e a altura do mais alto
		
		// executa o laço de repetição até que não for digitado o numero 0
		while (altura != 0){
			System.out.printf("Informe a altura \n");
			
			altura = sc.nextFloat();
		}
		
		
		
	}
}
