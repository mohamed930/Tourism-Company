package Classes;

import DataBase.Go;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import tourism.company.Tools;

public class Itinerary{

    private int trip_code;
    private String trip_Name;
    private String trip_Cover;
    private String Describ;
    private int Coast;
    private int Super_Id;
    private int Super_Id2;

    /*---------------------------------------------------*/  
   
    public int getTrip_code() {
        return trip_code;
    }

    public void setTrip_code(int trip_code) {
        this.trip_code = trip_code;
    }
    
    public String getTrip_Name() {
        return trip_Name;
    }

    public void setTrip_Name(String trip_Name) {
        this.trip_Name = trip_Name;
    }

    public String getTrip_Cover() {
        return trip_Cover;
    }

    public void setTrip_Cover(String trip_Cover) {
        this.trip_Cover = trip_Cover;
    }

    public String getDescrib() {
        return Describ;
    }

    public void setDescrib(String Describ) {
        this.Describ = Describ;
    }

    public int getCoast() {
        return Coast;
    }

    public void setCoast(int Coast) {
        this.Coast = Coast;
    }
    
    public int getSuper_Id() {
        return Super_Id;
    }

    public void setSuper_Id(int Super_Id) {
        this.Super_Id = Super_Id;
    }
    
    public int getSuper_Id2() {
        return Super_Id2;
    }

    public void setSuper_Id2(int Super_Id2) {
        this.Super_Id2 = Super_Id2;
    }
    /*---------------------------------------------------*/
    
    
    // method number (1) this method getting autonumber for trip code. 
    public String getAutoCodeTrip (JComboBox ComboType)
    {
        switch (ComboType.getSelectedItem().toString()) {
            case "داخلى":
            {
                String Sql = "select max(trip_code)+1 as 'autonum' from Itinerary Where trip_code LIKE '100%';";
                return Go.countautonumber1(Sql, "100200");   
            }
            case "عمره":
            {
                String Sql = "select max(trip_code)+1 as 'autonum' from Itinerary Where trip_code LIKE '200%';";
                return Go.countautonumber1(Sql, "200200");    
            }
            case "خارجى":
            {
                String Sql = "select max(trip_code)+1 as 'autonum' from Itinerary Where trip_code LIKE '300%';";
                return Go.countautonumber1(Sql, "300300");    
            }
            default:
                break;
        }
        return "أدخل نوع العرض";
    }
    
