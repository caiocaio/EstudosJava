
public class Endereco {
	private Endereco endereco;
	private String logradouro;
	private int numero;
	private String quadra;
	private String lote;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, int numero, String quadra, String lote, String bairro, int cep, String cidade,
			String estado) {

		setLogradouro(logradouro);
		setNumero(numero);
		setQuadra(quadra);
		setLote(lote);
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
		setEstado(estado);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Endereco [endereco=" + endereco + ", logradouro=" + logradouro + ", numero=" + numero + ", quadra="
				+ quadra + ", lote=" + lote + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado="
				+ estado + "]";
	}
    
}
