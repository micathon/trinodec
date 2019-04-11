package iconst;

public enum KeywordTyp {
	NULL, ZPAREN, DO, IMPORT, FROM, ALL, AS, 
	CLASS, ICLASS, ABCLASS, SCOOL, ISCOOL, 
	DEFUN, IDEFUN, ABDEFUN, GDEFUN, DEFIMP, VAR, IVAR, ENUM, IENUM,
	DOES, CONST, DECOR, RETURN, RAISE, CALL, UNTUP, SLICE,
	IF, ELSE, WHILE, FOR, IN, TRY, EXCEPT, EOTRY, UNTIL,
	BREAK, CONTINUE, DEL, QUOTE, IS, TUPLE, JIST, BITARRAY,
	DICT, CAST, PRINT, ECHO, LAMBDA, TRUE, FALSE,
	DOT, SET, ADDSET, MINUSSET, MPYSET, DIVSET, IDIVSET, MODSET, 
	SHLSET, SHRSET, SHRUSET, ANDBSET, XORBSET, ORBSET,
	ANDSET, XORSET, ORSET, QUEST, MINUS, NOTBITZ, NOT,
	DIV, IDIV, MOD, MPY, ADD, 
	GE, LE, GT, LT, EQ, NE, SHL, SHR, SHRU, 
	ANDBITZ, XORBITZ, ORBITZ, AND, XOR, OR, 
	STRDO, STRCAT, STAR, DBLSTAR;
	
	public static final KeywordTyp values[] = values();
}
