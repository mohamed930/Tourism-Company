package tourism.company;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tools {
    
    public static void openForm (JFrame form)
    {
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }
    
    public static void ConfirmExit ()
    {
        int x = JOptionPane.showConfirmDialog(null, "هل تريد حقا الخروج؟", "الخروج", JOptionPane.YES_NO_OPTION);
        if (x == 0)
            System.exit(0);
    }
    
    public static void myMess (String Mess)
    {
        JOptionPane.showMessageDialog(null, Mess);
    }
    
    public static String PrintDate ()
    {
        java.util.Date d = new java.util.Date();
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy hh:mm a");
        return df.format(d);
    }
    
    public static void setIcon (String Name , JButton B1 , int W , int H)
    {
        try {
            File f = new File(Name);
            Image img = ImageIO.read(f);
            Image newimg = img.getScaledInstance(W, H, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            B1.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setIcon (String Name , JLabel L1 , int W , int H)
    {
        try {
            File f = new File(Name);
            Image img = ImageIO.read(f);
            Image newimg = img.getScaledInstance(W, H, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            L1.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String GetAnyPhoto (JButton BTNImage , JLabel LBLImage , int W , int H)
    {
        try {
            JFileChooser ch = new JFileChooser();
            FileNameExtensionFilter fe = new FileNameExtensionFilter("All Image", "jpg","png","bmp","webp","jpeg");
            ch.setFileFilter(fe);
            ch.showDialog(BTNImage, "Chooce Image");
            File clr1 = ch.getSelectedFile();
            String clr = clr1.getAbsolutePath();
            try {
                File f = new File(clr);
                Image img = ImageIO.read(f);
                Image newimg = img.getScaledInstance(W, H, Image.SCALE_AREA_AVERAGING);
                ImageIcon icon = new ImageIcon(newimg);
                LBLImage.setIcon(icon);
                return clr;
            } catch (IOException ex) {
                Tools.myMess("لم اجد الملف لفتحه");
            }
        } catch (HeadlessException ex) {
            System.out.println("Don't Chooce any picture");
        }
        return null;
    }
}
