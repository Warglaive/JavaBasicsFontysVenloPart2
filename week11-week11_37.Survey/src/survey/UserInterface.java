package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

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
        JLabel labe = new JLabel("");
        JLabel text = new JLabel("Are you?");
        JCheckBox fButton = new JCheckBox("Yes!");
        JCheckBox sButton = new JCheckBox("No!");
        container.add(text);
        container.add(fButton);
        container.add(sButton);
        JLabel moreText = new JLabel("Why?");
        container.add(moreText);
        ButtonGroup gr = new ButtonGroup();

        JRadioButton fButton1 = new JRadioButton("No reason..");
        JRadioButton sButton2 = new JRadioButton("Because it is fun!");
        gr.add(fButton1);
        gr.add(sButton2);
        JButton done = new JButton("Done!");

        container.add(fButton1);
        container.add(sButton2);
        container.add(done);
    }
}
