import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class frmGraficas extends JDialog {
    private JPanel contentPane;

    public frmGraficas(int numPagina) {

        contentPane = mostrargrafiaca(numPagina);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 500);
        setResizable(true);
        setVisible(true);
    }

    private ChartPanel mostrargrafiaca(int numpagina) {
        JFreeChart grafica;
        DefaultCategoryDataset data;
        DefaultPieDataset pastel;
        XYSeries series;
        XYDataset datosParaLinea;
        switch (numpagina) {

            case 18:
                data = new DefaultCategoryDataset();

                data.addValue(14, "", "Nokia");
                data.addValue(10, "", "Samsung");
                data.addValue(8, "", "Blackberry");
                data.addValue(12, "", "LG");
                data.addValue(4, "", "Motorola");
                data.addValue(2, "", "otros");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 19:
                data = new DefaultCategoryDataset();

                data.addValue(14, "", "Nokia");
                data.addValue(10, "", "Samsung");
                data.addValue(8, "", "Blackberry");
                data.addValue(12, "", "LG");
                data.addValue(4, "", "Motorola");
                data.addValue(2, "", "otros");

                grafica = ChartFactory.createAreaChart("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 21:
                data = new DefaultCategoryDataset();

                data.addValue(14, "28%", "Nokia");
                data.addValue(10, "20%", "Samsung");
                data.addValue(8, "16%", "Blackberry");
                data.addValue(12, "24%", "LG");
                data.addValue(4, "8%", "Motorola");
                data.addValue(2, "4%", "otros");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 22:
                pastel = new DefaultPieDataset();

                pastel.setValue("Nokia", 14);
                pastel.setValue("Samsung", 10);
                pastel.setValue("Blackberry", 8);
                pastel.setValue("LG", 12);
                pastel.setValue("Motorola", 4);
                pastel.setValue("otros", 2);
                grafica = ChartFactory.createPieChart3D("", pastel, true, true, false);
                return new ChartPanel(grafica);
            case 23:
                //todo graficas de la 23
                break;
            case 29:
                data = new DefaultCategoryDataset();

                data.addValue(4, "A", "10.4     12.4");
                data.addValue(4, "B", "12.5     14.4");
                data.addValue(9, "C", "14.5     16.4");
                data.addValue(24, "D", "16.5    18.4");
                data.addValue(9, "E", "18.5     20.4");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 30:
                data = new DefaultCategoryDataset();

                data.addValue(4, "A", "10.4     12.4");
                data.addValue(4, "B", "12.5     14.4");
                data.addValue(9, "C", "14.5     16.4");
                data.addValue(24, "D", "16.5    18.4");
                data.addValue(9, "E", "18.5     20.4");

                grafica = ChartFactory.createAreaChart("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 31:
                data = new DefaultCategoryDataset();

                data.addValue(4, "A", "10.4     12.4");
                data.addValue(4, "B", "12.5     14.4");
                data.addValue(9, "C", "14.5     16.4");
                data.addValue(24, "D", "16.5    18.4");
                data.addValue(9, "E", "18.5     20.4");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 32:

                series = new XYSeries("grafica");

                series.add(0, 10.4);
                series.add(8, 12.4);
                series.add(16, 14.4);
                series.add(34, 16.4);
                series.add(82, 18.4);
                series.add(100, 20.4);

                datosParaLinea = new XYSeriesCollection(series);

                grafica = ChartFactory.createXYLineChart("Grafica de Frecuencia acumulativa relativa", "", "", datosParaLinea, PlotOrientation.HORIZONTAL, true, true, false);
                return new ChartPanel(grafica);
            case 33:
                series = new XYSeries("grafica");

                series.add(0, 10.4);
                series.add(4, 12.4);
                series.add(8, 14.4);
                series.add(17, 16.4);
                series.add(41, 18.4);
                series.add(50, 20.4);

                datosParaLinea = new XYSeriesCollection(series);

                grafica = ChartFactory.createXYLineChart("Grafica de Frecuencia acumulativa", "", "", datosParaLinea, PlotOrientation.HORIZONTAL, true, true, false);
                return new ChartPanel(grafica);
            case 35:
                series = new XYSeries("grafica");
                series.add(0, 0);
                series.add(1, 17);
                series.add(2, 15);
                series.add(3, 17.2);
                series.add(4, 17.4);
                series.add(5, 15);
                series.add(6, 18);
                series.add(7, 16.2);
                series.add(8, 18.2);
                series.add(9, 19);
                series.add(10, 17);
                series.add(11, 17.4);
                series.add(12, 18.4);
                series.add(13, 13.4);
                series.add(14, 15.8);
                series.add(15, 16.2);
                series.add(16, 14.3);
                series.add(17, 17.6);
                series.add(18, 17.5);
                series.add(19, 19.1);
                series.add(20, 15.8);
                series.add(21, 15.2);
                series.add(22, 14.8);
                series.add(23, 14.5);
                series.add(24, 17.6);
                series.add(25, 17.9);
                series.add(26, 10.4);
                series.add(27, 11.5);
                series.add(28, 16.1);
                series.add(29, 17.9);
                series.add(30, 17.7);
                series.add(31, 17.8);
                series.add(32, 17.2);
                series.add(33, 17.9);
                series.add(34, 18);
                series.add(35, 16.7);
                series.add(36, 12.4);
                series.add(37, 15.8);
                series.add(38, 16.1);
                series.add(39, 16.3);
                series.add(40, 16.5);
                series.add(41, 16.7);
                series.add(42, 16.1);
                series.add(43, 19.9);
                series.add(44, 11.2);
                series.add(45, 18.3);
                series.add(46, 16.1);
                series.add(47, 16.3);
                series.add(48, 18.7);
                series.add(49, 16.4);
                series.add(50, 19.7);

                datosParaLinea = new XYSeriesCollection(series);

                grafica = ChartFactory.createXYLineChart("Digipunto Hunter", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 36:
                pastel = new DefaultPieDataset();

                pastel.setValue("A 8%", 8);
                pastel.setValue("B 8%", 8);
                pastel.setValue("C 18%", 18);
                pastel.setValue("D 48%", 48);
                pastel.setValue("E 18%", 18);
                grafica = ChartFactory.createPieChart3D("Gráfica circular o  de sectores", pastel, true, true, false);
                return new ChartPanel(grafica);
            case 38:
                //// TODO: 03/06/2016 graficas de la  38
                new frmPag38();
                data = new DefaultCategoryDataset();

                data.addValue(4, "A", "10.4     12.4");
                data.addValue(4, "B", "12.5     14.4");
                data.addValue(9, "C", "14.5     16.4");
                data.addValue(24, "D", "16.5    18.4");
                data.addValue(9, "E", "18.5     20.4");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);

            case 39:
                //// TODO: 03/06/2016 graficas de la 39
                break;
            case 40:
                // TODO: 03/06/2016 graficas de la 40
                break;



        }

        return null;
    }


}

