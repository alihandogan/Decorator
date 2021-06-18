
public class sutEkle extends AbstractDecorator{

	public sutEkle(Icecek drink) {
		super(drink);
		
	}
	public void ıcecekYap() {
		
		super.ıcecekYap();
		System.out.println("İçeceğinize ekstra süt eklendi.");
	}

	
	
}
