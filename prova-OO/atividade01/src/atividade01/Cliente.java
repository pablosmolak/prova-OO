package atividade01;

public class Cliente {
	private String nome;
	private int idade;
	private Endereco endereco;
	private Animal animalEstimacao;
	
   public Cliente(String nome, int idade, Endereco endereco, Animal animalDeEstimacao) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.animalEstimacao = animalDeEstimacao;
    }
	
	public String getNome() {
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}public void setIdade(int idade) {
		this.idade = idade;
	}
	
	 public Endereco getEndereco() {
	        return endereco;
	    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Animal getAnimalEstimacao() {
        return animalEstimacao;
    }

    public void setAnimalDeEstimacao(Animal animalEstimacao) {
        this.animalEstimacao = animalEstimacao;
    }

}
