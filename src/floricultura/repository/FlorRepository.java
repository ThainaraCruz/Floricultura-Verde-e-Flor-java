package floricultura.repository;

import floricultura.model.Flor;
import floricultura.model.Item;
import floricultura.model.Produto;

public interface FlorRepository {
	public void cadastrarFlor (Flor mflor);
	public void cadastrarProduto(Produto mproduto);
	public void exibirItens();
	public void buscarItemPorNome(String nome);
	public void atualizarItem(Item cItem);
	public void deletarItem(String nome);
	
}
