package day06;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {

	public static void main(String[] args) {
		/*
		Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz.
		String str=“ilovejavatoo”
		Output: o v a
		*/
		
		String str = new String("ilovejavatoo");
		ArrayList<Character> charList = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
		// System.out.println(charList);
		tekrarliKarakterler(charList);
	}

	public static void tekrarliKarakterler(ArrayList<Character> a) {
		String tekrarlilar = "";
		// ahmet
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) == a.get(j) && !tekrarlilar.contains(a.get(i) + "")) {
					tekrarlilar += a.get(i) + " ";
				}
			}
		}
		System.out.println(tekrarlilar);

	}

	
}
