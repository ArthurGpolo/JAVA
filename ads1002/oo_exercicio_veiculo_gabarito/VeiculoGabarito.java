public class VeiculoGabarito {
    private String modelo;
    private String placa;
    private double nivelCombustivel;

    public VeiculoGabarito(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void acelerar() {
        System.out.printf("%s acelerando\n", modelo);
    }

    public void abastecer() {
        System.out.printf("%s abastecendo", modelo);
    }
}
