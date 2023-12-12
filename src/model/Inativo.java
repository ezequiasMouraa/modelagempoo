package model;

import java.util.ArrayList;
import java.util.List;

public class Inativo extends Servidor {
    private final String vinculo;
    private final List<DadosPeriodoInativo> dadosInativos;

    public Inativo(String cpf, String nome, String vinculo, double proventos) {
        super(cpf, nome, "Pensionista", proventos);  // Orgao fixo como "Pensionista"
        this.vinculo = vinculo;
        this.dadosInativos = new ArrayList<>();
    }

    public void adicionarDados(DadosPeriodoInativo dados) {
        dadosInativos.add(dados);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("VÍNCULO: " + vinculo);
        System.out.println("DADOS PERÍODO INATIVO:");
        for (DadosPeriodoInativo dados : dadosInativos) {
            dados.exibirDetalhes();
        }
    }
}