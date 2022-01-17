package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Estoque;

public class EstoqueDB {
	private Map<String, Estoque> estoquesDBMap = new HashMap<>();

	public Map<String, Estoque> getEstoquesDBMap() {
		return estoquesDBMap;
	}
	
	public List<Estoque> getEstoque(){
		List<Estoque> estoques = new ArrayList<>();
		for(Map.Entry<String, Estoque> estoque: estoquesDBMap.entrySet()) {
			estoques.add(estoque.getValue());
		}
		return estoques;
	}
	
	public Estoque getEstoqueById(String id) {
		return estoquesDBMap.get(id);
	}
	public void addNovoEstoque(Estoque estoque) {
		estoquesDBMap.put(estoque.getId(), estoque);
	}

}
