
package controls ;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class JMybotton1 extends JButton {
    
    public JMybotton1(){
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.BLACK);
        
    }
    // 0, 0, getWidth()-1, getHeight()-1, 20, 20
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.blue);
        g.drawOval(0, 0, getWidth(), getHeight());
    }
    
}
