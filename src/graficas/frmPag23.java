package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPag23 extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
    private JTextField America;
    private JTextField CruzAzul;
    private JTextField Guadalajara;
    private JTextField Toluca;
    private JTextField UNAM;
    public static int america;
    public static int cruzAzul;
    public static int guadalajara;
    public static int toluca;
    public static int unam;

    public frmPag23() {
        setContentPane(contentPane);
        setModal(true);
        setSize(300, 300);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    america = Integer.parseInt(America.getText());
                    cruzAzul = Integer.parseInt(CruzAzul.getText());
                    guadalajara = Integer.parseInt(Guadalajara.getText());
                    toluca = Integer.parseInt(Toluca.getText());
                    unam = Integer.parseInt(UNAM.getText());
                    setVisible(false);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(frmPag23.this, err.getMessage());

                }


            }
        });
        setVisible(true);

    }
}
