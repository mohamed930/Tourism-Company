package Classes;

import DataBase.Go;
import javax.swing.JTable;
import tourism.company.Tools;

public class Admin implements BigPoint.Main{
    
    private String Name;
    private String UserName;
    private String PassWord;
    private String Tele;
    private String New_Pass;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getTele() {
        return Tele;
    }

    public void setTele(String Tele) {
        this.Tele = Tele;
    }
    
    public String getNew_Pass() {
        return New_Pass;
    }

    public void setNew_Pass(String New_Pass) {
        this.New_Pass = New_Pass;
    }
    
    @Override
    public void add() {
        
        String Sql = "Select count(*) from Admin;";
        String s = Go.countRow(Sql);
        
        if (s == null)
        {
            Tools.myMess("لا يمكن الوصول للداتا بيز الخاصة بالمدير");
        }
        
        else if(!"1".equals(s))
        {
            Tools.myMess("لايمكن اضافه مدير اخر,أسف");
        }
        else
        {
            String Sql1 = "insert into Admin (Name,userName,password,Telephone) values ('"
                + Name+"','"+UserName+"','"+PassWord+"','"+Tele+"');";
            boolean add = Go.ExecuteNonQuerey(Sql1);
            try {
            if(add)
            {
                Tools.myMess("تمت اضافة المدير بنجاح");
            }
            else
                Tools.myMess("ارجو ادخال البيانات صحيحة");
            }
            catch(Exception e)
            {
                Tools.myMess(e.getMessage());
            }
        }
    }
    
    public boolean login ()
    {
        String Sql = "select userName , password from Admin where userName = '"
                +UserName +"' and password = '"+PassWord+"';";
        boolean quary = Go.ExecuteQuary(Sql);
        return quary;
    }

    @Override
    public void update() {
        String Check = "select password from Admin where password = '"+PassWord+"';";
        boolean x =  Go.ExecuteQuary(Check);
        if (x)
        {
            String Sql = "update Admin set password = '"+New_Pass+"';";
            boolean Y = Go.ExecuteNonQuerey(Sql);
            try {
                if (Y)
                {
                    Tools.myMess("تم تعديل كلمة المرور بنجاح");
                }
                else
                {
                    Tools.myMess("لم يتم تغيير كلمة المرور");
                }
                
            }catch(Exception ex)
            {
                Tools.myMess(ex.getMessage());
            }
        }
        else
        {
            Tools.myMess("ارجوك تأكد من ادخالك لكلمة المرور بطريقة صحيحة");
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean quary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getOneRow(JTable t, String TName, int c, int w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
