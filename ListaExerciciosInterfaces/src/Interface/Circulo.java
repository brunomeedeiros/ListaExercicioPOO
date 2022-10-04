package Interface;

public class Circulo implements AreaCalculavel {
	
	private final double PI = 3.14159;
	private double circulo;
	private double raio;

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public double calculaCirculo() {
		
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
