// Servidor.java
package model;

public abstract class Servidor {
    protected String cpf;
    protected String nome;
    protected String orgao;
    protected double totalLiquido;

    public Servidor(String cpf, String nome, String orgao, double totalLiquido) {
        this.cpf = cpf;
        this.nome = nome;
        this.orgao = orgao;
        this.totalLiquido = totalLiquido;
    }

    public void exibirDetalhes() {
        System.out.println("CPF: " + cpf);
        System.out.println("NOME: " + nome);
        System.out.println("VÍNCULO: " + orgao);
        System.out.println("TOTAL LÍQUIDO: " + totalLiquido);
    }

}
