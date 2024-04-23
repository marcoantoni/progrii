import java.util.Scanner;

public class RevisaoAvaliacao{

	public static void main(String args[]) {
		/*A padaria Hotpão vende uma certa quantidade de 
		 * pães franceses e uma quantidade de broas a 
		 * cada dia. Cada pãozinho custa R$ 0,43 e a 
		 * broa custa R$2,45. Ao final do dia, o dono quer
		 *  saber quanto arrecadou com a venda dos pães e
		 * broas (juntos), e quanto deve guardar numa 
		 * conta de poupança (30% do total arrecadado). 
		 * Com base nestes fatos, faça um algoritmo para 
		 * ler as quantidades de pães e de broas, e
		 *  depois calcular os dados solicitados.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe a quantidade de broas vendidas \n");
		int qtd_broas = sc.nextInt();
		
		System.out.printf("Informe a quantidade de cacetinhos vendidos \n");
		int qtd_cacetinho = sc.nextInt();
	
		float totalVendas = (qtd_broas * 2.45f) + (qtd_cacetinho * 0.43f);
		
		float poupanca = totalVendas * 0.3f;
		
		System.out.printf("Hoje foram vendidos R$ %.2f. Você deve guardar %.2f do valor na poupança \n",  totalVendas, poupanca);
		// System.out.println("Hoje foram vendidos R$ " + totalVendas + " Você deve guardar " + poupanca + " do valor na poupança \n");
		
		int a = 50;
		int b = 50;
		
		if (a > b) {
			System.out.printf("A é maior que B \n");
		 } else 
			System.out.printf("B é maior que A \n");
		
		int diaSemana = 1;
		
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
			default:
				// se não se encaixar nas condições acima
				System.out.printf("Sábado");
		}	
		
		for (int i=0; i < 5; i++){
			System.out.printf("%d \n", i);
		}
		
		// Faça um programa que leia as 3 notas de um estudante e 
		// calcule a média aritmética
		float somatorio = 0;
		
		for (int i=0; i < 3; i++){
			
			float nota = sc.nextFloat();
			
			somatorio = somatorio + nota;
		}
		
		float media = somatorio / 3;
		
		if (media >= 7)
			System.out.printf("A média é %.2f e você está aprovado \n", media);
		else if (media < 1.8f)
			System.out.printf("Você está reprovado com a média %.2f ", media);
		else 
			System.out.printf("Você está em exame com a média %.2f ", media);
	}
}
