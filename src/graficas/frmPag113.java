package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag113 extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
    private JTextField textField17;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;

    public static double p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17,
            p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32;

    public frmPag113() {
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 500);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    p1 = Double.parseDouble(textField1.getText());
                    p2 = Double.parseDouble(textField2.getText());
                    p3 = Double.parseDouble(textField3.getText());
                    p4 = Double.parseDouble(textField4.getText());
                    p5 = Double.parseDouble(textField5.getText());
                    p6 = Double.parseDouble(textField6.getText());
                    p7 = Double.parseDouble(textField7.getText());
                    p8 = Double.parseDouble(textField8.getText());
                    p9 = Double.parseDouble(textField9.getText());
                    p10 = Double.parseDouble(textField10.getText());
                    p11 = Double.parseDouble(textField11.getText());
                    p12 = Double.parseDouble(textField12.getText());
                    p13 = Double.parseDouble(textField13.getText());
                    p14 = Double.parseDouble(textField14.getText());
                    p15 = Double.parseDouble(textField15.getText());
                    p16 = Double.parseDouble(textField16.getText());
                    p17 = Double.parseDouble(textField17.getText());
                    p18 = Double.parseDouble(textField18.getText());
                    p19 = Double.parseDouble(textField19.getText());
                    p20 = Double.parseDouble(textField20.getText());
                    p21 = Double.parseDouble(textField21.getText());
                    p22 = Double.parseDouble(textField22.getText());
                    p23 = Double.parseDouble(textField23.getText());
                    p24 = Double.parseDouble(textField24.getText());
                    p25 = Double.parseDouble(textField25.getText());
                    p26 = Double.parseDouble(textField26.getText());
                    p27 = Double.parseDouble(textField27.getText());
                    p28 = Double.parseDouble(textField28.getText());
                    p29 = Double.parseDouble(textField29.getText());
                    p30 = Double.parseDouble(textField30.getText());
                    p31 = Double.parseDouble(textField31.getText());
                    p32 = Double.parseDouble(textField32.getText());
                    setVisible(false);
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(frmPag113.this, er.getMessage());
                }


            }
        });
        setResizable(true);
        setVisible(true);
    }
}
