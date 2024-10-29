public class Contato{

	// atributos encapsulados
	private String nome;
	private String fone;
	private String email;

	// método construtor da classe
	public Contato (String n, String fone, String email){
		setNome(n);
		setFone(fone);
		setEmail(email);
		System.out.printf("Método construtor 1: recebe 3 parametros \n");
	}
	
	// sobrecarga no método construtor
	public Contato (String n, String fone){
		setNome(n);
		setFone(fone);
		System.out.printf("Método construtor 2: recebe 2 parametros \n");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		
		// validação da quantidade de caracteres na string
		if (nome.length() >= 2){
			this.nome = nome;
		} else {
			this.nome = "";	// atribuindo um valor vazio para que não apareça null ao printar o nome quando ele for inválido
			System.out.println("Nome inválido: deve conter no mínimo 2 caracteres \n");
		}
	}
	
	public void setFone(String fone) {
		
		// validação que deve conter 3 digitos OU ser um valor que contenha entre de 8 a 16 digitos
		if (fone.length() == 3 || fone.length() >= 8 && fone.length() <= 16){
			this.fone = fone;
		} else {
			System.out.println("Número inválido: ele deve conter 3 digitos OU ser um valor que contenha entre de 8 a 16 digitos");
		}
	}
	
	public void setEmail(String email) {
		this.email = email;	// sem regras de validação
	}
	
	public void mostrarContato(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Telefone: %s \n", fone);

		// validação para não mostrar o email quando ele não for preenchido
		if (email != null){
			System.out.printf("Email: %s \n ", email);
		}
		
		System.out.printf("-------------------- \n");
	}
	
	public static void main (String args[]) {
		
		Contato ct1 = new Contato("", "3522678935226789", "thaila@gmail.com");
		
		Contato ct2 = new Contato("Henrique", "97847543");
	
		ct1.mostrarContato();
		ct2.mostrarContato();
	}
}
