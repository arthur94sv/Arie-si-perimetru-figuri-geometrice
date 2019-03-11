
public class Patrat extends FiguriGeometrice {
	private int x;

	public void setX(int x) {
		this.x = x;

	}

	public void arie() {
		int rez = x * x;
		System.out.println("Aria patratului este: " + rez);
	}

	public void perimetru() {
		int rez = x * 4;
		System.out.println("Perimetrul patratului este: " + rez);

	}
}
