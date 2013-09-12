
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
import hw1.nlp.Sentence_Type;

/** The question for the QA problem.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * @generated */
public class Question_Type extends Sentence_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.qa.Question");
 
  /** @generated */
  final Feature casFeat_docID;
  /** @generated */
  final int     casFeatCode_docID;
  /** @generated */ 
  public String getDocID(int addr) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.qa.Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_docID);
  }
  /** @generated */    
  public void setDocID(int addr, String v) {
        if (featOkTst && casFeat_docID == null)
      jcas.throwFeatMissing("docID", "hw1.qa.Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_docID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_docID = jcas.getRequiredFeatureDE(casType, "docID", "uima.cas.String", featOkTst);
    casFeatCode_docID  = (null == casFeat_docID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docID).getCode();

  }
}



    