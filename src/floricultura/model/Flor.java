package floricultura.model;

public class Flor extends Item {
	private String descricao;
	private int estoque;
	
	public Flor(String nome, double preco, String descricao, int estoque) {
		super(nome, preco);
		this.descricao = descricao;
		this.estoque = estoque;
		
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public void visualizar() {
		System.out.println("Flor: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Descrição: " + descricao);
        System.out.println("Estoque disponível: " + estoque);
    		
	}

}
