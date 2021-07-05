package unq.poo2.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class WikipediaTest {

	
	MismaLetraInicial mli;
	LinkEnComun lec;
	PropiedadEnComun pec;
	
	
	@BeforeEach
	void setup() {
		
		mli = new MismaLetraInicial();
		lec = new LinkEnComun();
		pec = new PropiedadEnComun();
		
	}
	
	
	
	@Test
	void testConMismaLetraInicial() {
		
		WikipediaPage page1 = mock(WikipediaPage.class);
		WikipediaPage page2 = mock(WikipediaPage.class);
		WikipediaPage page3 = mock(WikipediaPage.class);
		WikipediaPage page4 = mock(WikipediaPage.class);

		
		when(page1.getTitle()).thenReturn("Bartender");
		when(page2.getTitle()).thenReturn("Bares");
		when(page3.getTitle()).thenReturn("Restaurant");
		when(page4.getTitle()).thenReturn("Bart");
		
		
		List<WikipediaPage> paginas = mli.getSimilarPages(page1, Arrays.asList(page2,page3,page4));
		
		assertEquals(Arrays.asList(page2,page4), paginas);
		
	}

	
	
	@Test
	void testConLinkEnComun() {
		
		WikipediaPage page1 = mock(WikipediaPage.class);
		WikipediaPage page2 = mock(WikipediaPage.class);
		WikipediaPage page3 = mock(WikipediaPage.class);
		WikipediaPage page4 = mock(WikipediaPage.class);
		WikipediaPage page5 = mock(WikipediaPage.class);
		WikipediaPage page6 = mock(WikipediaPage.class);
		WikipediaPage page7 = mock(WikipediaPage.class);
		
		
		when(page1.getTitle()).thenReturn("Bares");
		when(page2.getTitle()).thenReturn("Restaurant");
		when(page3.getTitle()).thenReturn("Bartender");
		when(page4.getTitle()).thenReturn("Barcos");
		when(page5.getTitle()).thenReturn("Cerveza");
		when(page6.getTitle()).thenReturn("Programación");
		when(page7.getTitle()).thenReturn("Partidos");
		
		
		when(page1.getLinks()).thenReturn(Arrays.asList(page2));
		when(page2.getLinks()).thenReturn(Arrays.asList(page1,page5));
		when(page3.getLinks()).thenReturn(Arrays.asList(page7));
		when(page4.getLinks()).thenReturn(Arrays.asList());
		when(page5.getLinks()).thenReturn(Arrays.asList(page2));
		when(page6.getLinks()).thenReturn(Arrays.asList(page3));
		
		
		List<WikipediaPage> retorno = lec.getSimilarPages(page1, Arrays.asList(page2,page3,page4,page5,page6,page7));
		
		assertEquals(Arrays.asList(page5), retorno);
		
		
	}

	@Test
	void testConPropiedadEnComun() {
		
		WikipediaPage page1 = mock(WikipediaPage.class);
		WikipediaPage page2 = mock(WikipediaPage.class);
		WikipediaPage page3 = mock(WikipediaPage.class);
		WikipediaPage page4 = mock(WikipediaPage.class);
		WikipediaPage page5 = mock(WikipediaPage.class);
		WikipediaPage page6 = mock(WikipediaPage.class);
		WikipediaPage page7 = mock(WikipediaPage.class);
		
		
		Map<String, WikipediaPage> m1 = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> m2 = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> m3 = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> m4 = new HashMap<String, WikipediaPage>();
		
		
		m1.put("birth_place", page5);
		m1.put("year", page6);
		m2.put("birth_place", page5);
		m3.put("city", page7);
		m3.put("height", page6);
		
		
		when(page1.getInfobox()).thenReturn(m1);
		when(page2.getInfobox()).thenReturn(m2);
		when(page3.getInfobox()).thenReturn(m3);
		when(page4.getInfobox()).thenReturn(m4);
		
		
		List<WikipediaPage> retorno = pec.getSimilarPages(page1, Arrays.asList(page2,page3,page4));
		
		assertEquals(Arrays.asList(page2), retorno);
	
	}

}
