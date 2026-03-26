import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckboxColorApplet extends Applet implements ItemListener {
    Checkbox red, green, blue;
    Color color = Color.RED;

    public void init() {
        red = new Checkbox("Red");
        green = new Checkbox("Green");
        blue = new Checkbox("Blue");

        add(red);
        add(green);
        add(blue);

        red.addItemListener(this);
        green.addItemListener(this);
        blue.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (red.getState()) color = Color.RED;
        if (green.getState()) color = Color.GREEN;
        if (blue.getState()) color = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }
}