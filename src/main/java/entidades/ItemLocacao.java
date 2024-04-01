package entidades;

public class ItemLocacao {
    private int id;
    private double valor;
    private Filme filme;
    private Jogo jogo;

    public ItemLocacao(int id, double valor, Filme filme) {
        this.id = id;
        this.valor = valor;
        this.filme = filme;
    }

    public ItemLocacao(int id, double valor, Jogo jogo) {
        this.id = id;
        this.valor = valor;
        this.jogo = jogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
