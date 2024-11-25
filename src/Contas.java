import java.util.ArrayList;
import java.util.Random;

public class Contas {

    private int nmrConta;
    private int codigo; // 0 Conta corrente, 1 Conta investimento
    private Cliente cliente;
    private Gerente gerente;
    private double saldo;

    public Contas(int nmrConta, int codigo, Cliente cliente, Gerente gerente) {
        super();
        this.nmrConta = nmrConta;
        this.codigo = codigo;
        this.cliente = cliente;
        this.gerente = gerente;
        this.saldo = 0;
        pontuarGerente();
    }

    public Contas() {
    }

    public int gerarNmrConta(int escolhaTipoCliente) {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        int nmr = 0;

        do {
            if (escolhaTipoCliente == 0) {
                nmr = 100 + random.nextInt(900);
            } else {
                nmr = 1000 + random.nextInt(9000);
            }

        } while (numeros.contains(nmr));

        numeros.add(nmr);

        return nmr;
    }

    private void pontuarGerente() {
        if (cliente instanceof ClientePessoaFisica) {
            gerente.pontuar(2);
        } else {
            gerente.pontuar(5);
        }

        if (this.codigo == 0) {
            gerente.pontuar(5);
        } else {
            gerente.pontuar(10);
        }
    }

    public String tipoConta(int codigo) {
        return codigo == 0 ? "Conta Corrente" : "Conta Investimo";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nAgência 0015 • Conta " + nmrConta + "-01\n");
        sb.append(tipoConta(codigo) + "\n");
        sb.append("| " + cliente.toString() + "\n");
        sb.append("| Saldo: R$ " + saldo + "\n");
        sb.append(gerente.toString());

        return sb.toString();
    }

    public int getNmrConta() {
        return nmrConta;
    }

    public void setNmrConta(int nmrConta) {
        this.nmrConta = nmrConta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
