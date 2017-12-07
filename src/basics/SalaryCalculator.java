/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

/**
 *
 * @author n-yusuf
 */
public class SalaryCalculator {
    
    public static void main(String[] args) {
        // Define a variable  for our career 
        
        String career  ;
        System.out.println("Program is starting ...");
        
        career = "Software Developer";
        System.out.println("My career is "+career);
        
        int hoursPerWeek = 40 ;
        int weekPerYear = 50 ;
        double rate = 42.50 ;
        career = "Web Developer" ;
        
        double salary = hoursPerWeek * weekPerYear * rate  ;
        
        System.out.println("My Salary as " + career + " at the rate of  $ " + rate + " per hour is $" + salary + " per year");
        
    }
    
}
