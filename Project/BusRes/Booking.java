package BusRes;

import Busres2.BookingDAO;
import Busres2.BusDAO;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String PassengerName;
    int busNo;
    Date date;
    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Name:");
        PassengerName = sc.next();
        System.out.println("Enter BusNo:");
        busNo = sc.nextInt();
        System.out.println("Enter The Date Like dd-MM-yyyy:");
        String dateinput = sc.next();
        SimpleDateFormat dateInput = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateInput.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable()  throws SQLException{

        Busres2.BusDAO busdao = new BusDAO();
        Busres2.BookingDAO bookingdao = new BookingDAO();
        int capacity = busdao.getCapacity(busNo);

        int booked = bookingdao.getBookedCount(busNo,date);

        return booked<capacity;

    }

}
