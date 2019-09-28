package Classes;

import BigPoint.Main;
import DataBase.Go;
import javax.swing.JComboBox;
import javax.swing.JTable;
import tourism.company.Tools;


public class Internal implements Main{
    
    private long SSN;
    private String Name;
    private String Tele;
    private String cash;
    private int offer_code;
    private int seate;
    private static String Emp_name;

    /*---------------------------------------------------*/
    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String Tele) {
        this.Tele = Tele;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public int getOffer_code() {
        return offer_code;
    }

    public void setOffer_code(int offer_code) {
        this.offer_code = offer_code;
    }

    public int getSeate() {
        return seate;
    }

    public void setSeate(int seate) {
        this.seate = seate;
    }
    
    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }
    /*---------------------------------------------------*/
    
    
    // methode one in internal table.
    @Override
    public void add() 
    {
        String Sql = "insert into Internal_Reservarion (SSN,cust_name,Telephone,cash,Offer_Code,Number_Seate)"
                + "values ("+SSN+",'"+Name+"','"+Tele+"','"+cash+"',"+offer_code+","+seate+");";
        boolean add = Go.ExecuteNonQuerey(Sql);
        try {
            if (add)
                Tools.myMess("تمت اضافة البيانات");
            else
                Tools.myMess("لم تتم اضافة البيانات بنجاح");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    // methode two update on Internal table.
    @Override
    public void update() 
    {
         String Sql = "update Internal_Reservarion "
                 + "set cust_name = '"+Name+"', "
                 + "Telephone = '"+Tele+"', "
                 + "cash = '"+cash+"', "
                 + "Offer_Code = "+offer_code+", "
                 + "Number_Seate = "+seate+" "
                 + "where SSN = "+ SSN +";";
        boolean add = Go.ExecuteNonQuerey(Sql);
        try {
            if (add)
                Tools.myMess("تمت ضبط البيانات");
            else
                Tools.myMess("لم تتم ضبط البيانات بنجاح");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // method three to get number offer.
    public void fillComboBox (JComboBox jc)
    {
        String Sql = "Select trip_Name from Itinerary Where trip_code LIKE '100%';";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (4) this method getting available seate or not.
    public int getTripeCode(JComboBox jc)
    {
        String Sql1 = "Select trip_code from Itinerary Where trip_Name = '"+jc.getSelectedItem().toString() + "';";
        int x = Integer.parseInt(Go.ExecuteQuary1(Sql1, "trip_code"));
        return x;
    }
    
    // method numer (5) this method getting name tripe from dataBase By using Trip Code in Table Update Umrah.
    public String getTripeName()
    {
        String Sql1 = "Select trip_Name from Itinerary Where trip_code = "+offer_code+";";
        String S = Go.ExecuteQuary1(Sql1, "trip_Name");
        return S;
    }
    
    // method six to get the coast of internal trip from dataBase.
    public String Quary() 
    {
        String Sql = "Select trip_coast from Itinerary where trip_code = "+offer_code +";";
        String s = Go.ExecuteQuary1(Sql,"trip_coast");
        try {
            if (s == null)
                Tools.myMess("لم اجد السعر المطلوب");
            else
                return s;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
   
    // method seven to check the seate is avaliable or not.
    @Override
    public boolean quary() 
    {
        String Sql = "select Number_Seate from Internal_Reservarion where Offer_Code = "+offer_code+" "
                      + "and Number_Seate = "+seate+";";
        boolean a = Go.ExecuteQuary(Sql);
        try {
            if (a) 
            {
                return true;
            }
            else
            {
                String Sql1 = "select SeateNumber from Accompanying where offerCode = "+offer_code+" "
                             + "and SeateNumber = "+seate+";";
                boolean a1 = Go.ExecuteQuary(Sql1);
                return a1;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    // method eight to fill the table Parent in edit view Internal. 
    @Override
    public void getOneRow(JTable t, String TName, int c, int w) 
    {
        String Sql = "SELECT Internal_Reservarion.cust_name , Internal_Reservarion.SSN , Internal_Reservarion.Telephone , Internal_Reservarion.cash , Internal_Reservarion.Offer_Code , Internal_Reservarion.Number_Seate from Internal_Reservarion \n" +
                     "WHERE Internal_Reservarion.SSN = "+SSN+";";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
    
    // method nine to count the avaliable chair in the trip
    public int count ()
    {
        String Sql = "Select Count(*) from Internal_Reservarion WHERE Offer_Code = "+offer_code +";";
        int S = Integer.parseInt(Go.countRow(Sql));
        String Sql1 = "Select Count(*) from Accompanying WHERE offerCode = "+offer_code +";";
        int S1 = Integer.parseInt(Go.countRow(Sql1));
        return S + S1;
    }

     
    @Override
    public void delete() 
    {
        
    }
    
}
