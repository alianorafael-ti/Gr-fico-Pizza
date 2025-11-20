package com.exemplo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {

        // Criando os dados do gráfico
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Carros", 40);
        dataset.setValue("Motos", 25);
        dataset.setValue("Caminhões", 15);
        dataset.setValue("Ônibus", 20);

        // Criando o gráfico de pizza
        JFreeChart chart = ChartFactory.createPieChart(
                "Gráfico de Pizza - Exemplo", // Título
                dataset,                     // Dados
                true,                        // Mostrar legenda
                true,
                false
        );

        // Exibir o gráfico em uma janela
        ChartFrame frame = new ChartFrame("Gráfico Pizza", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
