
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icecek cay = new Cay();
		sutEkle sutEkleyici = new sutEkle(cay); 
		sutEkleyici.ıcecekYap();
		
		surupEkle surupEkleyici = new surupEkle(sutEkleyici);
		surupEkleyici.ıcecekYap();
		
		sekerEkle sekerEkleyici = new sekerEkle(surupEkleyici);
		sekerEkleyici.ıcecekYap();
		
		
		
		
		

	}

}
