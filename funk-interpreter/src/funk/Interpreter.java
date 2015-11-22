package funk;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import funk.antlr.funkLexer;
import funk.antlr.funkParser;
import funk.antlr.funkParser.AssignContext;
import funk.antlr.funkParser.IdContext;
import funk.antlr.funkParser.LiteralContext;
import funk.antlr.funkParser.MemberCallContext;
import jdk.nashorn.internal.ir.Assignment;

public class Interpreter {
	//V�ltoz�k
	//F�ggv�nyek
	
	public void execute(String code) {
		//Stringb�l f�t �p�teni
		CharStream stream = new ANTLRInputStream(code);
		funkLexer lexer = new funkLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		funkParser parser = new funkParser(tokens);
		
		//Minden csom�pontot ki�rt�kelni:
		try{
			while(true) 
				eval(parser.statement());
		}
		catch(RecognitionException re) {
			//Silently stop
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	private Object eval(ParseTree node) {
		//Kider�teni hogy milyen szab�lyb�l j�tt: 
		//Ha id: 
		if(node instanceof IdContext) {
			//Megkeresni a v�ltoz�k k�zt az ID nev�t �s visszaadni
		}
		//Ha literal: 
		else if(node instanceof LiteralContext) {
			//Megn�zni hogy milyen t�pus� �s visszaadni a megfelel� funk.Object-et
		}
		//Ha memberCall: 
		else if(node instanceof MemberCallContext) {
			//Kikeresni a f�ggv�nyek k�zt a megfelel� f�ggv�nyt
			//Kim�solni az arg-okat
			//Ki�rt�kelni az arg-okat �s az �gy kapott funk.Object-eket list�ba tenni
			//�tadni a list�t a kikeresett f�ggv�nynek �s visszaadni amit ad
		}
		//Ha ID '=' expr: 
		else if(node instanceof AssignContext) {
			//Ki�rt�kelni expr-t
			//A kapott Object-et eltenni ID nev� v�ltoz�k�nt
			//A kapott Object-et visszaadni
		}
		else {
		//Ha expr '+' expr: 
			//Kiszedni a k�t expr-t
			//Mindkett�t ki�rt�kelni
			//A k�t kapott Object-et �sszeadni Object.add-al
			//A kapott Object-et visszaadni
		}

		return new Object();
	}
}

class Utils {
	//Ide mehetnek majd az olyan utility f�ggv�nyek mint amik m�ltkor t�rt�ntek
	//Pl. extractNodes, extractTokens, ilyesmik
	
	public static int classifyNode(ParseTree node) {
		ParserRuleContext ctx = (ParserRuleContext)node.getPayload();

		return 0;
	}
	
	public static List<ParseTree> extractNodes(ParseTree node) {
		List<ParseTree> ret = new ArrayList<>();
		
		for(int i = 0; i < node.getChildCount(); i++)
		{
			ParseTree c = node.getChild(i);
			if(c.getPayload() instanceof ParserRuleContext)
				ret.add(c);
		}
		
		return ret; 
	}
	
	public static List<Token> extractTokens(ParseTree node) {
		List<Token> ret = new ArrayList<Token>();
		
		for(int i = 0; i < node.getChildCount(); i++)
		{
			ParseTree c = node.getChild(i);
			if(c.getPayload() instanceof Token)
				ret.add((Token)c.getPayload());
		}
		
		return ret; 
	}
}