package view;

import controller.calcCont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcForm extends JPanel {
    private JComboBox<String> inputDropDown;
    private JComboBox<String> outputDropDown;
    private JTextField inputField;
    private JTextField outputField;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JButton convertButton;

    public calcForm(ActionListener convertButtonListener) {
        JFrame f = new JFrame("Conversion Calculator");

        String[] types = {"Decimal", "Binary", "Octal", "HexaDecimal"};
        inputDropDown = new JComboBox<>(types);
        outputDropDown = new JComboBox<>(types);

        JLabel l1 = new JLabel("From");
        JLabel l2 = new JLabel("To");

        inputField = new JTextField(20);
        outputField = new JTextField(20);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(30, 10, 10, 10); // Padding
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(l1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        inputDropDown.setPreferredSize(new Dimension(200, 40));
        add(inputDropDown, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(10, 10, 5, 10);
        add(l2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        outputDropDown.setPreferredSize(new Dimension(200, 40));
        add(outputDropDown, gbc);

        inputLabel = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(40, 10, 5, 10);
        add(inputLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(10, 10, 5, 10);
        inputField.setPreferredSize(new Dimension(200, 40));
        add(inputField, gbc);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(convertButtonListener);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        convertButton.setPreferredSize(new Dimension(20, 30));
        gbc.insets = new Insets(10, 10, 30, 10);
        add(convertButton, gbc);

        outputLabel = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(5, 10, 5, 10);
        add(outputLabel, gbc);


        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(10, 10, 5, 10);
        outputField.setPreferredSize(new Dimension(200, 40));
        add(outputField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(40, 10, 5, 10);
        add(inputLabel, gbc);

        String fromType = (String) inputDropDown.getSelectedItem();
        String toType = (String) outputDropDown.getSelectedItem();
        calcCont.updateLabels(fromType, toType, inputLabel, outputLabel);

        ActionListener comboBoxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fromType = (String) inputDropDown.getSelectedItem();
                String toType = (String) outputDropDown.getSelectedItem();
                calcCont.updateLabels(fromType, toType, inputLabel, outputLabel);
            }
        };

        inputDropDown.addActionListener(comboBoxListener);
        outputDropDown.addActionListener(comboBoxListener);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.add(this, BorderLayout.NORTH);
        f.setSize(500, 600);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create an instance of calcForm with a convert button listener
            new calcForm(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle convert button action
                    System.out.println("Convert button clicked");
                }
            });
        });
    }
}
