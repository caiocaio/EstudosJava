package funcionario;

import java.sql.Date;

public class Funcionario {
	
	int rg;
	String nome, departamento; 
	double salario;
	Date dataDeEntrada;
	Funcionario fucionario;
	boolean status;
	
	

	void aumento(double valor){
		this.salario = this.salario + valor;
	}
	
	void mudarDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	// PEGAR DATA ATUAL DA BIBLIOTECA DE DATE
	// void registrarEntrada(Date dataDeEntrada) {
		// this.dataDeEntrada = dataDeEntrada;
	// }
	
	
	void demitir() {
		this.status = false;
	}
	
	void admitir() {
		this.status = true;
	}
	
}
