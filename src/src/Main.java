package src;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		long CPF;
		String nome;
		String telefone;
		String email;
		Endereco endereco;
		Pessoa pessoa;
		int codigoEndereco;
		String logradouro; 
		int numero; 
		String bairro; 
		String complemento; 
		String cidade;
		String estado; 
		String uf;
		long CEP;
		
		
		
		
		
		//Variavel que representa  a entrada via console
		Scanner entrada = new Scanner(System.in);
		
		//coletar os dados
		System.out.println("\nInfome um código: ");
		codigo = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme um CPF: ");
		CPF = Long.parseLong(entrada.next());
		
		System.out.println("\nInforme o telefone: ");
		telefone = entrada.nextLine();
		
		System .out.println("\nInforme um nome: ");
		nome = entrada.nextLine();
		
		System.out.println("\nInfomer o email: ");
		email = entrada.nextLine();		
		
		//---Coletando os dados do endereco
		System.out.println("\nInforme um codigo Endereço: ");
		codigoEndereco = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme o logradouro: ");
		logradouro = entrada.nextLine();
		
		System.out.println("\nInforme o numero: ");
	    numero  = Integer.parseInt(entrada.nextLine());
	    
	    System.out.println("\nInforme o bairro: ");
		bairro = entrada.nextLine();
		
		System.out.println("\nInforme o complemento: ");
		complemento = entrada.nextLine();
		
		System.out.println("\nInforme a cidade: ");
		cidade = entrada.nextLine();
		
		System.out.println("\nInforme o estado: ");
		estado = entrada.nextLine();
		
		System.out.println("\nInforme o UF: ");
		uf = entrada.nextLine();
		
		System.out.println("\nInforme o CEP: ");
		CEP = Long.parseLong(entrada.nextLine());
		
		//CRIAR O OBJETO ENDERECO
		endereco = new Endereco (codigo, logradouro, numero, bairro, complemento, cidade, estado, uf,CEP);
		pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
		
		//Mostra o resultado dos dados
		System.out.println(pessoa.imprimir());//mostrar os dados
		
		
		
	}// fim metodo static

}// fim da classe
