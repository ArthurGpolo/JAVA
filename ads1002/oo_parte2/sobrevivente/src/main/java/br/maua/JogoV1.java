package br.maua;

public class JogoV1 {
    public static void main(String[] args){
        // construir um objeto do tipo Personagem
        Personagem p1 = new Personagem();
        p1.nome = "Jubileu";
        p1.cacar();
        p1.comer();
        p1.dormir();
        p1.cacar();

        Personagem p2 = new Personagem();
        p2.nome = "Cleber Machado";
        p2.dormir();
        p2.dormir();
        p2.dormir();
    };
}
