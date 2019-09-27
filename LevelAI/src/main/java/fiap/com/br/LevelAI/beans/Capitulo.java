package fiap.com.br.LevelAI.beans;

public class Capitulo {
	private int codigo;
	private String titulo;
	private String conteudo;

	public Capitulo() {
		
	}

	public Capitulo(int codigo, String titulo, String conteudo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
