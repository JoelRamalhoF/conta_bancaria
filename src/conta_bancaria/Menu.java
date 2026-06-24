package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {

		int opcao;

		// criar dados de teste
		criarContasTeste();

		while (true) {

			System.out.println(
					Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "************************************************");
			System.out.println("*                                              *");
			System.out.println("*    " + Cores.TEXT_YELLOW + "($$$$)" + Cores.TEXT_RESET + Cores.BLACK_BACKGROUND
					+ "      " + Cores.TEXT_GREEN + "BANCO DA PRAÇA     " + Cores.TEXT_RESET + Cores.TEXT_YELLOW
					+ Cores.BLACK_BACKGROUND + "($$$$)" + Cores.TEXT_RESET + Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN
					+ "     *");
			System.out.println("*                                              *");
			System.out.println("************************************************");
			System.out.println("*                                              *");
			System.out.println("*       1- Criar Conta                         *");
			System.out.println("*       2- Listar todas as Contas              *");
			System.out.println("*       3- Buscar Conta Por Número             *");
			System.out.println("*       4- Atualizar Dados da Conta            *");
			System.out.println("*       5- Apagar Conta                        *");
			System.out.println("*       6- Sacar                               *");
			System.out.println("*       7- Depositar                           *");
			System.out.println("*       8- Transferir Valores Entre Contas     *");
			System.out.println("*       0- Sair                                *");
			System.out.println("*                                              *");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada:                     ");
			System.out.println("                                                " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número Inteiro entre 0 e 8.");
				leia.nextLine();
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_GREEN + "\nCriar uma conta\n" + Cores.TEXT_RESET);
				cadastrarConta();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_GREEN + "\nListar todas as Contas\n" + Cores.TEXT_RESET);

				listarContas();
				keyPress();

				break;
			case 3:
				System.out.println(Cores.TEXT_GREEN + "\nBuscar Conta Por Número\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_GREEN + "\nAtualizar Dados da Conta\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_GREEN + "\nApagar Conta\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_GREEN + "\nSacar\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_GREEN + "\nDepositar\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_GREEN + "\nTransferir Valores Entre Contas\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			case 0:
				System.out.println(Cores.TEXT_YELLOW + "\nO Banco da Praça agradece!" + Cores.TEXT_RESET);
				sobre();
				leia.close();
				System.exit(0);
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED + "\nOpção inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_GREEN + "\n************************************************" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_GREEN + "* Projeto Desenvolvido por Joel Ramalho Filho    *" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_GREEN + "* GitHub: github.com/JoelRamalhoF                *" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_GREEN + "************************************************\n" + Cores.TEXT_RESET);
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

	public static void criarContasTeste() {
		contaController.cadastrar(
				new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(
				new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));

	}

	public static void listarContas() {
		contaController.listarTodas();
	}

	public static void cadastrarConta() {

		System.out.println("Digite o número da Agência: ");
		int agencia = leia.nextInt();

		System.out.println("Digite o nome do Titular da Conta: ");
		leia.skip("\\R");
		String titular = leia.nextLine();

		System.out.println("Digite o tipo da Conta (1 - CC | 2 - CP) : ");
		int tipo = leia.nextInt();

		System.out.println("Digite o saldo da Conta: ");
		float saldo = leia.nextFloat();

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o limite da Conta: ");
			float limite = leia.nextFloat();
			leia.nextLine();

			contaController
					.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.println("Digite o dia do aniversário da Conta: ");
			int aniversario = leia.nextInt();
			leia.nextLine();
			contaController.cadastrar(
					new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida" + Cores.TEXT_RESET);
		}
	}
}