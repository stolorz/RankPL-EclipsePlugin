package pl.stolorz.dsl.rankpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRankPLLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_HASH_COMMENT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRankPLLexer() {;} 
    public InternalRankPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRankPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRankPL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:11:7: ( ':=' )
            // InternalRankPL.g:11:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:12:7: ( ';' )
            // InternalRankPL.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:13:7: ( '+' )
            // InternalRankPL.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:14:7: ( '-' )
            // InternalRankPL.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:15:7: ( '*' )
            // InternalRankPL.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:16:7: ( '/' )
            // InternalRankPL.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:17:7: ( '(' )
            // InternalRankPL.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:18:7: ( ')' )
            // InternalRankPL.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:19:7: ( ',' )
            // InternalRankPL.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:555:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // InternalRankPL.g:555:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // InternalRankPL.g:555:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRankPL.g:555:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRankPL.g:555:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRankPL.g:555:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalRankPL.g:555:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRankPL.g:555:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:557:10: ( 'this one has been deactivated' )
            // InternalRankPL.g:557:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_HASH_COMMENT"
    public final void mRULE_HASH_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_HASH_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:559:19: ( ( '#' ( ( '\\r' )? '\\n' )? | '#' (~ ( ( '#' | '\\n' | '\\r' ) ) )+ ( ( '\\r' )? '\\n' )? | '#' '#' '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // InternalRankPL.g:559:21: ( '#' ( ( '\\r' )? '\\n' )? | '#' (~ ( ( '#' | '\\n' | '\\r' ) ) )+ ( ( '\\r' )? '\\n' )? | '#' '#' '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            // InternalRankPL.g:559:21: ( '#' ( ( '\\r' )? '\\n' )? | '#' (~ ( ( '#' | '\\n' | '\\r' ) ) )+ ( ( '\\r' )? '\\n' )? | '#' '#' '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='#') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='#') ) {
                    alt12=3;
                }
                else if ( ((LA12_1>='\u0000' && LA12_1<='\t')||(LA12_1>='\u000B' && LA12_1<='\f')||(LA12_1>='\u000E' && LA12_1<='\"')||(LA12_1>='$' && LA12_1<='\uFFFF')) ) {
                    alt12=2;
                }
                else {
                    alt12=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRankPL.g:559:22: '#' ( ( '\\r' )? '\\n' )?
                    {
                    match('#'); 
                    // InternalRankPL.g:559:26: ( ( '\\r' )? '\\n' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRankPL.g:559:27: ( '\\r' )? '\\n'
                            {
                            // InternalRankPL.g:559:27: ( '\\r' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='\r') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalRankPL.g:559:27: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }

                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRankPL.g:559:40: '#' (~ ( ( '#' | '\\n' | '\\r' ) ) )+ ( ( '\\r' )? '\\n' )?
                    {
                    match('#'); 
                    // InternalRankPL.g:559:44: (~ ( ( '#' | '\\n' | '\\r' ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\"')||(LA6_0>='$' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRankPL.g:559:44: ~ ( ( '#' | '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // InternalRankPL.g:559:64: ( ( '\\r' )? '\\n' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRankPL.g:559:65: ( '\\r' )? '\\n'
                            {
                            // InternalRankPL.g:559:65: ( '\\r' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='\r') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalRankPL.g:559:65: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }

                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalRankPL.g:559:78: '#' '#' '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
                    {
                    match('#'); 
                    match('#'); 
                    match('#'); 
                    // InternalRankPL.g:559:90: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRankPL.g:559:90: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalRankPL.g:559:106: ( ( '\\r' )? '\\n' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRankPL.g:559:107: ( '\\r' )? '\\n'
                            {
                            // InternalRankPL.g:559:107: ( '\\r' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='\r') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalRankPL.g:559:107: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }

                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:561:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRankPL.g:561:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRankPL.g:561:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRankPL.g:561:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRankPL.g:561:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRankPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:563:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRankPL.g:563:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRankPL.g:563:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRankPL.g:563:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRankPL.g:563:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRankPL.g:563:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRankPL.g:563:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRankPL.g:563:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRankPL.g:563:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRankPL.g:563:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRankPL.g:563:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:565:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRankPL.g:565:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRankPL.g:565:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRankPL.g:565:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:567:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRankPL.g:567:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRankPL.g:567:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRankPL.g:567:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalRankPL.g:567:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRankPL.g:567:41: ( '\\r' )? '\\n'
                    {
                    // InternalRankPL.g:567:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalRankPL.g:567:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:569:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRankPL.g:569:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRankPL.g:569:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRankPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRankPL.g:571:16: ( . )
            // InternalRankPL.g:571:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRankPL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_NUMBER | RULE_INT | RULE_HASH_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=18;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalRankPL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalRankPL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalRankPL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalRankPL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalRankPL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalRankPL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalRankPL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalRankPL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalRankPL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalRankPL.g:1:64: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // InternalRankPL.g:1:76: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalRankPL.g:1:85: RULE_HASH_COMMENT
                {
                mRULE_HASH_COMMENT(); 

                }
                break;
            case 13 :
                // InternalRankPL.g:1:103: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalRankPL.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalRankPL.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalRankPL.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalRankPL.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalRankPL.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\14\1\24\4\uffff\1\34\4\uffff\1\24\1\uffff\1\41\1\uffff\1\24\1\uffff\2\24\15\uffff\1\41\4\uffff\2\41\1\uffff";
    static final String DFA23_eofS =
        "\50\uffff";
    static final String DFA23_minS =
        "\1\0\1\75\4\uffff\1\52\4\uffff\1\60\1\uffff\1\150\1\uffff\1\101\1\uffff\2\0\15\uffff\1\151\4\uffff\1\163\1\40\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\75\4\uffff\1\57\4\uffff\1\71\1\uffff\1\150\1\uffff\1\172\1\uffff\2\uffff\15\uffff\1\151\4\uffff\1\163\1\40\1\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\uffff\1\12\1\uffff\1\14\1\uffff\1\15\2\uffff\1\21\1\22\1\1\1\2\1\3\1\4\1\5\1\17\1\20\1\6\1\7\1\10\1\11\1\uffff\1\15\1\14\1\16\1\21\2\uffff\1\13";
    static final String DFA23_specialS =
        "\1\0\20\uffff\1\2\1\1\25\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\21\1\16\3\24\1\22\1\7\1\10\1\5\1\3\1\11\1\4\1\13\1\6\12\12\1\1\1\2\5\24\32\20\3\24\1\17\1\20\1\24\23\20\1\15\6\20\uff85\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "",
            "",
            "\12\14",
            "",
            "\1\40",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\43",
            "\0\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_NUMBER | RULE_INT | RULE_HASH_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0==':') ) {s = 1;}

                        else if ( (LA23_0==';') ) {s = 2;}

                        else if ( (LA23_0=='+') ) {s = 3;}

                        else if ( (LA23_0=='-') ) {s = 4;}

                        else if ( (LA23_0=='*') ) {s = 5;}

                        else if ( (LA23_0=='/') ) {s = 6;}

                        else if ( (LA23_0=='(') ) {s = 7;}

                        else if ( (LA23_0==')') ) {s = 8;}

                        else if ( (LA23_0==',') ) {s = 9;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 10;}

                        else if ( (LA23_0=='.') ) {s = 11;}

                        else if ( (LA23_0=='t') ) {s = 13;}

                        else if ( (LA23_0=='#') ) {s = 14;}

                        else if ( (LA23_0=='^') ) {s = 15;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='s')||(LA23_0>='u' && LA23_0<='z')) ) {s = 16;}

                        else if ( (LA23_0=='\"') ) {s = 17;}

                        else if ( (LA23_0=='\'') ) {s = 18;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 19;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='!'||(LA23_0>='$' && LA23_0<='&')||(LA23_0>='<' && LA23_0<='@')||(LA23_0>='[' && LA23_0<=']')||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_18 = input.LA(1);

                        s = -1;
                        if ( ((LA23_18>='\u0000' && LA23_18<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_17 = input.LA(1);

                        s = -1;
                        if ( ((LA23_17>='\u0000' && LA23_17<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}