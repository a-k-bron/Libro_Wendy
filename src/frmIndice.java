import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmIndice extends JDialog {
    private JPanel contentPane;
    private JList lista;
    private JButton btnAceptar;

    public frmIndice() {
        setContentPane(contentPane);
        setModal(true);
        setSize(600, 700);
        setResizable(true);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pagina = ((String) lista.getSelectedValue()).substring(0, 3);
                new frmPagina(pagina);
            }
        });
        setVisible(true);


    }
}
