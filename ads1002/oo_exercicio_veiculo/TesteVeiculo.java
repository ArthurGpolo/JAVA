public class TesteVeiculo {
    // criar método main 
    public static void main(String[] args) {
    // construir dois objetos do tipo veículo
    Veiculo v1 = new Veiculo();
    Veiculo v2 = new Veiculo();
    // atribuir valores a suas propriedades usando os metodos setters 
    v1.setVelocidade(120);
    v1.setMarca("ferrari");
    v2.setVelocidade(60);
    v2.setMarca("toyota");
    // adicionar os seus componentes
    v1.marca();
    v1.velocidade();
    v2.marca();
    v2.velocidade();
    }
}
