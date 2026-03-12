public class TesteVeiculoGabarito {
    public static void main(String[] args) {

        VeiculoGabarito veiculo1 = new VeiculoGabarito("Fusca", "ABC-1234");

        var veiculo2 = new VeiculoGabarito("\nCorolla", "AAA-1111");

        veiculo1.acelerar();
        veiculo1.abastecer();
        veiculo2.abastecer();
        veiculo2.acelerar();
    }
}
