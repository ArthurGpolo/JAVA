import javax.swing.JOptionPane;

public class OperacoesVetores {
    // vetor precisa ser static
    static int[] num = new int[7];
    static int quantidade = 0; // meu index(i)
    static String menu = "1 - Adicionar\n 2 - Exibir\n 3 - Buscar\n 4 - Ver o maior\n 5 - Somar todos os elementos\n 6 - Ver elementos pares\n 0 - Sair";

    public static void main(String[] args) {
        int opcao;
        do {
            // input para o usuário
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu)); // retorna string se necessário converter tipo
                                                                         // de variável
            switch (opcao) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    exibir();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    maior();
                    break;
                case 5:
                    soma();
                    break;
                case 6:
                    pares();
                    break;
            }
        } while (opcao != 0);
    }

    static void adicionar() {
        if (quantidade == num.length) {
            JOptionPane.showMessageDialog(null, "Vetor cheio");
            return;
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor"));
        num[quantidade] = valor;
        quantidade++;
        JOptionPane.showMessageDialog(null, "Valor adicionado com sucesso");
    }

    static void exibir() {
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Valor vazio");
            return;
        }
        String txt = "";
        for (int i = 0; i < quantidade; i++) {
            txt = txt + num[i] + " ";
        }
        JOptionPane.showMessageDialog(null, txt);
    }

    static void buscar() {
        // Se estiver vazio avisa e termina caso o contrário pega o valor e retorna se
        // existir
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum valor cadastrado");
            return;
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja buscar"));
        for (int i = 0; i < quantidade; i++) {
            if (valor == num[i]) {
                JOptionPane.showMessageDialog(null, "Encontrado na posição: " + i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Elemento não encontrado");
    }

    static void maior() {
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum valor cadastrado");
            return;
        }
        int maior = num[0];
        for (int i = 1; i < quantidade; i++) {
            maior = num[i] > maior ? num[i] : maior; // if-else de uma linha só
        }
        JOptionPane.showMessageDialog(null, maior + " é o maior valor");
    }

    static void soma() {
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum valor cadastrado");
            return;
        }
        int soma = 0;
        for (int num : num) {
            soma += num;
        }
        JOptionPane.showMessageDialog(null, "Soma " + soma);
    }

    static void pares() {
        if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum valor cadastrado");
            return;
        }
        int pares = num[quantidade];
        for (int num : num) {
            if (num % 2 == 0) {
                pares++;
            }
            JOptionPane.showMessageDialog(null, pares);
        }
    }
}