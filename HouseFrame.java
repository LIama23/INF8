
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class HouseFrame extends JFrame implements ActionListener {
    private Figure[] figures = new Figure[100];
    private int max = 0;

    public void add(Figure fig) {
        figures[max] = fig;
        max++;
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < max; i++) {
            figures[i].draw(g);
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
        }
    }

    private void moveAll() {
        for (int i = 0; i < 150; i++) {
            for (int j = 0; j < max; j++) {
                // TO BE DONE
            }
            sleep(10);
            paint(getGraphics());
        }
    }

    public void actionPerformed(ActionEvent e) {
        // add one more house
        // TO BE DONE
        moveAll();
    }

    public void initComponents() {
        setBackground(Color.WHITE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBackground(Color.WHITE);

        // set layout of content
        panel.setLayout(new FlowLayout());

        // add one button
        JButton action = new JButton("action");
        panel.add(action);
        action.addActionListener(this);

        // add geometric figures for house
        // TO BE DONE
        
    }

    public static void main(String[] args) {
        // set look
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        // Create application frame.
        HouseFrame houseFrame = new HouseFrame();
        houseFrame.setSize(400, 400);
        houseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        houseFrame.initComponents();
        // show frame.
        houseFrame.setLocationRelativeTo(null);
        houseFrame.setVisible(true);
    }
}