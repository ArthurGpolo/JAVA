package br.maua.maua_ads1002_bd_pessoas;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) throws Exception {
        String menu = "1 - Cadastrar\n2 - Atualizar\n3 - Apagar\n4 - Visualizar\n0 - Sair";
        int opcao;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch (opcao) {
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
                case 3:{
                    System.out.println("Digite um código");
                    int codigo = leitor.nextInt();
                    Pessoa p2 = new Pessoa(codigo);
                    p2.remover();
                    System.out.println("Pessoa removida");
                    break;
                }
                case 4:
                    List<Pessoa> pessoas = Pessoa.listar();
                    for (Pessoa pessoa : pessoas) {
                        System.err.printf(
                           "%s %s %s\n",
                            pessoa.getNome(), pessoa.getFone(), pessoa.getEmail()
                        );
                    }
                    ;
                    break;
            }
        } while (opcao != 0);
        leitor.close();
    }
}
