package Classes;

import BigPoint.Main;
import DataBase.Go;
import javax.swing.JTable;
import tourism.company.Tools;


public class Accompanying implements Main{
    
    private long SSN;
    private String PSSN;
    private String Name;
    private String Tele;
    private String cash;
    private int offer_code;
    private int seate;
    private long PSSN1;
    private String PASSN2;
    private String PASSN3;
    private String Photo;

    /*-------------------------------------------------------*/
    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
    
    public String getPSSN() {
        return PSSN;
    }

    public void setPSSN(String PSSN) {
        this.PSSN = PSSN;
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
    
    public long getPSSN1() {
        return PSSN1;
    }

    public void setPSSN1(long PSSN1) {
        this.PSSN1 = PSSN1;
    }
    
    public String getPASSN2() {
        return PASSN2;
    }

    public void setPASSN2(String PASSN2) {
        this.PASSN2 = PASSN2;
    }

    public String getPASSN3() {
        return PASSN3;
    }

    public void setPASSN3(String PASSN3) {
        this.PASSN3 = PASSN3;
    }
   
    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    /*---------------------------------------------------------*/

    // methode one(A) add in Accomanying for internal trip
    @Override
    public void add() 
    {
        String Sql = "insert into Accompanying (Name,SSN,TelePhone,offerCode,SeateNumber,PSSN1) "
                + "values ('"+Name+"',"+SSN+",'"+Tele+"',"+offer_code+","+seate+","+PSSN1+");";
        Go.ExecuteNonQuerey(Sql);
    }
    
    // methode one(B) add in Accompanying for Umarh trip
    public void add1() 
    {
        String Sql = "insert into Accompanying (Name,PassProtNumber,TelePhone,offerCode,SeateNumber,Photo,PASN2) "
                + "values ('"+Name+"','"+PSSN+"','"+Tele+"',"+offer_code+","+seate+",'"+Photo+"','"+PASSN2+"');";
        Go.ExecuteNonQuerey(Sql);
    }
    
    // methode one(C) add in Accompanying for External trip
    public void add2() 
    {
        String Sql = "insert into Accompanying (Name,PassProtNumber,TelePhone,offerCode,SeateNumber,Photo,PASN3) "
                + "values ('"+Name+"','"+PSSN+"','"+Tele+"',"+offer_code+","+seate+",'"+Photo+"','"+PASSN3+"');";
        Go.ExecuteNonQuerey(Sql);
    }
    
    // methode two(A) update in Accompanying for Internal Trip
    @Override
    public void update() 
    {
        String Sql = "Update Accompanying "
                + "set Name = '"+Name +"', "
                + "TelePhone = '"+Tele +"', "
                + "SeateNumber = "+seate +" "
                + "where SSN = "+SSN +";";
        boolean s = Go.ExecuteNonQuerey(Sql);
        try {
            if (s)
                Tools.myMess("تمت اعادة الضبط بنجاح");
            else
                Tools.myMess("لم يتم اعادة الضبط");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // methode two(B) update in Accompanying for Umarah Trip
    public void updateU() 
    {
        String Sql = "Update Accompanying "
                + "set Name = '"+Name +"', "
                + "TelePhone = '"+Tele +"', "
                + "SeateNumber = "+seate +" "
                + "where PassProtNumber = '"+PSSN +"';";
        boolean s = Go.ExecuteNonQuerey(Sql);
        try {
            if (s)
                Tools.myMess("تمت اعادة الضبط بنجاح");
            else
                Tools.myMess("لم يتم اعادة الضبط");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // method three(A) to get information in Add Page at Internal Sekction
    @Override
    public void getOneRow(JTable t, String TName, int c, int w) 
    {
        String Sql = "select Name, SSN , offerCode , TelePhone , SeateNumber , PSSN1 "
                + " from Accompanying Where PSSN1 = "+ PSSN1 +";";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
    
    // method three(B) to get information in Add Page at Umrah Sekction
    public void getOneRowU(JTable t, String TName, int c, int w) 
    {
        String Sql = "select Name, PassProtNumber , offerCode , TelePhone , SeateNumber , PASN2 , Photo"
                + " from Accompanying Where PASN2 = '"+ PASSN2 +"';";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
    
    // method three(C) to get information in Add Page at External Sekction
    public void getOneRowE(JTable t, String TName, int c, int w) 
    {
        String Sql = "select Name, PassProtNumber , offerCode , TelePhone , SeateNumber , PASN3 , Photo"
                + " from Accompanying Where PASN3 = '"+ PASSN3 +"';";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
 
    // methid four(A) to get information in Update Page at internal Update
    public void getOneRow1 (JTable t, String TName, int c, int w)
    {
        String Sql1 = "SELECT Accompanying.Name , Accompanying.SSN , Accompanying.TelePhone , Accompanying.offerCode , Accompanying.SeateNumber "
                + "from Accompanying WHERE Accompanying.PSSN1 = "+PSSN1 + ";";
        Go.QuaryAndFillTable(Sql1, TName, t, w, c);
    }
    
     // methid four(B) to get information in Update Page at Umarah Update
    public void getOneRow1U (JTable t, String TName, int c, int w)
    {
        String Sql1 = "SELECT Accompanying.Name , Accompanying.PassProtNumber , Accompanying.TelePhone , Accompanying.offerCode , Accompanying.SeateNumber "
                + "from Accompanying WHERE Accompanying.PASN2 = '"+PASSN2 + "';";
        Go.QuaryAndFillTable(Sql1, TName, t, w, c);
    }
    
    // methid four(C) to get information in Update Page at External Update
    public void getOneRow1E (JTable t, String TName, int c, int w)
    {
        String Sql1 = "SELECT Accompanying.Name , Accompanying.PassProtNumber , Accompanying.TelePhone , Accompanying.offerCode , Accompanying.SeateNumber "
                + "from Accompanying WHERE Accompanying.PASN3 = '"+PASSN3 + "';";
        Go.QuaryAndFillTable(Sql1, TName, t, w, c);
    }
    
    // method five(A) to get count of Accompanying for parent in internal Sektion
    public String count ()
    {
        String Sql = "select Count(*) from Accompanying WHERE PSSN1 = "+PSSN1 + ";";
        String s = Go.countRow(Sql);
        return s;
    }
    
    // method five(B) to get count of Accompanying for parent in Umrah Sektion
    public String countU ()
    {
        String Sql = "select Count(*) from Accompanying WHERE PASN2 = '"+PASSN2 + "';";
        String s = Go.countRow(Sql);
        return s;
    }
    
    // method five(C) to get count of Accompanying for parent in External Sektion
    public String countE ()
    {
        String Sql = "select Count(*) from Accompanying WHERE PASN3 = '"+PASSN3 + "';";
        String s = Go.countRow(Sql);
        return s;
    }
    
    // method six to get the seate is avaliable or not
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
    
    // method six to get the seate is avaliable or not from Umrah
    public boolean quaryU() 
    {
        String Sql = "select Number_Seate from Umrah_Reservarion where Offer_Code = "+offer_code+" "
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
    
    // method six to get the seate is avaliable or not from Umrah
    public boolean quaryE() 
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
    
    // it dosn't exsist in the current time
    @Override
    public void delete() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
