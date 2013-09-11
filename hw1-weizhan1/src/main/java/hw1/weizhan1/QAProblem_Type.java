
/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The type of QA problems, which include question and answers. The answers are wrapped into the answer scores.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * @generated */
public class QAProblem_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAProblem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAProblem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAProblem(addr, QAProblem_Type.this);
  			   QAProblem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAProblem(addr, QAProblem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAProblem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.weizhan1.QAProblem");
 
  /** @generated */
  final Feature casFeat_totalNumberOfAnswers;
  /** @generated */
  final int     casFeatCode_totalNumberOfAnswers;
  /** @generated */ 
  public int getTotalNumberOfAnswers(int addr) {
        if (featOkTst && casFeat_totalNumberOfAnswers == null)
      jcas.throwFeatMissing("totalNumberOfAnswers", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_totalNumberOfAnswers);
  }
  /** @generated */    
  public void setTotalNumberOfAnswers(int addr, int v) {
        if (featOkTst && casFeat_totalNumberOfAnswers == null)
      jcas.throwFeatMissing("totalNumberOfAnswers", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setIntValue(addr, casFeatCode_totalNumberOfAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_procID;
  /** @generated */
  final int     casFeatCode_procID;
  /** @generated */ 
  public String getProcID(int addr) {
        if (featOkTst && casFeat_procID == null)
      jcas.throwFeatMissing("procID", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_procID);
  }
  /** @generated */    
  public void setProcID(int addr, String v) {
        if (featOkTst && casFeat_procID == null)
      jcas.throwFeatMissing("procID", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setStringValue(addr, casFeatCode_procID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_docID;
  /** @generated */
  final int     casFeatCode_docID;
  /** @generated */ 
  public int getDocID(int addr) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_docID);
  }
  /** @generated */    
  public void setDocID(int addr, int v) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setIntValue(addr, casFeatCode_docID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_totalNumberOfCorrectAnswers;
  /** @generated */
  final int     casFeatCode_totalNumberOfCorrectAnswers;
  /** @generated */ 
  public int getTotalNumberOfCorrectAnswers(int addr) {
        if (featOkTst && casFeat_totalNumberOfCorrectAnswers == null)
      jcas.throwFeatMissing("totalNumberOfCorrectAnswers", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_totalNumberOfCorrectAnswers);
  }
  /** @generated */    
  public void setTotalNumberOfCorrectAnswers(int addr, int v) {
        if (featOkTst && casFeat_totalNumberOfCorrectAnswers == null)
      jcas.throwFeatMissing("totalNumberOfCorrectAnswers", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setIntValue(addr, casFeatCode_totalNumberOfCorrectAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pAtN;
  /** @generated */
  final int     casFeatCode_pAtN;
  /** @generated */ 
  public double getPAtN(int addr) {
        if (featOkTst && casFeat_pAtN == null)
      jcas.throwFeatMissing("pAtN", "hw1.weizhan1.QAProblem");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_pAtN);
  }
  /** @generated */    
  public void setPAtN(int addr, double v) {
        if (featOkTst && casFeat_pAtN == null)
      jcas.throwFeatMissing("pAtN", "hw1.weizhan1.QAProblem");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_pAtN, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAProblem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_totalNumberOfAnswers = jcas.getRequiredFeatureDE(casType, "totalNumberOfAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_totalNumberOfAnswers  = (null == casFeat_totalNumberOfAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_totalNumberOfAnswers).getCode();

 
    casFeat_procID = jcas.getRequiredFeatureDE(casType, "procID", "uima.cas.String", featOkTst);
    casFeatCode_procID  = (null == casFeat_procID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_procID).getCode();

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "hw1.weizhan1.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_docID = jcas.getRequiredFeatureDE(casType, "docID", "uima.cas.Integer", featOkTst);
    casFeatCode_docID  = (null == casFeat_docID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docID).getCode();

 
    casFeat_totalNumberOfCorrectAnswers = jcas.getRequiredFeatureDE(casType, "totalNumberOfCorrectAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_totalNumberOfCorrectAnswers  = (null == casFeat_totalNumberOfCorrectAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_totalNumberOfCorrectAnswers).getCode();

 
    casFeat_pAtN = jcas.getRequiredFeatureDE(casType, "pAtN", "uima.cas.Double", featOkTst);
    casFeatCode_pAtN  = (null == casFeat_pAtN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pAtN).getCode();

  }
}



    