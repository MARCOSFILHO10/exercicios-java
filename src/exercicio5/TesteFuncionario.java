package exercicio5;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario(1000, true);
		funcionario1.bonifica(10000);
		funcionario1.demite();
		
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.isAtivo());
		
		Funcionario funcionario2 = new Funcionario(10000, true);
		funcionario2.bonifica(5000);
		funcionario2.demite();
		
		System.out.println(funcionario2.getSalario());
		System.out.println(funcionario2.isAtivo());
		
		Funcionario funcionario3 = new Funcionario(8000, true);
		funcionario3.bonifica(2000);
		funcionario3.demite();
		
		System.out.println(funcionario3.getSalario());
		System.out.println(funcionario3.isAtivo());

		Funcionario funcionario4 = new Funcionario(5000, true);
		funcionario4.bonifica(1000);
		funcionario4.demite();
		
		System.out.println(funcionario4.getSalario());
		System.out.println(funcionario4.isAtivo());
		
		Funcionario funcionario5 = new Funcionario(3000, true);
		funcionario5.bonifica(500);
		funcionario5.demite();
		
		System.out.println(funcionario5.getSalario());
		System.out.println(funcionario5.isAtivo());

	}
}
