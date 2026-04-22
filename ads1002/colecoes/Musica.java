public class Musica {
    private String titulo;
    private int nota;

    public Musica(String titulo) {
        this.titulo = titulo;
        this.nota = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}