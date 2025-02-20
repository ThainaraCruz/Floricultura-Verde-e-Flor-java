package floricultura;

import java.io.IOException;
import java.util.Scanner;

import floricultura.util.Cores;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
    
		int opcao = 0, tipo;
	
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
			
			opcao = leia.nextInt();
	
			if (opcao == 9) {
				System.out.println("\nA Floricultura Verde e Flor agradece a sua colaboração!");
				sobre();
	             		leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Cadastrar um Item novo");
				
				keyPress();
				break;
			case 2:
				System.out.println("\n Listar todos os Itens");
				
				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Item por Nome");
				
				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar dados dos i");
				
				keyPress();
				break;
			case 5:
				System.out.println("\n Apagar um Item");
			
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
