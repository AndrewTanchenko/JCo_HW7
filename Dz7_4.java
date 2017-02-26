// Javacore / Tanchenko A.
/*
 * O.4 Напишите программу определяющую сумму цифр любого введенного как аргумент командной строки целого положительного числа.
 */

//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class Dz7_4 {
    
  static  int getSummNumDigits(int n) {
      String s1=""+n;
      int sum=0;
     for(int i=1;i<=s1.length();i++){
        sum+=n%10;
        n=(int)(n/10);
     }
  return sum;
  }
      
  static  boolean intCheck(String ...s) {
    boolean ok =false;
    int x=0;
   for(int i=0;i<s.length;i++){
     try{
          x = Integer.parseInt(s[i]);
          ok=true;
        }
        catch(IllegalArgumentException e) { 
          System.out.println("Data has not integer format");
          ok =false;
          break;
        }
   }
  return ok;
  }
   
  public static void main(String[] args) {
    
    int n=0;
    boolean ok=false;
    
    // Input user data block //
      if (args.length==1){
        if(intCheck(args[0])){
          n = Integer.parseInt(args[0]);
          ok=true;
        }
      }
    /////////////////////////// 
    
      if(ok){
        System.out.println ("Summ digits of number "+n+" is: "+getSummNumDigits(n));
      }
   } 
 }