package modelo;

public class Cliente {
	private String nome;
	private int cpf;
	private int cod;
	private String telefone;
	
	public Cliente() {
	}

	/** COnstrutor completo
	 * 
	 * @param nome
	 * @param cpf	cpf do cliente
	 * @param cod codigo para identeificar o cliente 
	 * @param telefone telefone do cliente
	 */
	public Cliente(String nome, int cpf, int cod, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.cod = cod;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * acessar a informação do cpf do cliente
	 * @return
	 */
	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * parametro toString para imprimir equivalencias na imprenssão
	 * @author Brenno Alves
	 */
	public String toString (){
		return "\nDados do cliente: \nCodigo:"+cod+"\nNome:"+nome+"\nCPF: "+cpf+"\nTelefone: "+telefone;
	}
	/**
	 * parametro para buscar nome do cliente no sistema 
	 * @param boolean
	 * @return
	 * @author Brenno Alves
	 */
	public boolean verificarNome(String nome) {
		if(this.nome.equalsIgnoreCase(nome)==true) {
			return true;
		}
		return false;
	}

}

