package com.company;

import java.util.Scanner;

public class Main {

   public class luas_persegi{
       public double luas1 (double p,double l){

           double luas;
           luas = p*l;
           return luas;
       }
       public void luas2(double p, double l){
           double luas;
           luas = p*l;
           System.out.println("Luasnya :"+ luas); ;
       }
   }

    public static void main(String[] args) {
	// write your code here
        double luas1;
        System.out.println("Menghitung luas persegi panjang \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pannjang ");
        double p = input.nextDouble();
        System.out.println("Masukkan Lebar :");
        double l = input.nextDouble();

        System.out.println("HAsil luas Dengan method ");
        double luas = luas1(p,l);
        System.out.println("luas =" + luas);

        System.out.println("Hasil luas dengan void");
        luas2 (p,l);

    }
}
