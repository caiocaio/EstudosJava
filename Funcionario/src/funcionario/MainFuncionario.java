package funcionario;

public class MainFuncionario {
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		
		fun1.nome = "Augusto";
		fun1.departamento = "atoa";
		fun1.rg = 12345;
		fun1.salario = 2300;
		
		
		fun1.aumento(1000);
		System.out.println("Seu novo salario e de : "+ fun1.salario);
		
	}
	
	


	
	
	
	
	
}
