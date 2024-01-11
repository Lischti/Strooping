package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui extends JFrame {
    public Gui() {
        setLayout(null);

        final JButton dropdownButton = new JButton("Runden Auswahl");
        dropdownButton.setBounds(50, 50, 150, 30);

        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("15-mal klicken");
        JMenuItem option2 = new JMenuItem("30-mal klicken");
        JMenuItem option3 = new JMenuItem("45-mal klicken");

        option1.addActionListener(new OptionActionListener());
        option2.addActionListener(new OptionActionListener());
        option3.addActionListener(new OptionActionListener());

        popupMenu.add(option1);
        popupMenu.add(option2);
        popupMenu.add(option3);

        dropdownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupMenu.show(dropdownButton, 0, dropdownButton.getHeight());
            }
        });

        add(dropdownButton);
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Dropdown Button Round Selection");
        setVisible(true);
    }

    private class OptionActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem source = (JMenuItem) e.getSource();
            String selectedOption = source.getText();
            System.out.println("Selected Option: " + selectedOption);
        }
    }

}

    
