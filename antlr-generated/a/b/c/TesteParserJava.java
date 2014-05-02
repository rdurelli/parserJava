package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class TesteParserJava {

	public static void main(String[] args) {
		CharStream stream = new ANTLRStringStream("package a.b.c;import org.antlr.runtime.ANTLRStringStream;import org.antlr.runtimeCharStream; public class TesteParserJava { private String nameDurelli; public static void main ( String[] args) {} }");
		
		JavaLexer lexer = new JavaLexer(stream);

		TokenStream tokenStream = new CommonTokenStream(lexer);

		JavaParser parser = new JavaParser(tokenStream);
		
		
		try {
			parser.compilationUnit();
//			parser.packageDeclaration();
//			parser.importDeclaration();
//			parser.typeDeclaration();
//			parser.classDeclaration();
			System.out.println("AQUI");
			parser.fieldDeclaration();
			parser.memberDeclaration();
//			System.out.println(parser.getNames());
			
			
//			System.out.println(parser.getImports());
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
