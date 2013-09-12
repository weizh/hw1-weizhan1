
/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.qa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import hw1.Base_Type;

/** 
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * @generated */
public class Problem_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Problem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Problem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Problem(addr, Problem_Type.this);
  			   Problem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Problem(addr, Problem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Problem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.qa.Problem");
 
  /** @generated */
  final Feature casFeat_answers;
  /** @generated */
  final int     casFeatCode_answers;
  /** @generated */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answers);
  }
  /** @generated */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    ll_cas.ll_setRefValue(addr, casFeatCode_answers, v);}
    
   /** @generated */
  public int getAnswers(int addr, int i) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
  }
   
  /** @generated */ 
  public void setAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_docID;
  /** @generated */
  final int     casFeatCode_docID;
  /** @generated */ 
  public String getDocID(int addr) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.qa.Problem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_docID);
  }
  /** @generated */    
  public void setDocID(int addr, String v) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.qa.Problem");
    ll_cas.ll_setStringValue(addr, casFeatCode_docID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numOfCorrectAnswers;
  /** @generated */
  final int     casFeatCode_numOfCorrectAnswers;
  /** @generated */ 
  public int getNumOfCorrectAnswers(int addr) {
        if (featOkTst && casFeat_numOfCorrectAnswers == null)
      jcas.throwFeatMissing("numOfCorrectAnswers", "hw1.qa.Problem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numOfCorrectAnswers);
  }
  /** @generated */    
  public void setNumOfCorrectAnswers(int addr, int v) {
        if (featOkTst && casFeat_numOfCorrectAnswers == null)
      jcas.throwFeatMissing("numOfCorrectAnswers", "hw1.qa.Problem");
    ll_cas.ll_setIntValue(addr, casFeatCode_numOfCorrectAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PatN;
  /** @generated */
  final int     casFeatCode_PatN;
  /** @generated */ 
  public double getPatN(int addr) {
        if (featOkTst && casFeat_PatN == null)
      jcas.throwFeatMissing("PatN", "hw1.qa.Problem");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PatN);
  }
  /** @generated */    
  public void setPatN(int addr, double v) {
        if (featOkTst && casFeat_PatN == null)
      jcas.throwFeatMissing("PatN", "hw1.qa.Problem");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PatN, v);}
    
  
 
  /** @generated */
  final Feature casFeat_totalAnswers;
  /** @generated */
  final int     casFeatCode_totalAnswers;
  /** @generated */ 
  public int getTotalAnswers(int addr) {
        if (featOkTst && casFeat_totalAnswers == null)
      jcas.throwFeatMissing("totalAnswers", "hw1.qa.Problem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_totalAnswers);
  }
  /** @generated */    
  public void setTotalAnswers(int addr, int v) {
        if (featOkTst && casFeat_totalAnswers == null)
      jcas.throwFeatMissing("totalAnswers", "hw1.qa.Problem");
    ll_cas.ll_setIntValue(addr, casFeatCode_totalAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.qa.Problem");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.qa.Problem");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "hw1.qa.Problem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "hw1.qa.Problem");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Problem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answers = jcas.getRequiredFeatureDE(casType, "answers", "uima.cas.FSArray", featOkTst);
    casFeatCode_answers  = (null == casFeat_answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answers).getCode();

 
    casFeat_docID = jcas.getRequiredFeatureDE(casType, "docID", "uima.cas.String", featOkTst);
    casFeatCode_docID  = (null == casFeat_docID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docID).getCode();

 
    casFeat_numOfCorrectAnswers = jcas.getRequiredFeatureDE(casType, "numOfCorrectAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_numOfCorrectAnswers  = (null == casFeat_numOfCorrectAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numOfCorrectAnswers).getCode();

 
    casFeat_PatN = jcas.getRequiredFeatureDE(casType, "PatN", "uima.cas.Double", featOkTst);
    casFeatCode_PatN  = (null == casFeat_PatN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PatN).getCode();

 
    casFeat_totalAnswers = jcas.getRequiredFeatureDE(casType, "totalAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_totalAnswers  = (null == casFeat_totalAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_totalAnswers).getCode();

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "hw1.qa.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

  }
}



    