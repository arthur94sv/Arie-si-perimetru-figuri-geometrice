
public class Triunghi extends FiguriGeometrice {
	private int x;
	private int y;
	private int z;

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;

	}

	public void setZ(int z) {
		this.z = z;

	}

	public void arie() {
		double p = (x + y + z) / 2;
		System.out.printf("Aria triunghiului este: %.2f\n", Math.sqrt(Math.abs(p * (p - x) * (p - y) * (p - z))));

	}

	public void perimetru() {
		int rez = x + y + z;
		System.out.println("Perimetrum trunghiului este: " + rez);

	}

}
