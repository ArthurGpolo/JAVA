import java.util.Random;
public class TesteVeiculo {
    // criar o método main

    // construir dois objetos do tipo veículo

    // atribuir valores as suas propriedades usando os metodos setters

    // acionar os seus comportamentos
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Veiculo c1 = new Veiculo();
        c1.nome = "Uno";
        Veiculo c2 = new Veiculo();
        c2.nome = "Cybertruck";
        c1.setGasolina(0);
        c1.setKilometragem(500);
        c2.setGasolina(100);
        c2.setKilometragem(200);
        System.out.printf("Carro %s quebrou", c1.nome);
            while(true){
                System.out.println("====================================================");
                int oQueFazer = gerador.nextInt(1,3);
                switch(oQueFazer){
                    case 1:
                        c1.acelerar();
                        break;
                    case 2:
                        c1.abastecer();
                        break;}
                    switch(oQueFazer){
                    case 1:
                        c2.acelerar();
                        break;
                    case 2:
                        c2.abastecer();
                        break;
                    }
                    System.out.println("====================================================");
                    Thread.sleep(4000);
            }
        }
    }
