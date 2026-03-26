import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeApplet extends Applet implements ActionListener {
    Button btn;
    Color color = Color.RED;
    int i = 0;

    public void init() {
        btn = new Button("Change Color");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        i++;
        if (i % 3 == 0) color = Color.RED;
        else if (i % 3 == 1) color = Color.GREEN;
        else color = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(100, 100, 100, 100);
    }
}