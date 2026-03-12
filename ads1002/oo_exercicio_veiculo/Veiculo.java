public class Veiculo {
    // duas propriedades que veículos em geral possuem
    // ambas encapsuladas

    // metodos setters para ambas

    // dois comportamentos que veículos em geral possuem
    String nome;
    private int gasolina = 0;
    private int kilometragem = 0;

    public void setGasolina(int g) {
        if (g >= 1 && g <= 100) {
            gasolina = g;
        }
    }

    public void setKilometragem(int k) {
        if (k >= 0 && k <= 1000)
            kilometragem = k;
    }

    void acelerar() {
        if (gasolina >= 10) {
            System.out.printf("%s acelerando...\n", nome);
            gasolina = gasolina - 10;
            if (kilometragem < 1000)
                kilometragem = kilometragem + 10;
            else {
                System.out.printf("%s não tem combustível!!\n", nome);
            }
        }
    }

    void abastecer() {
        if(gasolina <= 100){
            System.out.printf("%s abastecendo...\n", nome);
            gasolina = 100;}
        else{
            System.out.printf("%s não precisa abastecer!!", nome);
        }
    }
}