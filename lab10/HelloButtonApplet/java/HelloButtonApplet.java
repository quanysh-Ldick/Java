import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HelloButtonApplet extends Applet implements ActionListener {
    Button btn;
    String msg = "";

    public void init() {
        btn = new Button("Click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Hello Java";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}