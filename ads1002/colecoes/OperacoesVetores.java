import javax.swing.JOptionPane;

public class OperacoesVetores {
    // vetor precisa ser static
    static int[] num = new int[5];
    static int quantidade = 0; // meu index(i)
    static String menu = "1 - Adicionar\n 2 - Exibir\n 3 - Buscar\n 4 - Ver o maior\n 0 - Sair";
    public static void main(String[] args) {
        int opcao;
        do {
            // input para o usuário
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu)); // retorna string se necessário converter tipo de variável
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

    }

    static void maior() {

    }
}