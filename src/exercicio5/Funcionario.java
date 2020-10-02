package exercicio5;

public class Funcionario {
	private int id;
	private int setor;
	private int salario;
	private int rg;
	private boolean ativo;
	
	public Funcionario(int salario, boolean ativo) {
		super();
		this.salario = salario;
		this.ativo = ativo;
	}
	
	public Funcionario() {
		super();
	}

	public int bonifica(int bonificacao) {
		this.salario = salario + bonificacao;
		return salario;
	}
	
	public boolean demite () {
		this.ativo = false;
		return ativo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
