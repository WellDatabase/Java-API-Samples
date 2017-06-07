package com.welldatabase.samples;

import java.awt.*;
import java.io.File;
import java.io.IOException;
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


    public static void viewFirstZipFile(File fileTarget) throws IOException {
        //Open Zip
        File extractFolder = new File("zipFolder");
        ZipHelper.extractFolder(fileTarget, extractFolder);

        //Open a File
        openFirstFile(extractFolder);
    }

    public static void openFirstFile(File extractFolder) throws IOException {
        File[] entries = extractFolder.listFiles();

        if(entries.length > 0 ) {
            openFile(entries[0]);
        }
    }


    private static void openFile(File fileTarget) throws IOException {


        Desktop.getDesktop().open(fileTarget);
    }
}

