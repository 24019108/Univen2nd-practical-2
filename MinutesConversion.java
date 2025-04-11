
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;

/**
 *
 * @author 24019108
 */
import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int minutes;
        System.out.println("Enter the number of minutes");
        minutes = myInput.nextInt();
        int seconds = 60;
        int HourInaDay =24;
        double hours,days;
        
       hours=minutes/seconds;
       days=hours/HourInaDay;
       
       System.out.println("minutes = " +minutes +"minutes");
       System.out.println("hours =" +hours + "Hrs");
       System.out.println("Days =" +days + "DAYS");
        
    }
}
