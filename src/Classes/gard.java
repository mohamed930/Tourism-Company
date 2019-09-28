package Classes;

import DataBase.Go;
import javax.swing.JTable;

public class gard {
    
    public static void fillEmployee (JTable table , String TName , int W , int H)
    {
        String Sql = "select Name , Salary from Employee";
        Go.QuaryAndFillTable(Sql, TName, table, W, H);
    }
}
