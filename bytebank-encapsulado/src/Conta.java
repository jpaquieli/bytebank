public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Foi depositado o valor R$" + valor);
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}