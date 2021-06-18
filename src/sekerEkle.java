
public class sekerEkle extends AbstractDecorator{

	public sekerEkle(Icecek drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	
	public void ıcecekYap() {
		
		super.ıcecekYap();
		System.out.println("İçeceğinize ekstra şeker eklendi.");
	}

	
}
