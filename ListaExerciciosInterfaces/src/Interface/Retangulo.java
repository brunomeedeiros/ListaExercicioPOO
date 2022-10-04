package Interface;

public class Retangulo implements AreaCalculavel {
	private double retangulo;
	private double lado;
	private double altura;

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double calculaRetangulo() {
		
		retangulo = lado * altura;
		return retangulo;
	}

	public double getRetangulo() {
		return retangulo;
	}

	public void setRetangulo(double retangulo) {
		this.retangulo = retangulo;
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
