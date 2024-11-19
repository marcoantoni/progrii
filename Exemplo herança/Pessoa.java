class Pessoa{
	protected String nome;
	protected String cpf;
	protected Data nascimento;
	protected long rg;
	
	// pelas regras de negócio, apenas o nascimento poderá ser alterado, por isso não serão desenvolvidos os métodos settes para todos os atributos
	
	
	public Pessoa(String nome, String cpf, long rg){
		// aqui dentro fica as regras de validação
		// nesse exemplo não será criada as regras em razão do tempo necessário
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public void setNascimento(Data dt) {
		this.nascimento = dt;
	}
	
	// métodos getters
	public String getNome(){
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public Data getNascimento(){
		return nascimento;
	}
	
	public long getRg() {
		return rg;
	}
		
	// método para mostrar as informações
	public void mostrar(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("Nascimento: %s\n", nascimento.escreverData() );
		System.out.printf("RG: %d\n", rg );
		 
	}
	
	public static void main(String args[]) {
		
		Pessoa p1 = new Pessoa("Marcelo", "029.673.630-75", 48356348);
		//Pessoa p1 = new Pessoa();
				
		p1.nascimento = new Data(15, 4, 2001);
		
		p1.mostrar();
		
	}
	
}
