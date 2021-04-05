package day06;

import java.io.FileNotFoundException;

public class Soru3 {
		/*
	 	Motor isminde bir degisken olusturun ve sonraki satirda gene ayni isimde bir degisken olustmraya calisin
	 	ve eger bir hata halirsaniz bu hatayi handle edin
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		String motor = "Ferrari motoru";
		
		try {
		//	String motor = "Tesla motoru"; Ayni isimli ikinci bir degisken olusturamayiz ve bunu exception'lar ile cozmemiz mumkun degildir
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	}

