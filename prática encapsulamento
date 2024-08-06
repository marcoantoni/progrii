# Encapsulamento
Essa atividade prática tem objetivo de introduzir aos conceitos de encapsulamento, que é um dos 4 pilares da programaçãoa Orientada a Objetivos. 

Primeiro faça o download da classe  [Data.java](https://github.com/marcoantoni/progrii/blob/main/Data.java), que foram desenvolvidos como exemplos nas aulas anteriores (lembre-se de colocar todos os arquivos dentro da mesma pasta).

Crie uma nova classe chamada **AppData.java** contendo o seguinte conteúdo:
```java
class AppData{
	
	public static void main(String[] args){
		Data dataAvaliacao = new Data(10, 9, 2024);
	
		System.out.printf("A Avaliação II da disciplina sera em %s", dataAvaliacao.escreverData() );
	}
}

```
Agora modifiqe a classe **AppData.java**, alterando a dataAvaliacao, mas para fazer isso não colocaremos os novos valores no método construtor da classe **Data** e sim atualizaremos o existente. Para isso, insira o seguinte código entre as linhas 4 e 6: ``dataAvaliacao .dia = 35;`` (após criar a instância da classe **Data** - objeto ``dataAvaliacao ``). 

1. Compile e execute o código. Responda a pergunta 1 (depois volte para cá).

Você deve ter percebido que a saída para a data foi 35 de setembro de 2024, algo que não existe. Quando programamos orientado a objetos, muitas vezes é necessário controlar quais dados podem ou não podem ser modificados, impedindo que sejam colocados valores inválidos, burlando as regras que já programamos, ou simplesmente, quando queremos impedir que dado seja acessado. Para fazer esse controle de acesso, existe o **_encapsulamento_**, que permite controlar a visibilidade tanto dos métodos quanto dos atributos de uma classe. O encapsulamento é realizado pelos **modificadores de acesso**, que são:
* **public**: permite que um atributo ou método seja acessado diretamente sem nenhum controle. Perceba que nos métodos que a gente desenvolve eles sempre começam com a palavra reservada ``public``.
* **private**: Modificador de acesso que impede que os métodos e atributos de uma classe sejam acessados externamente, ou seja, atributos ou métodos declarados com ``private`` **só podem ser acessados dentro da classe onde foram declarados**.
* **protected**: Modificador de acesso que permite o acesso a todas as subclasses. Esse modificador está atrelhado a Herença em Orientação a objetos e por isso não precisamos nos preocupar com ele agora, pois Herança é algo que será trabalhado no futuro.

Como primeiro teste, faça o seguinte: insira o modificador **public** na classe **Data** na hora de declarar os atributos, deixando nesse formato: ``public int dia;``. Remova também o ``public`` dos métodos nessa classe. Responda a pergunta 2 (depois volte para cá).

O modificador ``public`` é implicito na hora de criar os atributos ou métodos, ou seja, se não for específicado um modificador na hora de criar os atributos/métodos, automaticamente ele será ``public``. É por isso que criamos os atributos da classe e conseguimos modificá-los e também é por isso que podemos remover o **public** dos métodos que tudo funciona normalmente.

Apesar do modificador ``public`` ser implicito no código, **é uma boa prática deixarmos ele explicito no código**, por isso, coloque ele novamente em todos os métodos da classe. (Por garantia compile os códigos para garantir que tudo está funcionando corretamente).

Para impedir que o dia/mes/ano seja alterados, permitindo valores inválidos, acrescente o modificador ``private`` em todos os atributos da classe **Data**. Recompile o código da classe Data. Responda a pergunta 3 (depois volte para cá).

E se for necessário alterar ou recuperar o valor de um atributo (exemplo: dia, mes e ano), é possível fazer isso? Sim, mas devemos criar novos métodos que permitem fazer isso.

Pesquise e formule os conceitos para métodos **_getter_** e **_setter_**.

## Perguntas relacionadas a prática
1. O que você percebeu de errado na saída do programa?
2. Você percebeu algo de diferente na hora de executar o programa?
3. O código compilou normalmente? Qual foi a mensagem de erro apresentada? Use o Google Tradutor para identificar o que essa mensagem quer dizer. 
