package src;

import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	public int codigo;
	public long CPF;
	public String nome;
	public String telefone;
	public String email;
	Endereco endereco;
	Pessoa pessoa;
	public int codigoEndereco;
	public String logradouro; 
	public int numero; 
	public String bairro; 
	public String complemento; 
	public String cidade;
	public String estado; 
	public String uf;
	public long CEP;
	
	public ControlMenu() {
	this.entrada = new Scanner(System.in);	
	this.opcao = 0;
	}//fim construtor Padrão
	
	public void MostrarMenu() {
		System.out.println("\n\nBem-Vindo(a)\n\n" +
					"Escolha uma das opções abaixo: "+
					"\n0. Sair"                      +
					"\n1. Cadastrar Pessoa"          +
					"\n2. Consultar Pessoa"          +
					"\n3. Atualizar Pessoa"          +
					"\n4. Excluir   Pessoa"
				);
		//COLETAR OPÇÂO
		this.opcao =Integer.parseInt(entrada.nextLine());
	
	}//fim do mostrar menu

	public void execultar() {
		do {
		this.MostrarMenu();//Mostrar as opçoes disponiveis para o usuariuio
		
		switch (this.opcao) {
	case 0:
		System.out.println("Obrigado! ");
		break;
	
	case 1:
		System.out.println("Cadastrar! ");
		
		//Variavel que representa  a entrada via console
				this.entrada = new Scanner(System.in);
				
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
				this.endereco = new Endereco (codigo, logradouro, numero, bairro, complemento, cidade, estado, uf,CEP);
				this.pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
				
		
		
		
		
		
		break;
	
	case 2:
       System.out.println("Consultar! ");
     //Mostra o resultado dos dados
    System.out.println(this.pessoa.imprimir());//mostrar os dados
     		
       
	break;
		
	case 3:
		System.out.println("Atualizar! ");
		System.out.println("Escolha abaixo o que deseja Atualizar: "+
		                   "\n1.Nome"									+
		                   "\n2.CPF"									+
		                   "\n3.Telefone"								+
		                   "\n4.E-mail"								+	
		                   "\n5.Logradouro"							+
		                   "\n6.Numero"								+	
		                   "\n7.Bairro"								+	
		                   "\n8.Complemento"							+
		                   "\n9.Cidade"								+
		                   "\n10.Estado"								+
		                   "\n11.UF"									+
		                   "\n12.CEP"
		                  );
		this.opcao = Integer.parseInt(this.entrada.nextLine());
		//escolha caso para atualização
		switch(this.opcao) {
		
		case 1:
			System.out.println("Qual o novo nome:?");
			String nome = this.entrada.nextLine();//Coletando o novo nome do usuario	
			this.pessoa.setNome(nome);
			break;
			
		case 2:
			System.out.println("Qual novo CPF? ");
			String cpf = this.entrada.nextLine();// Coleta o novo CPF
			this.pessoa.setCPF(Long.parseLong(cpf));
			break;
			
		case 3:
			System.out.println("Qual novo Telefone? ");
			String telefone = this.entrada.nextLine();// coleta o novo telefone
			this.pessoa.setTelefone(telefone);
			break;	
		
		case 4:
			System.out.println("Qual o novo email?");
			String email = this.entrada.nextLine();//Coleta o novo email
			this.pessoa.setEmail(email);
			break;
			
		case 5:
			System.out.println("Qual o novo logradouro?");
			String logradouro = this.entrada.nextLine();//Coleta o novo logradouro
			this.endereco.setLogradouro(logradouro);
			break;
			
		case 6:
			System.out.println("Qual o novo numero?");
			int numero = Integer.parseInt(this.entrada.nextLine());//Coleta o novo numero
			this.endereco.setNumero(numero);
			break;
			
		case 7:
			System.out.println("Qual o novo bairro?");
			String bairro = this.entrada.nextLine();//coletando novo bairro
			this.endereco.setBairro(bairro);
			break;
		
		case 8:
			System.out.println("Qual o novo complemento?");
			String complemento = this.entrada.nextLine();//coletando novo complemento
			this.endereco.setComplemento(complemento);
			break;
			
		case 9:
			System.out.println("Qual a nova cidade?");
			String cidade = this.entrada.nextLine();// coletando nova cidade
			this.endereco.setCidade(cidade);
			break;
		
		case 10:
			System.out.println("Qual novo  Estado?");
			String estado = this.entrada.nextLine();//coleta novo endereço
			this.endereco.setEstado(estado);
			break;
		
		case 11:
			System.out.println("Qual novo UF?");
			String uf = this.entrada.nextLine();//coleta novo uf
			this.endereco.setUf(uf);		
			break;	
		
		case 12:
			System.out.println("Qual o novo CEP?");
			Long CEP = Long.parseLong(this.entrada.nextLine());
			this.endereco.setCEP(CEP);
			break;	
			
			
		default:
			
		System.out.println("Codigo Invalido");
		break;
			
		}
	break;
	
		
	case 4:
		System.out.println("Deletar! ");
		this.endereco = new Endereco();//Chamando o construtor
		this.pessoa = new Pessoa(); //Chamando o construtor vazio
		break;
		
	default:
		System.out.println("Código informado invalido");
		break;
	
	
		
		
		}// fim do switch
		}while(this.opcao !=0);// fim, do do while
	}
	
}// fim da classe ColtroloMEnu
