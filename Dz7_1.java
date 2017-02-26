// Javacore / Tanchenko A.
/*
 * O.1 Write a program that takes two int values a and b from the command line and prints a random integer between a and b.
 */

//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class Dz7_1 {
    
  static  int randomAtoB(int a,int b) {
    int random_=0;
    if(b>=a){random_=(int)(Math.random()*(b-a)+a);}
    else{random_=(int)(Math.random()*(a-b)+b);}
  return random_;
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
    
    int a=0,b=0;
    boolean ok=false;
    
    // Input user data block //
      if (args.length==2){
        if(intCheck(args[0],args[1])){
          a = Integer.parseInt(args[0]);
          b = Integer.parseInt(args[1]);
          ok=true;
        }
      }
    /////////////////////////// 
    
      if(ok){
        System.out.println ("Random vallue from "+a+" to "+b+" is: "+randomAtoB(a,b));
      }
   } 
 }