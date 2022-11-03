package lexer;

/*
 * O pacote lexer é uma extenção do código para o analisador léxico. 
 * 
 */
public class Tag {
	/*
	 * já a classe Tag define constates para os tokens 
	 */
	
	public final static int 
		
	/*
	 * Porém 3 das constantes , INDEX, MINUS e TEMP, não são tokens lexicos; e sim serão usadas 
	 * nas árvores sintaticas. 
	 */
		AND = 256, BASIC = 257, BREAK = 258, DO = 259, ELSE =260,
		EQ = 261, FALSE = 262, GE =263, ID =264, IF = 265, 
		INDEX = 266, LE = 267, MINUS =268, NE = 269, NUM = 270, 
		OR = 271, REAL = 272, TEMP = 273, TRUE = 274, WHILE = 275;
	
}