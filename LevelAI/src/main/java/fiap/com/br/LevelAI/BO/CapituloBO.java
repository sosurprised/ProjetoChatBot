package fiap.com.br.LevelAI.BO;

public class CapituloBO {

}



/*
public String novoProduto(Produto pProduto) throws Exception{
	pProduto.setDescricao(pProduto.getDescricao().toUpperCase());
	if(pProduto.getDescricao().length()<3||pProduto.getDescricao().length()>10) {
		return"Descri��o como caracteres invalidos";
	}
	if(pProduto.getValor()<=0) {
		return "Pre�o invalido!!!";
	}
	if(pProduto.getFabricante().getCodigo()<=0) {
		return "Codigo do fabricante invalido";
	}
	if(pProduto.getCodigo()<=0) {
		return "Codigo do produto invalido";
	}
	ProdutoDAO dao = new ProdutoDAO();
	Produto p = dao.getProduto(pProduto.getCodigo());
	
	if(pProduto.getCodigo()!=0) {
		return"C�digo ja existe";
	}
	if(p.getFabricante().getCodigo()==0) {
		return "Fabricante n�o existe!!!";
	}
	if(dao.addProduto(pProduto)==0) {
		dao.fechar();
		return"N�o cadastrou o produto";
	}else {
		dao.fechar();
		return"Ghandi fez tudo e aprovou o produto!!!Deixa o like e se inscreva no canal, n�o esque�a de acionar o sininho, tem video todo dia as 15:00 e live a meia noite ab�s.";
	}
}

}
*/