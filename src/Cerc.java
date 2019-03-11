
public class Cerc extends FiguriGeometrice {
	private double r;

	public void setR(double r) {
		this.r = r;

	}

	public void arie() {
		double rez = Math.PI * r * r;
		System.out.printf("Aria discului este: %.2f\n", rez);
	}

	public void perimetru() {
		double rez = 2 * Math.PI * r;
		System.out.printf("Corcumferinta discului este: %.2f\n", rez);
	}

}