    // method number (2) this method add tripe.
    public void add(String sc) 
    {
        if ("داخلى".equals(sc))
        {
            String Sql = "INSERT into Itinerary (trip_Name,trip_cover,trip_descrip,trip_coast,trip_code) VALUES"+ 
                          "('"+trip_Name+"'"+",'"+trip_Cover+"','"+Describ+"',"+Coast+","+trip_code+");";
            
            if (Super_Id2 == 0)
            {
                 String Sql1 = "INSERT INTO SuperViser_id (Supervisor_id,tripe_code) values ("+Super_Id+","+trip_code+");";
                 boolean add = Go.ExecuteNonQuerey(Sql);
                 Go.ExecuteNonQuerey(Sql1);

                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            else
            {
                String Sql1 = "INSERT INTO SuperViser_id (Supervisor_id,tripe_code) values ("+Super_Id+","+trip_code+"),"+
		                                                           "("+Super_Id2+","+trip_code+");";
                boolean add = Go.ExecuteNonQuerey(Sql);
                Go.ExecuteNonQuerey(Sql1);

                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            
        }
        else if ("عمره".equals(sc))
        {
            String Sql = "INSERT into Itinerary (trip_Name,trip_cover,trip_descrip,trip_coast,trip_code) VALUES"+ 
                          "('"+trip_Name+"'"+",'"+trip_Cover+"','"+Describ+"',"+Coast+","+trip_code+");";
            if (Super_Id2 == 0)
            {
                String Sql1 = "INSERT INTO SuperViser_id1 (Id,Trip_code) values ("+Super_Id+","+trip_code+");";
                boolean add = Go.ExecuteNonQuerey(Sql);
                Go.ExecuteNonQuerey(Sql1);
             
                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            else
            {
                String Sql1 = "INSERT INTO SuperViser_id1 (Id,Trip_code) values ("+Super_Id+","+trip_code+"),"+
		                                                           "("+Super_Id2+","+trip_code+");";
                boolean add = Go.ExecuteNonQuerey(Sql);
                Go.ExecuteNonQuerey(Sql1);
             
                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
             
        }
        else if ("خارجى".equals(sc))
        {
            String Sql = "INSERT into Itinerary (trip_Name,trip_cover,trip_descrip,trip_coast,trip_code) VALUES"+ 
                          "('"+trip_Name+"'"+",'"+trip_Cover+"','"+Describ+"',"+Coast+","+trip_code+");";
            
            if (Super_Id2 == 0)
            {
                 String Sql1 = "INSERT INTO SuperViser_id2 (Id,Trip_code) values ("+Super_Id+","+trip_code+");";
                 
                 boolean add = Go.ExecuteNonQuerey(Sql);
                 Go.ExecuteNonQuerey(Sql1);
                 
                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            else
            {
                String Sql1 = "INSERT INTO SuperViser_id2 (Id,Trip_code) values ("+Super_Id+","+trip_code+"),"+
		                                                           "("+Super_Id2+","+trip_code+");";
                 boolean add = Go.ExecuteNonQuerey(Sql);
                 Go.ExecuteNonQuerey(Sql1);
                try {
                    if (add) 
                    {
                        Tools.myMess("تمت اضافة العرض بنجاح");
                    }
                    else
                    {
                        Tools.myMess("لم يتم اضافة العرض");
                    }
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
           
        }
    }
    
    // method number (3) this method update tripe.
    public void update(String sc) 
    {
        
        if ("داخلى".equals(sc))
        {
            String Sql = "update Itinerary set "
                + "trip_Name = '"+trip_Name +"',"
                + "trip_coast = "+Coast +", "
                + "trip_descrip = '"+Describ +"' "
                + "WHERE trip_code = "+trip_code+";";
            
            String Sql1 = "update SuperViser_id set "
                    + "Supervisor_id = "+Super_Id +","
                   + "tripe_code = "+trip_code+" "
                    + "WHERE Supervisor_id = "+Super_Id2+";";
 
            boolean edit = Go.ExecuteNonQuerey(Sql);
            Go.ExecuteNonQuerey(Sql1);
            try {
                if (edit)
                {
                    Tools.myMess("تم التعديل بنجاح");
                }
                else
                {
                    Tools.myMess("لم يتم تعديل البيانات");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        else if ("عمره".equals(sc))
        {
            String Sql = "update Itinerary set "
                + "trip_Name = '"+trip_Name +"',"
                + "trip_coast = "+Coast +", "
                + "trip_descrip = '"+Describ +"' "
                + "WHERE trip_code = "+trip_code+";";
            
            String Sql1 = "update SuperViser_id1 set "
                    + "Id = "+Super_Id +","
                   + "Trip_code = "+trip_code+" "
                    + "WHERE Id = "+Super_Id2+";";
           
            boolean edit = Go.ExecuteNonQuerey(Sql);
            Go.ExecuteNonQuerey(Sql1);
            try {
                if (edit)
                {
                    Tools.myMess("تم التعديل بنجاح");
                }
                else
                {
                    Tools.myMess("لم يتم تعديل البيانات");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        else if ("خارجى".equals(sc))
        {
            String Sql = "update Itinerary set "
                + "trip_Name = '"+trip_Name +"',"
                + "trip_coast = "+Coast +", "
                + "trip_descrip = '"+Describ +"' "
                + "WHERE trip_code = "+trip_code+";";
            
            String Sql1 = "update SuperViser_id1 set "
                    + "Id = "+Super_Id +","
                   + "Trip_code = "+trip_code+" "
                    + "WHERE Id = "+Super_Id2+";";
            
            boolean edit = Go.ExecuteNonQuerey(Sql);
            Go.ExecuteQuary(Sql1);
            try {
                if (edit)
                {
                    Tools.myMess("تم التعديل بنجاح");
                }
                else
                {
                    Tools.myMess("لم يتم تعديل البيانات");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    // method number (4) this method delete tripe.
    public void delete(String cc) 
    {
        
        if ("داخلى".equals(cc))
        {
            String Sql1 = "Delete from SuperViser_id WHERE tripe_code = "+trip_code+";";
            String Sql = "Delete from Itinerary WHERE trip_code = "+trip_code+";";
            Go.ExecuteNonQuerey(Sql1);
            boolean c = Go.ExecuteNonQuerey(Sql);
            try {
                if (c) 
                {
                    Tools.myMess(" عملية مسح ناجحة ");
                }
                else
                {
                    Tools.myMess(" عمليه المسح غير ناجحه");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        else if ("عمره".equals(cc))
        {
            String Sql1 = "Delete from SuperViser_id1 WHERE Trip_code = "+trip_code+";";
            String Sql = "Delete from Itinerary WHERE trip_code = "+trip_code+";";
            Go.ExecuteNonQuerey(Sql1);
            boolean c = Go.ExecuteNonQuerey(Sql);
            try {
                if (c) 
                {
                    Tools.myMess(" عملية مسح ناجحة ");
                }
                else
                {
                    Tools.myMess(" عمليه المسح غير ناجحه");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        else if ("خارجى".equals(cc))
        {
            String Sql1 = "Delete from SuperViser_id2 WHERE Trip_codeس = "+trip_code+";";
            String Sql = "Delete from Itinerary WHERE trip_code = "+trip_code+";";
            Go.ExecuteNonQuerey(Sql1);
            boolean c = Go.ExecuteNonQuerey(Sql);
            try {
                if (c) 
                {
                    Tools.myMess(" عملية مسح ناجحة ");
                }
                else
                {
                    Tools.myMess(" عمليه المسح غير ناجحه");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
    }
    
    // method number (5) this method fillCombo tripe By Name.
    public void fillcombobox (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (6) this method getting available seate or not.
    public int getTripeCode()
    {
        String Sql1 = "Select trip_code from Itinerary Where trip_Name = '"+trip_Name + "';";
        int x = Integer.parseInt(Go.ExecuteQuary1(Sql1, "trip_code"));
        return x;
    }
    
    // method number (7) this method Getting The Offer for User in Offers GUI.
    public void getOffer(JTextField tx , JTextField tx1 , JTextArea ax , JLabel la , int w , int h) 
    {
        String Sql = "select trip_descrip , trip_cover, trip_coast , trip_Name from Itinerary "
                + "where trip_code = " + trip_code +";";
        Go.fill(Sql, ax, tx, tx1, la, w, h);
    }
 
}
