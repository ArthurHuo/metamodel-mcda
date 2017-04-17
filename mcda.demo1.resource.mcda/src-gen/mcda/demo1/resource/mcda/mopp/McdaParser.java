// $ANTLR 3.4

	package mcda.demo1.resource.mcda.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class McdaParser extends McdaANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLOAT", "IDENTIFIER", "INTEGER", "LINEBREAK", "QUOTED_34_34", "SL_COMMENT", "WHITESPACE", "'('", "')'", "','", "':'", "';'", "'Analyze'", "'ComparisonMatrix'", "'ComparisonPair'", "'Criteria'", "'Evaluate'", "'EvaluatePair'", "'File'", "'Filter'", "'Option'", "'OptionType'", "'Task'", "'criteriaName'", "'description'", "'name'", "'{'", "'}'"
    };

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

    // delegates
    public McdaANTLRParserBase[] getDelegates() {
        return new McdaANTLRParserBase[] {};
    }

    // delegators


    public McdaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public McdaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(27 + 1);
         

    }

    public String[] getTokenNames() { return McdaParser.tokenNames; }
    public String getGrammarFileName() { return "Mcda.g"; }


    	private mcda.demo1.resource.mcda.IMcdaTokenResolverFactory tokenResolverFactory = new mcda.demo1.resource.mcda.mopp.McdaTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal> expectedElements = new java.util.ArrayList<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>() {
    			public boolean execute(mcda.demo1.resource.mcda.IMcdaTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new mcda.demo1.resource.mcda.IMcdaProblem() {
    					public mcda.demo1.resource.mcda.McdaEProblemSeverity getSeverity() {
    						return mcda.demo1.resource.mcda.McdaEProblemSeverity.ERROR;
    					}
    					public mcda.demo1.resource.mcda.McdaEProblemType getType() {
    						return mcda.demo1.resource.mcda.McdaEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		mcda.demo1.resource.mcda.IMcdaExpectedElement terminal = mcda.demo1.resource.mcda.grammar.McdaFollowSetProvider.TERMINALS[terminalID];
    		mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] containmentFeatures = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = mcda.demo1.resource.mcda.grammar.McdaFollowSetProvider.LINKS[ids[i]];
    		}
    		mcda.demo1.resource.mcda.grammar.McdaContainmentTrace containmentTrace = new mcda.demo1.resource.mcda.grammar.McdaContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal expectedElement = new mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>() {
    			public boolean execute(mcda.demo1.resource.mcda.IMcdaTextResource resource) {
    				mcda.demo1.resource.mcda.IMcdaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>() {
    			public boolean execute(mcda.demo1.resource.mcda.IMcdaTextResource resource) {
    				mcda.demo1.resource.mcda.IMcdaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>() {
    			public boolean execute(mcda.demo1.resource.mcda.IMcdaTextResource resource) {
    				mcda.demo1.resource.mcda.IMcdaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public mcda.demo1.resource.mcda.IMcdaTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new McdaParser(new org.antlr.runtime3_4_0.CommonTokenStream(new McdaLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new McdaParser(new org.antlr.runtime3_4_0.CommonTokenStream(new McdaLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new mcda.demo1.resource.mcda.util.McdaRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public McdaParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((McdaLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((McdaLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == mcda.demo1.Task.class) {
    				return parse_mcda_demo1_Task();
    			}
    			if (type.getInstanceClass() == mcda.demo1.Filter.class) {
    				return parse_mcda_demo1_Filter();
    			}
    			if (type.getInstanceClass() == mcda.demo1.Analyze.class) {
    				return parse_mcda_demo1_Analyze();
    			}
    			if (type.getInstanceClass() == mcda.demo1.Evaluate.class) {
    				return parse_mcda_demo1_Evaluate();
    			}
    			if (type.getInstanceClass() == mcda.demo1.File.class) {
    				return parse_mcda_demo1_File();
    			}
    			if (type.getInstanceClass() == mcda.demo1.OptionType.class) {
    				return parse_mcda_demo1_OptionType();
    			}
    			if (type.getInstanceClass() == mcda.demo1.option.class) {
    				return parse_mcda_demo1_option();
    			}
    			if (type.getInstanceClass() == mcda.demo1.ComparisonMatrix.class) {
    				return parse_mcda_demo1_ComparisonMatrix();
    			}
    			if (type.getInstanceClass() == mcda.demo1.EvaluatePair.class) {
    				return parse_mcda_demo1_EvaluatePair();
    			}
    			if (type.getInstanceClass() == mcda.demo1.Criteria.class) {
    				return parse_mcda_demo1_Criteria();
    			}
    			if (type.getInstanceClass() == mcda.demo1.ComparisonPair.class) {
    				return parse_mcda_demo1_ComparisonPair();
    			}
    		}
    		throw new mcda.demo1.resource.mcda.mopp.McdaUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(mcda.demo1.resource.mcda.IMcdaOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public mcda.demo1.resource.mcda.IMcdaParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>>();
    		mcda.demo1.resource.mcda.mopp.McdaParseResult parseResult = new mcda.demo1.resource.mcda.mopp.McdaParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, mcda.demo1.resource.mcda.IMcdaTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		mcda.demo1.resource.mcda.IMcdaParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal>();
    		java.util.List<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal> newFollowSet = new java.util.ArrayList<mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 102;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]> newFollowerPair : newFollowers) {
    							mcda.demo1.resource.mcda.IMcdaExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							mcda.demo1.resource.mcda.grammar.McdaContainmentTrace containmentTrace = new mcda.demo1.resource.mcda.grammar.McdaContainmentTrace(null, newFollowerPair.getRight());
    							mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal newFollowTerminal = new mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(mcda.demo1.resource.mcda.mopp.McdaExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Mcda.g:529:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_mcda_demo1_Task ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        mcda.demo1.Task c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Mcda.g:530:2: ( (c0= parse_mcda_demo1_Task ) EOF )
            // Mcda.g:531:2: (c0= parse_mcda_demo1_Task ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Mcda.g:536:2: (c0= parse_mcda_demo1_Task )
            // Mcda.g:537:3: c0= parse_mcda_demo1_Task
            {
            pushFollow(FOLLOW_parse_mcda_demo1_Task_in_start82);
            c0=parse_mcda_demo1_Task();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_mcda_demo1_Task"
    // Mcda.g:545:1: parse_mcda_demo1_Task returns [mcda.demo1.Task element = null] : a0= 'Task' a1= '{' ( ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' ) )* a13= '}' ;
    public final mcda.demo1.Task parse_mcda_demo1_Task() throws RecognitionException {
        mcda.demo1.Task element =  null;

        int parse_mcda_demo1_Task_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        mcda.demo1.operation a2_0 =null;

        mcda.demo1.OptionType a3_0 =null;

        mcda.demo1.option a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Mcda.g:548:2: (a0= 'Task' a1= '{' ( ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' ) )* a13= '}' )
            // Mcda.g:549:2: a0= 'Task' a1= '{' ( ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' ) )* a13= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_mcda_demo1_Task115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[1]);
            	}

            a1=(Token)match(input,30,FOLLOW_30_in_parse_mcda_demo1_Task129); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[10]);
            	}

            // Mcda.g:585:2: ( ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==20||(LA2_0 >= 22 && LA2_0 <= 25)||(LA2_0 >= 28 && LA2_0 <= 29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Mcda.g:586:3: ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' )
            	    {
            	    // Mcda.g:586:3: ( (a2_0= parse_mcda_demo1_operation ) | (a3_0= parse_mcda_demo1_OptionType ) | (a4_0= parse_mcda_demo1_option ) |a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';' |a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';' )
            	    int alt1=5;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	    case 20:
            	    case 22:
            	    case 23:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // Mcda.g:587:4: (a2_0= parse_mcda_demo1_operation )
            	            {
            	            // Mcda.g:587:4: (a2_0= parse_mcda_demo1_operation )
            	            // Mcda.g:588:5: a2_0= parse_mcda_demo1_operation
            	            {
            	            pushFollow(FOLLOW_parse_mcda_demo1_operation_in_parse_mcda_demo1_Task158);
            	            a2_0=parse_mcda_demo1_operation();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a2_0 != null) {
            	            						if (a2_0 != null) {
            	            							Object value = a2_0;
            	            							addObjectToList(element, mcda.demo1.mcdaPackage.TASK__HAVE_OPERATION, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_0_0, a2_0, true);
            	            						copyLocalizationInfos(a2_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[11]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[12]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[13]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[14]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[15]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[16]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[17]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[18]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[19]);
            	            			}

            	            }
            	            break;
            	        case 2 :
            	            // Mcda.g:622:8: (a3_0= parse_mcda_demo1_OptionType )
            	            {
            	            // Mcda.g:622:8: (a3_0= parse_mcda_demo1_OptionType )
            	            // Mcda.g:623:5: a3_0= parse_mcda_demo1_OptionType
            	            {
            	            pushFollow(FOLLOW_parse_mcda_demo1_OptionType_in_parse_mcda_demo1_Task200);
            	            a3_0=parse_mcda_demo1_OptionType();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a3_0 != null) {
            	            						if (a3_0 != null) {
            	            							Object value = a3_0;
            	            							element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DEFINE_TYPE), value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_1_0, a3_0, true);
            	            						copyLocalizationInfos(a3_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[20]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[21]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[22]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[23]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[24]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[25]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[26]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[27]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[28]);
            	            			}

            	            }
            	            break;
            	        case 3 :
            	            // Mcda.g:657:8: (a4_0= parse_mcda_demo1_option )
            	            {
            	            // Mcda.g:657:8: (a4_0= parse_mcda_demo1_option )
            	            // Mcda.g:658:5: a4_0= parse_mcda_demo1_option
            	            {
            	            pushFollow(FOLLOW_parse_mcda_demo1_option_in_parse_mcda_demo1_Task242);
            	            a4_0=parse_mcda_demo1_option();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a4_0 != null) {
            	            						if (a4_0 != null) {
            	            							Object value = a4_0;
            	            							addObjectToList(element, mcda.demo1.mcdaPackage.TASK__HAVE_OPTION, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_2_0, a4_0, true);
            	            						copyLocalizationInfos(a4_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[29]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[30]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[31]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[32]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[33]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[34]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[35]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[36]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[37]);
            	            			}

            	            }
            	            break;
            	        case 4 :
            	            // Mcda.g:692:8: a5= 'name' a6= ':' (a7= QUOTED_34_34 ) a8= ';'
            	            {
            	            a5=(Token)match(input,29,FOLLOW_29_in_parse_mcda_demo1_Task278); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_0, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[38]);
            	            			}

            	            a6=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_Task298); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_1, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[39]);
            	            			}

            	            // Mcda.g:720:4: (a7= QUOTED_34_34 )
            	            // Mcda.g:721:5: a7= QUOTED_34_34
            	            {
            	            a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Task324); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a7 != null) {
            	            						mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            						tokenResolver.setOptions(getOptions());
            	            						mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            	            						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME), result);
            	            						Object resolvedObject = result.getResolvedToken();
            	            						if (resolvedObject == null) {
            	            							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            	            						}
            	            						java.lang.String resolved = (java.lang.String) resolvedObject;
            	            						if (resolved != null) {
            	            							Object value = resolved;
            	            							element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME), value);
            	            							completedElement(value, false);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_2, resolved, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[40]);
            	            			}

            	            a8=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Task357); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_3, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[41]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[42]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[43]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[44]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[45]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[46]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[47]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[48]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[49]);
            	            			}

            	            }
            	            break;
            	        case 5 :
            	            // Mcda.g:779:8: a9= 'description' a10= ':' (a11= QUOTED_34_34 ) a12= ';'
            	            {
            	            a9=(Token)match(input,28,FOLLOW_28_in_parse_mcda_demo1_Task385); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_0, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[50]);
            	            			}

            	            a10=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_Task405); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_1, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[51]);
            	            			}

            	            // Mcda.g:807:4: (a11= QUOTED_34_34 )
            	            // Mcda.g:808:5: a11= QUOTED_34_34
            	            {
            	            a11=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Task431); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a11 != null) {
            	            						mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            						tokenResolver.setOptions(getOptions());
            	            						mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            	            						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION), result);
            	            						Object resolvedObject = result.getResolvedToken();
            	            						if (resolvedObject == null) {
            	            							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
            	            						}
            	            						java.lang.String resolved = (java.lang.String) resolvedObject;
            	            						if (resolved != null) {
            	            							Object value = resolved;
            	            							element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION), value);
            	            							completedElement(value, false);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_2, resolved, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[52]);
            	            			}

            	            a12=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Task464); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            				if (element == null) {
            	            					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            	            					startIncompleteElement(element);
            	            				}
            	            				collectHiddenTokens(element);
            	            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_3, null, true);
            	            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	            			}

            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[53]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[54]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[55]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[56]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[57]);
            	            				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[58]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[59]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[60]);
            	            				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[61]);
            	            			}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[63]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[64]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[65]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[66]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[69]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[70]);
            	}

            a13=(Token)match(input,31,FOLLOW_31_in_parse_mcda_demo1_Task497); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_mcda_demo1_Task_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_Task"



    // $ANTLR start "parse_mcda_demo1_Filter"
    // Mcda.g:895:1: parse_mcda_demo1_Filter returns [mcda.demo1.Filter element = null] : a0= 'Filter' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';' ;
    public final mcda.demo1.Filter parse_mcda_demo1_Filter() throws RecognitionException {
        mcda.demo1.Filter element =  null;

        int parse_mcda_demo1_Filter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Mcda.g:898:2: (a0= 'Filter' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';' )
            // Mcda.g:899:2: a0= 'Filter' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_mcda_demo1_Filter526); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[71]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_Filter540); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[72]);
            	}

            // Mcda.g:927:2: (a2= QUOTED_34_34 )
            // Mcda.g:928:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter558); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[73]);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_Filter579); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[74]);
            	}

            // Mcda.g:977:2: (a4= QUOTED_34_34 )
            // Mcda.g:978:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter597); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[75]);
            	}

            a5=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_Filter618); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[76]);
            	}

            // Mcda.g:1027:2: (a6= QUOTED_34_34 )
            // Mcda.g:1028:3: a6= QUOTED_34_34
            {
            a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter636); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_6, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[77]);
            	}

            a7=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_Filter657); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[78]);
            	}

            a8=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Filter671); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[79]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[86]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[87]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_mcda_demo1_Filter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_Filter"



    // $ANTLR start "parse_mcda_demo1_Analyze"
    // Mcda.g:1101:1: parse_mcda_demo1_Analyze returns [mcda.demo1.Analyze element = null] : a0= 'Analyze' a1= '(' ( ( (a2= QUOTED_34_34 ) ) )* a3= ')' a4= ';' ;
    public final mcda.demo1.Analyze parse_mcda_demo1_Analyze() throws RecognitionException {
        mcda.demo1.Analyze element =  null;

        int parse_mcda_demo1_Analyze_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Mcda.g:1104:2: (a0= 'Analyze' a1= '(' ( ( (a2= QUOTED_34_34 ) ) )* a3= ')' a4= ';' )
            // Mcda.g:1105:2: a0= 'Analyze' a1= '(' ( ( (a2= QUOTED_34_34 ) ) )* a3= ')' a4= ';'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_mcda_demo1_Analyze700); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[88]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_Analyze714); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[89]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[90]);
            	}

            // Mcda.g:1134:2: ( ( (a2= QUOTED_34_34 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==QUOTED_34_34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Mcda.g:1135:3: ( (a2= QUOTED_34_34 ) )
            	    {
            	    // Mcda.g:1135:3: ( (a2= QUOTED_34_34 ) )
            	    // Mcda.g:1136:4: (a2= QUOTED_34_34 )
            	    {
            	    // Mcda.g:1136:4: (a2= QUOTED_34_34 )
            	    // Mcda.g:1137:5: a2= QUOTED_34_34
            	    {
            	    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Analyze743); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2 != null) {
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	    						tokenResolver.setOptions(getOptions());
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            	    						}
            	    						java.lang.String resolved = (java.lang.String) resolvedObject;
            	    						if (resolved != null) {
            	    							Object value = resolved;
            	    							element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD), value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_2_0_0_0, resolved, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[91]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[92]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[94]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_Analyze789); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[95]);
            	}

            a4=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Analyze803); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[96]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[97]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[98]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[99]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[100]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[101]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[102]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[103]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[104]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_mcda_demo1_Analyze_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_Analyze"



    // $ANTLR start "parse_mcda_demo1_Evaluate"
    // Mcda.g:1219:1: parse_mcda_demo1_Evaluate returns [mcda.demo1.Evaluate element = null] : a0= 'Evaluate' a1= '(' a2= 'criteriaName' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_EvaluatePair ) ) )* a7= ')' a8= ';' ;
    public final mcda.demo1.Evaluate parse_mcda_demo1_Evaluate() throws RecognitionException {
        mcda.demo1.Evaluate element =  null;

        int parse_mcda_demo1_Evaluate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;
        mcda.demo1.EvaluatePair a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Mcda.g:1222:2: (a0= 'Evaluate' a1= '(' a2= 'criteriaName' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_EvaluatePair ) ) )* a7= ')' a8= ';' )
            // Mcda.g:1223:2: a0= 'Evaluate' a1= '(' a2= 'criteriaName' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_EvaluatePair ) ) )* a7= ')' a8= ';'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_mcda_demo1_Evaluate832); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[105]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_Evaluate846); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[106]);
            	}

            a2=(Token)match(input,27,FOLLOW_27_in_parse_mcda_demo1_Evaluate860); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[107]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_Evaluate874); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[108]);
            	}

            // Mcda.g:1279:2: (a4= QUOTED_34_34 )
            // Mcda.g:1280:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Evaluate892); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[109]);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Evaluate913); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[110]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[111]);
            	}

            // Mcda.g:1330:2: ( ( (a6_0= parse_mcda_demo1_EvaluatePair ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Mcda.g:1331:3: ( (a6_0= parse_mcda_demo1_EvaluatePair ) )
            	    {
            	    // Mcda.g:1331:3: ( (a6_0= parse_mcda_demo1_EvaluatePair ) )
            	    // Mcda.g:1332:4: (a6_0= parse_mcda_demo1_EvaluatePair )
            	    {
            	    // Mcda.g:1332:4: (a6_0= parse_mcda_demo1_EvaluatePair )
            	    // Mcda.g:1333:5: a6_0= parse_mcda_demo1_EvaluatePair
            	    {
            	    pushFollow(FOLLOW_parse_mcda_demo1_EvaluatePair_in_parse_mcda_demo1_Evaluate942);
            	    a6_0=parse_mcda_demo1_EvaluatePair();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addObjectToList(element, mcda.demo1.mcdaPackage.EVALUATE__CONTAIN, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_6_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[112]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[113]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[114]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[115]);
            	}

            a7=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_Evaluate983); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[116]);
            	}

            a8=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Evaluate997); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[117]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[118]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[119]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[122]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[125]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_mcda_demo1_Evaluate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_Evaluate"



    // $ANTLR start "parse_mcda_demo1_File"
    // Mcda.g:1405:1: parse_mcda_demo1_File returns [mcda.demo1.File element = null] : a0= 'File' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';' ;
    public final mcda.demo1.File parse_mcda_demo1_File() throws RecognitionException {
        mcda.demo1.File element =  null;

        int parse_mcda_demo1_File_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Mcda.g:1408:2: (a0= 'File' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';' )
            // Mcda.g:1409:2: a0= 'File' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_mcda_demo1_File1026); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[126]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_File1040); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[127]);
            	}

            // Mcda.g:1437:2: (a2= QUOTED_34_34 )
            // Mcda.g:1438:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_File1058); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[128]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_File1079); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[129]);
            	}

            a4=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_File1093); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[130]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[131]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[134]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[135]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[136]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[137]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[138]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_mcda_demo1_File_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_File"



    // $ANTLR start "parse_mcda_demo1_OptionType"
    // Mcda.g:1511:1: parse_mcda_demo1_OptionType returns [mcda.demo1.OptionType element = null] : a0= 'OptionType' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_Criteria ) ) )* (a7_0= parse_mcda_demo1_ComparisonMatrix ) a8= ')' a9= ';' ;
    public final mcda.demo1.OptionType parse_mcda_demo1_OptionType() throws RecognitionException {
        mcda.demo1.OptionType element =  null;

        int parse_mcda_demo1_OptionType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        Token a9=null;
        mcda.demo1.Criteria a6_0 =null;

        mcda.demo1.ComparisonMatrix a7_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Mcda.g:1514:2: (a0= 'OptionType' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_Criteria ) ) )* (a7_0= parse_mcda_demo1_ComparisonMatrix ) a8= ')' a9= ';' )
            // Mcda.g:1515:2: a0= 'OptionType' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' ( ( (a6_0= parse_mcda_demo1_Criteria ) ) )* (a7_0= parse_mcda_demo1_ComparisonMatrix ) a8= ')' a9= ';'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_mcda_demo1_OptionType1122); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[139]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_OptionType1136); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[140]);
            	}

            a2=(Token)match(input,29,FOLLOW_29_in_parse_mcda_demo1_OptionType1150); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[141]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_OptionType1164); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[142]);
            	}

            // Mcda.g:1571:2: (a4= QUOTED_34_34 )
            // Mcda.g:1572:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_OptionType1182); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[143]);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_OptionType1203); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[145]);
            	}

            // Mcda.g:1622:2: ( ( (a6_0= parse_mcda_demo1_Criteria ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Mcda.g:1623:3: ( (a6_0= parse_mcda_demo1_Criteria ) )
            	    {
            	    // Mcda.g:1623:3: ( (a6_0= parse_mcda_demo1_Criteria ) )
            	    // Mcda.g:1624:4: (a6_0= parse_mcda_demo1_Criteria )
            	    {
            	    // Mcda.g:1624:4: (a6_0= parse_mcda_demo1_Criteria )
            	    // Mcda.g:1625:5: a6_0= parse_mcda_demo1_Criteria
            	    {
            	    pushFollow(FOLLOW_parse_mcda_demo1_Criteria_in_parse_mcda_demo1_OptionType1232);
            	    a6_0=parse_mcda_demo1_Criteria();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addObjectToList(element, mcda.demo1.mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_6_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[146]);
            	    				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[147]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[148]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[149]);
            	}

            // Mcda.g:1659:2: (a7_0= parse_mcda_demo1_ComparisonMatrix )
            // Mcda.g:1660:3: a7_0= parse_mcda_demo1_ComparisonMatrix
            {
            pushFollow(FOLLOW_parse_mcda_demo1_ComparisonMatrix_in_parse_mcda_demo1_OptionType1277);
            a7_0=parse_mcda_demo1_ComparisonMatrix();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            				startIncompleteElement(element);
            			}
            			if (a7_0 != null) {
            				if (a7_0 != null) {
            					Object value = a7_0;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_7, a7_0, true);
            				copyLocalizationInfos(a7_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[150]);
            	}

            a8=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_OptionType1295); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[151]);
            	}

            a9=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_OptionType1309); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[152]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[153]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[154]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[155]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[156]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[157]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[158]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[159]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[160]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_mcda_demo1_OptionType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_OptionType"



    // $ANTLR start "parse_mcda_demo1_option"
    // Mcda.g:1723:1: parse_mcda_demo1_option returns [mcda.demo1.option element = null] : a0= 'Option' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' (a6= QUOTED_34_34 ) ( (a7= ',' (a8= QUOTED_34_34 ) ) )* ( (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) ) )* a13= ';' a14= ')' a15= ';' ;
    public final mcda.demo1.option parse_mcda_demo1_option() throws RecognitionException {
        mcda.demo1.option element =  null;

        int parse_mcda_demo1_option_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Mcda.g:1726:2: (a0= 'Option' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' (a6= QUOTED_34_34 ) ( (a7= ',' (a8= QUOTED_34_34 ) ) )* ( (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) ) )* a13= ';' a14= ')' a15= ';' )
            // Mcda.g:1727:2: a0= 'Option' a1= '(' a2= 'name' a3= ':' (a4= QUOTED_34_34 ) a5= ';' (a6= QUOTED_34_34 ) ( (a7= ',' (a8= QUOTED_34_34 ) ) )* ( (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) ) )* a13= ';' a14= ')' a15= ';'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_mcda_demo1_option1338); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[161]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_option1352); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[162]);
            	}

            a2=(Token)match(input,29,FOLLOW_29_in_parse_mcda_demo1_option1366); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[163]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_option1380); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[164]);
            	}

            // Mcda.g:1783:2: (a4= QUOTED_34_34 )
            // Mcda.g:1784:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1398); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[165]);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_option1419); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[166]);
            	}

            // Mcda.g:1833:2: (a6= QUOTED_34_34 )
            // Mcda.g:1834:3: a6= QUOTED_34_34
            {
            a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1437); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					addObjectToList(element, mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_6, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[167]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[168]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[169]);
            	}

            // Mcda.g:1871:2: ( (a7= ',' (a8= QUOTED_34_34 ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Mcda.g:1872:3: (a7= ',' (a8= QUOTED_34_34 ) )
            	    {
            	    // Mcda.g:1872:3: (a7= ',' (a8= QUOTED_34_34 ) )
            	    // Mcda.g:1873:4: a7= ',' (a8= QUOTED_34_34 )
            	    {
            	    a7=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_option1467); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_7_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[170]);
            	    			}

            	    // Mcda.g:1887:4: (a8= QUOTED_34_34 )
            	    // Mcda.g:1888:5: a8= QUOTED_34_34
            	    {
            	    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1493); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a8 != null) {
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	    						tokenResolver.setOptions(getOptions());
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            	    						}
            	    						java.lang.String resolved = (java.lang.String) resolvedObject;
            	    						if (resolved != null) {
            	    							Object value = resolved;
            	    							addObjectToList(element, mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_7_0_0_1, resolved, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[171]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[172]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[173]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[174]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[175]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[176]);
            	}

            // Mcda.g:1934:2: ( (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==28) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // Mcda.g:1935:3: (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) )
            	    {
            	    // Mcda.g:1935:3: (a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 ) )
            	    // Mcda.g:1936:4: a9= ';' a10= 'description' a11= ':' (a12= QUOTED_34_34 )
            	    {
            	    a9=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_option1548); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[177]);
            	    			}

            	    a10=(Token)match(input,28,FOLLOW_28_in_parse_mcda_demo1_option1568); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[178]);
            	    			}

            	    a11=(Token)match(input,14,FOLLOW_14_in_parse_mcda_demo1_option1588); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_2, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[179]);
            	    			}

            	    // Mcda.g:1978:4: (a12= QUOTED_34_34 )
            	    // Mcda.g:1979:5: a12= QUOTED_34_34
            	    {
            	    a12=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1614); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a12 != null) {
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	    						tokenResolver.setOptions(getOptions());
            	    						mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            	    						}
            	    						java.lang.String resolved = (java.lang.String) resolvedObject;
            	    						if (resolved != null) {
            	    							Object value = resolved;
            	    							element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION), value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_3, resolved, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[180]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[181]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[182]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[183]);
            	}

            a13=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_option1660); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[184]);
            	}

            a14=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_option1674); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[185]);
            	}

            a15=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_option1688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[186]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[187]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[188]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[189]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[190]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[191]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[192]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[193]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[194]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_mcda_demo1_option_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_option"



    // $ANTLR start "parse_mcda_demo1_ComparisonMatrix"
    // Mcda.g:2075:1: parse_mcda_demo1_ComparisonMatrix returns [mcda.demo1.ComparisonMatrix element = null] : a0= 'ComparisonMatrix' a1= '(' ( ( (a2_0= parse_mcda_demo1_ComparisonPair ) ) )* a3= ')' a4= ';' ;
    public final mcda.demo1.ComparisonMatrix parse_mcda_demo1_ComparisonMatrix() throws RecognitionException {
        mcda.demo1.ComparisonMatrix element =  null;

        int parse_mcda_demo1_ComparisonMatrix_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        mcda.demo1.ComparisonPair a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Mcda.g:2078:2: (a0= 'ComparisonMatrix' a1= '(' ( ( (a2_0= parse_mcda_demo1_ComparisonPair ) ) )* a3= ')' a4= ';' )
            // Mcda.g:2079:2: a0= 'ComparisonMatrix' a1= '(' ( ( (a2_0= parse_mcda_demo1_ComparisonPair ) ) )* a3= ')' a4= ';'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_mcda_demo1_ComparisonMatrix1717); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[195]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_ComparisonMatrix1731); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[196]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[197]);
            	}

            // Mcda.g:2108:2: ( ( (a2_0= parse_mcda_demo1_ComparisonPair ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Mcda.g:2109:3: ( (a2_0= parse_mcda_demo1_ComparisonPair ) )
            	    {
            	    // Mcda.g:2109:3: ( (a2_0= parse_mcda_demo1_ComparisonPair ) )
            	    // Mcda.g:2110:4: (a2_0= parse_mcda_demo1_ComparisonPair )
            	    {
            	    // Mcda.g:2110:4: (a2_0= parse_mcda_demo1_ComparisonPair )
            	    // Mcda.g:2111:5: a2_0= parse_mcda_demo1_ComparisonPair
            	    {
            	    pushFollow(FOLLOW_parse_mcda_demo1_ComparisonPair_in_parse_mcda_demo1_ComparisonMatrix1760);
            	    a2_0=parse_mcda_demo1_ComparisonPair();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2_0 != null) {
            	    						if (a2_0 != null) {
            	    							Object value = a2_0;
            	    							addObjectToList(element, mcda.demo1.mcdaPackage.COMPARISON_MATRIX__MAKEUPOF, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_2_0_0_0, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[198]);
            	    				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[199]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[200]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[201]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_ComparisonMatrix1801); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[202]);
            	}

            a4=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_ComparisonMatrix1815); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[203]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_mcda_demo1_ComparisonMatrix_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_ComparisonMatrix"



    // $ANTLR start "parse_mcda_demo1_EvaluatePair"
    // Mcda.g:2175:1: parse_mcda_demo1_EvaluatePair returns [mcda.demo1.EvaluatePair element = null] : a0= 'EvaluatePair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')' a6= ';' ;
    public final mcda.demo1.EvaluatePair parse_mcda_demo1_EvaluatePair() throws RecognitionException {
        mcda.demo1.EvaluatePair element =  null;

        int parse_mcda_demo1_EvaluatePair_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Mcda.g:2178:2: (a0= 'EvaluatePair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')' a6= ';' )
            // Mcda.g:2179:2: a0= 'EvaluatePair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')' a6= ';'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_mcda_demo1_EvaluatePair1844); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[204]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_EvaluatePair1858); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[205]);
            	}

            // Mcda.g:2207:2: (a2= QUOTED_34_34 )
            // Mcda.g:2208:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_EvaluatePair1876); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[206]);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_EvaluatePair1897); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[207]);
            	}

            // Mcda.g:2257:2: (a4= QUOTED_34_34 )
            // Mcda.g:2258:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_EvaluatePair1915); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[208]);
            	}

            a5=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_EvaluatePair1936); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[209]);
            	}

            a6=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_EvaluatePair1950); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[210]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[211]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_mcda_demo1_EvaluatePair_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_EvaluatePair"



    // $ANTLR start "parse_mcda_demo1_Criteria"
    // Mcda.g:2324:1: parse_mcda_demo1_Criteria returns [mcda.demo1.Criteria element = null] : a0= 'Criteria' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';' ;
    public final mcda.demo1.Criteria parse_mcda_demo1_Criteria() throws RecognitionException {
        mcda.demo1.Criteria element =  null;

        int parse_mcda_demo1_Criteria_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Mcda.g:2327:2: (a0= 'Criteria' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';' )
            // Mcda.g:2328:2: a0= 'Criteria' a1= '(' (a2= QUOTED_34_34 ) a3= ')' a4= ';'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_mcda_demo1_Criteria1979); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[212]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_Criteria1993); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[213]);
            	}

            // Mcda.g:2356:2: (a2= QUOTED_34_34 )
            // Mcda.g:2357:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Criteria2011); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[214]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_Criteria2032); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[215]);
            	}

            a4=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_Criteria2046); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[216]);
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[217]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_mcda_demo1_Criteria_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_Criteria"



    // $ANTLR start "parse_mcda_demo1_ComparisonPair"
    // Mcda.g:2423:1: parse_mcda_demo1_ComparisonPair returns [mcda.demo1.ComparisonPair element = null] : a0= 'ComparisonPair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';' ;
    public final mcda.demo1.ComparisonPair parse_mcda_demo1_ComparisonPair() throws RecognitionException {
        mcda.demo1.ComparisonPair element =  null;

        int parse_mcda_demo1_ComparisonPair_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Mcda.g:2426:2: (a0= 'ComparisonPair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';' )
            // Mcda.g:2427:2: a0= 'ComparisonPair' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ',' (a6= QUOTED_34_34 ) a7= ')' a8= ';'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_mcda_demo1_ComparisonPair2075); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[218]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_mcda_demo1_ComparisonPair2089); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[219]);
            	}

            // Mcda.g:2455:2: (a2= QUOTED_34_34 )
            // Mcda.g:2456:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2107); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[220]);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_ComparisonPair2128); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[221]);
            	}

            // Mcda.g:2505:2: (a4= QUOTED_34_34 )
            // Mcda.g:2506:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2146); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[222]);
            	}

            a5=(Token)match(input,13,FOLLOW_13_in_parse_mcda_demo1_ComparisonPair2167); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[223]);
            	}

            // Mcda.g:2555:2: (a6= QUOTED_34_34 )
            // Mcda.g:2556:3: a6= QUOTED_34_34
            {
            a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2185); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new mcda.demo1.resource.mcda.mopp.McdaTerminateParsingException();
            			}
            			if (element == null) {
            				element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				mcda.demo1.resource.mcda.IMcdaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				mcda.demo1.resource.mcda.IMcdaTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_6, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[224]);
            	}

            a7=(Token)match(input,12,FOLLOW_12_in_parse_mcda_demo1_ComparisonPair2206); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[225]);
            	}

            a8=(Token)match(input,15,FOLLOW_15_in_parse_mcda_demo1_ComparisonPair2220); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[226]);
            		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[227]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_mcda_demo1_ComparisonPair_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_ComparisonPair"



    // $ANTLR start "parse_mcda_demo1_operation"
    // Mcda.g:2622:1: parse_mcda_demo1_operation returns [mcda.demo1.operation element = null] : (c0= parse_mcda_demo1_Filter |c1= parse_mcda_demo1_Analyze |c2= parse_mcda_demo1_Evaluate |c3= parse_mcda_demo1_File );
    public final mcda.demo1.operation parse_mcda_demo1_operation() throws RecognitionException {
        mcda.demo1.operation element =  null;

        int parse_mcda_demo1_operation_StartIndex = input.index();

        mcda.demo1.Filter c0 =null;

        mcda.demo1.Analyze c1 =null;

        mcda.demo1.Evaluate c2 =null;

        mcda.demo1.File c3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Mcda.g:2623:2: (c0= parse_mcda_demo1_Filter |c1= parse_mcda_demo1_Analyze |c2= parse_mcda_demo1_Evaluate |c3= parse_mcda_demo1_File )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // Mcda.g:2624:2: c0= parse_mcda_demo1_Filter
                    {
                    pushFollow(FOLLOW_parse_mcda_demo1_Filter_in_parse_mcda_demo1_operation2245);
                    c0=parse_mcda_demo1_Filter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Mcda.g:2625:4: c1= parse_mcda_demo1_Analyze
                    {
                    pushFollow(FOLLOW_parse_mcda_demo1_Analyze_in_parse_mcda_demo1_operation2255);
                    c1=parse_mcda_demo1_Analyze();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Mcda.g:2626:4: c2= parse_mcda_demo1_Evaluate
                    {
                    pushFollow(FOLLOW_parse_mcda_demo1_Evaluate_in_parse_mcda_demo1_operation2265);
                    c2=parse_mcda_demo1_Evaluate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Mcda.g:2627:4: c3= parse_mcda_demo1_File
                    {
                    pushFollow(FOLLOW_parse_mcda_demo1_File_in_parse_mcda_demo1_operation2275);
                    c3=parse_mcda_demo1_File();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_mcda_demo1_operation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_mcda_demo1_operation"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_mcda_demo1_Task_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_mcda_demo1_Task115 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_mcda_demo1_Task129 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_operation_in_parse_mcda_demo1_Task158 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_OptionType_in_parse_mcda_demo1_Task200 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_option_in_parse_mcda_demo1_Task242 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_29_in_parse_mcda_demo1_Task278 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_Task298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Task324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Task357 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_28_in_parse_mcda_demo1_Task385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_Task405 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Task431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Task464 = new BitSet(new long[]{0x00000000B3D10000L});
    public static final BitSet FOLLOW_31_in_parse_mcda_demo1_Task497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_mcda_demo1_Filter526 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_Filter540 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter558 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_Filter579 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter597 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_Filter618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Filter636 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_Filter657 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Filter671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_mcda_demo1_Analyze700 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_Analyze714 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Analyze743 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_Analyze789 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Analyze803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_mcda_demo1_Evaluate832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_Evaluate846 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_mcda_demo1_Evaluate860 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_Evaluate874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Evaluate892 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Evaluate913 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_EvaluatePair_in_parse_mcda_demo1_Evaluate942 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_Evaluate983 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Evaluate997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_mcda_demo1_File1026 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_File1040 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_File1058 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_File1079 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_File1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_mcda_demo1_OptionType1122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_OptionType1136 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_mcda_demo1_OptionType1150 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_OptionType1164 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_OptionType1182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_OptionType1203 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_Criteria_in_parse_mcda_demo1_OptionType1232 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_ComparisonMatrix_in_parse_mcda_demo1_OptionType1277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_OptionType1295 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_OptionType1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_mcda_demo1_option1338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_option1352 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_mcda_demo1_option1366 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_option1380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1398 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_option1419 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1437 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_option1467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1493 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_option1548 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_mcda_demo1_option1568 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mcda_demo1_option1588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_option1614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_option1660 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_option1674 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_option1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_mcda_demo1_ComparisonMatrix1717 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_ComparisonMatrix1731 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_parse_mcda_demo1_ComparisonPair_in_parse_mcda_demo1_ComparisonMatrix1760 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_ComparisonMatrix1801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_ComparisonMatrix1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_mcda_demo1_EvaluatePair1844 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_EvaluatePair1858 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_EvaluatePair1876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_EvaluatePair1897 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_EvaluatePair1915 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_EvaluatePair1936 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_EvaluatePair1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_mcda_demo1_Criteria1979 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_Criteria1993 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_Criteria2011 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_Criteria2032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_Criteria2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_mcda_demo1_ComparisonPair2075 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_mcda_demo1_ComparisonPair2089 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_ComparisonPair2128 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_mcda_demo1_ComparisonPair2167 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_mcda_demo1_ComparisonPair2185 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_mcda_demo1_ComparisonPair2206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_mcda_demo1_ComparisonPair2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mcda_demo1_Filter_in_parse_mcda_demo1_operation2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mcda_demo1_Analyze_in_parse_mcda_demo1_operation2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mcda_demo1_Evaluate_in_parse_mcda_demo1_operation2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mcda_demo1_File_in_parse_mcda_demo1_operation2275 = new BitSet(new long[]{0x0000000000000002L});

}