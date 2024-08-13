class AppData{
	
	public static void main(String[] args){
		Data dataAvaliacao = new Data(31, 9, 2024);
	
	
		//dataAvaliacao.dia = 35;
		
		// chamando o método set para alterar o dia
		dataAvaliacao.setDia(10);
		
		// alterando o mes da data através do método set
		dataAvaliacao.setMes(9);
	
		System.out.printf("A Avaliação II da disciplina sera em %s", dataAvaliacao.escreverData() );
	}
}
