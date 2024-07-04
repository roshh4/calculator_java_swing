package controller;

import view.calcForm;
import model.calcModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcCont {
    private calcForm view;

    public calcCont(calcForm view)
    {
        this.view = view;
        initController();
    }

    public static void updateLabels(String fromType, String toType, JLabel inputLabel, JLabel outputLabel) {
        inputLabel.setText("Enter your " + fromType + " input");
        outputLabel.setText("Here is the " + toType + " output");
    }

    private void initController()
    {
        view.getConvertButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String from = view.getInputDropDown().getSelectedItem().toString();
                String to = view.getOutputDropDown().getSelectedItem().toString();
                String input = view.getInputField().getText();
                String result = calcModel.convert(from, to, input);
                view.getOutputField().setText(result);
            }
        });

        ActionListener comboBoxListner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String from = view.getInputDropDown().getSelectedItem().toString();
                String to = view.getOutputDropDown().getSelectedItem().toString();
                updateLabels(from, to, view.getInputLabel(), view.getOutputLabel());
            }
        };

        view.getInputDropDown().addActionListener(comboBoxListner);
        view.getOutputDropDown().addActionListener(comboBoxListner);

        //initial labels
        String fromi = view.getInputDropDown().getSelectedItem().toString();
        String toi = view.getOutputDropDown().getSelectedItem().toString();
        updateLabels(fromi, toi, view.getInputLabel(), view.getOutputLabel());
    }
}