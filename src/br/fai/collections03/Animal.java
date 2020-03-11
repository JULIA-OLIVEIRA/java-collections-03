package br.fai.collections03;

public abstract class Animal {

	public static void som() {
		
		System.out.println("este é o som padrão de um animal: zzzz");

	}
	
	public void dizerMeuNome() {
		System.out.println("o nome do animal é:  xxxxx  ");
	}
	
	private void dizerMinhaIdade() {
		
		System.out.println("minha idade é: yyyyy ");
	}
	
	public String getCor() {
	return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	private String cor = "preto";
	private int idade = 5;
	private String nome = "não definido";
}
