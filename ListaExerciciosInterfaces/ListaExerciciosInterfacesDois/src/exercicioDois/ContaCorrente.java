package exercicioDois;

public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public double calculaTributos() {
		return super.obterSaldo() * 0.01;
	}

}
