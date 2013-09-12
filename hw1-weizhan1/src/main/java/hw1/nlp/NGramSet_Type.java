
/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.nlp;

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

/** The set that contains the NGrams of a sentence.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * @generated */
public class NGramSet_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramSet_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramSet_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramSet(addr, NGramSet_Type.this);
  			   NGramSet_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramSet(addr, NGramSet_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramSet.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.nlp.NGramSet");
 
  /** @generated */
  final Feature casFeat_ngrams;
  /** @generated */
  final int     casFeatCode_ngrams;
  /** @generated */ 
  public int getNgrams(int addr) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngrams);
  }
  /** @generated */    
  public void setNgrams(int addr, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngrams, v);}
    
   /** @generated */
  public int getNgrams(int addr, int i) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
  }
   
  /** @generated */ 
  public void setNgrams(int addr, int i, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramSet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ngrams = jcas.getRequiredFeatureDE(casType, "ngrams", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngrams  = (null == casFeat_ngrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngrams).getCode();

  }
}



    