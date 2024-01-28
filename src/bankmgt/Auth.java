package bankmgt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Auth {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;

    public Auth() {
        frame = new JFrame("Bank Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2));

        // Components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        signupButton = new JButton("Sign Up");

        // Adding components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(signupButton);

        // Event listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login button click
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                // Add your login logic here
                JOptionPane.showMessageDialog(frame, "Login clicked\nUsername: " + username);
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle signup button click
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                // Add your signup logic here
                JOptionPane.showMessageDialog(frame, "Sign Up clicked\nUsername: " + username);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    public void start(){
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Auth();
            }
        });}
}
