package mcda.demo1.resource.mcda.interpreter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;

import mcda.demo1.Analyze;
import mcda.demo1.ComparisonMatrix;
import mcda.demo1.ComparisonPair;
import mcda.demo1.Criteria;
import mcda.demo1.Evaluate;
import mcda.demo1.EvaluatePair;
import mcda.demo1.File;
import mcda.demo1.Filter;
import mcda.demo1.OptionType;
import mcda.demo1.Task;
import mcda.demo1.operation;
import mcda.demo1.option;
import mcda.demo1.resource.mcda.IMcdaInterpreterListener;
import mcda.demo1.resource.mcda.util.AbstractMcdaInterpreter;
import Jama.*;

public class MCDAInterpreter extends AbstractMcdaInterpreter {
	
	ArrayList<ArrayList> optionList = new ArrayList<ArrayList>();
	ArrayList<ArrayList> evaluatedOptionList = new ArrayList<ArrayList>();
	HashMap c2n = new HashMap();
	HashMap n2c = new HashMap();
//	Matrix criteriaMatrix;
	double[][] criteriaMatrix;
	int criteriaNumber = 0;
	int optionNumber = 0;
	double[] weight;
	

	@Override
	public Object interprete(Object context) {
		// TODO Auto-generated method stub
		return super.interprete(context);
	}

	@Override
	public boolean continueInterpretation(Object context, Object result) {
		// TODO Auto-generated method stub
		return super.continueInterpretation(context, result);
	}

