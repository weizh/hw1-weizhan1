
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

/** Super class for token and  tag.
 * Updated by JCasGen Wed Sep 11 21:34:57 EDT 2013
 * @generated */
public class Element_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Element_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Element_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Element(addr, Element_Type.this);
  			   Element_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Element(addr, Element_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Element.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.nlp.Element");
 
  /** @generated */
  final Feature casFeat_elementType;
  /** @generated */
  final int     casFeatCode_elementType;
  /** @generated */ 
  public String getElementType(int addr) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.nlp.Element");
    return ll_cas.ll_getStringValue(addr, casFeatCode_elementType);
  }
  /** @generated */    
  public void setElementType(int addr, String v) {
        if (featOkTst && casFeat_elementType == null)
      jcas.throwFeatMissing("elementType", "hw1.nlp.Element");
    ll_cas.ll_setStringValue(addr, casFeatCode_elementType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Element_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elementType = jcas.getRequiredFeatureDE(casType, "elementType", "uima.cas.String", featOkTst);
    casFeatCode_elementType  = (null == casFeat_elementType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elementType).getCode();

  }
}



    