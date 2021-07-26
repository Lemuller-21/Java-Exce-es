
public class TestaSaca {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 123);
		
		cc.deposita(200);
		System.out.println(cc.getSaldo());
		
		try {
			cc.saca(199.81);			
		} catch(Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
	}

}
