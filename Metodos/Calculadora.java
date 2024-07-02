// outro exemplo de funções com retorno - uma calculadora possui 4 operações básicas: somar, subtrair, dividir e multiplicar

class Calculadora {
	
	
	// cria um método que recebe 2 numeros como parametros, calcula e retorna a soma desses dois numeros
	public float somar(float n1, float n2) {
		float resultado = n1 + n2;
		
		return resultado;
	}
	
	public float subtrair(float n1, float n2) {
		return n1 - n2;
	}
	
	public static void main (String args[]) {
		Calculadora calc = new Calculadora(); // calculadora simples, pois só permite a operação com dois numeros por vez
		
		// chama o método somar da classe Calculadora passando como argumento os números 19 e 11. 
		// devido ao método ter retorno, ele será armazenado na variavel resultado (linha abaixo)
		// importante perceber que a variavel criada abaixo não é a mesma da variavel criada dentro do método somar. 
		// uma variavel só pode ser acessada dentro do método que a cria
		float resultado = calc.somar(19, 11);	
		
		System.out.printf("A soma é %f", resultado );
		
		System.out.printf("A subtração de %f - %f é %f \n", 80f, 37f, calc.subtrair(80, 37) );
	
		int resultado2 = 10 / 0;
		
		System.out.printf("A subtração de %d", resultado2);
	
	}

}
