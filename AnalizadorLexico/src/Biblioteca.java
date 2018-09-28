
public class Biblioteca {
	
	PALABRAS_RESERVADAS("abs|brk|cs|char|cls|do|else|extends|for|if|str|implements|import|interface|swt|this|try|wl|yes|no|nl|main|bt|st|int|fl|dou"),
	ENTEROS("[0-9]"),
	OP_NUMERICO("+|-|*|^|/|%"),
	OP_AUMENTATIVO("++|--"),
	OP_LOGICOS("!|&|&&|(||)|(|)"),
	OP_COMPARATIVO(">|<|<=|>=|!=|=="),
	TERMINADOR(";"),
	ASIGNACION("="),
	AGRUPADOREs("(|)|{|}|[|]"),
	BLANCOS("\n|\t| |");
	
}
