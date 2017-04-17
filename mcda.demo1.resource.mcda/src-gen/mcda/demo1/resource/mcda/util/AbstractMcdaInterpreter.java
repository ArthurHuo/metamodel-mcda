/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractMcdaInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<mcda.demo1.resource.mcda.IMcdaInterpreterListener> listeners = new java.util.ArrayList<mcda.demo1.resource.mcda.IMcdaInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof mcda.demo1.Task) {
			result = interprete_mcda_demo1_Task((mcda.demo1.Task) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.Filter) {
			result = interprete_mcda_demo1_Filter((mcda.demo1.Filter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.Analyze) {
			result = interprete_mcda_demo1_Analyze((mcda.demo1.Analyze) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.Evaluate) {
			result = interprete_mcda_demo1_Evaluate((mcda.demo1.Evaluate) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.File) {
			result = interprete_mcda_demo1_File((mcda.demo1.File) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.operation) {
			result = interprete_mcda_demo1_operation((mcda.demo1.operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.OptionType) {
			result = interprete_mcda_demo1_OptionType((mcda.demo1.OptionType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.option) {
			result = interprete_mcda_demo1_option((mcda.demo1.option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.ComparisonMatrix) {
			result = interprete_mcda_demo1_ComparisonMatrix((mcda.demo1.ComparisonMatrix) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.EvaluatePair) {
			result = interprete_mcda_demo1_EvaluatePair((mcda.demo1.EvaluatePair) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.Criteria) {
			result = interprete_mcda_demo1_Criteria((mcda.demo1.Criteria) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.ComparisonPair) {
			result = interprete_mcda_demo1_ComparisonPair((mcda.demo1.ComparisonPair) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_mcda_demo1_Task(mcda.demo1.Task task, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_operation(mcda.demo1.operation operation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_Filter(mcda.demo1.Filter filter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_Analyze(mcda.demo1.Analyze analyze, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_Evaluate(mcda.demo1.Evaluate evaluate, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_File(mcda.demo1.File file, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_OptionType(mcda.demo1.OptionType optionType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_option(mcda.demo1.option option, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_ComparisonMatrix(mcda.demo1.ComparisonMatrix comparisonMatrix, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_EvaluatePair(mcda.demo1.EvaluatePair evaluatePair, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_Criteria(mcda.demo1.Criteria criteria, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mcda_demo1_ComparisonPair(mcda.demo1.ComparisonPair comparisonPair, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (mcda.demo1.resource.mcda.IMcdaInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(mcda.demo1.resource.mcda.IMcdaInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(mcda.demo1.resource.mcda.IMcdaInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
