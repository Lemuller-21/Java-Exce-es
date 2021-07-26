
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		if (agencia < 1) {
			throw new IllegalArgumentException();
		}
		if (numero < 1) {
			throw new IllegalArgumentException();
		}
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SacaException {
		if (this.saldo < valor) {
			throw new SacaException("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SacaException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
