import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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
        switch (numpagina) {
            case 18:
                DefaultCategoryDataset data = new DefaultCategoryDataset();

                data.addValue(14, "", "Nokia");
                data.addValue(10, "", "Samsung");
                data.addValue(8, "", "Blackberry");
                data.addValue(12, "", "LG");
                data.addValue(4, "", "Motorola");
                data.addValue(2, "", "otros");

                JFreeChart grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 19:
                break;
        }
        return null;
    }


}

