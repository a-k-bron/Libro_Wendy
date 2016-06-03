import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

/**
 * Created by Everardo on 02/06/2016.
 */
public class Graficas {
    JFreeChart grafica;
    String titulo;
    String tx;
    String ty;
    XYSeriesCollection datos = new XYSeriesCollection();
    final static int LINEAL = 1;
    final static int POLAR = 2;
    final static int DISPERSION = 3;
    final static int AREA = 4;
    final static int LOGARITMICA = 5;
    final static int SERIETIEMPO = 6;
    final static int PASO = 7;
    final static int PASOAREA = 8;

    public Graficas(int tipo, String titulo) {
        this.titulo = titulo;
    }

    public void tipoGrafica(int tipo) {
        switch (tipo) {
            case LINEAL:
                grafica = ChartFactory.createXYLineChart(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case POLAR:
                break;
            case DISPERSION:
                break;
            case AREA:
                break;
            case LOGARITMICA:
                break;
            case SERIETIEMPO:
                break;
            case PASO:
                break;
            case PASOAREA:
                break;
        }
    }

    public void agragarGrafica(String id, double[] x, double[] y) {
        XYSeries s = new XYSeries(id);
        int n = x.length;

        for (int i = 0; i < n; i++) {
            s.add(x[i], y[i]);
        }
        datos.addSeries(s);
    }

    public JPanel obtienePanel() {
        return new ChartPanel(grafica);
    }
}
