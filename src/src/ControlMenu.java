package src;

import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	
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
		break;
	
	case 2:
       System.out.println("Consultar! ");	
	break;
		
	case 3:
		System.out.println("Atualizar! ");
		break;
		
	case 4:
		System.out.println("Deletar! ");
		break;
		
	default:
		System.out.println("Código informado invalido");
		break;
		
		
		
		
		
		
		
		
		
		
		
		
		
		}// fim do switch
		}while(this.opcao !=0);// fim, do do while
	}
	
}// fim da classe ColtroloMEnu
