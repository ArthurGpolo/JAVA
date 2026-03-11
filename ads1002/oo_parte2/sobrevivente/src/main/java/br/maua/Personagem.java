package br.maua;

public class Personagem {
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    // setters
    public void setEnergia(int e) {
        if (e >= 0 && e <= 10) {
            energia = e;
        }
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 10) {
            this.fome = fome;   
        }
    }

    public void setSono(int sono) {
        if (sono >= 0 && sono >= 10) {
            this.sono = sono;   
        }
    }

    // método: tipo de retorno, nome, lista de parâmetros e corpo
    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " caçando...");
            energia = energia - 2;
        } else {
            System.out.printf("%s sem energia para caçar...\n", nome);
        }

        if (fome < 10)
            fome = fome + 1;

        if (sono < 10)
            sono = sono + 1;
    }

    void comer() {
        if (fome >= 1) {
            System.out.printf("%s comendo...\n", nome);
            // fome = fome - 1;
            // fome -= 1;
            fome--;
            if (energia < 10)
                energia++;
        } else {
            System.out.printf("%s sem fome\n", nome);
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.printf("%s dormindo...\n", nome);
            sono--;
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.printf("%s sem sono\n", nome);
        }
    }

    int somar(int a, int b) {
        return a + b;
    }
}
