package aula2;

public class Principal {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "Rafa";
		minhaConta.limite = 18000;
		minhaConta.numCont = 232323;
		minhaConta.saldo = 16000;
		minhaConta.tipo = "Topper";
		
		
		System.out.println("Saldo da conta de " + minhaConta.dono+":" + minhaConta.saldo);
		System.out.println("O tipo da conta e  "+ minhaConta.tipo);
		
		minhaConta.sacar(10000);
		minhaConta.depositar(100);
		
		System.out.println("Novo saldo eh de: "+ minhaConta.saldo);
		
		
	}

}
