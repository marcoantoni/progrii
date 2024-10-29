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
	
	public void buscar(String busca){
		
		// variavel de status para poder mostrar uma mensagem para o usuário
		boolean encontrado = false;
		
		// percorre o array de contatos indo somente até o ponto em que há contatos armazenados (< prox)
		for (int i=0; i < prox; i++){
			// testa se o nome do contato corresponde ao parametro recebido (busca)
			if (contatos[i].getNome().equalsIgnoreCase(busca) ){
				System.out.printf("Encontrei o contato de %s \n", busca);
				contatos[i].mostrarContato();	// mostra o contato
				encontrado = true;	// altera o status da variavel
				break;	// interrompe a busca, pois já encontrou o contato
			}
		}
		
		// mensagem para informar se o contato foi encontrado
		if (encontrado == false) {
			System.out.printf("O contato de %s não foi encontrado\n", busca);
		}
	}
	
	public void deletar (String deletado) {
		
		// variavel de status para poder mostrar uma mensagem para o usuário
		boolean excluido = false;

		// percorre o array de contatos indo somente até o ponto em que há contatos armazenados (< prox)
		for (int i=0; i<prox; i++){
			// testa se o nome do contato corresponde ao parametro recebido (busca)
			if (contatos[i].getNome().equalsIgnoreCase(deletado) ){
				contatos[i] = null;	// remove a referencia do contato armazenado (exclui a ligação)
				prox--; // mesma coisa que prox = prox - 1;	libera uma posição no array
				excluido = true;	// altera o status da variavel
			}
		}
		
		// mostra a mensagem
		if (excluido == true) {
			System.out.printf("Contato excluído com sucesso!\n");
		} else {
			System.out.printf("Contato não excluído pois não foi encontrado!\n");
		}
		
		// percorre o laço novamente para trocar as posições do array. Exemplo:
		// Se houver 5 contatos e o primeiro for excluído, a posição zero não pode ficar com null
		for (int i=0; i<prox; i++){
			// testa se o contato for null
			if (contatos[i] == null) {
				contatos[i] = contatos[i+1];	// contato atual é igual ao próximo
				contatos[i+1] = null;	// exclui a ligação do próximo contato
			}
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
		
		// testando a operacao de buscar contato
		agendaDiego.buscar("Luiza");
		
		// testando a operacao de exclusao
		agendaDiego.deletar("Carlos");
		
		agendaDiego.mostrarAgenda();
	}
}
