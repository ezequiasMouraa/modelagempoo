package model;

public abstract class DadosPeriodo {
    private final String periodo;
    private final double remuneracao;
    private final double comissao;
    private final double beneficios;
    private final double eventuais;
    private final double horasExtras;
    private final double judiciais;
    private final double tetoRedutor;
    private final double irrf;
    private final double contribPrev;
    private final double totalLiquido;

    public DadosPeriodo(String periodo, double remuneracao, double comissao, double beneficios,
                        double eventuais, double horasExtras, double judiciais, double tetoRedutor,
                        double irrf, double contribPrev, double totalLiquido) {
        this.periodo = periodo;
        this.remuneracao = remuneracao;
        this.comissao = comissao;
        this.beneficios = beneficios;
        this.eventuais = eventuais;
        this.horasExtras = horasExtras;
        this.judiciais = judiciais;
        this.tetoRedutor = tetoRedutor;
        this.irrf = irrf;
        this.contribPrev = contribPrev;
        this.totalLiquido = totalLiquido;
    }

    public abstract void exibirDetalhes();

    @Override
    public String toString() {
        return String.format("Período: %s, Remuneração: %.2f, Comissão: %.2f, Benefícios: %.2f, " +
                        "Eventuais: %.2f, Horas Extras: %.2f, Judiciais: %.2f, " +
                        "Teto Redutor: %.2f, IRRF: %.2f, Contribuição Previdenciária: %.2f, " +
                        "Total Líquido: %.2f", periodo, remuneracao, comissao, beneficios,
                eventuais, horasExtras, judiciais, tetoRedutor, irrf, contribPrev, totalLiquido);
    }
}