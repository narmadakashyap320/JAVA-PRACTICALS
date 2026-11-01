import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("removal")
public class LoginFormApplet extends Applet
        implements ActionListener {

    TextField name, password;
    Label result;
    Button submit;

    public void init() {

        setLayout(new GridLayout(4, 2));

        add(new Label("Enter Name:"));

        name = new TextField(20);
        add(name);

        add(new Label("Enter Password:"));

        password = new TextField(20);
        password.setEchoChar('*');
        add(password);

        submit = new Button("Submit");
        add(submit);

        result = new Label("");
        add(result);

        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String n = name.getText();
        String p = password.getText();

        if (n.isEmpty() || p.isEmpty()) {
            result.setText("Fill all fields");
        } else {
            result.setText("Welcome " + n);
        }
    }
        }
