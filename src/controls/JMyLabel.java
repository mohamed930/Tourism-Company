
package controls ;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JMyLabel extends JLabel {
    
    public JMyLabel(){
        setOpaque(false);
        //setContentAreaFilled(false);
        setForeground(Color.white);
        
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(new Color(255,255,255));
        g.fillOval(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.WHITE);
        g.drawOval(0, 0, getWidth(), getHeight());
    }
    
}
