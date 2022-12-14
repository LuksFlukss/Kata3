/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Louka Vanhoucke
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(Histogram<String> histogram ,String title) {
        super(title);
        setContentPane(createPanel());
        pack();
    }
    
    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma de emails", 
                "Dominios de email", "Nº de emails", dataset, 
                PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(8, "", "ulpgc.es");
         dataset.addValue(2, "", "hotmail.com");
        dataset.addValue(7, "", "eii.ulpgc.es");
        dataset.addValue(1, "", "gmail.com");
        dataset.addValue(15, "", "dis.ulpgc.es");

        return dataset;
    }
}
