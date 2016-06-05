import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class frmPagina extends JDialog {
    private JPanel contentPane;
    private JTextArea textArea1;
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private JToolBar jtMenu;
    private JButton btnGraficas;
    private JLabel contadorPagina;
    private BufferedReader b = null;
    private int paginaSiguinte;

    public frmPagina(String numeroPag) {
        setContentPane(contentPane);
        setModal(true);
        jtMenu.setFloatable(false);
        paginaSiguinte = Integer.parseInt(numeroPag);
        mostrarPagina(numeroPag);
        setSize(1000, 700);

        if (mostrarBoton(paginaSiguinte)) {
            btnGraficas.setVisible(true);
        } else {
            btnGraficas.setVisible(false);
        }
        contadorPagina.setText(String.valueOf(paginaSiguinte));

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
            //"out/production/Libro_Wendy/Textos/" + numeroPagina + ".txt"
            //b = new BufferedReader(new InputStreamReader(new FileInputStream("out/production/Libro_Wendy/Textos/" + numeroPagina + ".txt"), "utf-8"));
            contadorPagina.setText(String.valueOf(paginaSiguinte));
            if (mostrarBoton(Integer.parseInt(numeroPagina))) {
                btnGraficas.setVisible(true);
            } else {
                btnGraficas.setVisible(false);
            }

            b = new BufferedReader(new InputStreamReader(new FileInputStream("Textos/" + numeroPagina + ".txt"), "utf-8"));
            String cadena;
            StringBuilder sb = new StringBuilder();
            while ((cadena = b.readLine()) != null) {
                sb.append(cadena).append('\n');
            }
            textArea1.setText(sb.toString());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(frmPagina.this, "se termino el libro");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (!(b == null)) {
                try {
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean mostrarBoton(int pagina) {
        int[] paginasConGrafica = new int[]{18, 19, 21, 22, 23, 29, 30, 31, 32, 33,
                35, 36, 38, 39, 40};

        for (int i = 0; i < paginasConGrafica.length; i++) {
            if (pagina == paginasConGrafica[i]) {
                return true;
            }
        }

        return false;
    }

}
