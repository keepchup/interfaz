import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame("Mi app");
        frame.setContentPane(new form1().mainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(200, 300);
        frame.setVisible(true);
         */
        JFrame login = new JFrame("Loging");
        login.setContentPane(new login().LOGIN());
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setSize(500, 500);
        login.setVisible(true);
    }
}