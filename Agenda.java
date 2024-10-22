public class Agenda {
	private Contato contatos[];	// criando um vetor do tipo Contato
	private int prox;	// indice para controlar a posição de inserção dos contatos no vetor

	public Agenda(){
		contatos = new Contato[5];	// inicia o array para armazenar 5 contatos
		prox = 0;	// inicializa o indice de controle 
	}

	public void adicionar(Contato c){
		// validação para saber se o contato pode ser inserido
		if (prox == 5){
			System.out.println("A agenda está cheia, exclua algum contato \n");
		} else {
			contatos[prox] = c;	// armazena o link do contato na agenda
			prox++;
			System.out.println("Contato inserido com sucesso");
		}
	}
	
	public void mostrarAgenda(){
		// outra alternativa é trocar o valor 5 por prox
		for (int i=0; i < prox; i++) {
			contatos[i].mostrarContato();
			
			// solução 1: Jasmini
			//if (contatos[i] != null){
			//	contatos[i].mostrarContato();	// chama o método mostrarContato() da classe Contato
			//}
			
			// solução 2: Diego, Bernado e Vitor Hugo 
			//if(i < prox){
			//	contatos[i].mostrarContato();	// chama o método mostrarContato() da classe Contato
			//}
		}
	}

	public static void main (String args[]){

		// criando 2 contatos para serem adicionados a agenda
		Contato ct1 = new Contato("Carlos", "51 90584395", "carlos@gmail.com");
		
		Contato ct2 = new Contato("Luiza", "51 967348383", "luiza@gmail.com");
		
		// criando uma nova agenda
		Agenda agendaDiego = new Agenda();
		
		// adicionando um contato a "agendaDiego"
		agendaDiego.adicionar(ct1);
		
		// adicionando outro contato a "agendaDiego"
		agendaDiego.adicionar(ct2);
		
		// mostrar os contatos salvos na "agendaDiego"
		agendaDiego.mostrarAgenda();
	}
}