	@Override
	public Object interprete(EObject object, Object context) {
		// TODO Auto-generated method stub
		//return super.interprete(object, context);
		Object result = null;
		if (object instanceof mcda.demo1.Task) {
			Task task = (mcda.demo1.Task) object;
			System.out.println("==================================================");
			System.out.println("Task:"+task.getName());
			System.out.println("Description:"+task.getDescription());
//			System.out.println("--------------------------------------------------");
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
		
		if (object instanceof mcda.demo1.Evaluate) {
			Evaluate ev = (Evaluate) object;
			String cName = ev.getCriteriaName();
			List aList = ev.getContain();
			for(int i = 0; i < aList.size();i++){
				EvaluatePair ep = (EvaluatePair)aList.get(i);
				String attValue = ep.getName();
				String attNum = ep.getValue();
				int location = (int)c2n.get(cName)+1;
				
				for(int j = 0; j < evaluatedOptionList.size();j++){
					if(evaluatedOptionList.get(j).get(location).equals(attValue)){
						evaluatedOptionList.get(j).set(location, attNum);
					}
				}
				
			}
			
			
			
			
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
			OptionType optionType = (OptionType) object;
			List c = optionType.getDefineCriteria();
			int s = c.size();
			criteriaNumber = s;
//			criteriaMatrix = new Matrix(4,4);
			criteriaMatrix = new double[s][s];
			for(int i = 0; i < c.size(); i++){
				mcda.demo1.Criteria cc = (Criteria)c.get(i);
				c2n.put(cc.getName(), i);
				n2c.put(i, cc.getName());
//				System.out.println(cc.getName());
//				criteriaMatrix.set(i, i, 1);
				criteriaMatrix[i][i] = 1;
			}
			
			
			result = interprete_mcda_demo1_OptionType((mcda.demo1.OptionType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.option) {
			option op = (option) object;
			ArrayList<String> opt = new ArrayList<String>();
			ArrayList<String> eopt = new ArrayList<String>();
			opt.add(op.getName());
			eopt.add(op.getName());
			List atts = op.getAttribute();
			for(int i = 0; i < atts.size();i++){
				opt.add((String)atts.get(i));
				eopt.add((String)atts.get(i));
			}
			if(op.getDescription() != null){
				opt.add(op.getDescription());
				eopt.add(op.getDescription());
			}
			optionList.add(opt);
			evaluatedOptionList.add(eopt);
			optionNumber++;
					
			
			result = interprete_mcda_demo1_option((mcda.demo1.option) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mcda.demo1.ComparisonMatrix) {
			ComparisonMatrix cm = (ComparisonMatrix)object;
			List cmm = cm.getMakeupof();
			for(int i = 0; i < cmm.size(); i ++){
				ComparisonPair cp = (ComparisonPair)cmm.get(i);
				//System.out.println(cp.getCriteria1()+","+cp.getCriteria2()+","+cp.getValue());
				double d;
				if(yunsuanjibie(cp.getValue()) !=null){
					d = Double.valueOf(yunsuanjibie(cp.getValue()));
				}else{
					d = Double.valueOf(cp.getValue());
				}
				
				int i1 = (int)c2n.get(cp.getCriteria1());
				int i2 = (int)c2n.get(cp.getCriteria2());
				criteriaMatrix[i1][i2] = d;
				criteriaMatrix[i2][i1] = 1/d;
//				criteriaMatrix.set((int)c2n.get(cp.getCriteria1()), (int)c2n.get(cp.getCriteria2()), d);
//				criteriaMatrix.set((int)c2n.get(cp.getCriteria2()), (int)c2n.get(cp.getCriteria1()), 1/d);
				
				
				
			}
			
			System.out.println("--------------------------------------------------");
			System.out.println("The Criteria Comparison Matrix");
			System.out.println("--------------------------------------------------");
//			System.out.println(criteriaMatrix);
			System.out.print(rpad("",12));
			for(int k = 0 ; k < criteriaNumber;k++){
				System.out.print(rpad((String)n2c.get(k),12));
				
				
			}
			System.out.println();
			for(int i = 0; i < criteriaNumber; i++){
				System.out.print(rpad((String)n2c.get(i),12));
//				System.out.print("\t\t");
				for(int j = 0; j < criteriaNumber; j++){
					DecimalFormat df = new DecimalFormat("0.00");
					String num = df.format(criteriaMatrix[i][j]);
					System.out.print(rpad(num,12));
//					System.out.print("\t\t");
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------------");
			
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
		if (object instanceof mcda.demo1.Analyze) {
			System.out.println("--------------------------------------------------");
			System.out.println("Option List");
			System.out.println("--------------------------------------------------");
			System.out.print(rpad("Option",12));
			for(int k = 0 ; k < criteriaNumber;k++){
				System.out.print(rpad((String)n2c.get(k),12));
			}
			System.out.print("Description");
			System.out.println();
			for(int i = 0; i < optionList.size();i++){
				for(int j = 0; j < optionList.get(i).size();j++){
					System.out.print(rpad((String)optionList.get(i).get(j),12));
				}
				
				System.out.println();
			}
			System.out.println("--------------------------------------------------");
			
			
			System.out.println("--------------------------------------------------");
			System.out.println("Evaluated Option List");
			System.out.println("--------------------------------------------------");
			System.out.print(rpad("Option",12));
			for(int k = 0 ; k < criteriaNumber;k++){
				System.out.print(rpad((String)n2c.get(k),12));
			}
			System.out.print("Description");
			System.out.println();
			for(int i = 0; i < evaluatedOptionList.size();i++){
				for(int j = 0; j < evaluatedOptionList.get(i).size();j++){
					System.out.print(rpad((String)evaluatedOptionList.get(i).get(j),12));
				}
				
				System.out.println();
			}
			System.out.println("--------------------------------------------------");
			
			
			
			
			
	
					weight = new double[criteriaNumber];
			
					AHPComputeWeight instance = AHPComputeWeight.getInstance();
			
			
					 
					instance.weight(criteriaMatrix, weight, criteriaNumber);
			
//					System.out.println(Arrays.toString(weight));
			
			
			
			
			
			
			
			
			
			
			double[][] evaluatedMatrix= new double[optionNumber][criteriaNumber];
			for(int i = 0; i < evaluatedOptionList.size();i++){
				for(int j = 0; j < criteriaNumber;j++){
					evaluatedMatrix[i][j] = Double.valueOf((String)evaluatedOptionList.get(i).get(j+1));
				}
			}
			
			
			double sum = 0;
			HashMap pos2score = new HashMap();
			HashMap score2pos = new HashMap();
			double[] sort = new double[optionNumber];
			
			for(int i = 0; i < optionNumber; i++){
				for(int j = 0; j < criteriaNumber; j++){
					sum += weight[j]*evaluatedMatrix[i][j];
				}
				sort[i] = sum;
				pos2score.put(i, sum);
				score2pos.put(sum, i);
				sum = 0;
			}
			
			Arrays.sort(sort);
			double t = 0;
			for (int i = 0; i < sort.length /2; i++) {
				  t = sort[i];
				  sort[i] = sort[sort.length-1-i];
				  sort[sort.length-1-i] = t;
			}
			
			
			
			System.out.println("--------------------------------------------------");
			System.out.println("Decision Ranks");
			System.out.println("--------------------------------------------------");
			System.out.print(rpad("Rank",12));
			System.out.print(rpad("Score",12));
			System.out.print(rpad("Option",12));
			for(int k = 0 ; k < criteriaNumber;k++){
				System.out.print(rpad((String)n2c.get(k),12));
			}
			System.out.print("Description");
			System.out.println();
//			for(int i = 0; i < evaluatedOptionList.size();i++){
//				for(int j = 0; j < evaluatedOptionList.get(i).size();j++){
//					System.out.print(rpad((String)evaluatedOptionList.get(i).get(j),12));
//				}
//				
//				System.out.println();
//			}
			
			for (int i = 0; i < sort.length; i++) {
				  int pos = (int)score2pos.get(sort[i]);
				  System.out.print(rpad(""+(i+1),12));
				  DecimalFormat df = new DecimalFormat("0.0000");
			      String num = df.format(sort[i]);
					
				  System.out.print(rpad(num,12));
				  
				  for(int j = 0; j < optionList.get(pos).size(); j++){
					  System.out.print(rpad((String)optionList.get(pos).get(j),12));
				  }
				  System.out.println();
			}
			
			
			System.out.println("--------------------------------------------------");
			
			System.out.println("==================================================");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			result = interprete_mcda_demo1_Analyze((mcda.demo1.Analyze) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public String rpad(String inStr, int finalLength)
	{
	    return (inStr + "                                " // typically a sufficient length spaces string.
	        ).substring(0, finalLength);
	}
	
	public static String addBigDecimal(String a, String b) {     
        double a1 = Double.parseDouble(a);     
        double b1 = Double.parseDouble(b);     
        BigDecimal a2 = BigDecimal.valueOf(a1);     
        BigDecimal b2 = BigDecimal.valueOf(b1);     
        BigDecimal c2 = a2.add(b2);     
        String c1 = c2 + "";     
        return c1;     
    }    
    /**   
     * 两个字符类型的小数进行相减为a-b;   
     *    
     * @param a   
     * @param b   
     * @return   
     */    
    public static String reduceBigDecimal(String a, String b) {     
        double a1 = Double.parseDouble(a);     
        double b1 = Double.parseDouble(b);     
        BigDecimal a2 = BigDecimal.valueOf(a1);     
        BigDecimal b2 = BigDecimal.valueOf(b1);     
        BigDecimal c2 = a2.subtract(b2);     
        String c1 = c2 + "";     
        return c1;     
    }    
    /**   
     * 两个字符类型的数相乘 a*b=c；   
     *    
     * @param a   
     * @param b   
     * @return   
     */    
    public static String multipliedString(String a, String b) {     
        double a1 = Double.parseDouble(a);     
        double b1 = Double.parseDouble(b);     
        BigDecimal a2 = BigDecimal.valueOf(a1);     
        BigDecimal b2 = BigDecimal.valueOf(b1);     
        BigDecimal c2 = a2.multiply(b2);     
        String c1 = c2 + "";     
        return c1;     
    }    
    /**   
     * 两个字符类型的数相除 a/b=c；   
     *    
     * @param a   
     * @param b   
     * @return   
     */    
    public static String divideString(String a, String b) {     
        double a1 = Double.parseDouble(a);     
        double b1 = Double.parseDouble(b);     
        BigDecimal a2 = BigDecimal.valueOf(a1);     
        BigDecimal b2 = BigDecimal.valueOf(b1);     
        BigDecimal c2 = a2.divide(b2,a2.scale());     
        String c1 = c2 + "";     
        return c1;     
    }    
	
	
	public static String yunsuanjibie(String s) {  
        String r = "";  
        int p = 0;  
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'  
                    || s.charAt(i) == '/') {  
                p++;  
            }  
        }
        if(p == 0){
        	return null;
        }
        String k[] = new String[2 * p + 1];  
        int k1 = 0;  
        int first = 0;  
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'  
                    || s.charAt(i) == '/') {  
                k[k1] = s.substring(first, i);  
                k1++;  
                k[k1] = "" + s.charAt(i);  
                k1++;  
                first = i + 1;  
            }
        }  
        k[k1] = s.substring(first, s.length());  
        int kp = p;  
        while (kp > 0) {  
            for (int i = 0; i < k.length; i++) {  
                if (k[i].equals("*") || k[i].equals("/")) {  
                    int l;  
                    for (l = i - 1; l > -1; l--) {  
                        if (!(k[l].equals("p")))  
                            break;  
                    }  
                    int q;  
                    for (q = i + 1; q < k.length; q++) {  
                        if (!(k[l].equals("p")))  
                            break;  
                    }  
                    if (k[i].equals("*")) {  
                        k[i] = ""+ multipliedString(k[l],k[q]);  
                        k[l] = "p";  
                        k[q] = "p";  
                        kp--;  
                    } else {  
                        k[i] = ""+divideString(k[l],k[q]);  
                        k[l] = "p";  
                        k[q] = "p";  
                        kp--;  
                    }  
                    break;  
                }  
            }  
            for (int i = 0; i < 2 * p + 1; i++) {  
                if (k[i].equals("+") || k[i].equals("-")) {  
                    int l;  
                    for (l = i - 1; l > -1; l--) {  
                        if (!(k[l].equals("p")))  
                            break;  
                    }  
                    int q;  
                    for (q = i + 1; q < k.length; q++) {  
                        if (!(k[q].equals("p")))  
                            break;  
                    }  
                    if (k[i].equals("+")) {  
                        k[i] = ""+addBigDecimal(k[l],k[q]);  
                        k[l] = "p";  
                        k[q] = "p";  
                        kp--;  
                    } else {  
                        k[i] = ""+reduceBigDecimal(k[l],k[q]);  
                        k[l] = "p";  
                        k[q] = "p";  
                        kp--;  
                    }  
                    break;  
                }  
            }  
            for (int i = 0; i < k.length; i++) {  
                if (!(k[i].equals("p"))) {  
                    r = k[i];  
                    break;  
                }  
            }  
        }  
        return r;  
    }  
	
	
	

	@Override
	public Object interprete_mcda_demo1_Task(Task task, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_Task(task, context);
	}

	@Override
	public Object interprete_mcda_demo1_operation(operation operation,
			Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_operation(operation, context);
	}

	@Override
	public Object interprete_mcda_demo1_Filter(Filter filter, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_Filter(filter, context);
	}

	@Override
	public Object interprete_mcda_demo1_Analyze(Analyze analyze, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_Analyze(analyze, context);
	}

	@Override
	public Object interprete_mcda_demo1_Evaluate(Evaluate evaluate,
			Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_Evaluate(evaluate, context);
	}

	@Override
	public Object interprete_mcda_demo1_File(File file, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_File(file, context);
	}

	@Override
	public Object interprete_mcda_demo1_OptionType(OptionType optionType,
			Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_OptionType(optionType, context);
	}

	@Override
	public Object interprete_mcda_demo1_option(option option, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_option(option, context);
	}

	@Override
	public Object interprete_mcda_demo1_ComparisonMatrix(
			ComparisonMatrix comparisonMatrix, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_ComparisonMatrix(comparisonMatrix, context);
	}

	@Override
	public Object interprete_mcda_demo1_EvaluatePair(EvaluatePair evaluatePair,
			Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_EvaluatePair(evaluatePair, context);
	}

	@Override
	public Object interprete_mcda_demo1_Criteria(Criteria criteria,
			Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_Criteria(criteria, context);
	}

	@Override
	public Object interprete_mcda_demo1_ComparisonPair(
			ComparisonPair comparisonPair, Object context) {
		// TODO Auto-generated method stub
		return super.interprete_mcda_demo1_ComparisonPair(comparisonPair, context);
	}

	@Override
	public void addObjectToInterprete(EObject object) {
		// TODO Auto-generated method stub
		super.addObjectToInterprete(object);
	}

	@Override
	public void addObjectsToInterprete(Collection objects) {
		// TODO Auto-generated method stub
		super.addObjectsToInterprete(objects);
	}

	@Override
	public void addObjectsToInterpreteInReverseOrder(Collection objects) {
		// TODO Auto-generated method stub
		super.addObjectsToInterpreteInReverseOrder(objects);
	}

	@Override
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		// TODO Auto-generated method stub

//		super.addObjectTreeToInterpreteTopDown(root);
		
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		
		java.util.List<org.eclipse.emf.ecore.EObject> evaluationAndPairs = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> analyze = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> optiontype = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> comparisonMatrixAndPairs = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> criteria = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> option = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		java.util.List<org.eclipse.emf.ecore.EObject> newList = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
//			System.out.println(eObject);
		}
		
		int i = 0;
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.Evaluate || objects.get(i) instanceof mcda.demo1.EvaluatePair){
				evaluationAndPairs.add(objects.get(i));
			}
		}
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.Analyze){
				analyze.add(objects.get(i));
			}
		}
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.OptionType){
				optiontype.add(objects.get(i));
			}
		}
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.ComparisonMatrix || objects.get(i) instanceof mcda.demo1.ComparisonPair){
				comparisonMatrixAndPairs.add(objects.get(i));
			}
		}
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.Criteria){
				criteria.add(objects.get(i));
			}
		}
		for(i = 0; i < objects.size();i++){
			if(objects.get(i) instanceof mcda.demo1.option){
				option.add(objects.get(i));
			}
		}
		
		newList.add(root);
		newList.addAll(optiontype);
		newList.addAll(criteria);
		newList.addAll(comparisonMatrixAndPairs);
		newList.addAll(option);
		newList.addAll(evaluationAndPairs);
		newList.addAll(analyze);
		
		
//		addObjectsToInterpreteInReverseOrder(objects);
		addObjectsToInterpreteInReverseOrder(newList);
	}

	@Override
	public void addListener(IMcdaInterpreterListener newListener) {
		// TODO Auto-generated method stub
		super.addListener(newListener);
	}

	@Override
	public boolean removeListener(IMcdaInterpreterListener listener) {
		// TODO Auto-generated method stub
		return super.removeListener(listener);
	}

	@Override
	public EObject getNextObjectToInterprete() {
		// TODO Auto-generated method stub
		return super.getNextObjectToInterprete();
	}

	@Override
	public Stack getInterpretationStack() {
		// TODO Auto-generated method stub
		return super.getInterpretationStack();
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		super.terminate();
	}

	@Override
	public Object getCurrentContext() {
		// TODO Auto-generated method stub
		return super.getCurrentContext();
	}

}
