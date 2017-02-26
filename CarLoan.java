// Javacore / Tanchenko A.
/*
 * O.3 Write a program CarLoan.java that reads in three command-line arguments P, Y, and R 
 *     and calculates the monthly payments you would have to make over Y years to pay off a P dollar loan 
 *     at R per cent interest compounded monthly. 
 *     The formula is The formula is
                 P r
payment =  ---------------,  where n = 12 * Y, r = R / (12 * 100)
           1  - (1 + r)^(-n)
 */

//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class CarLoan {
    
  static  double getPayment(double p, double y, double r) {
    double n=0,r_=0,pay=0;
      n=12*y;
      r_=r/12/100;
       pay=p*r_/(1-Math.pow((1+r_),-n));
       pay=Math.round(pay*100)/100;
  return pay;
  }
      
  static  boolean doubleCheck(String ...s) {
    boolean ok =false;
    double x=0;
   for(int i=0;i<s.length;i++){
     try{
          x = Double.parseDouble(s[i]);
          ok=true;
        }
        catch(IllegalArgumentException e) { 
          System.out.println("Data has wrong format");
          ok =false;
          break;
        }
   }
  return ok;
  }
   
  public static void main(String[] args) {
    
    double p=0,y=0,r=0;
    boolean ok=false;
    
    // Input user data block //
      if (args.length==3){
        if(doubleCheck(args[0],args[1],args[2])){
          p = Double.parseDouble(args[0]);
          y = Double.parseDouble(args[1]);
          r = Double.parseDouble(args[2]);
          ok=true;
        }
      }
    /////////////////////////// 
          
      if(ok){
        System.out.println ();
        System.out.println ("In case pay "+p+" dollar for "+y+" years and "+r+"% percentage");
        System.out.println ("Payment will be "+getPayment(p,y,r)+ " per month");
      }
   } 
 }