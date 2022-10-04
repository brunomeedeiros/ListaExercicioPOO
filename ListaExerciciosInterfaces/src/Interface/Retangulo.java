package Interface;

public class Retangulo {
	private double retangulo;
	private double lado;
	private double altura;
	
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
