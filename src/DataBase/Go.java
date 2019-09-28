package DataBase;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import tourism.company.Tools;

public class Go {
    private static String url = "";
    private static Connection con;
    
    private static void setURL()
    {
        url="jdbc:mysql://localhost:3306/TourismCompany"
                +  "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    private static void setConnection()
    {
        try {
            setURL();
            con =(Connection) DriverManager.getConnection(url,"root" ,"");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public static boolean ExecuteNonQuerey(String sqlstatement)
    {
      try {
             setConnection();
             Statement st = con.createStatement();
             st.execute(sqlstatement);
             con.close();
             return true ;
          }   
     catch(SQLException ee)
          {
            System.out.print(ee.getMessage());
            return false;
          }
    }
     
    public static String countRow (String Sql)
    {
        try
        {
            setConnection();
            Statement st = con.createStatement();
            String count = Sql;
            ResultSet s = st.executeQuery(count);
            String res = null;
            while(s.next())
            {
                res = s.getString("COUNT(*)");
            }
            con.close();
            return res;
        }
        catch(SQLException ee)
        {
            System.out.print(ee.getMessage());
        }
        return null;
    }
    
    public static boolean ExecuteQuary (String Sql)
    {
        try
        {
            setConnection();
            Statement st = con.createStatement();
            st.executeQuery(Sql);
            while(st.getResultSet().next())
            {
                con.close();
                return true;
            }
            con.close();
        }
        catch(SQLException ee)
        {
            System.out.print(ee.getMessage());
        }
        return false;
    }
    
    public static String ExecuteQuary1 (String Sql , String columnName)
    {
        setConnection();
        try {
            Statement st = con.createStatement();
            String ss = Sql;
            ResultSet s = st.executeQuery(ss);
            String aa = null;
            while (s.next())
            {
                aa = s.getString(columnName);
            }
            return aa;
        } catch (SQLException ex) {
            Logger.getLogger(Go.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String countautonumber(String tnsme , String columnname)
    {
       try { 
        setConnection();
        Statement stm = con.createStatement();
        String autonum = "select max(" + columnname + ")+1 as autonum" + " from " + tnsme;
        stm.executeQuery(autonum);
        String num = "";
        while(stm.getResultSet().next())
        {
            num = stm.getResultSet().getString("autonum");
        }
        con.close();
        if (num == null || "".equals(num)){
            return "102102";
        }
        else {
            return num;
        }
        
    }
       catch(SQLException eee)
              {
                System.out.print(eee.getMessage());
                return "102102";
              }
    }
    
    public static String countautonumber1 (String Sql , String Start_Code)
    {
       try { 
        setConnection();
        Statement stm = con.createStatement();
        String autonum = Sql;
        stm.executeQuery(autonum);
        String num = "";
        while(stm.getResultSet().next())
        {
            num = stm.getResultSet().getString("autonum");
        }
        con.close();
        if (num == null || "".equals(num)){
            return Start_Code;
        }
        else {
            return num;
        }
        
    }
       catch(SQLException eee)
              {
                System.out.print(eee.getMessage());
                return "102102";
              }
    }
    
    public static void filltotable(String tnameorselects, JTable table , int Begin , int End)
    {
        try
        {
            setConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strselect;
            String spart = tnameorselects.substring(Begin, End).toLowerCase();
            if( "select ".equals(spart) )
            {
                strselect=tnameorselects;
            }
            else
            {
                strselect = "select * from " + tnameorselects;
            }
            rs=st.executeQuery(strselect);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while(rs.next())
            {
                row = new Vector(c);
                for(int i =1; i<=c ; i++)
                {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
                
            }
            if(table.getColumnCount()!=c)
            {
              JOptionPane.showMessageDialog(null , "table culomn not equal query column\nJTable column count is: " 
                      +table.getColumnCount()+"query column coint is = "+c);   
            }
            con.close();
        }
        catch(SQLException ee)
        {
          System.out.print(ee.getMessage());
        }
    }
    
    public static void QuaryAndFillTable (String Sql , String TName , JTable table , int R , int C)
    {
        try
        {
            setConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strselect;
            String spart = TName.substring(R, C).toLowerCase();
            if( "select ".equals(spart) )
            {
                strselect= TName;
            }
            else
            {
                strselect = Sql;
            }
            rs=st.executeQuery(strselect);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while(rs.next())
            {
                row = new Vector(c);
                for(int i =1; i<=c ; i++)
                {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
                
            }
            if(table.getColumnCount()!=c)
            {
              JOptionPane.showMessageDialog(null , "table culomn not equal query column\nJTable column count is: " 
                      +table.getColumnCount()+"query column coint is = "+c);   
            }
            con.close();
        }
        catch(SQLException ee)
        {
          System.out.print(ee.getMessage());
        }
    }
    
    public static void fill (String Sql, JTextField tx , JTextArea ta)
    {
        setConnection();
        try {
            Statement st = con.createStatement();
            String ss = Sql;
            ResultSet s = st.executeQuery(ss);
            while (s.next())
            {
                tx.setText(s.getString("Title"));
                ta.setText(s.getString("note"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Go.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void fill (String Sql, JTextArea ax , JTextField tx  , JTextField tx1 , JLabel la , int w ,int h)
    {
        setConnection();
        try {
            Statement st = con.createStatement();
            String ss = Sql;
            ResultSet s = st.executeQuery(ss);
            while (s.next())
            {
                tx1.setText(s.getString("trip_Name"));
                tx.setText(s.getString("trip_coast"));
                ax.setText(s.getString("trip_descrip"));
                Tools.setIcon(s.getString("trip_cover"), la, w, h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Go.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void fillComboBox (String Sql , JComboBox Jc)
    {
        try {
            setConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while(rs.next())
            {
                Jc.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Go.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
