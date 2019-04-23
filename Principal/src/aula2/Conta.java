package aula2;

public class Conta {
	int numCont;
	String tipo , dono;
	double saldo, limite;
	Conta Conta;
	
	
	
	
	void sacar(double quantidade) {
	this.saldo = this.saldo - quantidade;
	
	}
	void depositar(double quantidade){
	this.saldo = this.saldo + quantidade;
		
	}
	

}
