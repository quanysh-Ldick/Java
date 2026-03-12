package MyGraph;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class X2 extends JFrame {

    X2(String s){

        super(s);
        setLayout(null);
        setSize(600,300);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(300,300);
    }

    public void paint(Graphics gr){

        int y;

        gr.setColor(Color.WHITE);
        gr.fillRect(0,0,600,300);

        gr.setColor(Color.BLACK);

        gr.drawLine(300,0,300,300);
        gr.drawLine(0,150,600,150);

        gr.setColor(Color.RED);

        for(int x=-300; x<300; x++){

            y=(x*x)/100;

            gr.drawLine(x+300,150-y,x+300,150-y);
        }
    }
}