package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag125 extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
    private JTextField txfKm1;
    private JTextField txfC6;
    private JTextField txfKm2;
    private JTextField txfC7;
    private JTextField txfKm3;
    private JTextField txfC8;
    private JTextField txfKm4;
    private JTextField txfC10;
    private JTextField txfKm9;
    private JTextField txfKm10;
    private JTextField txfKm8;
    private JTextField txfKm7;
    private JTextField txfKm6;
    private JTextField txfKm5;
    private JTextField txfC5;
    private JTextField txfC1;
    private JTextField txfC2;
    private JTextField txfC3;
    private JTextField txfC4;
    private JTextField txfC9;

    public static int km1, km2, km3, km4, km5, km6, km7, km8, km9, km10;
    public static int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;


    public frmPag125() {
        setContentPane(contentPane);
        setModal(true);
        setSize(400, 400);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    km1 = Integer.parseInt(txfKm1.getText());
                    km2 = Integer.parseInt(txfKm2.getText());
                    km3 = Integer.parseInt(txfKm3.getText());
                    km4 = Integer.parseInt(txfKm4.getText());
                    km5 = Integer.parseInt(txfKm5.getText());
                    km6 = Integer.parseInt(txfKm6.getText());
                    km7 = Integer.parseInt(txfKm7.getText());
                    km8 = Integer.parseInt(txfKm8.getText());
                    km9 = Integer.parseInt(txfKm9.getText());
                    km10 = Integer.parseInt(txfKm10.getText());

                    c1 = Integer.parseInt(txfC1.getText());
                    c2 = Integer.parseInt(txfC2.getText());
                    c3 = Integer.parseInt(txfC3.getText());
                    c4 = Integer.parseInt(txfC4.getText());
                    c5 = Integer.parseInt(txfC5.getText());
                    c6 = Integer.parseInt(txfC6.getText());
                    c7 = Integer.parseInt(txfC7.getText());
                    c8 = Integer.parseInt(txfC8.getText());
                    c9 = Integer.parseInt(txfC9.getText());
                    c10 = Integer.parseInt(txfC10.getText());

                    setVisible(false);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(frmPag125.this, err.getMessage());
                }

            }
        });
        setVisible(true);
    }
}
