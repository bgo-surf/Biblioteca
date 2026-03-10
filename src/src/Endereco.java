package src;

public class Endereco {
	private int codigo;
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String uf;
	private long CEP;
	
	public Endereco() {
		this.setCodigo  (0);
		this.setLogradouro ("");
		this.setNumero (0);
		this.setBairro  ("");
		this.setComplemento ("");
		this.setCidade  ("");
		this.setEstado  ("");
		this.setUf  ("");
		this.setCEP  (0);
		
	}//fim do construtor endereco
	
	public Endereco (int codigo,String logradouro, int numero, String bairro, String complemento, String cidade, String estado, String uf,long CEP) {
		this.setCodigo(codigo);
		this.setLogradouro (logradouro);
		this.setNumero (numero);
		this.setBairro (bairro);
		this.setComplemento (complemento);
		this.setCidade (cidade);
		this.setEstado (estado);
		this.setUf  (uf);
		this.setCEP (CEP);
	}//fim do construtor
	
	public int getCodigo() {
		return this.codigo;
	}//fim get codigo
	
	public String getLogradouro() {
		return this.logradouro;
	}// fim do get Logradouro
	
	public int getNumero() {
		return this.numero;
	}//fim do get Numero
	
	public String getBairro() {
		return this.bairro;
	}//fim get bairro
	
	public String getcomplemento() {
		return this.complemento;
	}//fim get complemento
	
	public String getCidade() {
		return this.cidade;
	}//fim get cidade
	
	public String getEstado() {
		return this.estado;
	}//fim get estado
	
	public String getUf() {
		return this.uf;
	}//fim get uf
	
	public long getCEP() {
		return this.CEP;
	}// fim get cep
	
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}//Fim do set logradouro
	
	public void setNumero(int numero) {
		this.numero = numero;
	}//Fim do set numero
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}//Fim do set bairro
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//Fim do set complemento
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}//Fim do set cidade
	
	public void setEstado(String estado) {
		this.estado = estado;
	}//Fim do set estado
	
	public void setUf(String uf) {
		this.uf = uf;
	}//Fim do set uf
	
	public void setCEP(long  cep) {
		this.CEP = cep;
	}//Fim do set CEP
	 public void setCodigo (int codigo) {
		 this.codigo = codigo;
	 }//fim do set codigo
	
	public String imprimir () {
		return "Logradouro: " + getLogradouro() +
				"\nNúmero: "  + getNumero()  +
				"\nBairro: " + getBairro() +
				"\nComplemento: " + getcomplemento() +
				"\nCidade:" + getCidade() +
				"\nEstado: " + getEstado() +
				"\nUF: " + getUf() +
				"\nCEP: " + getCEP();
	}//Fim do Imprimir
	

	

	
	
}//fim da classe
