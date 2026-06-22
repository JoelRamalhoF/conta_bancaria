package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao;
        
        /*Instanciar Objetos da Classe Conta*/

        Conta c1 = new Conta(1, 123, 1, "Joel", 200000.00f);
       c1.visualizar();
       
       Conta c2 = new Conta(2, 123, 2, "Larissa", 2000000.00f);
       c2.visualizar();
       
       /* Alteração do Saldo e nome do Titular*/
       c1.setSaldo(300000.00f);
       c1.setTitular("Joel Ramalho");
       c1.visualizar();
       
        /**
         * if ternario
         * condição (?) açao se for verdadeiro (:) ação se for falso
         * 
         * saque na conta c2
         * */
       System.out.println("\nSacar R$ 3.000.000,00 da Conta C2: " + (c2.sacar(3000000.00f) ? "Saque efetuado com Sucesso!" : "Saldo Insuficiente"));
       System.out.println("\nSacar R$ 3.000.000,00 da Conta C2: " + (c2.sacar(300000.00f) ? "Saque efetuado com Sucesso!" : "Saldo Insuficiente"));
       c2.visualizar();
       
       /*Deposito na conta c2
        * */
       c2.depositar(50000.00f);
       c2.visualizar();
       
       
        while (true) {

            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "************************************************" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*                                              *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*    ($$$$)      BANCO DA PRAÇA     ($$$$)     *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*                                              *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "************************************************" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*                                              *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           1- Criar Conta                     *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           2- Listar todas as Contas          *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           3- Buscar Conta Por Número         *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           4- Atualizar Dados da Conta        *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           5- Apagar Conta                    *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           6- Sacar                           *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           7- Depositar                       *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           8- Transferir Valores Entre Contas *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*           0- Sair                            *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "*                                              *" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "************************************************" + Cores.RESET);
            System.out.println(Cores.BLACK_BACKGROUND + Cores.TEXT_GREEN + "Entre com a opção desejada: " + Cores.RESET);

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_GREEN + "\nCriar uma conta\n" + Cores.RESET);
                    break;
                case 2:
                    System.out.println(Cores.TEXT_GREEN + "\nListar todas as Contas\n" + Cores.RESET);
                    break;
                case 3:
                    System.out.println(Cores.TEXT_GREEN + "\nBuscar Conta Por Número\n" + Cores.RESET);
                    break;
                case 4:
                    System.out.println(Cores.TEXT_GREEN + "\nAtualizar Dados da Conta\n" + Cores.RESET);
                    break;
                case 5:
                    System.out.println(Cores.TEXT_GREEN + "\nApagar Conta\n" + Cores.RESET);
                    break;
                case 6:
                    System.out.println(Cores.TEXT_GREEN + "\nSacar\n" + Cores.RESET);
                    break;
                case 7:
                    System.out.println(Cores.TEXT_GREEN + "\nDepositar\n" + Cores.RESET);
                    break;
                case 8:
                    System.out.println(Cores.TEXT_GREEN + "\nTransferir Valores Entre Contas\n" + Cores.RESET);
                    break;
                case 0:
                    System.out.println(Cores.TEXT_GREEN + "\nO Banco da Praça agradece!" + Cores.RESET);
                    sobre();
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(Cores.TEXT_GREEN + "\nOpção inválida!\n" + Cores.RESET);
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println(Cores.TEXT_GREEN + "\n************************************************" + Cores.RESET);
        System.out.println(Cores.TEXT_GREEN + "* Projeto Desenvolvido por Joel Ramalho        *" + Cores.RESET);
        System.out.println(Cores.TEXT_GREEN + "* GitHub: github.com/JoelRamalhoF              *" + Cores.RESET);
        System.out.println(Cores.TEXT_GREEN + "************************************************\n" + Cores.RESET);
    }
}