package floricultura.model;

public class Flor extends Item {
	private String descricao;
	
	
	public Flor(String nome, double preco, String descricao) {
		super(nome, preco);
		this.descricao = descricao;
		
	}
	

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void visualizar() {
		System.out.println("Flor: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Descrição: " + descricao);
    		
	}

}
