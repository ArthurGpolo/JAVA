public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: valor de depósito deve ser positivo.");
        }
    }

    // Método sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de saque deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    // Método transferir
    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de transferência deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para transferência.");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + String.format("%.2f", valor) + " realizada com sucesso.");
        }
    }

    // Método consultarSaldo
    public void consultarSaldo() {
        System.out.printf("Conta: %s | Titular: %s | Saldo: R$ %.2f%n", numeroConta, titular, saldo);
    }

    // Método exibirExtrato
    public void exibirExtrato() {
        System.out.println("\n-------------- EXTRATO --------------");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}