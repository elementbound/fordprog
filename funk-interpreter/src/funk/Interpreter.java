package funk;

public class Interpreter {
	//V�ltoz�k
	//F�ggv�nyek
	
	public void execute(String code) {
		//Stringb�l f�t �p�teni
		
		//Minden csom�pontot ki�rt�kelni:
			//eval(node)
	}
	
	private Object eval(/* ParserTree node */) {
		//Kider�teni hogy milyen szab�lyb�l j�tt: 
		//Ha id: 
			//Megkeresni a v�ltoz�k k�zt az ID nev�t �s visszaadni
		
		//Ha literal: 
			//Megn�zni hogy milyen t�pus� �s visszaadni a megfelel� funk.Object-et
		
		//Ha memberCall: 
			//Kikeresni a f�ggv�nyek k�zt a megfelel� f�ggv�nyt
			//Kim�solni az arg-okat
			//Ki�rt�kelni az arg-okat �s az �gy kapott funk.Object-eket list�ba tenni
			//�tadni a list�t a kikeresett f�ggv�nynek �s visszaadni amit ad
		
		//Ha expr '+' expr: 
			//Kiszedni a k�t expr-t
			//Mindkett�t ki�rt�kelni
			//A k�t kapott Object-et �sszeadni Object.add-al
			//A kapott Object-et visszaadni
		
		//Ha ID '=' expr: 
			//Ki�rt�kelni expr-t
			//A kapott Object-et eltenni ID nev� v�ltoz�k�nt
			//A kapott Object-et visszaadni

		return new Object();
	}
}

class Utils {
	//Ide mehetnek majd az olyan utility f�ggv�nyek mint amik m�ltkor t�rt�ntek
	//Pl. extractNodes, extractTokens, ilyesmik
}