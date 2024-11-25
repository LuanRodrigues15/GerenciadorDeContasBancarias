public class Gerente {

    protected String nome;
    private String cpf;
    private int pontuacao;

    public Gerente(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.pontuacao = 0;
    }

    public void pontuar(int pontuar) {
        this.pontuacao += pontuar;
    }

    @Override
    public String toString() {
        return "\nGerente: " + nome + "\nCPF: " + cpf + "\nPontuação: " + pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }


}
