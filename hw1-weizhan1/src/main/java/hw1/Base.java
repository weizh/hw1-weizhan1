

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The Base Annotation which includes source and confidence values for it.
The Annotation type has already defined the begin and end position, so we don't define those again here.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Base extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Base.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Base() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Base(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Base(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Base(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets The source of the Annotation, which is the processor ID.
   * @generated */
  public String getSource() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1.Base");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Base_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The source of the Annotation, which is the processor ID. 
   * @generated */
  public void setSource(String v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1.Base");
    jcasType.ll_cas.ll_setStringValue(addr, ((Base_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence value of this annotation.
   * @generated */
  public double getConfidence() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.Base");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence value of this annotation. 
   * @generated */
  public void setConfidence(double v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.Base");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: lang

  /** getter for lang - gets The language of the Annotation type. This is set for handling internationalzation.
   * @generated */
  public String getLang() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_lang == null)
      jcasType.jcas.throwFeatMissing("lang", "hw1.Base");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Base_Type)jcasType).casFeatCode_lang);}
    
  /** setter for lang - sets The language of the Annotation type. This is set for handling internationalzation. 
   * @generated */
  public void setLang(String v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_lang == null)
      jcasType.jcas.throwFeatMissing("lang", "hw1.Base");
    jcasType.ll_cas.ll_setStringValue(addr, ((Base_Type)jcasType).casFeatCode_lang, v);}    
  }

    