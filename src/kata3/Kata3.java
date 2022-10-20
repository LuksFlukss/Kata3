/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Entrar
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmnail.com");
        histogram.increment("eii.ulpgc.es");

        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histograma");
        histogramDisplay.execute();
                
    }
    
}
