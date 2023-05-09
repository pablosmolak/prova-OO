package atividade01;

public class index {

	public static void main(String[] args) {
		Endereco casa = new Endereco("setor de chacaras", "estrada da matinha", 8596, "Vilhena", "RO", "76986-000");
	    Animal animal2 = new Animal("Cleitin", "amarelo", 2, false,true,"Gato");
	    Cliente cliente = new Cliente("Pablo", 25, casa, animal2);
	    Servico servico = new Servico(cliente, "tosa e vacinação", 100.0, animal2);

	    System.out.println("Cliente: " + servico.getCliente().getNome());
	    System.out.println("Nome do Animal: " + servico.getAnimal().getNome());
	    System.out.println("Tipo de Animal: " + animal2.getTipo());
	    System.out.println("Teste de Felv: " + animal2.vacinadoFelV());
	    System.out.println("Serviço: " + servico.getDescricao());
	    System.out.println("Valor: R$ " + servico.getValor());
	    
	    
	    

	}

}
