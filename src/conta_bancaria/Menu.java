package conta_bancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println("************************************************");
			System.out.println("*                                              *");
			System.out.println("*    ($$$$)      BANCO DA PRAÇA     ($$$$)     *");
			System.out.println("*                                              *");
			System.out.println("************************************************");
			System.out.println("*                                              *");
			System.out.println("*           1- Criar Conta                     *");
			System.out.println("*           2- Listar todas as Contas          *");
			System.out.println("*           3- Buscar Conta Por Número         *");
			System.out.println("*           4- Atualizar Dados da Conta        *");
			System.out.println("*           5- Apagar Conta                    *");
			System.out.println("*           6- Sacar                           *");
			System.out.println("*           7- Depositar                       *");
			System.out.println("*           8- Transferir Valores Entre Contas *");
			System.out.println("*           0- Sair                            *");
			System.out.println("*                                              *");
			System.out.println("************************************************");
			System.out.println("       Entre com a Opção Desejada:              ");
			System.out.println("                                                ");

			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("\n O Banco da Praça Agradece");
				
				leia.close();
				sobre();
				System.exit(0);
			}
			switch(opcao) {
			case 1:
				System.out.println("\nCriar uma conta\n");
				break;
			case 2:
				System.out.println("\nListar todas as Contas\n");
				break;
			case 3:
				System.out.println("\nBuscar Conta Por Número\n");
				break;
			case 4:
				System.out.println("\nAtualizar Dados da Conta\n");
				break;
			case 5:
				System.out.println("\nApagar Conta\n");
				break;
			case 6:
				System.out.println("\nSacar\n");
				break;
			case 7:
				System.out.println("\nDepositar\n");
				break;
			case 8:
				System.out.println("\nTransferir Valores Entre Contas\n");
				break;
			case 0:
				System.out.println("\nSair\n");
				break;
			}
		}
	}
		public static void sobre() {
			System.out.println("\n************************************************************************");
			System.out.println("*                     Projeto Desenvolvido por:                        *");
			System.out.println("*  Joel da Cunha Ramalho Filho - joelramalho.negociosonline@gmail.com  *");
			System.out.println("*  GitHub: https://github.com/JoelRamalhoF                             *");
			System.out.println("*  Muito Obrigao por sua visita :)                                     *");
			System.out.println("************************************************************************\n");
		
		
	}
	
}
