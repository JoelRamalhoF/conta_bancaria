package conta_bancaria;

import java.util.Scanner;


import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;
public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao;
        
        /*Instanciar Objetos da Classe Conta*/

       /* Conta c1 = new Conta(1, 123, 1, "Joel", 200000.00f);
       c1.visualizar();
       
       Conta c2 = new Conta(2, 123, 2, "Larissa", 2000000.00f);
       c2.visualizar();
       */
       /* Alteração do Saldo e nome do Titular*/
      /* c1.setSaldo(300000.00f);
       c1.setTitular("Joel Ramalho");
       c1.visualizar();
       
        /**
         * if ternario
         * condição (?) açao se for verdadeiro (:) ação se for falso
         * 
         * saque na conta c2
         * */
      /* System.out.println("\nSacar R$ 3.000.000,00 da Conta C2: " + (c2.sacar(3000000.00f) ? 
    		   "Saque efetuado com Sucesso!" : "Saldo Insuficiente"));
       
       System.out.println("\nSacar R$ 3.000.000,00 da Conta C2: " + (c2.sacar(300000.00f) ? 
    		   "Saque efetuado com Sucesso!" : "Saldo Insuficiente"));
       
       c2.visualizar();
       
       /*Deposito na conta c2
        * */
      /* c2.depositar(50000.00f);
       c2.visualizar();
            */
        
        // Instanciar Objetos da Classe Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(3, 789, 1, "Joel", 200000.00f, 2000.00f);
		cc1.visualizar();
		
		System.out.println("Sacar R$ 203.000,00 da conta Cc1: " + (cc1.sacar(203000.00f) ? "Saque efetuado com sucesso! Saldo: " + cc1.getSaldo() : "Saldo Insuficiente | Saldo: " + cc1.getSaldo()));
		
		System.out.println("Sacar R$ 202.000,00 da conta Cc1: " + (cc1.sacar(202000.00f) ? "Saque efetuado com sucesso! Saldo: " + cc1.getSaldo() : "Saldo Insuficiente | Saldo: " + cc1.getSaldo()));
		
		cc1.depositar(2000.00f);
		cc1.visualizar();
		
		// teste conta poupanca
		ContaPoupanca cp1 = new ContaPoupanca(4, 789, 2, "Larissa", 10000.0f, 15);
		cp1.visualizar();
		cp1.sacar(500.0f);
		cp1.visualizar();
		cp1.depositar(300.0f);
		cp1.visualizar();
       
        while (true) {

            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "************************************************");
            System.out.println( "*                                              *");
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
            System.out.println("************************************************" );
            System.out.println("Entre com a opção desejada:                     " );
            System.out.println("                                                " + Cores.TEXT_RESET);

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_GREEN + "\nCriar uma conta\n" + Cores.TEXT_RESET);
                    break;
                case 2:
                    System.out.println(Cores.TEXT_GREEN + "\nListar todas as Contas\n" + Cores.TEXT_RESET);
                    break;
                case 3:
                    System.out.println(Cores.TEXT_GREEN + "\nBuscar Conta Por Número\n" + Cores.TEXT_RESET);
                    break;
                case 4:
                    System.out.println(Cores.TEXT_GREEN + "\nAtualizar Dados da Conta\n" + Cores.TEXT_RESET);
                    break;
                case 5:
                    System.out.println(Cores.TEXT_GREEN + "\nApagar Conta\n" + Cores.TEXT_RESET);
                    break;
                case 6:
                    System.out.println(Cores.TEXT_GREEN + "\nSacar\n" + Cores.TEXT_RESET);
                    break;
                case 7:
                    System.out.println(Cores.TEXT_GREEN + "\nDepositar\n" + Cores.TEXT_RESET);
                    break;
                case 8:
                    System.out.println(Cores.TEXT_GREEN + "\nTransferir Valores Entre Contas\n" + Cores.TEXT_RESET);
                    break;
                case 0:
                    System.out.println(Cores.TEXT_GREEN + "\nO Banco da Praça agradece!" + Cores.TEXT_RESET);
                    sobre();
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(Cores.TEXT_GREEN + "\nOpção inválida!\n" + Cores.TEXT_RESET);
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
}