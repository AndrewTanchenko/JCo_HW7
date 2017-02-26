// Javacore / Tanchenko A.
/*
 * O.2 Write a program  that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 */

//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class Dz7_2 {
    
  static  int randomAtoB(int a,int b) {
    int random_=0;
    if(b>=a){random_=(int)(Math.random()*(b-a)+a);}
    else{random_=(int)(Math.random()*(a-b)+b);}
  return random_;
  }
  
  static  int summ(int ...n) {
    int sum=0;
    //System.out.println (" "+n[0]+" "+n[1]+" length:"+n.length);
    
    for(int i=0;i<=n.length-1;i++){
     sum+=n[i]; 
    }
  return sum;
  }
   
  public static void main(String[] args) {
    
    int a=0,b=0;
    boolean ok=false;
    
    // Input user data block //
          a = randomAtoB(1,6);
          b = randomAtoB(1,6);
    /////////////////////////// 
    
        System.out.println ("Summ of "+a+" and "+b+" is: "+summ(a,b));
     
   } 
 }