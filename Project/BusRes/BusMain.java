package BusRes;

import java.util.Scanner;
import java.sql.*;
public class BusMain {
    public static void main(String[] args) throws  SQLException{
        Scanner sc=new Scanner(System.in);
        BusDAO busdao=new BusDAO();
        try {
            busdao.BusDisplayInfo();
            int useropt = 1;
            while (useropt == 1) {
                System.out.println("Enter 1 Booking 2 Exit:");
                useropt = sc.nextInt();
                if (useropt == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable()) {
                        BookingDAO bookingdao = new BookingDAO();
                        bookingdao.addBooking(booking);
                        System.out.println("Booking is Successful:");
                    } else
                        System.out.println("Sorry Bus is full Try another bus and Another Date:");
                    //System.out.println("Booking...");
                } else {
                    System.out.println("Booking Stop...");
                }

            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
