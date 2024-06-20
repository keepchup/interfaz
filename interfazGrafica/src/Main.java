import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        String num1 = JOptionPane.showInputDialog("Ingrese un numero");
        String num2 = JOptionPane.showInputDialog("Ingrese un numero");

        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int sum=n1*n2;

        JOptionPane.showMessageDialog(null, "El resultado es: "+sum, "Suma de numeros enteros", JOptionPane.PLAIN_MESSAGE);
    }
}