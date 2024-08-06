class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		if (dia >= 1 && dia <=30){
			this.dia = dia;
		} else {
			System.out.println("Dia inválido");
			this.dia = 1;	// valor padrão de inicialização das datas 
		}
		
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			this.mes = 1;	// mes padrão de inicialição para valores inválidos
			System.out.println("Mês inválido");
		}
		
		if (ano >= 1900){
			this.ano = ano;
		} else {
			this.ano = 2000;	// ano padrão de inicialição para valores inválidos
			System.out.println("Ano inválido");
		}
		
	}
	
	public String escreverData(){
		String meses[] = {"", "janeiro", "fevereiro", "março", "abril", "maio", "jnho", "julho", "agosto", "setembro", "outrubro", "novembro", "dezembro"};
	
		String msg = dia + " de " + meses[mes] + " de " + ano;
	
		return msg;
	}
	
	public static void main(String[] args){
		Data dataAvaliacao = new Data(10, 9, 2024);
	
		System.out.printf("A Avaliação II da disciplina sera em %s", dataAvaliacao.escreverData() );
	}
}
