package unq.poo2.wikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PropiedadEnComun extends Filtro {

	
	@Override
	List<WikipediaPage> getPropiedadEnComun(WikipediaPage page, List<WikipediaPage> wikipedia){
		List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();
		for (WikipediaPage p : wikipedia) {
			if(this.tienenInfoboxEnComun(page, p)) {
				paginas.add(p);
			}
		}
		return paginas;
	} 

	
	private boolean tienenInfoboxEnComun(WikipediaPage page1, WikipediaPage page2) {
		Set<String> keys =  page1.getInfobox().keySet();
		for(String k : keys) {
			if (page2.getInfobox().containsKey(k)) {
				return true;
			}
		}
		return false;
	}

}
