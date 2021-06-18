
public class surupEkle extends AbstractDecorator{

	public surupEkle(Icecek drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	public void ıcecekYap() {
		
		super.ıcecekYap();
		System.out.println("İçeceğinize ekstra şurup eklenmiştir");
	}
	
	
}
