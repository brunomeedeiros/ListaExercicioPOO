package Interface;

public class Circulo implements AreaCalculavel {
	
	private final double PI = 3.14159;
	private double raio;

	@Override
	public double calculaArea() {
		return PI * (raio * raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

}
