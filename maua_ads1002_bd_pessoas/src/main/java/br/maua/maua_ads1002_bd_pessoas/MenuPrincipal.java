package br.maua.maua_ads1002_bd_pessoas;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) throws Exception{
        String menu = "1 - Cadastrar\n2 - Atualizar\n3 - Apagar\n4 - Visualizar\n0 - Sair";
        int opcao;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = leitor.next();
                    System.out.println("Digite o fone: ");
                    String fone = leitor.next();
                    System.out.println("Digite o email: ");
                    String email = leitor.next();
                    Pessoa p = new Pessoa(nome, fone, email);
                    p.cadastrar();
                    System.out.println("Pessoa cadastrada!");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while(opcao != 0);
        leitor.close();
    }
}
