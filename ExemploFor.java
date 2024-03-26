// ExemploFor.java
class ExemploFor {

	public static void main (String args[]) {
		
		for (int i=0; i<35; i=i+3){
			System.out.printf("%d \n", i);
		}
		
		// Exercicio 1: faça um programa que mostre os 
		// numeros pares entre 0 até 100
		
		// Exercicio 2: Faça um programa que percorra os numeros
		// de 0 até 100, some o valor dos numeros impares e ao final
		// mostre o resultado
		int soma = 0;
		for (int i=0; i<=100; i++){
			
			if (i % 2 != 0){
				soma = soma + i;
			}
		}
		System.out.printf("A soma é %d", soma);
		
		
		// Exercicio 3: Faça um programa que some todos os numeros
		// de 0 a 100 e mostre o resultado
		
	}
}
