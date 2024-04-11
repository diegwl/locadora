package entidades;

public class Filme extends Item{
    private String diretor;
    private String duracao;

    public Filme(int id, String titulo, String descricao, double preco, Categoria categoria, int numeroDias, String diretor, String duracao) {
        super(id, titulo, descricao, preco, categoria, numeroDias);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public Filme(int id, String titulo, String descricao, double preco, Categoria categoria, int numeroDias) {
        super(id, titulo, descricao, preco, categoria, numeroDias);
    }

    public Filme(Categoria categoria) {
        super(categoria);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
