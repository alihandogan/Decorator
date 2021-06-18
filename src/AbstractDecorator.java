
public abstract class AbstractDecorator implements Icecek{
	
	private Icecek drink;
	
	public AbstractDecorator(Icecek drink) {
		this.drink = drink;
	}
	
	public void ıcecekYap() {
		drink.ıcecekYap();
	}
	
}
