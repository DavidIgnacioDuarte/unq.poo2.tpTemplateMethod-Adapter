package unq.poo2.wikipedia;

import java.util.ArrayList;
import java.util.List;

public class MismaLetraInicial extends Filtro {

	
	@Override
	List<WikipediaPage> getLetraInicial(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();
		char letraBuscada =  page.getTitle().charAt(0);
		for (WikipediaPage p : wikipedia) {
			if (p.getTitle().charAt(0) == letraBuscada) {
				paginas.add(p);
			}
		}
		return paginas;
		
	}

}
