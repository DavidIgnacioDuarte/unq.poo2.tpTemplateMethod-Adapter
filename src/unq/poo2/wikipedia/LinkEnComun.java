package unq.poo2.wikipedia;

import java.util.ArrayList;
import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	List<WikipediaPage> getLinkEnComun(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();
		for(WikipediaPage p : wikipedia){
			if(this.tienenLinksEnComun(page, p)) {
				paginas.add(p);
			}
		}
		return paginas;
		
	}
	
	
	private boolean tienenLinksEnComun(WikipediaPage page1, WikipediaPage page2) {
		for (WikipediaPage p : page1.getLinks()) {
			if(page2.getLinks().indexOf(p) != -1) {
				return true;
			}
		}
		return false;
	}
	
}
