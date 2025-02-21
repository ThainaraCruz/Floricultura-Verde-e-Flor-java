package floricultura;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import floricultura.controller.FlorController;
import floricultura.util.Cores;
import floricultura.model.Flor;
import floricultura.model.Produto;

public class Menu {

	public static void main(String[] args) {
	
	    FlorController flor = new FlorController();
		Scanner leia = new Scanner(System.in);
    
		int opcao = 0, tipo;
		String nomeBusca;
	
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                FLORICULTURA VERDE E FLOR            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Item                       ");
			System.out.println("            2 - Listar todos os Itens                ");
			System.out.println("            3 - Buscar Itens por Nome                ");
			System.out.println("            4 - Atualizar Dados dos Itens            ");
			System.out.println("            5 - Apagar um item                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			if (opcao == 6) {
				System.out.println("\nA Floricultura Verde e Flor agradece a sua colaboração!");
				sobre();
	             		leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Cadastrar um Item novo");
				
				do {
					System.out.println("Digite o Tipo do Item (1-Flor ou 2-Produto): ");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
							
				switch(tipo) {
					case 1 -> {
						System.out.println("\nCadastro de Flor:");
						leia.nextLine();
	                    System.out.print("Digite o nome da flor: ");
	                    String nomeFlor = leia.nextLine();
	                   
	                    System.out.print("Digite o preço da flor: ");
	                    double precoFlor = leia.nextDouble();
	                    leia.nextLine();
	                    
	                    System.out.print("Digite a descrição da flor: ");
	                    String descricaoFlor = leia.nextLine();	                    	                   
	                    
	                    flor.cadastrarFlor(new Flor(nomeFlor, precoFlor, descricaoFlor));	                   
					}
					case 2 -> {
						System.out.println("\nCadastro de Produto:");
						leia.nextLine();
	                    System.out.print("Digite o nome do produto: ");
	                    String nomeProduto = leia.nextLine();
	                    
	                    System.out.print("Digite o preço do produto: ");
	                    double precoProduto = leia.nextDouble();
	                    leia.nextLine();
	                    
	                    System.out.print("Digite a descrição do produto: ");
	                    String descricaoProduto = leia.nextLine();
	                    
	                    flor.cadastrarProduto(new Produto(nomeProduto, precoProduto, descricaoProduto));	                    
				}	
				}	
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todos os Itens");
				
				flor.exibirItens();
				
				keyPress();
				break;
			case 3:
				System.out.println("\nBuscar Item por Nome");
				
				leia.nextLine();
				System.out.println("Digite o nome: ");
				nomeBusca = leia.nextLine();
				
				flor.buscarItemPorNome(nomeBusca);
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados dos Itens");
				
				System.out.print("\nDigite o nome do item que deseja atualizar: ");
                String nomeAtualizar = leia.nextLine();
                
                leia.nextLine();
                System.out.print("Digite o novo preço: ");
                double novoPreco = leia.nextDouble();
                
                System.out.print("Digite a nova descrição: ");
                String novaDescricao = leia.nextLine();               
                //public Flor(String nome, double preco, String descricao, int estoque)
                flor.atualizarItem(new Flor(nomeAtualizar, novoPreco, novaDescricao));
				keyPress(); 
				break;
			case 5:
				System.out.println("\nApagar um Item");
				
				leia.nextLine();
				System.out.print("\nDigite o nome do item que deseja deletar: ");
                String nomeDeletar = leia.nextLine();
                flor.deletarItem(nomeDeletar);
				
				keyPress();	
				break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
				
				keyPress();
				break;	
		}
			
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Thainara Cruz");
		System.out.println("Generation Brasil - thainarac@genstudents.org");
		System.out.println("https://github.com/ThainaraCruz");
		System.out.println("*********************************************************");
	}
    
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
