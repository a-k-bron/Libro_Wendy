import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class frmPagina extends JDialog {
    private JPanel contentPane;
    private JTextArea textArea1;
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private JToolBar jtMenu;
    private JButton btnGraficas;
    private FileReader f = null;
    private BufferedReader b = null;
    private int paginaSiguinte;

    public frmPagina(String numeroPag) {
        setContentPane(contentPane);
        setModal(true);
        jtMenu.setFloatable(false);
        paginaSiguinte = Integer.parseInt(numeroPag);
        mostrarPagina(numeroPag);
        setSize(1000, 700);
        btnAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String siguiente;
                paginaSiguinte--;
                if (paginaSiguinte < 10) {
                    siguiente = "00" + String.valueOf(paginaSiguinte);
                } else if (paginaSiguinte >= 10 && paginaSiguinte < 100) {
                    siguiente = "0" + String.valueOf(paginaSiguinte);
                } else {
                    siguiente = String.valueOf(paginaSiguinte);
                }
                mostrarPagina(siguiente);
            }
        });
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String siguiente;
                paginaSiguinte++;
                if (paginaSiguinte < 10) {
                    siguiente = "00" + String.valueOf(paginaSiguinte);
                } else if (paginaSiguinte >= 10 && paginaSiguinte < 100) {
                    siguiente = "0" + String.valueOf(paginaSiguinte);
                } else {
                    siguiente = String.valueOf(paginaSiguinte);
                }
                mostrarPagina(siguiente);
            }
        });
        btnGraficas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mostrarBoton(paginaSiguinte)) {
                    new frmGraficas(paginaSiguinte);
                } else {
                    JOptionPane.showMessageDialog(frmPagina.this, "no tiene grafica");
                }

            }
        });
        setVisible(true);
    }

    private void mostrarPagina(String numeroPagina) {

        try {
            f = new FileReader("out/production/Libro_Wendy/Textos/" + numeroPagina + ".txt");
            b = new BufferedReader(f);
            String cadena;
            textArea1.setText("");
            while ((cadena = b.readLine()) != null) {
                textArea1.setText(textArea1.getText() + cadena + "\n");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(frmPagina.this, "se termino el libro");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (!(f == null)) {
                try {
                    f.close();
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean mostrarBoton(int pagina) {
        int[] paginasConGrafica = new int[]{18, 19, 21, 22, 23, 29, 30, 31, 32, 33,
                34, 35, 36, 37, 38, 39, 40, 48};

        for (int i = 0; i < paginasConGrafica.length; i++) {
            if (pagina == paginasConGrafica[i]) {
                return true;
            }
        }

        return false;
    }

}
