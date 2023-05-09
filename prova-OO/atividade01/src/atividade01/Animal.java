package atividade01;

public class Animal {
	private String Nome;
	private String raca;
	private int idade;
	private boolean cinomose;
	private boolean Felv;
	private String tipo;
	
	public Animal(String nome, String raca, int idade, boolean cinomose, boolean Felv, String tipo) {
	    this.Nome = nome;
	    this.raca = raca;
	    this.idade = idade;
	    this.cinomose = cinomose;
	    this.Felv = Felv;
	    this.tipo = tipo;
	  }
	
	public String getNome() {
		return Nome;
	}public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public int getIdade() {
		return idade;
	}public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getTipo() {
		return tipo;
	}public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setCinomose(boolean cinomose) {
		this.cinomose = cinomose;
	}
	public void setFivFelv(boolean fivFelv) {
		this.Felv = fivFelv;
	}
	
	public boolean vacinadoCinomose() {
	    return cinomose;
	  }

	  public boolean vacinadoFelV() {
	    return Felv;
	  }

}
