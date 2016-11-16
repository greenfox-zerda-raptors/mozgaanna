package com.greenfox.bx;

import javax.print.DocFlavor;

/**
 * Created by mozgaanna on 16/11/16.
 */
public class Reservation implements Reservationy {
    String codeBooking;
    String dowBooking;



    public Reservation(String dayOfWeek){
        dowBooking = dayOfWeek;
        this.codeBooking = randomZeroToZ(8);
    }


    @Override
    public void setDowBooking(String dowBooking) {
        this.dowBooking = dowBooking;
    }

    @Override
    public String getDowBooking() {
        return dowBooking;
    }

    @Override
    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    @Override
    public String getCodeBooking() {
        return codeBooking;
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return false;
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Booking# %s for %s", codeBooking, dowBooking);
    }

    // this is somewhere in the code...
    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // and someplace else in the code


    // and this is how I got the code
    static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }
}
