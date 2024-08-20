class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
					
		// para que a validação do dia funcione corretamente, é necessário que o mês esteja inicializado, pois há meses que tem 28, 30 ou 31 dias.
		setMes(mes);
		
		setDia(dia); // chamando o método setAno para fazer a validação do dia
		
		
		
		// criar um método set para o atributo ano e em seguida
		// alterar o ano do objeto dataAvaliacao
		setAno(ano);
		System.out.printf("Método construtor: dia = %d, mes=%d, ano=%d", dia, mes, ano);
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano){
		if (ano >= 1900){
			this.ano = ano;
		} else {
			this.ano = 2000;	// ano padrão de inicialição para valores inválidos
			System.out.println("Ano inválido");
		}
	}
	
	public int getDia(){
		return dia;
	}
	// criar os métodos getters para os atributos mes/ano
	
	public void setDia(int dia){
		// print para debuguar o código
		//System.out.printf("Método setDia: dia = %d, mes=%d, ano=%d", dia, mes, ano);
		
		// validação do dia do mes usando um array
		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
		// mes é o atributo da classe
		if (dia >= 1 && dia <= diasMes[mes] ){
			this.dia = dia;
		} else {
			System.out.println("Dia inválido");
			this.dia = 1;	// valor padrão de inicialização das datas 
		}
		
		// desafio: validar os anos bissextos
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			this.mes = 1;	// mes padrão de inicialição para valores inválidos
			System.out.println("Mês inválido");
		}
	}
		
	public String escreverData(){
		String meses[] = {"", "janeiro", "fevereiro", "março", "abril", "maio", "jnho", "julho", "agosto", "setembro", "outrubro", "novembro", "dezembro"};
	
		String msg = dia + " de " + meses[mes] + " de " + ano;
	
		return msg;
	}
	
}
