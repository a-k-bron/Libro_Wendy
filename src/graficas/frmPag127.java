package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag127 extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
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
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;

    public static int po1, po2, po3, po4, po5, po6, po7, po8, po9, po10;
    public static int sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8, sb9, sb10;

    public frmPag127() {

        setContentPane(contentPane);
        setModal(true);
        setSize(400, 400);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    po1 = Integer.parseInt(textField1.getText());
                    po2 = Integer.parseInt(textField2.getText());
                    po3 = Integer.parseInt(textField3.getText());
                    po4 = Integer.parseInt(textField4.getText());
                    po5 = Integer.parseInt(textField5.getText());
                    po6 = Integer.parseInt(textField6.getText());
                    po7 = Integer.parseInt(textField7.getText());
                    po8 = Integer.parseInt(textField8.getText());
                    po9 = Integer.parseInt(textField9.getText());
                    po10 = Integer.parseInt(textField10.getText());

                    sb1 = Integer.parseInt(textField11.getText());
                    sb2 = Integer.parseInt(textField12.getText());
                    sb3 = Integer.parseInt(textField13.getText());
                    sb4 = Integer.parseInt(textField14.getText());
                    sb5 = Integer.parseInt(textField15.getText());
                    sb6 = Integer.parseInt(textField16.getText());
                    sb7 = Integer.parseInt(textField17.getText());
                    sb8 = Integer.parseInt(textField18.getText());
                    sb9 = Integer.parseInt(textField19.getText());
                    sb10 = Integer.parseInt(textField20.getText());

                    setVisible(false);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(frmPag127.this, err.getMessage());
                }
            }
        });
        setVisible(true);
    }
}
