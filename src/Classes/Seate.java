package Classes;

import DataBase.Go;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Seate {
    
    private String trip_Name;
    private int Offer_code;
    
    /*---------------------------------------------*/
    public int getOffer_code() {
        return Offer_code;
    }

    public void setOffer_code(int Offer_code) {
        this.Offer_code = Offer_code;
    }
    
    public String gettrip_Name() {
        return trip_Name;
    }

    public void settrip_Name(String trip_Name) {
        this.trip_Name = trip_Name;
    }
    /*---------------------------------------------*/
    
    
    // method number (1) this method fill comboBox in flightStatement in GUI by The Trip name.
    public void fillcombobox (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (2) this method fill comboBox in flightStatement in GUI by The Trip name in Internal Sektion.
    public void fillcombobox1 (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary WHERE trip_code LIKE '100%'";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (3) this method fill comboBox in flightStatement in GUI by The Trip name in Umrah Sektion.
    public void fillcombobox2 (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary WHERE trip_code LIKE '200%'";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (4) this method fill comboBox in flightStatement in GUI by The Trip name in Umrah Sektion.
    public void fillcombobox3 (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary WHERE trip_code LIKE '300%'";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (5) this method Get Tripe Code From the Trip name from the ComboBox in Flight GUI.
    public int getTripeCode()
    {
        String Sql1 = "Select trip_code from Itinerary Where trip_Name = '"+trip_Name + "';";
        int x = Integer.parseInt(Go.ExecuteQuary1(Sql1, "trip_code"));
        return x;
    }
    
    
    /* 
        method number (4) this method set Color for seate is avalable or not in internal Sketion
        if it is avaliable the button will be orange.
        else it is not avaliable button will be green
    */
    public boolean isAvailableInternal (JButton lb , int N)
    {
        String Sql = "Select Number_Seate from Internal_Reservarion WHERE Offer_Code = "+ Offer_code +
                " and Number_Seate =  "+ N +";";
                
        boolean x = Go.ExecuteQuary(Sql);
        try {
            if (x == true)
            {
                lb.setBackground(Color.ORANGE);
                return false;
            }
            else
            {
                String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                " and SeateNumber = "+N +";";
                boolean y = Go.ExecuteQuary(Sql1);
                try {
                    if (y == true)
                    {
                        lb.setBackground(Color.ORANGE);
                        return false;
                    }
                    else
                    {
                        lb.setBackground(Color.GREEN);
                        return true;
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    
    /* 
        method number (4) this method set Color for seate is avalable or not in Umrah Sketion
        if it is avaliable the button will be orange.
        else it is not avaliable button will be green
    */
    public boolean isAvailableUmrah (JButton lb , int N)
     {
        String Sql = "Select Number_Seate from Umrah_Reservarion WHERE Offer_Code = "+ Offer_code +
                     " and Number_Seate =  "+ N +";";
             
        boolean x = Go.ExecuteQuary(Sql);
        try {
            if (x == true)
            {
                lb.setBackground(Color.ORANGE);
                return false;
            }
            else
            {
                String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                " and SeateNumber = "+N +";";
                boolean y = Go.ExecuteQuary(Sql1);
                try {
                    if (y == true)
                    {
                        lb.setBackground(Color.ORANGE);
                        return false;
                    }
                    else
                    {
                        lb.setBackground(Color.GREEN);
                        return true;
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return false;
     }
     
    
    /* 
        method number (4) this method set Color for seate is avalable or not in External Sketion
        if it is avaliable the button will be orange.
        else it is not avaliable button will be green
    */
    public boolean isAvailableExternal (JButton lb , int N)
    {
        String Sql = "Select Number_Seate from External_Reservarion WHERE Offer_Code = "+ Offer_code +
                     " and Number_Seate =  "+ N +";";
                
        boolean x = Go.ExecuteQuary(Sql);
        try {
            if (x == true)
            {
                lb.setBackground(Color.ORANGE);
                return false;
            }
            else
            {
                String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                " and SeateNumber = "+N +";";
                boolean y = Go.ExecuteQuary(Sql1);
                try {
                    if (y == true)
                    {
                        lb.setBackground(Color.ORANGE);
                        return false;
                    }
                    else
                    {
                        lb.setBackground(Color.GREEN);
                        return true;
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    
    /* method number (5) this method set Color for seate is avalable or not
        if it is avaliable the button will be orange.
        else it is not avaliable button will be green
    */
    public void isAvailable (JButton lb , int N)
    {       
        if (String.valueOf(Offer_code).startsWith("100"))
        {
            String Sql = "Select Number_Seate from Internal_Reservarion WHERE Offer_Code = "+ Offer_code +
                " and Number_Seate =  "+ N +";";
                
                boolean x = Go.ExecuteQuary(Sql);
                try {
                    if (x == true)
                    {
                        lb.setBackground(Color.ORANGE);
                    }
                    else
                    {
                        String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                        " and SeateNumber = "+N +";";
                        boolean y = Go.ExecuteQuary(Sql1);
                        try {
                            if (y == true)
                            {
                                lb.setBackground(Color.ORANGE);
                            }
                            else
                            {
                                lb.setBackground(Color.GREEN);
                            }
                        } catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        }
        else if (String.valueOf(Offer_code).startsWith("200"))
        {
            String Sql = "Select Number_Seate from Umrah_Reservarion WHERE Offer_Code = "+ Offer_code +
                " and Number_Seate =  "+ N +";";
             
                boolean x = Go.ExecuteQuary(Sql);
                try {
                    if (x == true)
                    {
                        lb.setBackground(Color.ORANGE);
                    }
                    else
                    {
                        String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                        " and SeateNumber = "+N +";";
                        boolean y = Go.ExecuteQuary(Sql1);
                        try {
                            if (y == true)
                            {
                                lb.setBackground(Color.ORANGE);
                            }
                            else
                            {
                                lb.setBackground(Color.GREEN);
                            }
                        } catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        }
        else if (String.valueOf(Offer_code).startsWith("300"))
        {
               String Sql = "Select Number_Seate from External_Reservarion WHERE Offer_Code = "+ Offer_code +
                " and Number_Seate =  "+ N +";";
                
                boolean x = Go.ExecuteQuary(Sql);
                try {
                    if (x == true)
                    {
                        lb.setBackground(Color.ORANGE);
                    }
                    else
                    {
                        String Sql1 = "Select SeateNumber from Accompanying WHERE offerCode = "+Offer_code +
                        " and SeateNumber = "+N +";";
                        boolean y = Go.ExecuteQuary(Sql1);
                        try {
                            if (y == true)
                            {
                                lb.setBackground(Color.ORANGE);
                            }
                            else
                            {
                                lb.setBackground(Color.GREEN);
                            }
                        } catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                    }
                } catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        }
        
    }                        
    
    
}
