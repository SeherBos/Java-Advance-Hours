package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Kac Sayi girmek istediginizi yaziniz ");
		int size = scan.nextInt();
		
		int sayilar [] = new int[size];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("Lutfen Array'in " + (i+1) + ".ci elemanini giriniz");
			sayilar [i] = scan.nextInt();
			
		}
		
		System.out.println(Arrays.toString(sayilar));
		Arrays.sort(sayilar);
		System.out.println(Arrays.toString(sayilar));

		System.out.println(sayilar[size-1] - sayilar[0]);
	}

}
