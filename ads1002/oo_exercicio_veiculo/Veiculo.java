public class Veiculo {
    // duas propriedade que veículos em geral possuem
    // ambas encapsuladas 
    private String marca = "ferrari";
    private int velocidade = 200;

    // métodos setters para ambas
    public void setVelocidade(int velocidade) {
        if (velocidade > 350) {
            this.velocidade = velocidade;
        }
    }

    public void setMarca(String marca) {
        if (marca != "ferrari") {
            this.marca = marca;
        }
    }

    // dois comportamentos que veículos em geral possuem
    void velocidade() {
        if (velocidade >= 100) {
            System.out.printf("%s cuidado você está a", velocidade, "%s diminua sua velocidade");
        } else if (velocidade > 0) {
            System.out.printf("%s você está dentro do limite de velocidade");
        } else {
            System.out.printf("%s você está parado");
        }
    }

    void marca() {
        if (marca == "ferrari") {
            System.out.printf("%s parabéns você possui uma", marca);
        }
    }
}
