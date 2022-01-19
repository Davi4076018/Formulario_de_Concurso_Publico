package package1;

public class Candidato {
	private String nome, sexo, cargo;
	private int Ninsc;
	
	public Candidato(String nome, String sexo, String cargo, int Ninsc) {
		this.cargo = cargo;
		this.Ninsc = Ninsc;
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getNinsc() {
		return Ninsc;
	}

	public void setNinsc(int ninsc) {
		Ninsc = ninsc;
	}

}
