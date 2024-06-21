import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class login {
    private JTextField user;
    private JTextField pass;
    private JButton login;
    private JButton cancel;
    private JLabel estado;
    private JPanel LOGIN;
    private JPasswordField passwordField1;

    public Container LOGIN() {
        return LOGIN;
    }

    public login() {
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(user.getText());
            }
        });
        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pass.setText(pass.getText());
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(user.getText().equals("admin") && pass.getText().equals("admin")) {
                    estado.setText("Conectado");
                } else if(user.getText()!="admin" && pass.getText()!="admin") {
                    estado.setText("Accedo denegado");
                }
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(null);
                pass.setText(null);
            }
        });

        estado.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });

    }


}
