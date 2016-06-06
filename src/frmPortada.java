import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Everardo on 30/05/2016.
 */
public class frmPortada extends JFrame {
    private JPanel panel1;
    private JButton btnContinuar;
    private JLabel lblImagen;

    public frmPortada() {
        super("Libro v1");
        setContentPane(panel1);
        pack();
        setSize(380, 650);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new frmIndice();
            }
        });
        setVisible(true);
    }
}
