package atividade02;

public class index {

	public static void main(String[] args) {
	    Endereco enderecoCliente1 = new Endereco("setor de chacaras", "estrada da matinha", 8596, "Vilhena", "RO", "76986-000");;
	    Endereco enderecoCliente2 = new Endereco("setor de chacaras", "estrada do coqueiro", 44, "Vilhena", "RO", "76986-000");

	    Cliente cliente1 = new Cliente("pablo smolak", enderecoCliente2);
	    Cliente cliente2 = new Cliente("josias da mota", enderecoCliente1);

	    Conta contaCliente1 = new Conta(1, 100000.00, cliente1);
	    Conta contaCliente2 = new Conta(2, 50.00, cliente2);

		System.out.println("Saldo Inicial do " + cliente1.getNome() + ": " + contaCliente1.getSaldo());
	    System.out.println("Saldo Inicial do " + cliente2.getNome() + ": " + contaCliente2.getSaldo());

	    contaCliente1.depositar(15500.00);
	    contaCliente1.sacar(2100.00);

	   
	    contaCliente2.depositar(100.00);
	    contaCliente2.sacar(100.00);

	  
	    contaCliente1.transferir(5000, contaCliente2);
		contaCliente2.transferir(50, contaCliente1);

	    System.out.println("Saldo final da conta do " + cliente1.getNome() + ": " + contaCliente1.getSaldo());
	    System.out.println("Saldo final da conta do " + cliente2.getNome() + ": " + contaCliente2.getSaldo());
	  }

}
