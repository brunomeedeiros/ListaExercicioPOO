package exercicioDois;

public class Conta {
	
	double saldo;

	public double obterSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		if((this.saldo - valor) >= 0) {
			this.saldo = this.saldo - valor;
		}else {
			System.out.println("Saldo Insulficiente");
		}
	}
}
