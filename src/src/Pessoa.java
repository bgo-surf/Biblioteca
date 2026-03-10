package src;

public class Pessoa {
	//Maxima da orientaçao a objeto O.O = Encapsulamento
	private int codigo;
	private long cpf;
	private String nome;
	private String telefone;
	private String email;
	Endereco endereco;
	
	
	
	public Pessoa() {
		this.setCodigo (0);
		this.setCPF (0);
		this.setNome ("");
		this.setTelefone ("");
		this.setEmail  ("");
		this.setEndereco (new Endereco());//chama construto vazio com valores padrão
	}// fim construtor padão
	
	//2° Maxima da O.O = Sobrecarga
	
	public Pessoa(int codigo, long cpf, String nome,String telefone, String email,Endereco endereco ) {
		this.setCodigo  (codigo);
		this.setCPF (cpf);
		this.setNome (nome);
		this.setTelefone (telefone);
		this.setEmail (email);
		this.setEndereco (endereco); 
}//fim construtor pessoa
	
	//Metodos modificadores - GETS e SETS
	public int getCodigo(){
		return this.codigo;
	}//Fim do Get Codigo
	
	
	public long getCPF() {
		return this.cpf;
	}//Fim do Get cpf
	
	
	public String getNome() {
		return this.nome;
	}// Fim Get Nome
	
	
	public String getTelefone() {
		return this.telefone;
	}//Fim get Telefone
	
	public String getEmail() {
		return this.email;
	}//Fim get Email
	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//Fim do set Codigo
	
	
	public void setCPF(long cpf) {
		this.cpf = cpf;
	}//Fim set CPF
	
	public void setNome (String nome) {
		this.nome = nome;
	}//Fim set Nome
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}//Fim set telefone
	
	public void setEmail (String email) {
		this.email = email;
	}//Fim do set email
	
	public Endereco getEndereco() {
		return this.endereco;
	}// fim do get endereco
	
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}// fim do setr endereco
	
	public String imprimir () {
		return "Codigo: " + getCodigo() +
				"\nCPF: "  + getCPF()  +
				"\nNome: " + getNome() +
				"\nTelefone: " + getTelefone() +
				"\nEmail:" + getEmail() +
				"\nDados Endereço" + this.endereco.imprimir();
	}//Fim do Imprimir
	
	
	
	
}//fim da classe
