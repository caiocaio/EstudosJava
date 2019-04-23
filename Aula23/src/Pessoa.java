import java.time.LocalDate;

public class Pessoa {
	// Adicione 5 atributos à classe Pessoa
	private String nome;
	private String cpf;
	private int idade;
	private LocalDate dataNascimento;
	private float altura;
	private Endereco endereco;
	
	

	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		setNome(nome);
		setCpf(cpf);
		setDataNascimento (dataNascimento);
		
	}
	public String getNone() {
		return getNome();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", altura=" + altura + ", endereco=" + endereco + "]";
	}
	
	
}
