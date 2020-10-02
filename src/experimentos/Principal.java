package experimentos;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setAltura(2);
		pessoa.setIdade(27);
		pessoa.setNome("Marcos");
		pessoa.setSexo("Masculino");
		
		System.out.println(pessoa.getAltura());
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setAltura(1);
		pessoa1.setIdade(26);
		pessoa1.setNome ("Antônio");
		pessoa1.setSexo("Masculino");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAltura());
	}

}
