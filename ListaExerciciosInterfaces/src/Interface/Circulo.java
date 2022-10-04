package Interface;

public class Circulo {
	
	private final double PI = 3.14159;
	private double circulo;
	private double raio;

	 public double calculaQuadrado() {
		
		circulo = PI * (raio * raio);
		
		return circulo;
	}

	public double getCirculo() {
		return circulo;
	}

	public void setCirculo(double circulo) {
		this.circulo = circulo;
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
