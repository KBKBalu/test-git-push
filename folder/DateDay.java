package balu.app;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
         int m = Integer.parseInt(month) -1;
         int d = Integer.parseInt(day);
         int y = Integer.parseInt(year);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m, d);
        
        System.out.printf("%TA%n", calendar);
    
      
        
    }
}

