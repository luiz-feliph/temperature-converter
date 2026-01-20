import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Temperature converter");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Convert Celsius to Fahrenheit:");
        frame.add(label);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        JFormattedTextField field = new JFormattedTextField(numberFormat);
        field.setColumns(10);
        frame.add(field);


    }
}
