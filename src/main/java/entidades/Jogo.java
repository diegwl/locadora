package entidades;

public class Jogo extends Item {
    private int memoria;
    private String tipo;

    public Jogo(int id, String titulo, String descricao, double preco, Categoria categoria, int memoria, String tipo) {
        super(id, titulo, descricao, preco, categoria);
        this.memoria = memoria;
        this.tipo = tipo;
    }

    public Jogo(int id, String titulo, String descricao, double preco, Categoria categoria) {
        super(id, titulo, descricao, preco, categoria);
    }

    public Jogo(Categoria categoria) {
        super(categoria);
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
