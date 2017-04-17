// $ANTLR 3.4

	package mcda.demo1.resource.mcda.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class McdaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int FLOAT=4;
    public static final int IDENTIFIER=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int QUOTED_34_34=8;
    public static final int SL_COMMENT=9;
    public static final int WHITESPACE=10;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public McdaLexer() {} 
    public McdaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public McdaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Mcda.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:15:7: ( '(' )
            // Mcda.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:16:7: ( ')' )
            // Mcda.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:17:7: ( ',' )
            // Mcda.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:18:7: ( ':' )
            // Mcda.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:19:7: ( ';' )
            // Mcda.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:20:7: ( 'Analyze' )
            // Mcda.g:20:9: 'Analyze'
            {
            match("Analyze"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:21:7: ( 'ComparisonMatrix' )
            // Mcda.g:21:9: 'ComparisonMatrix'
            {
            match("ComparisonMatrix"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:22:7: ( 'ComparisonPair' )
            // Mcda.g:22:9: 'ComparisonPair'
            {
            match("ComparisonPair"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:23:7: ( 'Criteria' )
            // Mcda.g:23:9: 'Criteria'
            {
            match("Criteria"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:24:7: ( 'Evaluate' )
            // Mcda.g:24:9: 'Evaluate'
            {
            match("Evaluate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:25:7: ( 'EvaluatePair' )
            // Mcda.g:25:9: 'EvaluatePair'
            {
            match("EvaluatePair"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:26:7: ( 'File' )
            // Mcda.g:26:9: 'File'
            {
            match("File"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:27:7: ( 'Filter' )
            // Mcda.g:27:9: 'Filter'
            {
            match("Filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:28:7: ( 'Option' )
            // Mcda.g:28:9: 'Option'
            {
            match("Option"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:29:7: ( 'OptionType' )
            // Mcda.g:29:9: 'OptionType'
            {
            match("OptionType"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:30:7: ( 'Task' )
            // Mcda.g:30:9: 'Task'
            {
            match("Task"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:31:7: ( 'criteriaName' )
            // Mcda.g:31:9: 'criteriaName'
            {
            match("criteriaName"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:32:7: ( 'description' )
            // Mcda.g:32:9: 'description'
            {
            match("description"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:33:7: ( 'name' )
            // Mcda.g:33:9: 'name'
            {
            match("name"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:34:7: ( '{' )
            // Mcda.g:34:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:35:7: ( '}' )
            // Mcda.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2631:11: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '-' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* ) )
            // Mcda.g:2632:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '-' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            {
            // Mcda.g:2632:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '-' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            // Mcda.g:2632:3: ( 'A' .. 'Z' | 'a' .. 'z' | '-' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Mcda.g:2632:35: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Mcda.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2635:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Mcda.g:2636:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2639:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Mcda.g:2640:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Mcda.g:2640:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Mcda.g:2640:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Mcda.g:2640:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Mcda.g:2640:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Mcda.g:2640:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Mcda.g:2640:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2643:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Mcda.g:2644:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Mcda.g:2644:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-'||(LA5_0 >= '1' && LA5_0 <= '9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='0') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Mcda.g:2644:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Mcda.g:2644:3: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Mcda.g:2644:4: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Mcda.g:2644:19: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Mcda.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Mcda.g:2644:31: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2647:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Mcda.g:2648:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Mcda.g:2648:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Mcda.g:2648:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Mcda.g:2648:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Mcda.g:2648:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Mcda.g:2648:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Mcda.g:2648:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Mcda.g:2648:21: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Mcda.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Mcda.g:2648:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            match('.'); 

            // Mcda.g:2648:44: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Mcda.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2651:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Mcda.g:2652:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Mcda.g:2652:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Mcda.g:2652:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Mcda.g:2652:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Mcda.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mcda.g:2655:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Mcda.g:2656:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Mcda.g:2656:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Mcda.g:2656:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Mcda.g:2656:3: ( '\"' )
            // Mcda.g:2656:4: '\"'
            {
            match('\"'); 

            }


            // Mcda.g:2656:8: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Mcda.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // Mcda.g:2656:17: ( '\"' )
            // Mcda.g:2656:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Mcda.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | IDENTIFIER | WHITESPACE | LINEBREAK | INTEGER | FLOAT | SL_COMMENT | QUOTED_34_34 )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // Mcda.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Mcda.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Mcda.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Mcda.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Mcda.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Mcda.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Mcda.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Mcda.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Mcda.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Mcda.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // Mcda.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // Mcda.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // Mcda.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // Mcda.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // Mcda.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // Mcda.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // Mcda.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // Mcda.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // Mcda.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // Mcda.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // Mcda.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // Mcda.g:1:136: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 23 :
                // Mcda.g:1:147: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 24 :
                // Mcda.g:1:158: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 25 :
                // Mcda.g:1:168: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 26 :
                // Mcda.g:1:176: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 27 :
                // Mcda.g:1:182: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 28 :
                // Mcda.g:1:193: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\6\uffff\11\24\2\uffff\1\24\3\uffff\2\46\2\uffff\14\24\1\46\2\uffff"+
        "\17\24\1\102\2\24\1\105\2\24\1\110\4\24\1\uffff\2\24\1\uffff\2\24"+
        "\1\uffff\4\24\1\125\1\127\2\24\1\132\3\24\1\uffff\1\24\1\uffff\2"+
        "\24\1\uffff\1\24\1\142\1\144\4\24\1\uffff\1\24\1\uffff\5\24\1\160"+
        "\5\24\1\uffff\1\24\1\167\2\24\1\172\1\173\1\uffff\2\24\2\uffff\1"+
        "\24\1\177\1\24\1\uffff\1\u0081\1\uffff";
    static final String DFA12_eofS =
        "\u0082\uffff";
    static final String DFA12_minS =
        "\1\11\5\uffff\1\156\1\157\1\166\1\151\1\160\1\141\1\162\1\145\1"+
        "\141\2\uffff\1\60\3\uffff\2\56\2\uffff\1\141\1\155\1\151\1\141\1"+
        "\154\1\164\1\163\1\151\1\163\1\155\3\56\2\uffff\1\154\1\160\1\164"+
        "\1\154\1\145\1\151\1\153\1\164\1\143\1\145\1\56\1\171\1\141\1\145"+
        "\1\165\1\55\1\145\1\157\1\55\1\145\1\162\1\55\1\172\2\162\1\141"+
        "\1\uffff\1\162\1\156\1\uffff\1\162\1\151\1\uffff\1\145\2\151\1\164"+
        "\2\55\1\151\1\160\1\55\1\163\1\141\1\145\1\uffff\1\171\1\uffff\1"+
        "\141\1\164\1\uffff\1\157\2\55\1\160\1\116\1\151\1\156\1\uffff\1"+
        "\141\1\uffff\1\145\1\141\1\157\1\115\1\151\1\55\1\155\1\156\2\141"+
        "\1\162\1\uffff\1\145\1\55\1\164\1\151\2\55\1\uffff\2\162\2\uffff"+
        "\1\151\1\55\1\170\1\uffff\1\55\1\uffff";
    static final String DFA12_maxS =
        "\1\175\5\uffff\1\156\1\162\1\166\1\151\1\160\1\141\1\162\1\145\1"+
        "\141\2\uffff\1\71\3\uffff\1\71\1\56\2\uffff\1\141\1\155\1\151\1"+
        "\141\1\154\1\164\1\163\1\151\1\163\1\155\1\71\1\56\1\71\2\uffff"+
        "\1\154\1\160\1\164\1\154\1\164\1\151\1\153\1\164\1\143\1\145\1\71"+
        "\1\171\1\141\1\145\1\165\1\172\1\145\1\157\1\172\1\145\1\162\2\172"+
        "\2\162\1\141\1\uffff\1\162\1\156\1\uffff\1\162\1\151\1\uffff\1\145"+
        "\2\151\1\164\2\172\1\151\1\160\1\172\1\163\1\141\1\145\1\uffff\1"+
        "\171\1\uffff\1\141\1\164\1\uffff\1\157\2\172\1\160\1\116\1\151\1"+
        "\156\1\uffff\1\141\1\uffff\1\145\1\141\1\157\1\120\1\151\1\172\1"+
        "\155\1\156\2\141\1\162\1\uffff\1\145\1\172\1\164\1\151\2\172\1\uffff"+
        "\2\162\2\uffff\1\151\1\172\1\170\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff\1\24\1\25\1\uffff\1\27\1\30"+
        "\1\26\2\uffff\1\33\1\34\15\uffff\1\31\1\32\32\uffff\1\14\2\uffff"+
        "\1\20\2\uffff\1\23\14\uffff\1\15\1\uffff\1\16\2\uffff\1\6\7\uffff"+
        "\1\11\1\uffff\1\12\13\uffff\1\17\6\uffff\1\22\2\uffff\1\13\1\21"+
        "\3\uffff\1\10\1\uffff\1\7";
    static final String DFA12_specialS =
        "\u0082\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\22\1\23\1\uffff\1\22\1\23\22\uffff\1\22\1\uffff\1\30\5\uffff"+
            "\1\1\1\2\2\uffff\1\3\1\21\1\uffff\1\27\1\26\11\25\1\4\1\5\5"+
            "\uffff\1\6\1\24\1\7\1\24\1\10\1\11\10\24\1\12\4\24\1\13\6\24"+
            "\4\uffff\1\24\1\uffff\2\24\1\14\1\15\11\24\1\16\14\24\1\17\1"+
            "\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32\2\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "\1\44\11\43",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\47\1\uffff\12\62",
            "\1\47",
            "\1\47\1\uffff\12\45",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\16\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\47\1\uffff\12\62",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\103",
            "\1\104",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\106",
            "\1\107",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\24\2\uffff\12\24\7\uffff\23\24\1\126\6\24\4\uffff\1\24\1"+
            "\uffff\32\24",
            "\1\130",
            "\1\131",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\24\2\uffff\12\24\7\uffff\17\24\1\143\12\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\2\uffff\1\156",
            "\1\157",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\170",
            "\1\171",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\174",
            "\1\175",
            "",
            "",
            "\1\176",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0080",
            "",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | IDENTIFIER | WHITESPACE | LINEBREAK | INTEGER | FLOAT | SL_COMMENT | QUOTED_34_34 );";
        }
    }
 

}