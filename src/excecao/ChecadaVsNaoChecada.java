package excecao;


public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
	
			geraErro1();
	
		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fim :)");
	}

	// Exce��o N�o checada ou N�o verifica
	static void geraErro1() throws RuntimeException{
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exce��o checada ou verificada
	static void geraErro2() throws Exception {
		
			throw new Exception("Ocorreu um erro bem legal #02!");
		
	}
}
