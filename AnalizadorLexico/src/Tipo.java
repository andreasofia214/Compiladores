
public enum Tipo {
	ENTERO("[0-9]$"),
    IDENTIFICADOR("_[A-Za-z|0-9]+$"),
    OPERADOR_NUMERICO("[+|-|*|^|/|%]$"),
    OPERADOR_LOGICO("[!|&|&&|(||)|(|)]$"),
    //OPERADOR_AUMENTATIVO("(++|--)$"),
    OPERADOR_COMPARATIVO("[>|<|<=|>=|!=|==]$"),
    TERMINADOR("[;]$"),
    ASIGNACION("[=]$"),
    RESERVADAS("[abs|brk|cs|char|cls|do|else|extends|for|if|str|implements|import|" + "interface|swt|this|try|wl|yes|no|nl|main|bt|st|int|ft|dou]$"),
    AGRUPADORES("[(|)|{|}|[|]]$"),
    COMENTARIOS("/*[A-Za-z|0-9]*/$"),
    BLANCOS("[\n|\t| ]$");
    

    public final String patron;

    Tipo(String s) {
        this.patron = s;

    }
}
