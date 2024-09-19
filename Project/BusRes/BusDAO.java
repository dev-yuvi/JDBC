package BusRes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO{
    public  static  void BusDisplayInfo()throws SQLException
    {
        String sql="select * from bus;";
        Connection con=DBConnection.getConnection();
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next())
        {
            System.out.print("BusNo: "+rs.getString(1));
            if(rs.getInt(2)==0)
            {
                System.out.print("AC: no");
            }
            else
            {
                System.out.print("AC: yes");
            }
            System.out.print("BusCapacity: "+rs.getInt(3));
            System.out.println();
        }
       // System.out.println();
        System.out.println("-------------------------------------------------");
    }
    public  static  int getCapacity(int busNo)throws SQLException
    {
        String sql="select capacity from bus where id="+busNo;
        Connection con=DBConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(sql);
        rs.next();
        return  rs.getInt(1);
    }

}
