package atividadeciclo1;

public class BuilderPatternTest {

	public static void main(String[] args) {
		new Pessoa.PessoaBuilder()
			.nome("André")
			.sobrenome("Lopes")
			.username("dede")
			.email("andre@gmail.com")
			.build();
			
		System.out.println(build);

	}

}
