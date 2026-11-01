import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentCRUD extends JFrame {

    JTextField id, name, email, course;

    JButton insert, update, delete, view;

    StudentCRUD() {

        setTitle("Student CRUD Operations");

        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Student ID:"));
        id = new JTextField();
        add(id);

        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Email:"));
        email = new JTextField();
        add(email);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        insert = new JButton("Insert");
        update = new JButton("Update");
        delete = new JButton("Delete");
        view = new JButton("View");

        add(insert);
        add(update);
        add(delete);
        add(view);

        insert.addActionListener(e -> insertData());
        update.addActionListener(e -> updateData());
        delete.addActionListener(e -> deleteData());
        view.addActionListener(e -> viewData());

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    void insertData() {

        String sql =
            "INSERT INTO students(name,email,course) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name.getText());
            ps.setString(2, email.getText());
            ps.setString(3, course.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Record Inserted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void updateData() {

        String sql =
            "UPDATE students SET name=?,email=?,course=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name.getText());
            ps.setString(2, email.getText());
            ps.setString(3, course.getText());
            ps.setInt(4, Integer.parseInt(id.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Record Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void deleteData() {

        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, Integer.parseInt(id.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Record Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void viewData() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            StringBuilder data = new StringBuilder();

            while (rs.next()) {

                data.append("ID: ").append(rs.getInt("id"))
                    .append("\nName: ").append(rs.getString("name"))
                    .append("\nEmail: ").append(rs.getString("email"))
                    .append("\nCourse: ").append(rs.getString("course"))
                    .append("\n-------------------\n");
            }

            JOptionPane.showMessageDialog(
                this, data.length() == 0 ? "No records found" : data.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new StudentCRUD();
    }
                                 }
