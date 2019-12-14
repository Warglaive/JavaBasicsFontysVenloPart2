package survey;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    //private JButton button;
    //private JLabel label;
    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        ButtonGroup btnGrp = new ButtonGroup();
        JRadioButton fAnswer = new JRadioButton("No reason.");
        JRadioButton sAnswer = new JRadioButton("Because it is fun!");
        btnGrp.add(fAnswer);
        btnGrp.add(sAnswer);
        container.add(fAnswer);
        container.add(sAnswer);
        container.add(new JButton("Done!"));
    }
}
