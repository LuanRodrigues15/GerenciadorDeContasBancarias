public abstract class Cliente {

    protected String nome;

    public Cliente(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
