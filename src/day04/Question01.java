package day04;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda Arrays.sort() methodu 
		 * kullanmadan bir method olusturacak sekilde  yapiniz
		 */
		
		
		
		int []arr = {5,20,18,-2,-30,156};
		int arr2[] = {5, 20, 18, -2, -30, 156, 12893, 23};
		enKucuk(arr);
		System.out.println();
		enBuyuk(arr2);

		
	}
	
	public static void enKucuk(int arr[]) {
		
		int temp = Integer.MAX_VALUE;
		
		for (int each : arr) {
			
			if (each<temp) {
				temp=each; // arr'de ki her sayiyi alarak temp'e esitleyecegiz ve karsilactirdigi en kucuk rakam en sonra yazdirilmis olacak .
				System.out.print(temp+" "); // loop her dondugunde yazdirip gormek icin yazdim, en sonda ki en kucuk olmus oluyor.
			}
			
		}
		
	}
	
	public static void enBuyuk(int arr2[]) {
		
	
			int temp = Integer.MIN_VALUE;
			
			int temp2 = arr2[0];
			
			for(int each:arr2) {
				if(each>temp) {
					temp = each; // 30 satirda ki gibi degil de bu sekilde yazdirip sadece en buyugunu gorebiliriz.
					
				}
			}
			System.out.print(temp + " ");
		}


	
}
