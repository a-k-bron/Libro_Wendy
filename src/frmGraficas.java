import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

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
                grafica = ChartFactory.createPieChart("", pastel, true, true, false);
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

        }
        return null;
    }


}

