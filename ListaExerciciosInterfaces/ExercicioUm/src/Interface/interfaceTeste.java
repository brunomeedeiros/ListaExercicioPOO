package Interface;

public class InterfaceTeste {

	public static void main(String[] args) {
		
		AreaCalculavel[] areaCalculada = new AreaCalculavel [5];
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();

		// Setando os valores para o Quadrado
		quadrado.setLado(5);
		
		// Setando os valores para o Circulo
		circulo.setRaio(10); 
		
		// Setando os valores para o Retangulo
		retangulo.setLado(2); 
		retangulo.setAltura(5);
		
		//Armazenando os returns das funções dentro do vetor nas posições [0,1,2]
		areaCalculada[0] = quadrado;
		areaCalculada[1] = circulo;
		areaCalculada[2] = retangulo;
		
		// Instanciando o Segundo Quadrado
		Quadrado quadrado2 = new Quadrado();
		
		// Setando o valor para o Segundo quadrado
		quadrado2.setLado(12);
		
		//Armazenando o return da função dentro do vetor na posição [3]
		areaCalculada[3] = quadrado2;
		
		// Instanciando o Segundo Retangulo
		Retangulo retangulo2 = new Retangulo();
		
		// Setando os valores para o Segundo Retangulo
		retangulo2.setLado(2);
		retangulo2.setAltura(6);
		
		//Armazenando o return da função dentro do vetor na posição [4]		
		areaCalculada[4] = retangulo2;
		
		System.out.println(areaCalculada[0]);
		System.out.println(areaCalculada[1]);
		System.out.println(areaCalculada[2]);
		System.out.println(areaCalculada[3]);
		
	}
}
