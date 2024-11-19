class Aluno extends Pessoa {
	private String curso;
	private int matricula;
	private int anoIngresso;
	
	public Aluno (String curso, int matricula, String nome, String cpf, long rg){
		super(nome, cpf, rg);
		
	
		
		anoIngresso = 2024;	// valor fixo para todos
	
		// a matricula não vai ser gerada
		this.curso = curso;
		
		this.matricula = matricula;
		
	
	}
	
	public static void main (String args[]){
		Aluno al1 = new Aluno("Técnico em Informática", 2024327432, "Cássio", "037.784.777-61", 4237583468l);
		
		al1.nascimento = new Data(15, 4, 2001);
		
		al1.mostrar();
	
	}
	
}
