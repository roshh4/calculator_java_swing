package controller;

import javax.swing.JLabel;

public class calcCont {
    public static void updateLabels(String fromType, String toType, JLabel inputLabel, JLabel outputLabel) {
        inputLabel.setText("Enter your " + fromType + " input");
        outputLabel.setText("Here is the " + toType + " output");
    }
}
