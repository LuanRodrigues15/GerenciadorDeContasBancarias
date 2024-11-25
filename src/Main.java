import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int resp;
        String[] tipoCliente = {"Pessoa Física", "Pessoa Jurídica"};
        String[] tipoConta = {"Conta Correte", "Conta Investimento"};

        Cliente cliente;
        Gerente gerente;
        Contas contas = new Contas();

        List<Contas> conta = new ArrayList<>();

        do {
            resp = JOptionPane.showConfirmDialog(null, "Deseja adicionar novo cliente?", "Conta Bancária",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resp == JOptionPane.YES_OPTION) {

                int escolhaTipoCliente = JOptionPane.showOptionDialog(null, "Qual o tipo do cliente?", "Conta Bancária",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoCliente, null);

                int nmrConta = contas.gerarNmrConta(escolhaTipoCliente);

                int escolhaTipoConta = JOptionPane.showOptionDialog(null, "Qual o tipo da conta?", "Conta Bancária",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoConta, null);

                if (escolhaTipoCliente == 0) {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome: ", "Conta Bancária - Dados da Pessoa Física",
                            JOptionPane.DEFAULT_OPTION);
                    String cpf = JOptionPane.showInputDialog(null, "Digite o CPF: ", "Conta Bancária - Dados da Pessoa Física",
                            JOptionPane.DEFAULT_OPTION);
                    cliente = new ClientePessoaFisica(nome, cpf);
                } else {
                    String nome = JOptionPane.showInputDialog(null, "Digite o Nome: ", "Conta Bancária - Dados da Pessoa Jurídica",
                            JOptionPane.DEFAULT_OPTION);
                    String cpf = JOptionPane.showInputDialog(null, "Digite o CNPJ: ", "Conta Bancária - Dados da Pessoa Jurídica",
                            JOptionPane.DEFAULT_OPTION);
                    cliente = new ClientePessoaJuridica(nome, cpf);
                }

                String nomeG = JOptionPane.showInputDialog(null, "Digite o nome do Gerente: ", "Conta Bancária - Dados do Gerente",
                        JOptionPane.DEFAULT_OPTION);
                String cpfG = JOptionPane.showInputDialog(null, "Digite o CPF: ", "Conta Bancária - Dados do Gerente",
                        JOptionPane.DEFAULT_OPTION);
                gerente = new Gerente(nomeG, cpfG);

                Contas c = new Contas(nmrConta, escolhaTipoConta, cliente, gerente);
                conta.add(c);

                JOptionPane.showMessageDialog(null, "Nova conta criada com sucesso!\n" + c, "Conta Bancária",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário optou em não adicionar novo cliente", "Conta Bancária",
                        JOptionPane.INFORMATION_MESSAGE);

            }

        } while (resp != JOptionPane.CANCEL_OPTION && resp != JOptionPane.NO_OPTION && resp != -1);

        if (conta.size() > 1) {
            int contador = 1;
            Gerente gMaiorPont = null;

            for (Contas result : conta) {
                JOptionPane.showMessageDialog(null, "- Dados da " + contador + "ª conta -\n" + result, "Conta Bancária - Contas criadas",
                        JOptionPane.INFORMATION_MESSAGE);
                contador++;

                Gerente gerenteDaConta = result.getGerente();
                if (gMaiorPont == null || gerenteDaConta.getPontuacao() > gMaiorPont.getPontuacao()) {
                    gMaiorPont = gerenteDaConta;
                }
            }

            JOptionPane.showMessageDialog(null, "Gerente com maior pontuação: " + gMaiorPont.getNome(),
                    "Conta Bancária", JOptionPane.INFORMATION_MESSAGE);
        } else if (conta.size() == 1) {
            JOptionPane.showMessageDialog(null, "Apenas uma conta foi cadastrada. Não há avaliação de maior pontuação.",
                    "Conta Bancária", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma conta foi cadastrada.", "Conta Bancária",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado!", "Conta Bancária", JOptionPane.INFORMATION_MESSAGE);
    }
}
