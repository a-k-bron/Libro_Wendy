import javax.swing.*;

/**
 * Created by Everardo on 30/05/2016.
 */
public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        System.out.println("hola por eve");
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        System.out.println("holaaa");
        new frmPortada();
    }
}
