import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentRegistrationPortal extends JFrame {

    JTextField name, email, course;
    JButton register;

    StudentRegistrationPortal() {

        setTitle("Student Registration Portal");

        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Email:"));
        email = new JTextField(15);
        add(email);

        add(new JLabel("Course:"));
        course = new JTextField(15);
        add(course);

        register = new JButton("Register");
        add(register);

        register.addActionListener(e -> registerStudent());

        setSize(350, 250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    void registerStudent() {

        String sql =
            "INSERT INTO students(name,email,course) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name.getText());
            ps.setString(2, email.getText());
            ps.setString(3, course.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Registration Successful");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationPortal();
    }
      }
