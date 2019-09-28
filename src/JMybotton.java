
package controls ;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JMybotton extends JButton {
    
    public JMybotton(){
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(new Color(70,130,180));
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.blue);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }
    
}
