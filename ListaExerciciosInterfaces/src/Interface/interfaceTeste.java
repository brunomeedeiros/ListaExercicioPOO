package Interface;

public class InterfaceTeste {

	public static void main(String[] args) {
		
		int[] areaCalculada = new int [5];
		
		
		Circulo circulo = new Circulo();
		
		circulo.setRaio(10);
		circulo.calculaCirculo();
		circulo.getCirculo();
		
		Quadrado quadrado = new Quadrado();
		
		quadrado.setLado(5);
		quadrado.calculaQuadrado();
		
	}
}
