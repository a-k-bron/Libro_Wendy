import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag38 extends JDialog {
    private JPanel contentPane;
    private JPanel ventanita;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton btnBarras;
    private JButton btnFrecuencia;
    private JButton buttonOK;
    private JFreeChart grafica;
    private DefaultCategoryDataset data;
    private DefaultPieDataset pastel;
    private XYSeries series;
    private XYDataset datosParaLinea;

    public frmPag38() {
        setContentPane(contentPane);
        setModal(true);
        setSize(400, 400);
        btnBarras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        setVisible(true);


    }
}
