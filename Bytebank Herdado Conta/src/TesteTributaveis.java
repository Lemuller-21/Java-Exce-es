
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 123);
		cc.deposita(100);
		
		SeguroDeVida seg = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seg);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}

}
