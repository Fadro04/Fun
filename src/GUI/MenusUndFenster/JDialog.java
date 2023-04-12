package GUI.MenusUndFenster;

public class JDialog extends javax.swing.JDialog {
    public static void main(String[] args) {
        JDialog dialog = new JDialog();
        dialog.setSize(200, 200);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dialog.setModal(true);
    }
}
