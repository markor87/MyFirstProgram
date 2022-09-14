import javax.swing.JOptionPane;

public class if_statements {
    public static void main(String[] args) {

        int godine = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj godina!"));

        if (godine >= 65) {
            JOptionPane.showMessageDialog(null, "Moras u penziju");
        } else if (godine >= 18) {
            JOptionPane.showMessageDialog(null, "Imas vise od 18 godina");
        } else {
            JOptionPane.showMessageDialog(null, "Maloletan si!");
        }
    }
}
