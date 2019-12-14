package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JButton copyBtn = new JButton("Copy!");
        JTextField fField = new JTextField("I was copied");
        JLabel label = new JLabel("");
        copyBtn.addActionListener(new ActionEventListener(fField, label));
        container.add(fField);
        container.add(copyBtn);
        container.add(label);

    }
}
