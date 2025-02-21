package floricultura.model;

public class Produto extends Item{
	private String descricao;
	
	public Produto(String nome, double preco, String descricao) {
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
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Descrição: " + descricao);
		
	}

}
