package Classes;

import DataBase.Go;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class Flight{

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
    
    // method number (2) this method Get Tripe Code From the Trip name from the ComboBox in Flight GUI.
    public int getTripeCode()
    {
        String Sql1 = "Select trip_code from Itinerary Where trip_Name = '"+trip_Name + "';";
        int x = Integer.parseInt(Go.ExecuteQuary1(Sql1, "trip_code"));
        return x;
    }
    
    //method number (3) this Method Fill The Table in Flight Statement GUI.
    public void GetFlightStatement (JTable table , int W , int H)
    {
        if (String.valueOf(Offer_code).startsWith("100"))
        {
            String Sql =  "SELECT Internal_Reservarion.cust_name , " +
                               "Internal_Reservarion.SSN , " +
                               "Internal_Reservarion.Telephone , " +
                               "COUNT(Accompanying.PSSN1) as 'Accomp' , " +
                               "Internal_Reservarion.cash , " +
                               "Internal_Reservarion.Number_Seate " +
                     "FROM " +
                             "Internal_Reservarion, " +
                             "Accompanying " +
                     "GROUP BY " +
                             "Internal_Reservarion.SSN , " +
                             "Accompanying.PSSN1 , " +
                             "Internal_Reservarion.Offer_Code " +
                     "HAVING " +
                             "Internal_Reservarion.SSN = Accompanying.PSSN1 " +
                             "AND " +
                             "Internal_Reservarion.Offer_Code = "+Offer_code +";";
        
            Go.QuaryAndFillTable(Sql, "Internal_Reservarion", table, W, H);
        }
        else if (String.valueOf(Offer_code).startsWith("200"))
        {
            String Sql =  "SELECT Umrah_Reservarion.cust_name , " +
                               "Umrah_Reservarion.PassportNumber , " +
                               "Umrah_Reservarion.Telephone , " +
                               "COUNT(Accompanying.PASN2) as 'Accomp' , " +
                               "Umrah_Reservarion.cash , " +
                               "Umrah_Reservarion.Number_Seate " +
                     "FROM " +
                             "Umrah_Reservarion, " +
                             "Accompanying " +
                     "GROUP BY " +
                             "Umrah_Reservarion.PassportNumber , " +
                             "Accompanying.PASN2 , " +
                             "Umrah_Reservarion.Offer_Code " +
                     "HAVING " +
                             "Umrah_Reservarion.PassportNumber = Accompanying.PASN2 " +
                             "AND " +
                             "Umrah_Reservarion.Offer_Code = "+Offer_code +";";
        
            Go.QuaryAndFillTable(Sql, "Umrah_Reservarion", table, W, H);
        }
        else if (String.valueOf(Offer_code).startsWith("300"))
        {
            String Sql =  "SELECT External_Reservarion.cust_name , " +
                               "External_Reservarion.PassportNumber , " +
                               "External_Reservarion.Telephone , " +
                               "COUNT(Accompanying.PASN3) as 'Accomp' , " +
                               "External_Reservarion.cash , " +
                               "External_Reservarion.Number_Seate " +
                     "FROM " +
                             "External_Reservarion, " +
                             "Accompanying " +
                     "GROUP BY " +
                             "External_Reservarion.PassportNumber , " +
                             "Accompanying.PASN3 , " +
                             "External_Reservarion.Offer_Code " +
                     "HAVING " +
                             "External_Reservarion.PassportNumber = Accompanying.PASN3 " +
                             "AND " +
                             "External_Reservarion.Offer_Code = "+Offer_code +";";
        
            Go.QuaryAndFillTable(Sql, "External_Reservarion", table, W, H);
        }
    }
    
}
