package Classes;

import BigPoint.Main;
import DataBase.Go;
import javax.swing.JComboBox;
import javax.swing.JTable;
import tourism.company.Tools;

public class External implements Main{
    
    private String SSN;
    private String Name;
    private String Tele;
    private String cash;
    private int offer_code;
    private int seate;
    private String photo;

    /*-------------------------------------------------------------*/
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /*-------------------------------------------------------------*/

    // method one add in External table.
    @Override
    public void add() 
    {
        String Sql = "insert into External_Reservarion (PassportNumber,cust_name,Telephone,cash,Offer_Code,Number_Seate,photo)"
                + "values ('"+SSN+"','"+Name+"','"+Tele+"','"+cash+"',"+offer_code+","+seate+",'"+photo+"');";
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

    // method two Update in External table.
    @Override
    public void update() 
    {
        String Sql = "update External_Reservarion "
                 + "set cust_name = '"+Name+"', "
                 + "Telephone = '"+Tele+"', "
                 + "cash = '"+cash+"', "
                 + "Offer_Code = "+offer_code+", "
                 + "Number_Seate = "+seate+" "
                 + "where PassportNumber = '"+ SSN +"';";
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
        String Sql = "Select trip_Name from Itinerary Where trip_code LIKE '300%';";
        Go.fillComboBox(Sql, jc);
    }
    
    // method number (4) this method getting tripe Code.
    public int getTripeCode(JComboBox jc)
    {
        String Sql1 = "Select trip_code from Itinerary Where trip_Name = '"+jc.getSelectedItem().toString()+"';";
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
    
    // method four to get the coast of umrah trip from dataBase.
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

    // method five to get the seate avalaible or not int External trips.
    @Override
    public boolean quary() 
    {
        String Sql = "select Number_Seate from External_Reservarion where Offer_Code = "+offer_code+" "
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

    // method six to fill the table Parent in edit view External. 
    @Override
    public void getOneRow(JTable t, String TName, int c, int w) 
    {
        String Sql = "SELECT External_Reservarion.cust_name , External_Reservarion.PassportNumber , External_Reservarion.Telephone , External_Reservarion.cash , External_Reservarion.Offer_Code , External_Reservarion.Number_Seate "
                + "from External_Reservarion WHERE External_Reservarion.PassportNumber = '"+SSN+"';";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
   
    
    public int count ()
    {
        String Sql = "Select Count(*) from External_Reservarion WHERE Offer_Code = "+offer_code +";";
        int S = Integer.parseInt(Go.countRow(Sql));
        String Sql1 = "Select Count(*) from Accompanying WHERE offerCode = "+offer_code +";";
        int S1 = Integer.parseInt(Go.countRow(Sql1));
        return S + S1;
    }
    
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
