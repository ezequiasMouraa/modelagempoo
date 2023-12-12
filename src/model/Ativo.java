package model;

import java.util.ArrayList;
import java.util.List;

public class Ativo extends Servidor {
    private final String cargo;
    private final String funcao;
    private final List<DadosPeriodoAtivo> dadosAtivos;

    public Ativo(String cpf, String nome, String orgao, double salario, String cargo, String funcao) {
        super(cpf, nome, orgao, salario);
        this.cargo = cargo;
        this.funcao = funcao;
        this.dadosAtivos = new ArrayList<>();
    }

    public void adicionarDados(DadosPeriodoAtivo dados) {
        dadosAtivos.add(dados);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("CARGO: " + cargo);
        System.out.println("FUNÇÃO: " + funcao);
        System.out.println("DADOS PERÍODO ATIVO:");
        for (DadosPeriodoAtivo dados : dadosAtivos) {
            dados.exibirDetalhes();
        }
    }
}