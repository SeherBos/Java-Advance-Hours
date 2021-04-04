package day03;

public class OgretmenBilgileri {
	
	String ogretmenIsmi;
	String ogretmenBrans;
	
	public OgretmenBilgileri(String brans, String isim){
		this.ogretmenBrans = brans;
		this.ogretmenIsmi = isim;	
		
	}
	
	public OgretmenBilgileri(){
		
	}
	
	
	
	/*Class’i olusturun bu Class’da bir Ogretmen icin gerekli
          bilgileri girebilecegim INSTANCE Variable’lar olusturun
          ve main method icinde bu variable’lara deger atayin ve yazdirin
         
      */
	
	
	public static void main(String[] args) {
		OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("Fen", "Velihan");
		System.out.println(ogretmen1.ogretmenBrans);
		
		OgretmenBilgileri ogretmen2 = new OgretmenBilgileri();
		ogretmen2.ogretmenBrans = "Mat ";
		ogretmen2.ogretmenIsmi ="Can";
		
		System.out.println(ogretmen2.ogretmenBrans + ogretmen2.ogretmenIsmi);
		
	}

	

}
