import java.time.LocalDate;

public class Aula02Main {
	public static void main(String[] args) {
		// Crie 3 objetos da classe Pessoa e
		// informe valores para os 5 atributos
		// de cada objeto.
		Pessoa daniel = new Pessoa();
		daniel.nome = "Daniel";
		daniel.cpf = "12345678909";
		daniel.endereco = new Endereco();
		daniel.endereco.logradouro = "Rua X";
		daniel.endereco.numero =  10;
		daniel.endereco.bairro = "Setor Central";
		daniel.altura = 1.83F;
		daniel.idade = 20;
		daniel.dataNascimento = LocalDate.of(1999, 7, 24);
		
		Pessoa ana = new Pessoa();
		ana.nome = "Ana";
		ana.cpf = "98765432100";
		//ana.endereco = "Rua Z, num 11. Setor Central";
		ana.altura = 1.70F;
		ana.idade = 19;
		ana.dataNascimento = LocalDate.of(2000, 1, 2);
		
		imprimir(ana);		
		imprimir(daniel);		
	}
	
	public static void imprimir(Pessoa pessoa) {
		System.out.println(pessoa.nome + " - " 
				+ pessoa.idade + " anos de idade.");
	}
	// Crie uma classe para representar o endereço
}
