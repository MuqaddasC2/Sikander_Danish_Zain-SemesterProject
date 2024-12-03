package NSCMS.ApplicationInterface.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

class RidingSubscription {
    private JFrame frame;
    private JPanel panel;
    private JButton backButton;
    @SuppressWarnings("unused")
    private int id;

    public RidingSubscription(int id) {
        frame = new JFrame("RIDING SOPS");
        this.id = id;
        frame.setSize(1000, 1000);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        ImageIcon icon1 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0010.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0020.jpg");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0018.jpg");
        ImageIcon icon4 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0014.jpg");
        ImageIcon icon5 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0016.jpg");
        ImageIcon icon6 = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\IMG-20240520-WA0023.jpg");
        ImageIcon buttonBackground = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\button.jpg");

        JLabel label1 = new JLabel(icon1);
        JLabel label2 = new JLabel(icon2);
        JLabel label3 = new JLabel(icon3);
        JLabel label4 = new JLabel(icon4);
        JLabel label5 = new JLabel(icon5);
        JLabel label6 = new JLabel(icon6);

        backButton = new JButton("BACK");
        backButton.setFont(new Font("Arial", Font.BOLD, 25));
        backButton.setForeground(Color.BLACK);
        backButton.setIcon(buttonBackground);
        backButton.setHorizontalTextPosition(SwingConstants.CENTER);
        backButton.setVerticalTextPosition(SwingConstants.CENTER);
        backButton.setBorder(new LineBorder(Color.ORANGE, 3));
        backButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                backButton.setSize(270, 100);
            }

            public void mouseExited(MouseEvent e) {
                backButton.setSize(260, 90);
            }

            public void mouseClicked(MouseEvent e)
            {
                new Dashboard(id);
                frame.setVisible(false);
            }
        });

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(backButton);

        JScrollPane scrollPane = new JScrollPane(panel);

        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setBackground(Color.ORANGE);

        JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
        horizontalScrollBar.setBackground(Color.ORANGE);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}