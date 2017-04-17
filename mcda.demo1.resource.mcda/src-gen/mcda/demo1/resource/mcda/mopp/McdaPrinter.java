/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaPrinter implements mcda.demo1.resource.mcda.IMcdaTextPrinter {
	
	protected mcda.demo1.resource.mcda.IMcdaTokenResolverFactory tokenResolverFactory = new mcda.demo1.resource.mcda.mopp.McdaTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private mcda.demo1.resource.mcda.IMcdaTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public McdaPrinter(java.io.OutputStream outputStream, mcda.demo1.resource.mcda.IMcdaTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof mcda.demo1.Task) {
			print_mcda_demo1_Task((mcda.demo1.Task) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.Filter) {
			print_mcda_demo1_Filter((mcda.demo1.Filter) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.Analyze) {
			print_mcda_demo1_Analyze((mcda.demo1.Analyze) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.Evaluate) {
			print_mcda_demo1_Evaluate((mcda.demo1.Evaluate) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.File) {
			print_mcda_demo1_File((mcda.demo1.File) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.OptionType) {
			print_mcda_demo1_OptionType((mcda.demo1.OptionType) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.option) {
			print_mcda_demo1_option((mcda.demo1.option) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.ComparisonMatrix) {
			print_mcda_demo1_ComparisonMatrix((mcda.demo1.ComparisonMatrix) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.EvaluatePair) {
			print_mcda_demo1_EvaluatePair((mcda.demo1.EvaluatePair) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.Criteria) {
			print_mcda_demo1_Criteria((mcda.demo1.Criteria) element, globaltab, out);
			return;
		}
		if (element instanceof mcda.demo1.ComparisonPair) {
			print_mcda_demo1_ComparisonPair((mcda.demo1.ComparisonPair) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected mcda.demo1.resource.mcda.mopp.McdaReferenceResolverSwitch getReferenceResolverSwitch() {
		return (mcda.demo1.resource.mcda.mopp.McdaReferenceResolverSwitch) new mcda.demo1.resource.mcda.mopp.McdaMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		mcda.demo1.resource.mcda.IMcdaTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new mcda.demo1.resource.mcda.mopp.McdaProblem(errorMessage, mcda.demo1.resource.mcda.McdaEProblemType.PRINT_PROBLEM, mcda.demo1.resource.mcda.McdaEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public mcda.demo1.resource.mcda.IMcdaTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_mcda_demo1_Task(mcda.demo1.Task element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPERATION));
		printCountingMap.put("haveOperation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DEFINE_TYPE));
		printCountingMap.put("defineType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPTION));
		printCountingMap.put("haveOption", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Task");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_Task_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_mcda_demo1_Task_0(mcda.demo1.Task element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"haveOperation"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"defineType"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"haveOption"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"description"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("defineType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DEFINE_TYPE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("defineType", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("haveOption");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPTION));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("haveOption", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("name");
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print(":");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME));
					if (o != null) {
						mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print(";");
				out.print(" ");
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("description");
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print(":");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("description");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION));
					if (o != null) {
						mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION), element));
						out.print(" ");
					}
					printCountingMap.put("description", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print(";");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("haveOperation");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPERATION));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("haveOperation", count - 1);
			}
		}
	}
	
	
	public void print_mcda_demo1_Filter(mcda.demo1.Filter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME));
		printCountingMap.put("criteriaName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__FILTER));
		printCountingMap.put("filter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Filter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("criteriaName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("criteriaName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP), element));
				out.print(" ");
			}
			printCountingMap.put("op", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_mcda_demo1_Analyze(mcda.demo1.Analyze element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD));
		printCountingMap.put("method", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Analyze");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_Analyze_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_mcda_demo1_Analyze_0(mcda.demo1.Analyze element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("method");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD), element));
				out.print(" ");
			}
			printCountingMap.put("method", count - 1);
		}
	}
	
	
	public void print_mcda_demo1_Evaluate(mcda.demo1.Evaluate element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CONTAIN));
		printCountingMap.put("contain", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME));
		printCountingMap.put("criteriaName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Evaluate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("criteriaName");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("criteriaName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("criteriaName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_Evaluate_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_mcda_demo1_Evaluate_0(mcda.demo1.Evaluate element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CONTAIN));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contain", count - 1);
		}
	}
	
	
	public void print_mcda_demo1_File(mcda.demo1.File element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL));
		printCountingMap.put("URL", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__IMPORT));
		printCountingMap.put("import", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("File");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("URL");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL), element));
				out.print(" ");
			}
			printCountingMap.put("URL", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_mcda_demo1_OptionType(mcda.demo1.OptionType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT));
		printCountingMap.put("compareWeight", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA));
		printCountingMap.put("defineCriteria", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OptionType");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_OptionType_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compareWeight");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compareWeight", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_mcda_demo1_OptionType_0(mcda.demo1.OptionType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("defineCriteria");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("defineCriteria", count - 1);
		}
	}
	
	
	public void print_mcda_demo1_option(mcda.demo1.option element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__INSTANCEOF));
		printCountingMap.put("instanceof", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Option");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("attribute", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_option_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_option_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_mcda_demo1_option_0(mcda.demo1.option element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("attribute", count - 1);
		}
	}
	
	public void print_mcda_demo1_option_1(mcda.demo1.option element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_mcda_demo1_ComparisonMatrix(mcda.demo1.ComparisonMatrix element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_MATRIX__MAKEUPOF));
		printCountingMap.put("makeupof", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ComparisonMatrix");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_mcda_demo1_ComparisonMatrix_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_mcda_demo1_ComparisonMatrix_0(mcda.demo1.ComparisonMatrix element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("makeupof");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_MATRIX__MAKEUPOF));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("makeupof", count - 1);
		}
	}
	
	
	public void print_mcda_demo1_EvaluatePair(mcda.demo1.EvaluatePair element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("EvaluatePair");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_mcda_demo1_Criteria(mcda.demo1.Criteria element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Criteria");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_mcda_demo1_ComparisonPair(mcda.demo1.ComparisonPair element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1));
		printCountingMap.put("Criteria1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2));
		printCountingMap.put("Criteria2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("ComparisonPair");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("Criteria1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1), element));
				out.print(" ");
			}
			printCountingMap.put("Criteria1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("Criteria2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2), element));
				out.print(" ");
			}
			printCountingMap.put("Criteria2", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE));
			if (o != null) {
				mcda.demo1.resource.mcda.IMcdaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
}
