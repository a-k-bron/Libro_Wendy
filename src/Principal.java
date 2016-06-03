import javax.swing.*;

/**
 * Created by Everardo on 30/05/2016.
 */
public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new frmPortada();
    }
}
