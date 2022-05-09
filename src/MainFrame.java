import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public void initialize(User user) {
        /*************** Info Panel ***************/
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0, 2, 5, 5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        infoPanel.add(new JLabel("Vards"));
        infoPanel.add(new JLabel(user.name));
        infoPanel.add(new JLabel("E-pasts"));
        infoPanel.add(new JLabel(user.email));
        infoPanel.add(new JLabel("Telefona numurs"));
        infoPanel.add(new JLabel(user.phone));
        infoPanel.add(new JLabel("Adrese"));
        infoPanel.add(new JLabel(user.address));


        Component[] labels = infoPanel.getComponents();
        for (int i = 0; i < labels.length; i++) {
            labels[i].setFont(new Font("SansSerif", Font.BOLD, 20));
        }

        add(infoPanel, BorderLayout.NORTH);



        setTitle("Lietotaja dati");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
