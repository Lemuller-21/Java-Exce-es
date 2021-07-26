
public class TestaConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(Exception ex) {
			System.out.println("Deu ruim");
		}
		
		//--------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(Exception ex) {
//			System.out.println("Deu ruim");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.fecha();				
//			}
//		}
	}
}
