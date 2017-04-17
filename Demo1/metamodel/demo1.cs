SYNTAXDEF mcda
FOR <http://swen424/demo1>
START Task

OPTIONS {
	generateCodeFromGeneratorModel = "true";
	usePredefinedTokens = "false";
	defaultTokenName = "IDENTIFIER";
}


TOKENS {
	DEFINE IDENTIFIER $('A'..'Z' | 'a'..'z' | '-'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
}


RULES {
	Task ::= "Task" "{" (haveOperation | defineType | haveOption | "name" ":" name['"','"'] ";" | "description" ":" description['"','"'] ";")* "}";
	Filter ::= "Filter" "(" criteriaName['"','"'] "," op['"','"'] "," target['"','"'] ")" ";";
	Analyze ::= "Analyze" "(" (method['"','"'])* ")" ";";
	Evaluate ::= "Evaluate" "(" "criteriaName" ":" criteriaName['"','"'] ";" (contain)* ")" ";";
	File ::= "File" "(" URL['"','"'] ")" ";";
	OptionType ::= "OptionType" "(" "name" ":" name['"','"'] ";" (defineCriteria)* compareWeight ")" ";";
	option ::= "Option" "(" "name" ":" name['"','"'] ";" attribute['"','"'] ("," attribute['"','"'])* (";" "description" ":" description['"','"'])* ";" ")" ";";
	ComparisonMatrix ::= "ComparisonMatrix" "(" (makeupof)* ")" ";";
	EvaluatePair ::= "EvaluatePair" "(" name['"','"'] "," value['"','"'] ")" ";";
	Criteria ::= "Criteria" "(" name['"','"'] ")" ";";
	ComparisonPair ::= "ComparisonPair" "("  Criteria1['"','"'] "," Criteria2['"','"'] "," value['"','"'] ")" ";";
}