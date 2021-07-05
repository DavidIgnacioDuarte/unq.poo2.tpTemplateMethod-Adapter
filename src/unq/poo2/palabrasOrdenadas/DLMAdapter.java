package unq.poo2.palabrasOrdenadas;

import javax.swing.DefaultListModel;

public class DLMAdapter extends DefaultListModel {
	
	ListaDePalabrasOrdenadas listaOrdenada;
	
	public DLMAdapter() {
		this.listaOrdenada = new ListaDePalabrasOrdenadas(); 
	}
	
	@Override
	public void addElement(Object e) {
		listaOrdenada.agregarPalabra((String) e);
	}

	@Override
	public Object getElementAt(int i) {
		return listaOrdenada.getPalabraDePosicion(i);
	}

	@Override
	public int getSize() {
		return listaOrdenada.cantidadDePalabras();
	}

	
}
 