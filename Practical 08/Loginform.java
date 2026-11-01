import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DatabaseLoginForm extends JFrame {

    JTextField name;
    JPasswordField password;
    JButton save;

    DatabaseLoginForm() {

        setTitle("Login Form");

        setLayout(new FlowLayout());

        add(new JLabel("Name:"));

        name = new JTextField(15);
        add(name);

        add(new JLabel("Password:"));

        password = new JPasswordField(15);
        add(password);

        save = new JButton("Save");
        add(save);

        save.addActionListener(e -> saveData());

        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    void saveData() {

        String sql =
            "INSERT INTO login_details(name,password) VALUES(?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name.getText());

            ps.setString(2,
                new String(password.getPassword()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Data Saved Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new DatabaseLoginForm();
    }
                            }
