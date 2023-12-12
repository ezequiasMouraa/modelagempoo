package model;

public class DadosPeriodoInativo extends DadosPeriodo {

    public DadosPeriodoInativo(String periodo, double proventos, double eventuais, double judiciais,
                               double tetoRedutor, double irrf, double contribPrev, double totalLiquido) {
        super(periodo, 0, 0, 0, proventos, 0, judiciais, tetoRedutor, irrf, contribPrev, totalLiquido);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Período Inativo:");
        System.out.println(this.toString());
    }
}