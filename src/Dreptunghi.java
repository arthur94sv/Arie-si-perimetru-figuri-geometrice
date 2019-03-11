
public class Dreptunghi extends FiguriGeometrice {
	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;

	}

	public void arie() {
		int rez = x * y;
		System.out.println("Aria dreptunghiului este: " + rez);
	}

	public void perimetru() {
		int rez = 2 * (x + y);
		System.out.println("Perimetrul dreptunghiului este: " + rez);
	}

}
