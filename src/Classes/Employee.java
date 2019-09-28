package Classes;

import BigPoint.Main;
import DataBase.Go;
import Form.EmployeeCataloge;
import java.sql.SQLException;
import javax.swing.JTable;
import tourism.company.Tools;

public class Employee implements Main{
    
    private int id;
    private String Name;
    private long SSN;
    private String Tele;
    private String Adress;
    private String SM;
    private int Salary;
    private String JD;
    private String UserName;
    private String PassWord;
    private String New_Pass;
    private int Age;
    private String Photo;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String Tele) {
        this.Tele = Tele;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getJD() {
        return JD;
    }

    public void setJD(String JD) {
        this.JD = JD;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    
    public String getNew_Pass() {
        return New_Pass;
    }

    public void setNew_Pass(String New_Pass) {
        this.New_Pass = New_Pass;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
   
    @Override
    public void add() 
    {
        String Sql = "insert into Employee (id,Name,SSN,Telephone,Address,SocialMartial,Salary,JobDescrib,userName,PassWord,Age,photo)"
                + "values ("+id+",'"+Name+"',"+SSN+",'"+Tele+"','"+Adress+"','"+SM+"',"+Salary+",'"+JD+"','"
                +UserName+"','"+PassWord+"',"+Age+",'"+Photo+"');";
        boolean add = Go.ExecuteNonQuerey(Sql);
        try {
                if(add)
                {
                    Tools.myMess("تمت اضافةالموظف بنجاح");
                }
                else
                    Tools.myMess("ارجو ادخال البيانات صحيحة");
                }
            catch(Exception e)
            {
                Tools.myMess(e.getMessage());
            }
    }
    
    public boolean SignIn ()
    {
        String Sql = "Select userName,PassWord from Employee where userName = '"+UserName 
                + "' and PassWord = '"+PassWord+"';" ;
        boolean quary = Go.ExecuteQuary(Sql);
        return quary;
    }

    @Override
    public void update() {
        String Sql = "update Employee set Name = '"+Name+"', "
                + "SSN = "+SSN+", "
                + "Telephone = '"+Tele+
                "', Address = '"+Adress+"', "
                + "SocialMartial = '"+SM+"', "
                + "Salary ="+Salary+
                ", JobDescrib='"+JD+"', "
                + "userName = '"+UserName+"', "
                + "PassWord = '"+New_Pass+
                "', Age = "+Age+", "
                + "photo = '"+Photo+"' "
                + "WHERE id = "+id+";";
        boolean update = Go.ExecuteNonQuerey(Sql);
        try {
            if (update)
            {
                Tools.myMess("تمت تعديل البيانات بنجاح");
            }
            else
            {
                Tools.myMess("لم تتم عملية التعديل بنجاح");
            }
        } catch (Exception ex) {
            Tools.myMess(ex.getMessage());
        }
    }
    
    @Override
    public boolean quary() {
        String Sql = "select Name,SSN,Telephone,Address,SocialMartial,Salary,JobDescrib,userName,PassWord,Age,photo "
                + "from Employee Where id = "+id+";";
        boolean quary = Go.ExecuteQuary(Sql);
        return quary;
    }

    @Override
    public void delete() 
    {
        String Sql = "Delete from Employee WHERE id = "+id+";";
        boolean delete = Go.ExecuteNonQuerey(Sql);
        try {
                if(delete)
                {
                    Tools.myMess("تم مسح بيانات الموظف بنجاح");
                }
                else
                    Tools.myMess("لم يتم مسح بيانات الموظف");
            }
            catch(Exception e)
            {
                Tools.myMess(e.getMessage());
            }
    }

    @Override
    public void getOneRow(JTable t, String TName, int c, int w) {
        String Sql = "select Name,SSN,Telephone,Address,SocialMartial,Salary,JobDescrib,userName,PassWord,Age,photo "
                                 + "from Employee Where id = "+id+";";
        Go.QuaryAndFillTable(Sql, TName, t, c, w);
    }
    
    public void getAllRow (JTable t, String TName, int c, int w)
    {
        String Sql = "select Name,SSN,Telephone,Address,SocialMartial,Salary,JobDescrib,userName,PassWord,Age,photo "
                + "from Employee";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
        
    }
    
    public void GetSalary (JTable t , String TName ,int c ,int w)
    {
        String Sql = "select Name , Salary from Employee";
        Go.QuaryAndFillTable(Sql, TName, t, w, c);
    }
    
    public String GetPhoto ()
    {
        String Sql = "Select photo from Employee Where userName = '"+UserName + "';";
        String URL = Go.ExecuteQuary1(Sql, "photo");
        return URL;
    }
    
}
