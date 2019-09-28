package Classes;

import DataBase.Go;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import tourism.company.Tools;

public class Note1 {
    
    private String Title;
    private String note;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void Add() 
    {
        
        String sql = "insert into Note (Title,note) values ("
                + "'"+Title +"', "
                + "'"+note +"');";
        boolean add = Go.ExecuteNonQuerey(sql);
        try {
            
            if (add)
                Tools.myMess("تمت اضافة البيانات بنجاح");
            else
                Tools.myMess("لم يتم اضافة البيانات");
            
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        } 
    }
    
    public void showMyNote(JTextField tx , JTextArea ta) 
    {
        String Sql = "select * from Note where Title = '"+Title +"';";
        try {
            Go.fill(Sql, tx, ta);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void fillComboBx (JComboBox Jc)
    {
        String Sql = "select Title from Note;";
        Go.fillComboBox(Sql, Jc);
    }
}
