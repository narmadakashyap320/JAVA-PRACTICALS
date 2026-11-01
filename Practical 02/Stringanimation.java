import java.applet.Applet;
import java.awt.Graphics;

public class StringAnimation extends Applet implements Runnable {
    String msg = "Welcome to Java Programming!";
    Thread t;
    int x = 0;

    public void init() {
        setSize(500, 200);
        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.blue);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + 10;

            if (x > getWidth()) {
                x = -200;
            }

            repaint();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, 100);
    }
}
