package Interface;

public class Quadrado implements AreaCalculavel{
	private double lado;
	private double quadrado;
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public double calculaQuadrado() {
		
		 quadrado = lado * lado;
		 
		 return (quadrado);
		
	 }

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(double quadrado) {
		this.quadrado = quadrado;
	}

	
	 
	 
	 
}
