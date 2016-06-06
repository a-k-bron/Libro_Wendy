package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag112 extends JDialog {
    private JPanel contentPane;
    private JTextField txfA;
    private JTextField txfB;
    private JTextField txfC;
    private JButton btnAceptar;
    public static float a, b, c;

    public frmPag112() {
        setContentPane(contentPane);
        setModal(true);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Float.parseFloat(txfA.getText());
                    b = Float.parseFloat(txfB.getText());
                    c = Float.parseFloat(txfC.getText());

                    setVisible(false);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(frmPag112.this, err.getMessage());
                }

            }
        });
        setSize(300, 300);
        setVisible(true);

    }
}
