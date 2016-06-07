import graficas.*;
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

    private JPanel mostrargrafiaca(int numpagina) {
        JFreeChart grafica;
        DefaultCategoryDataset data;
        DefaultPieDataset pastel;
        XYSeries series;
        XYDataset datosParaLinea;
        float porcentaje;
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
                new frmPag23();
                porcentaje = 100f / (frmPag23.unam + frmPag23.toluca + frmPag23.guadalajara + frmPag23.cruzAzul + frmPag23.america);
                pastel = new DefaultPieDataset();

                pastel.setValue("Guadalajara " + String.valueOf(frmPag23.guadalajara * porcentaje) + "%", frmPag23.guadalajara * porcentaje);
                pastel.setValue("America " + String.valueOf(frmPag23.america * porcentaje) + "%", frmPag23.america * porcentaje);
                pastel.setValue("Toluca " + String.valueOf(frmPag23.toluca * porcentaje) + "%", frmPag23.toluca * porcentaje);
                pastel.setValue("UNAM " + String.valueOf(frmPag23.unam * porcentaje) + "%", frmPag23.unam * porcentaje);
                pastel.setValue("Cruz Azul " + String.valueOf(frmPag23.cruzAzul * porcentaje) + "%", frmPag23.cruzAzul * porcentaje);

                grafica = ChartFactory.createPieChart3D("", pastel, true, true, false);
                return new ChartPanel(grafica);
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

                new frmPag38();
                series = new XYSeries("grafica");
                series.add(1, frmPag38.a);
                series.add(2, frmPag38.b);
                series.add(3, frmPag38.c);
                series.add(4, frmPag38.d);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("Poligono de frecuencia", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);

            case 39:
                new frmPag38();
                data = new DefaultCategoryDataset();

                data.addValue(frmPag38.a, "A", "A");
                data.addValue(frmPag38.b, "B", "B");
                data.addValue(frmPag38.c, "C", "C");
                data.addValue(frmPag38.d, "D", "D");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);

            case 40:
                new frmPag38();
                porcentaje = 100f / (frmPag38.a + frmPag38.b + frmPag38.c + frmPag38.d);
                pastel = new DefaultPieDataset();

                pastel.setValue("A " + String.valueOf(frmPag38.a * porcentaje) + "%", frmPag38.a * porcentaje);
                pastel.setValue("B " + String.valueOf(frmPag38.b * porcentaje) + "%", frmPag38.b * porcentaje);
                pastel.setValue("C " + String.valueOf(frmPag38.c * porcentaje) + "%", frmPag38.c * porcentaje);
                pastel.setValue("D " + String.valueOf(frmPag38.d * porcentaje) + "%", frmPag38.d * porcentaje);

                grafica = ChartFactory.createPieChart3D("", pastel, true, true, false);
                return new ChartPanel(grafica);

            case 99:
                series = new XYSeries("grafica");
                series.add(1, 0);
                series.add(2, 1);
                series.add(2.7, 7.5);
                series.add(3, 8);
                series.add(3.3, 7.5);
                series.add(4, 1);
                series.add(5, 0);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("distribucion simétrica", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 101:
                series = new XYSeries("grafica");
                series.add(1, 0);
                series.add(2, 1);
                series.add(2.7, 7.5);
                series.add(3, 8);
                series.add(3.3, 7.5);
                series.add(4, 1);
                series.add(5, 0);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("distribucion simétrica", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 111:
                new frmPag38();
                data = new DefaultCategoryDataset();

                data.addValue(frmPag38.a, "A", "A");
                data.addValue(frmPag38.b, "B", "B");
                data.addValue(frmPag38.c, "C", "C");
                data.addValue(frmPag38.d, "D", "D");

                grafica = ChartFactory.createBarChart3D("", "", "", data, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 112:
                new frmPag112();
                porcentaje = 100f / (frmPag112.a + frmPag112.b + frmPag112.c);
                pastel = new DefaultPieDataset();

                pastel.setValue("A ", frmPag112.a * porcentaje);
                pastel.setValue("B ", frmPag112.b * porcentaje);
                pastel.setValue("C ", frmPag112.c * porcentaje);
                grafica = ChartFactory.createPieChart3D("", pastel, true, true, false);
                return new ChartPanel(grafica);

            case 113:
                new frmPag113();
                series = new XYSeries("grafica");
                series.add(1, frmPag113.p1);
                series.add(2, frmPag113.p2);
                series.add(3, frmPag113.p3);
                series.add(4, frmPag113.p4);
                series.add(5, frmPag113.p5);
                series.add(6, frmPag113.p6);
                series.add(7, frmPag113.p7);
                series.add(8, frmPag113.p8);
                series.add(9, frmPag113.p9);
                series.add(10, frmPag113.p10);
                series.add(11, frmPag113.p11);
                series.add(12, frmPag113.p12);
                series.add(13, frmPag113.p13);
                series.add(14, frmPag113.p14);
                series.add(15, frmPag113.p15);
                series.add(16, frmPag113.p16);
                series.add(17, frmPag113.p17);
                series.add(18, frmPag113.p18);
                series.add(19, frmPag113.p19);
                series.add(20, frmPag113.p20);
                series.add(21, frmPag113.p21);
                series.add(22, frmPag113.p22);
                series.add(23, frmPag113.p23);
                series.add(24, frmPag113.p24);
                series.add(25, frmPag113.p25);
                series.add(26, frmPag113.p26);
                series.add(27, frmPag113.p27);
                series.add(28, frmPag113.p28);
                series.add(29, frmPag113.p29);
                series.add(30, frmPag113.p30);
                series.add(31, frmPag113.p31);
                series.add(32, frmPag113.p32);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("Gráfica de digipunto de Hunter", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);

            case 121:
                series = new XYSeries("grafica");
                series.add(0, 35);

                series.add(45, 120);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 125:
                new frmPag125();
                series = new XYSeries("grafica");
                series.add(frmPag125.km1, frmPag125.c1);
                series.add(frmPag125.km2, frmPag125.c2);
                series.add(frmPag125.km3, frmPag125.c3);
                series.add(frmPag125.km4, frmPag125.c4);
                series.add(frmPag125.km5, frmPag125.c5);
                series.add(frmPag125.km6, frmPag125.c6);
                series.add(frmPag125.km7, frmPag125.c7);
                series.add(frmPag125.km8, frmPag125.c8);
                series.add(frmPag125.km9, frmPag125.c9);
                series.add(frmPag125.km10, frmPag125.c10);

                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 127:
                new frmPag127();
                series = new XYSeries("grafica");
                series.add(frmPag127.po1, frmPag127.sb1);
                series.add(frmPag127.po2, frmPag127.sb2);
                series.add(frmPag127.po3, frmPag127.sb3);
                series.add(frmPag127.po4, frmPag127.sb4);
                series.add(frmPag127.po5, frmPag127.sb5);
                series.add(frmPag127.po6, frmPag127.sb6);
                series.add(frmPag127.po7, frmPag127.sb7);
                series.add(frmPag127.po8, frmPag127.sb8);
                series.add(frmPag127.po9, frmPag127.sb9);
                series.add(frmPag127.po10, frmPag127.sb10);
                datosParaLinea = new XYSeriesCollection(series);
                grafica = ChartFactory.createXYLineChart("", "", "", datosParaLinea, PlotOrientation.VERTICAL, true, true, false);
                return new ChartPanel(grafica);
            case 137:
                return new frmPag137().contentPane;
            case 138:
                return new frmPag138().contentPane;
            case 139:
                return new frmPag139().contentPane;
        }

        return null;
    }


}

