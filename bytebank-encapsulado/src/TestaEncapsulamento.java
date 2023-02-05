
public class TestaEncapsulamento {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta(1337, 24226);
		
		cliente.setNome("julio");
		
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(cliente.getProfissao());
		
		System.out.print(conta.getAgencia() + " " + conta.getNumero());
		
	}

}
