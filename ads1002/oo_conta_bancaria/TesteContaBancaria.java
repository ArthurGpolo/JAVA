import java.util.Random;

public class TesteContaBancaria {

    public static void main(String[] args) {

        // Criando duas contas com dados
        ContaBancaria c1 = new ContaBancaria("Arthur", "001", 1000.0);
        ContaBancaria c2 = new ContaBancaria("Maria", "002", 1000.0);

        Random gerador = new Random();

        while (true) {

            ContaBancaria ativa = gerador.nextBoolean() ? c1 : c2;
            ContaBancaria destino = (ativa == c1) ? c2 : c1;

            int operacao = gerador.nextInt(3);

            double valor = 1 + (500 - 1) * gerador.nextDouble();

            System.out.println("\n====================================");
            System.out.println("Conta ativa: " + (ativa == c1 ? "Conta 1" : "Conta 2"));

            switch (operacao) {
                case 0:
                    ativa.depositar(valor);
                    break;
                case 1:
                    ativa.sacar(valor);
                    break;
                case 2:
                    ativa.transferir(destino, valor);
                    break;
            }

            // Exibe extratos
            c1.exibirExtrato();
            c2.exibirExtrato();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Erro na pausa da thread");
            }
        }
    }
}