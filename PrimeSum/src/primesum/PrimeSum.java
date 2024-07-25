/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primesum;

import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class PrimeSum {


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
     
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int s=Integer.MAX_VALUE;
      int a=0;
      boolean f=false;
      for(int num:arr){
          if(num>1){
              boolean IsPrime=true;
              
          
          if(num==2){
               IsPrime = true;
          }
          else if(num%2==0){
              IsPrime=false;
          }
          else{
              for(int i=3;i*i<=num;i+=2){
                  if(num%i==0){
                      IsPrime=false;
                      break;
                  }
              }
          }
          if(IsPrime){
              if(num<s){
                  s=num;
              }
              a+=num;
              f=true;
          }
      }
    }
    if(f){
   

   
        int z=a-s;
    System.out.println(z);
}
}
}