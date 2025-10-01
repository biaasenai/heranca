package Atividade1;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String telefone, String cpf, String rg) {
		super(nome, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	

}
