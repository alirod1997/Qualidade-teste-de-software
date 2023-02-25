package testPackage;

import org.junit.jupiter.api.Test;

import aula2.Pessoa;
import junit.framework.Assert;

class PessoaTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		String nome = "Pedro";
		String sobreNome= "Silva";
		Pessoa pessoa = new Pessoa();
		String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome,sobreNome);
		Assert.assertEquals("PedroSilva", resultadoPrograma);
	}
		
	@Test
	public void testConcatenaNomeSobreNome() {
//		fail("Not yet implemented");
		String nome = "Alisson";
		String sobreNome= "Ferreira";
		Pessoa pessoa = new Pessoa();
		String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome,sobreNome);
		Assert.assertEquals("AlissonFerreira", resultadoPrograma);
	}
	
	@Test
	public void testePreenchimento() {
		String nome= " ";
		String sobreNome=" ";
		Pessoa pessoa = new Pessoa();
		String resultadoPrograma = pessoa.concatenaNomeSobreNome(nome,sobreNome);
		Assert.assertEquals("  ", resultadoPrograma);

	}
}
