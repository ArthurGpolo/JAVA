import java.util.*;
import javax.swing.JOptionPane;

public class PlayList {
    public static void main(String[] args) {

        // Lista de músicas
        List<Musica> musicas = new ArrayList<>();

        // Menu de opções
        String menu = "1 - Adicionar\n2 - Visualizar\n3 - Avaliar\n0 - Sair";
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(opcao){

                case 1:
                    // Adicionar música
                    String titulo = JOptionPane.showInputDialog("Título:");
                    Musica musica = new Musica(titulo);
                    musicas.add(musica);
                    break;

                case 2:
                    // Visualizar lista
                    String textoFinal = "";

                    // foreach correto
                    for (Musica i : musicas) {
                        textoFinal += i.getTitulo() + "\n"; // concatenação correta
                    }

                    JOptionPane.showMessageDialog(null, textoFinal);
                    break;

                case 3:
                    // Avaliar (exemplo simples)
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome da música para avaliar:");

                    for (Musica i : musicas) {
                        if (i.getTitulo().equalsIgnoreCase(nomeBusca)) {
                            int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota (0 a 10):"));
                            i.setNota(nota);
                        }
                    }
                    break;
            }

        } while(opcao != 0);
    }
}