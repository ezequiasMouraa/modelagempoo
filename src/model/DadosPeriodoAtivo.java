package model;

public class DadosPeriodoAtivo extends DadosPeriodo {

    public DadosPeriodoAtivo(String periodo, double remuneracao, double comissao, double beneficios,
                             double eventuais, double horasExtras, double judiciais, double tetoRedutor,
                             double irrf, double contribPrev, double totalLiquido) {
        super(periodo, remuneracao, comissao, beneficios, eventuais, horasExtras, judiciais,
                tetoRedutor, irrf, contribPrev, totalLiquido);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Período Ativo:");
        System.out.println(this.toString());
    }
}
