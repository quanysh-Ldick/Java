import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseEventApplet extends Applet implements MouseListener {
    int x, y;

    public void init() {
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 5, 5);
        g.drawString("X: " + x + " Y: " + y, 20, 20);
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}