package fiap.com.br.LevelAI.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fiap.com.br.LevelAI.beans.Disciplina;
import fiap.com.br.LevelAI.conexao.Conexao;



public class DisciplinaDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public DisciplinaDAO() throws Exception{
		con = Conexao.getConectar();
	}
	
	public Disciplina getDisiplina(int codigo) throws Exception{
		stmt = con.prepareStatement
		("select * from t_sd_disciplina where cd_disciplina=?");
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Disciplina(
					rs.getInt("cd_disciplina"),
					rs.getString("nm_disciplina"),
					rs.getString("ds_disciplina"),
					rs.getDate("dt_inicio"),
					rs.getDate("dt_termino"),
					rs.getString("st_status")	
					);
		}else {
			return new Disciplina();
		}
	}
	
	public String apagarDisciplina(int codigo) throws Exception{
		stmt = con.prepareStatement
		("delete from t_sd_disciplina where cd_disciplina=?");
		stmt.setInt(1, codigo);
		if (stmt.executeUpdate()>0) {
			return "Deletado com sucesso";
		}else {
			return "Disciplina não encontrada";
		}
	}
	
	public int addDisciplina(Disciplina obj) throws Exception{
		stmt = con.prepareStatement
				("insert into t_sd_disciplina (cd_disciplina, nm_disciplina, ds_disciplina, dt_inicio, dt_termino, st_status)"
						+ " VALUES (?, ?, ?, ?, ?, ?)");
		stmt.setInt(1, obj.getCodigo());
		stmt.setString(2, obj.getNome());
		stmt.setString(3, obj.getDescricao());
		stmt.setDate(4, (Date) obj.getInicio());
		stmt.setDate(5, (Date)obj.getTermino());
		stmt.setString(6, obj.getStatus());
		return stmt.executeUpdate();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	

}


