package GUI;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {
    public LoginGUI() {
        this.setTitle("Mini Market");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.init();
        this.setVisible(true);
    }
    private void init() {
        Color MainColor = Color.decode("#0097e6");

        //----Logic Interface--------
        //left content
        JPanel leftContent = new JPanel();
        leftContent.setBackground(MainColor);
        leftContent.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
        leftContent.setPreferredSize(new Dimension(350, 600));

        ImageIcon iconMiniMarket = new ImageIcon(new ImageIcon("assets/icon/icons8-supermarket-94.png").getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH));

        JLabel miniMarket = new JLabel(iconMiniMarket, JLabel.CENTER);
        leftContent.add(miniMarket);

        JLabel titleMiniMarket = new JLabel("<html><b style='font-size:25px'>Mini Market</b></html>");
        leftContent.add(titleMiniMarket);


        //add on loginGUI
        this.add(leftContent,BorderLayout.WEST);
    }
}
