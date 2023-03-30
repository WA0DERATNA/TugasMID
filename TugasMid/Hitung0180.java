/*Nama : Wa Ode Ratna Adiningsih
  NIM	 : 13020210180*/

import java.util.Scanner;

public class Hitung0180{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah dollar:");
		int dollar = input.nextInt();
		double rupiah = dollar*1509480;
	
		System.out.println(" Hasil " + dollar + " dollar = " +rupiah + " rupiah ");
	}

}