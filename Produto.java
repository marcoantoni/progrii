class Produto{
	private String nome;
	private float preco;
	
	public String getNome(){
		return nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float p){
		preco = p;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public void exibirProduto(){
		System.out.printf("Nome: %s - Preço: %f", nome, preco);
	}
	
	public Produto(String n, float preco) {
		setNome(n);
		setPreco(preco);
	}
	
	public static void main (String args[]) {
		Produto agua = new Produto("Água mineral com gás", 3.5f);
		
		agua.exibirProduto();
	}
}
