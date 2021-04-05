package day06;

public class soru2 {

	public static void main(String[] args) {
		
		
		/* Bir array'e uzunlugundan fazla eleman eklemeye calisin ve karsilasacaginiz exception i handle edin
		 * */
		
		int arr [] = {2,15,67,2,56};
		
		try {
		arr[6] = 23;
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uzunlugundan fazla eleman ekleyemezsiniz");
		}
		

	}

}
