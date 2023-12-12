// Main.java
package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        // Criar servidores ativos
        Ativo servidorAtivo1 = new Ativo("###.306.6##-##", "ADERVAL VANDERLEI TENORIO FILHO",
                "PGE", 51085.46, "Procurador de Estado", "Função Gratificada de Procurador Subcoor");

        Ativo servidorAtivo2 = new Ativo("###.566.2##-##", "IVAN LUIZ RUFINO DA SILVA",
                "PGE", 48723.17, "Procurador de Estado", "Função Gratificada de Procurador Coorden");

        Ativo servidorAtivo3 = new Ativo("###.007.1##-##", "SERGIO RICARDO FREIRE DE SOUSA PEPEU",
                "PGE", 48322.80, "Procurador de Estado", "Função Gratificada de Subprocurador Corr");

        // Adicionar dados aos servidores ativos
        servidorAtivo1.adicionarDados(new DadosPeriodoAtivo("2023/10", 42852.55, 2296.75, 2026.96,
                25057.47, 0, 0, 0, 15885.68, 5262.59, 51085.46));
        servidorAtivo1.adicionarDados(new DadosPeriodoAtivo("2023/09", 53491.25, 3337.34, 2026.96,
                0, 0, 0, 0, 12206.69, 5262.59, 41386.27));
        servidorAtivo1.adicionarDados(new DadosPeriodoAtivo("2023/08", 40426.93, 0, 2026.96,
                0, 0, 0, 0, 7778.15, 4964.71, 29711.03));
        // Adicionar mais dados aos servidores ativos...

        servidorAtivo2.adicionarDados(new DadosPeriodoAtivo("2023/10", 37589.96, 4101.35, 2026.96,
                25057.47, 0, 0, 0, 14789.98, 5262.59, 48723.17));
        servidorAtivo2.adicionarDados(new DadosPeriodoAtivo("2023/09", 48228.66, 4101.35, 2026.96,
                0, 0, 0, 0, 10021.61, 5262.59, 39072.77));
        servidorAtivo2.adicionarDados(new DadosPeriodoAtivo("2023/08", 35462.22, 3981.89, 2026.96,
                0, 0, 0, 0, 7061.85, 4964.71, 29444.51));
        // Adicionar mais dados aos servidores ativos...

        servidorAtivo3.adicionarDados(new DadosPeriodoAtivo("2023/10", 37589.96, 2296.75, 2026.96,
                27939.65, 0, 0, 0, 16267.93, 5262.59, 48322.80));
        servidorAtivo3.adicionarDados(new DadosPeriodoAtivo("2023/09", 48228.66, 4940.29, 2026.96,
                0, 0, 0, 48.68, 12468.92, 5262.59, 37415.72));
        servidorAtivo3.adicionarDados(new DadosPeriodoAtivo("2023/08", 35462.22, 4873.39, 2026.96,
                0, 0, 0, 0, 8789.90, 4964.71, 28607.96));
        // Adicionar mais dados aos servidores ativos...

        // Exibir detalhes dos servidores ativos
        servidorAtivo1.exibirDetalhes();
        servidorAtivo2.exibirDetalhes();
        servidorAtivo3.exibirDetalhes();

        // Criar servidores inativos
        Inativo servidorInativo1 = new Inativo("###.419.4##-##", "MARLENE SANTOS BRAGA",
                "Pensionista", 152330.72);
        Inativo servidorInativo2 = new Inativo("###.538.8##-##", "SILVANEIDE SANTOS DA SILVA",
                "Pensionista", 128858.15);
        Inativo servidorInativo3 = new Inativo("###.944.8##-##", "MARIA TEOMIRTES DE BARROS MALTA",
                "Pensionista", 65278.78);

        // Adicionar dados aos servidores inativos
        servidorInativo1.adicionarDados(new DadosPeriodoInativo("2023/10", 26653.45, 41305.76,
                0, 0, 0, 2680.43, 65278.78));
        servidorInativo1.adicionarDados(new DadosPeriodoInativo("2023/09", 26653.45, 0,
                0, 0, 0, 2680.43, 23973.02));
        servidorInativo1.adicionarDados(new DadosPeriodoInativo("2023/08", 26653.45, 0,
                0, 0, 0, 2680.43, 18846.20));
        // Adicionar mais dados aos servidores inativos...

        servidorInativo2.adicionarDados(new DadosPeriodoInativo("2023/10", 152176.06, 6460.01,
                0, 0, 14404.21, 15373.71, 128858.15));

        // Adicionar mais dados aos servidores inativos...

        servidorInativo3.adicionarDados(new DadosPeriodoInativo("2023/10", 26653.45, 0,
                0, 0, 0, 2680.43, 18846.20));
        // Adicionar mais dados aos servidores inativos...

        // Exibir detalhes dos servidores inativos
        servidorInativo1.exibirDetalhes();
        servidorInativo2.exibirDetalhes();
        servidorInativo3.exibirDetalhes();
    }
}
