package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 Bir sayının mükemmel olup olmadığını bulan bir program yazınız.
Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayı mükemmeldir.
ORNEK:
   INPUT     : 6
   OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
*/

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mukemmel sayiyi bulalim");
		
		int sayi = scan.nextInt();
		
		
		checkPerfectNumber(sayi);
		
	System.out.println(checkPerfectNumber(sayi));
		
	String result = checkPerfectNumber(sayi)? "Sayi mukemmel sayidir" 
											:"Sayi mukemmel sayi degildir";
	
	System.out.println(result);
	
	scan.close();
		
	}
	
	
		public static boolean checkPerfectNumber (int sayi) {
			
			int toplam = 0;
			boolean flag = false;
			
			
			for(int i =1; i <sayi; i++) {
				if(sayi%i==0) {
					toplam+=i;
				}
			}	
			if (toplam ==sayi) {
				flag = true;
				
			}
			
			return flag;
		}
		
		
	}


