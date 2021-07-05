package unq.poo2.wikipedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	
	final public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		paginasSimilares.addAll(this.getLetraInicial(page, wikipedia));
		paginasSimilares.addAll(this.getPropiedadEnComun(page, wikipedia));
		paginasSimilares.addAll(this.getLinkEnComun(page, wikipedia));
		return paginasSimilares;
	}

	
	//HOOKS METHODS
	List<WikipediaPage> getLetraInicial(WikipediaPage page, List<WikipediaPage> wikipedia){
		return new ArrayList<WikipediaPage>();
	}


	List<WikipediaPage> getLinkEnComun(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return new ArrayList<WikipediaPage>();
	}

	List<WikipediaPage> getPropiedadEnComun(WikipediaPage page, List<WikipediaPage> wikipedia){
		return new ArrayList<WikipediaPage>();
	} 

}

