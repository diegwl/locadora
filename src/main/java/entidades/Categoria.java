package entidades;

public class Categoria {
    private int id;
    private String nome;
    private char tipo;

    public Categoria(int id, String nome, char tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Categoria() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNomeTipo() {
        return tipo == 'F' ? "Filme" : "Jogo";
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
