package com.welldatabase.samples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class utils {


    public static Date addDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        return cal.getTime();
    }
}