
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

/** A sentence is a sequence of tokens.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * @generated */
public class Sentence_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.nlp.Sentence");
 
  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
   /** @generated */
  public int getTokens(int addr, int i) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }
   
  /** @generated */ 
  public void setTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_NGramSets;
  /** @generated */
  final int     casFeatCode_NGramSets;
  /** @generated */ 
  public int getNGramSets(int addr) {
        if (featOkTst && casFeat_NGramSets == null)
      jcas.throwFeatMissing("NGramSets", "hw1.nlp.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NGramSets);
  }
  /** @generated */    
  public void setNGramSets(int addr, int v) {
        if (featOkTst && casFeat_NGramSets == null)
      jcas.throwFeatMissing("NGramSets", "hw1.nlp.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_NGramSets, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_NGramSets = jcas.getRequiredFeatureDE(casType, "NGramSets", "hw1.nlp.NGramSet", featOkTst);
    casFeatCode_NGramSets  = (null == casFeat_NGramSets) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NGramSets).getCode();

  }
}



    