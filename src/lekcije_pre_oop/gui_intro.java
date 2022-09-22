package lekcije_pre_oop;

import javax.swing.JOptionPane;

public class gui_intro {
    public static void main(String[] args) {

        String ime = JOptionPane.showInputDialog("Unesi svoje ime");
        JOptionPane.showMessageDialog(null, "Hello " + ime);

        int godine = Integer.parseInt(JOptionPane.showInputDialog("Koliko imas godina? "));

        JOptionPane.showMessageDialog(null, ime + " " + "ima " + godine + "godina.");

        double visina = Double.parseDouble(JOptionPane.showInputDialog("Koliko si visok? "));

        JOptionPane.showMessageDialog(null, ime + " " + "ima " + godine + "godina. I visok je " + visina + "m");
    }
}
