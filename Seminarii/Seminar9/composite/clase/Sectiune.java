package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item{
	private String nume;
	private List<Item> listaOptiuni;
	
	public Sectiune(String nume) {
		super();
		this.nume = nume;
		this.listaOptiuni = new ArrayList<Item>();
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		listaOptiuni.add(item);
		
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		listaOptiuni.remove(item);
		
	}

	@Override
	public void descriere(String spatiere) {
		System.out.println(spatiere + this.nume);
		for(Item item:listaOptiuni) {
			item.descriere(spatiere  + "   ");
		}
		
	}

	@Override
	public Item getItem(int index) throws Exception {
		return listaOptiuni.get(index);
	}
	
	
}