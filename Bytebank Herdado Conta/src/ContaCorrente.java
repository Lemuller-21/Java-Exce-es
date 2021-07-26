
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SacaException {
		super.saca(valor + 0.2);
	}
	
	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	
}
