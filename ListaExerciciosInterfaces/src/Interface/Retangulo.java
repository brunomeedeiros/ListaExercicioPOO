package Interface;

public class Retangulo implements AreaCalculavel {
	private double lado;
	private double altura;

	@Override
	public double calculaArea() {
		return lado * altura;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
