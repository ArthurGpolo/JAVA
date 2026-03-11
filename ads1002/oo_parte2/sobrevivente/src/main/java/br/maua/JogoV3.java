package br.maua;

public class JogoV3 {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.nome = "John";
        Personagem p2 = new Personagem();
        p2.nome = "Matt";
        p2.setEnergia(5);
        p2.setFome(5);
        p2.setSono(5);
        p2.setFome(7);
        System.out.println("Game Over");
    }
}
