package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonClickCounter extends JFrame {
    private JButton button;
    private int clickCount;
    private JComboBox<Integer> clickLimitComboBox;

    public ButtonClickCounter() {
        button = new JButton("Klick mich!");
        clickCount = 0;

        // ComboBox für die maximale Anzahl der Klicks
        Integer[] clickLimits = { 5, 10, 15, 20 }; // Anpassbar nach Bedarf
        clickLimitComboBox = new JComboBox<>(clickLimits);
        clickLimitComboBox.setSelectedIndex(1); // Standardwert: 10 Klicks

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleClick();
            }
        });

        // Layout mit JPanel für die Komponenten
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(clickLimitComboBox);

        add(panel);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void handleClick() {
        clickCount++;
        System.out.println("Klicks: " + clickCount);

        int maxClicks = (int) clickLimitComboBox.getSelectedItem();
        if (clickCount >= maxClicks) {
            endGame();
        }
    }

    private void endGame() {
        JOptionPane.showMessageDialog(this, "Maximale Anzahl von Klicks erreicht.");
        System.exit(0);
    }

    public static void main(String[] args) {
        new ButtonClickCounter();
    }
}
