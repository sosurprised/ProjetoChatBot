package fiap.com.br.LevelAI.beans;

import java.util.Date;

public class Matricula {
	private int codigo;
	private Date matricula;

	public Matricula () {
		
	}

	public Matricula(int codigo, Date matricula) {
		super();
		this.codigo = codigo;
		this.matricula = matricula;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getMatricula() {
		return matricula;
	}

	public void setMatricula(Date matricula) {
		this.matricula = matricula;
	}
	
	
}
