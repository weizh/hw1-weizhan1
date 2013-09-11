
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

/** The NGrams, could be 1,2,or 3 grams.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * @generated */
public class NGram_Type extends Annotation_Type {
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
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.weizhan1.NGram");
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "hw1.weizhan1.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "hw1.weizhan1.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "hw1.weizhan1.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "hw1.weizhan1.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_procID;
  /** @generated */
  final int     casFeatCode_procID;
  /** @generated */ 
  public String getProcID(int addr) {
        if (featOkTst && casFeat_procID == null)
      jcas.throwFeatMissing("procID", "hw1.weizhan1.NGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_procID);
  }
  /** @generated */    
  public void setProcID(int addr, String v) {
        if (featOkTst && casFeat_procID == null)
      jcas.throwFeatMissing("procID", "hw1.weizhan1.NGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_procID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1.weizhan1.NGram");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1.weizhan1.NGram");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
   /** @generated */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  }
   
  /** @generated */ 
  public void setElements(int addr, int i, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_elementType;
  /** @generated */
  final int     casFeatCode_elementType;
  /** @generated */ 
  public String getElementType(int addr) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.weizhan1.NGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_elementType);
  }
  /** @generated */    
  public void setElementType(int addr, String v) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.weizhan1.NGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_elementType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NumberOfTokens;
  /** @generated */
  final int     casFeatCode_NumberOfTokens;
  /** @generated */ 
  public int getNumberOfTokens(int addr) {
        if (featOkTst && casFeat_NumberOfTokens == null)
      jcas.throwFeatMissing("NumberOfTokens", "hw1.weizhan1.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NumberOfTokens);
  }
  /** @generated */    
  public void setNumberOfTokens(int addr, int v) {
        if (featOkTst && casFeat_NumberOfTokens == null)
      jcas.throwFeatMissing("NumberOfTokens", "hw1.weizhan1.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_NumberOfTokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_procID = jcas.getRequiredFeatureDE(casType, "procID", "uima.cas.String", featOkTst);
    casFeatCode_procID  = (null == casFeat_procID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_procID).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_elementType = jcas.getRequiredFeatureDE(casType, "elementType", "uima.cas.String", featOkTst);
    casFeatCode_elementType  = (null == casFeat_elementType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elementType).getCode();

 
    casFeat_NumberOfTokens = jcas.getRequiredFeatureDE(casType, "NumberOfTokens", "uima.cas.Integer", featOkTst);
    casFeatCode_NumberOfTokens  = (null == casFeat_NumberOfTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NumberOfTokens).getCode();

  }
}



    