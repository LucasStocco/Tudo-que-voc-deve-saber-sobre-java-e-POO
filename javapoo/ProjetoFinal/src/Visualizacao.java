package src;

public class Visualizacao {
    // Relações de agregação
    private PequenoGafanhoto espectador;
    private Video filme;

    // Construtor
    public Visualizacao(PequenoGafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistidos(this.espectador.getTotalAssistidos() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    // Métodos com o mesmo nome mas assinaturas diferentes dentro da mesma classe. Isso é, uma sobrecarga.
    }
    public void avaliar() {
        // Se eu não chamar nada a avaliação será 5
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        // Se uma nota for passada, então será aquela nota
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        // Parâmetro interno
        int tot = 0;
        // Sistema de avaliação por porcentagem
        if (porcentagem <= 20) {
            tot = 2;
        } else if (porcentagem <= 50) {
            tot = 4;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    // Getters e Setters
    public PequenoGafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(PequenoGafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    // To String
    @Override 
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }        
}
