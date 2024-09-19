package BusRes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {
    public  static  int getBookedCount(int busNo, Date date)throws SQLException
    {
        String sql="select count(passenger_name) from booking where bus_no=? and travel_date=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement pst= con.prepareStatement(sql);
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        pst.setInt(1,busNo);
        pst.setDate(2,sqldate);
        ResultSet rs= pst.executeQuery();
        rs.next();
        return  rs.getInt(1);
    }
    public  static void addBooking(Booking booking)throws SQLException
    {
        String sql="insert into booking values(?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement pst=con.prepareStatement(sql);
        java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
        pst.setString(1,booking.PassengerName);
        pst.setInt(1,booking.busNo);
        pst.setDate(3,sqldate);
        pst.executeUpdate();
    }


}
