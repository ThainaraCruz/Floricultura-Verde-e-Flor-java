package floricultura.controller;

import floricultura.model.Flor;
import floricultura.model.Item;
import floricultura.model.Produto;
import floricultura.repository.FlorRepository;
import java.util.List;
import java.util.ArrayList;

public class FlorController implements FlorRepository {
	    private List<Item> itens;
	
	    public FlorController() {
	        this.itens = new ArrayList<>();
	    }

		@Override
		public void cadastrarFlor(Flor mflor) {
			Item flor = new Flor(mflor.getNome(),mflor.getPreco(), mflor.getDescricao());
	        itens.add(flor);
	        System.out.println("Flor " + mflor.getNome() + " cadastrada com sucesso.");			
		}

		@Override
		public void cadastrarProduto(Produto mproduto) {
		     Item produto = new Produto(mproduto.getNome(), mproduto.getPreco(), mproduto.getDescricao());
		        itens.add(produto);
		        System.out.println("Produto " + mproduto.getNome() + " cadastrado com sucesso.");
		    }					

		@Override
		public void exibirItens() {
			System.out.println("Itens disponíveis:");
	        for (Item item : itens) {
	            item.visualizar();
	            System.out.println("---------------");
	        }
	    }					

		@Override
		public void buscarItemPorNome(String nome) {
			for (Item itemBusca : itens) {
	            if (itemBusca.getNome().equalsIgnoreCase(nome)) {
	                itemBusca.visualizar();
	                return;
	            }
	        }
	        System.out.println("Item não encontrado.");			
		}
		
		@Override
		public void atualizarItem(Item cItem) {
			for (Item itemBusca : itens) {
				System.out.println(itemBusca.getNome());
	            if (itemBusca.getNome().equals(cItem.getNome())) {
	            	System.out.println("*********Caiu na controller");
	                itemBusca.setPreco(cItem.getPreco());
	                System.out.println("Item " + cItem.getNome() + " atualizado com sucesso.");
	                return;
	            }
	        }
	        System.out.println("Item não encontrado para atualização.");	       			
		}

		@Override
		public void deletarItem(String nome) {
			
			for (Item item : itens) {
	            if (item.getNome().equalsIgnoreCase(nome)) {
	                itens.remove(item);
	                System.out.println("Item " + nome + " deletado com sucesso.");
	                return;
	            }
	        }
	        System.out.println("Item não encontrado para deletar.");
	 
	    }
	}
	
	    	
