package day01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/*
	     * SORU 1
	     *
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
	     * kullaniciya musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
	     *
	     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Urun adedini giriniz");
		
		int quantity = scan.nextInt();
		
		System.out.println("Liste fiyatini yaziniz");
		double price	 = scan.nextDouble();	
		double totalPrice;
		
		
		System.out.println("Musteri kartiniz var ise Y yoksa N tusuna basiniz");

		char card = scan.next().toLowerCase().charAt(0);	
		
		if (card == 'y') {
			if (quantity>10) {
					price *= 0.8; // price=price*0.8;
					totalPrice = price*quantity;

				System.out.println("Yuzde %20 indirim uygunlanmistir.Odenmesi gereken miktar :" + totalPrice);
			} else {
				price *=0.85;
				totalPrice= price*quantity;
				System.out.println("Yuzde %15 indirim uygunlanmistir.Odenmesi gereken miktar :" + totalPrice);

			}
		
			
		} else if (card =='n'){
			if (quantity > 10) {
				price*= 0.85;
				totalPrice= price*quantity;
				System.out.println("Yuzde %15 indirim uygunlanmistir.Odenmesi gereken miktar :" + totalPrice);

			}else {
				price = price-price*10/100; // buda yuzde almanin farkli formulu // price*=0.9; da olabilirdi
				totalPrice = price*quantity;
				System.out.println("Yuzde %10 indirim uygunlanmistir.Odenmesi gereken miktar :" + totalPrice);

				
			}
		}else { 
			System.out.println("Yanlis giris yaptiniz");


			
		}
		
		scan.close();
		
		
	}

}
