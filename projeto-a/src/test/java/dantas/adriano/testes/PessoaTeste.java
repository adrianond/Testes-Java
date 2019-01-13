package dantas.adriano.testes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PessoaTeste {
	
	@Before
	public void inicio(){
		System.out.println("INICIO");
	}
	
	@Test
	public void testarPessoa(){
		
		boolean teste = true;
		Assert.assertTrue(teste);
		
	}

}
