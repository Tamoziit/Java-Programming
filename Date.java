import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Date {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double payment=sc.nextDouble();
        sc.close();
        Locale india = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(india);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}