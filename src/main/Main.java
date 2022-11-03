package main;

import java.io.*;
import java.lexer.*;
import parser.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.println('\n');
	}
	
}
