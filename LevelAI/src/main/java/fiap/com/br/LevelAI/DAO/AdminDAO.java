package fiap.com.br.LevelAI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fiap.com.br.LevelAI.beans.Admin;
import fiap.com.br.LevelAI.conexao.Conexao;

public class AdminDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AdminDAO() throws Exception{
		con = Conexao.getConectar();
	}
	
	public Admin getAdmin(int codigo) throws Exception{
		stmt = con.prepareStatement
		("select * from t_sd_admin where cd_admin=?");
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Admin(
					rs.getInt("cd_admin"),
					rs.getString("nm_admin"),
					rs.getString("ds_email"),
					rs.getString("ds_senha")
					);
		}else {
			return new Admin();
		}
	}
	
	public String apagarAdmin(int codigo) throws Exception{
		stmt = con.prepareStatement
		("delete from t_sd_admin where cd_admin=?");
		stmt.setInt(1, codigo);
		if (stmt.executeUpdate()>0) {
			return "Deletado com sucesso";
		}else {
			return "Admin não encontrado";
		}
	}
	
	public int addAdmin(Admin obj) throws Exception{
		stmt = con.prepareStatement
				("insert into t_sd_admin (cd_admin, nm_admin, ds_email, ds_senha)"
						+ " VALUES (?, ?, ?, ?)");
		stmt.setInt(1, obj.getCodigo());
		stmt.setString(2, obj.getNome());
		stmt.setString(3, obj.getEmail());
		stmt.setString(3, obj.getSenha());
		return stmt.executeUpdate();
	}

	public void fechar() throws Exception {
		con.close();
	}
	
}

