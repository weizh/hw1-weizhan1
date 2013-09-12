
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

/** The NGram of the tokens or the tags.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * @generated */
public class NGram_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.nlp.NGram");
 
  /** @generated */
  final Feature casFeat_elementType;
  /** @generated */
  final int     casFeatCode_elementType;
  /** @generated */ 
  public String getElementType(int addr) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.nlp.NGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_elementType);
  }
  /** @generated */    
  public void setElementType(int addr, String v) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.nlp.NGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_elementType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numberOfElements;
  /** @generated */
  final int     casFeatCode_numberOfElements;
  /** @generated */ 
  public int getNumberOfElements(int addr) {
        if (featOkTst && casFeat_numberOfElements == null)
      jcas.throwFeatMissing("numberOfElements", "hw1.nlp.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numberOfElements);
  }
  /** @generated */    
  public void setNumberOfElements(int addr, int v) {
        if (featOkTst && casFeat_numberOfElements == null)
      jcas.throwFeatMissing("numberOfElements", "hw1.nlp.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_numberOfElements, v);}
    
  
 
  /** @generated */
  final Feature casFeat_count;
  /** @generated */
  final int     casFeatCode_count;
  /** @generated */ 
  public int getCount(int addr) {
        if (featOkTst && casFeat_count == null)
      jcas.throwFeatMissing("count", "hw1.nlp.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_count);
  }
  /** @generated */    
  public void setCount(int addr, int v) {
        if (featOkTst && casFeat_count == null)
      jcas.throwFeatMissing("count", "hw1.nlp.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_count, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elementType = jcas.getRequiredFeatureDE(casType, "elementType", "uima.cas.String", featOkTst);
    casFeatCode_elementType  = (null == casFeat_elementType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elementType).getCode();

 
    casFeat_numberOfElements = jcas.getRequiredFeatureDE(casType, "numberOfElements", "uima.cas.Integer", featOkTst);
    casFeatCode_numberOfElements  = (null == casFeat_numberOfElements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numberOfElements).getCode();

 
    casFeat_count = jcas.getRequiredFeatureDE(casType, "count", "uima.cas.Integer", featOkTst);
    casFeatCode_count  = (null == casFeat_count) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_count).getCode();

  }
}



    