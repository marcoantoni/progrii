/* Correção da tarefa de casa: 
 * Criar uma classe para representar horários no 
 contexto computacional. Para testar o código, crie duas
 instências da classe para representar o horário que 
 você acorda e o horário que voce chega em casa, chamando
 o método para printar as informações.
*/
class Horario {
	// atributos da classe
	int hora;
	int minuto;
	
	// método construtor
	public Horario(int hora, int min) {
		// validacao do parametro hora, para não permitir valores inválidos
		if (hora >= 0 && hora < 24){
			this.hora = hora; // atribui a hora apenas se for um valor válido
		} else {
			System.out.printf("Verifique a hora informada\n");
			this.hora = 0;	// inicializando o atributo com um valor default
		}
		
		// validações similares as da hora
		if (minuto >=0 && minuto < 60){
			this.minuto = min; // embora aqui não tenha a ambiguidade, está sendo colocado o this para ficar padronizado
		} else {
			System.out.printf("Verifique os minutos informados\n");
			minuto = 0;	// valor dafault
		}
	}
	
	// método que escreve o horario no formado 23:54
	public void escreverHorario(){
		System.out.printf("%d:%d \n", hora, minuto);
	}
	
	public static void main (String args[]) {
		// cria um Horario, no qual define a hora como 8 e minutos como 15
		Horario acordar = new Horario(8, 15); 
		
		System.out.printf("Eu me acordo às ");
		acordar.escreverHorario();	// chama o método responsável por printar o horario na tela.
		
		
	}
	
}
