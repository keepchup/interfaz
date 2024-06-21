import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JPanel mainPanel;
    private JTextField num1;
    private JTextField num2;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JLabel resultado;


    public Container mainPanel() {
        return mainPanel;
    }
    public form1() {

        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText(num1.getText());
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2.setText(num2.getText());
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(num1.getText());
                Double n2 = Double.parseDouble(num2.getText());
                double r = n1+n2;
                resultado.setText("El resultado es: " + r);
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(num1.getText());
                Double n2 = Double.parseDouble(num2.getText());
                double r = n1-n2;
                resultado.setText("El resultado es: " + r);
            }

        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(num1.getText());
                Double n2 = Double.parseDouble(num2.getText());
                double r = n1*n2;
                resultado.setText("El resultado es: " + r);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(num1.getText());
                Double n2 = Double.parseDouble(num2.getText());
                if (n2==0){
                    resultado.setText("Sytax ERROR");
                } else {
                    double r = n1 / n2;
                    resultado.setText("El resultado es: " + r);
                }
            }
        });
    }
}
