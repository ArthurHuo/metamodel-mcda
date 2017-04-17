grammar Mcda;

options {
	superClass = McdaANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package mcda.demo1.resource.mcda.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package mcda.demo1.resource.mcda.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_mcda_demo1_Task{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_mcda_demo1_Task returns [mcda.demo1.Task element = null]
@init{
}
:
	a0 = 'Task' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[1]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
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
	
	(
		(
			(
				a2_0 = parse_mcda_demo1_operation				{
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
			)
			{
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
			
			
			|			(
				a3_0 = parse_mcda_demo1_OptionType				{
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
			)
			{
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
			
			
			|			(
				a4_0 = parse_mcda_demo1_option				{
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
			)
			{
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
			
			
			|			a5 = 'name' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[38]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[39]);
			}
			
			(
				a7 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[40]);
			}
			
			a8 = ';' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
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
			
			
			|			a9 = 'description' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[50]);
			}
			
			a10 = ':' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[51]);
			}
			
			(
				a11 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[52]);
			}
			
			a12 = ';' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
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
			
		)
		
	)*	{
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
	
	a13 = '}' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createTask();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_mcda_demo1_Filter returns [mcda.demo1.Filter element = null]
@init{
}
:
	a0 = 'Filter' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[71]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[72]);
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[73]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[74]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[75]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[76]);
	}
	
	(
		a6 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[77]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[78]);
	}
	
	a8 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFilter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
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
	
;

parse_mcda_demo1_Analyze returns [mcda.demo1.Analyze element = null]
@init{
}
:
	a0 = 'Analyze' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[88]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[90]);
	}
	
	(
		(
			(
				a2 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[91]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[92]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[94]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[95]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createAnalyze();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_mcda_demo1_Evaluate returns [mcda.demo1.Evaluate element = null]
@init{
}
:
	a0 = 'Evaluate' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[105]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[106]);
	}
	
	a2 = 'criteriaName' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[107]);
	}
	
	a3 = ':' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[108]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[109]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[110]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[111]);
	}
	
	(
		(
			(
				a6_0 = parse_mcda_demo1_EvaluatePair				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[112]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[113]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[114]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[115]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[116]);
	}
	
	a8 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
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
	
;

parse_mcda_demo1_File returns [mcda.demo1.File element = null]
@init{
}
:
	a0 = 'File' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[126]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[127]);
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[128]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[129]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createFile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_mcda_demo1_OptionType returns [mcda.demo1.OptionType element = null]
@init{
}
:
	a0 = 'OptionType' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[139]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[140]);
	}
	
	a2 = 'name' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[141]);
	}
	
	a3 = ':' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[142]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[143]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[145]);
	}
	
	(
		(
			(
				a6_0 = parse_mcda_demo1_Criteria				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[146]);
				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[147]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[149]);
	}
	
	(
		a7_0 = parse_mcda_demo1_ComparisonMatrix		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[150]);
	}
	
	a8 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[151]);
	}
	
	a9 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createOptionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
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
	
;

parse_mcda_demo1_option returns [mcda.demo1.option element = null]
@init{
}
:
	a0 = 'Option' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[161]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[162]);
	}
	
	a2 = 'name' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[163]);
	}
	
	a3 = ':' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[164]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[165]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[166]);
	}
	
	(
		a6 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[167]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[168]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[169]);
	}
	
	(
		(
			a7 = ',' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[170]);
			}
			
			(
				a8 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[171]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[172]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[173]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[174]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[175]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[176]);
	}
	
	(
		(
			a9 = ';' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[177]);
			}
			
			a10 = 'description' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[178]);
			}
			
			a11 = ':' {
				if (element == null) {
					element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[179]);
			}
			
			(
				a12 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[180]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[181]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[183]);
	}
	
	a13 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[184]);
	}
	
	a14 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[185]);
	}
	
	a15 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createoption();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
	}
	{
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
	
;

parse_mcda_demo1_ComparisonMatrix returns [mcda.demo1.ComparisonMatrix element = null]
@init{
}
:
	a0 = 'ComparisonMatrix' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[195]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[197]);
	}
	
	(
		(
			(
				a2_0 = parse_mcda_demo1_ComparisonPair				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[198]);
				addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[199]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[200]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[201]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[202]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonMatrix();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[203]);
	}
	
;

parse_mcda_demo1_EvaluatePair returns [mcda.demo1.EvaluatePair element = null]
@init{
}
:
	a0 = 'EvaluatePair' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[204]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[205]);
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[206]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[207]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[208]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[209]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createEvaluatePair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[210]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[211]);
	}
	
;

parse_mcda_demo1_Criteria returns [mcda.demo1.Criteria element = null]
@init{
}
:
	a0 = 'Criteria' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[212]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[213]);
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[214]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[215]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createCriteria();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[216]);
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[217]);
	}
	
;

parse_mcda_demo1_ComparisonPair returns [mcda.demo1.ComparisonPair element = null]
@init{
}
:
	a0 = 'ComparisonPair' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[218]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[219]);
	}
	
	(
		a2 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[220]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[221]);
	}
	
	(
		a4 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[222]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[223]);
	}
	
	(
		a6 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[224]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[225]);
	}
	
	a8 = ';' {
		if (element == null) {
			element = mcda.demo1.mcdaFactory.eINSTANCE.createComparisonPair();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[226]);
		addExpectedElement(null, mcda.demo1.resource.mcda.mopp.McdaExpectationConstants.EXPECTATIONS[227]);
	}
	
;

parse_mcda_demo1_operation returns [mcda.demo1.operation element = null]
:
	c0 = parse_mcda_demo1_Filter{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_mcda_demo1_Analyze{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_mcda_demo1_Evaluate{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_mcda_demo1_File{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

IDENTIFIER:
	(('A'..'Z' | 'a'..'z' | '-'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*)
	{ _channel = 99; }
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
INTEGER:
	(('-')?('1'..'9')('0'..'9')*|'0')
	{ _channel = 99; }
;
FLOAT:
	(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
	{ _channel = 99; }
;
SL_COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

