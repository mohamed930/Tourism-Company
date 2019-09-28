package BigPoint;

import javax.swing.JTable;

public interface Main {
    
    public void add();
    public void update();
    public boolean quary();
    public void delete();
    public void getOneRow(JTable t , String TName , int c , int w);
}
