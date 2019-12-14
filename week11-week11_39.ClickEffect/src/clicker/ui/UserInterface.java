package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    public UserInterface() {

    }

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        JLabel text = new JLabel(this.calculator.giveValue() + "");

        JButton addButton = new JButton("Click!");

        ClickListener calListener = new ClickListener(this.calculator, text);

        addButton.addActionListener(calListener);
        container.add(text,BorderLayout.SOUTH);
        container.add(addButton, BorderLayout.NORTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
