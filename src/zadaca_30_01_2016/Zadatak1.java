package zadaca_30_01_2016;

import java.util.Scanner;

public class Zadatak1 {
	 public static void main(String args[]){  
		 // korisnik unosi broj
		 Scanner unos = new Scanner(System.in);
		  int ostatak,suma=0,izlaz;    
		  System.out.println("Unesite broj: ");
		  int broj = unos.nextInt(); 
		  izlaz=broj;    
		  // vrti se petlja koja "okreæe" broj, dokle god ne bude ostala 0.
		  while(broj>0){    
		   ostatak=broj%10;
		   suma=(suma*10)+ostatak;    
		   broj=broj/10;    
		  }    
		  // ako je okrenuti broj jednak unesenom, znaèi da je palindrom
		  if(izlaz==suma)    
		   System.out.println("Broj je palindrom.");    
		  // ako nije, ispisuje se da nije palindrom
		  else    
		   System.out.println("Broj nije palindrom.");    
		  unos.close();
		}  
	} 