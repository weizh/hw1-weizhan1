

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** The NGrams, could be 1,2,or 3 grams.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class NGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: begin

  /** getter for begin - gets begin position of the ngram
   * @generated */
  public int getBegin() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets begin position of the ngram 
   * @generated */
  public void setBegin(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets The end position of the ngram
   * @generated */
  public int getEnd() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets The end position of the ngram 
   * @generated */
  public void setEnd(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The process that generated this ngram
   * @generated */
  public String getProcID() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The process that generated this ngram 
   * @generated */
  public void setProcID(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence value for this ngram
   * @generated */
  public double getConfidence() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NGram_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence value for this ngram 
   * @generated */
  public void setConfidence(double v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NGram_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets The array of the tokens contained in the NGram.
   * @generated */
  public FSArray getElements() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets The array of the tokens contained in the NGram. 
   * @generated */
  public void setElements(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - The array of the tokens contained in the NGram.
   * @generated */
  public Token getElements(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - The array of the tokens contained in the NGram.
   * @generated */
  public void setElements(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "hw1.weizhan1.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: elementType

  /** getter for elementType - gets The type that is specified for elements.
   * @generated */
  public String getElementType() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType);}
    
  /** setter for elementType - sets The type that is specified for elements. 
   * @generated */
  public void setElementType(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType, v);}    
   
    
  //*--------------*
  //* Feature: NumberOfTokens

  /** getter for NumberOfTokens - gets This is to specify if this NGram is a 1, 2, or 3 gram. 1 for unigram, 2 for bigram, and 3 for trigram.
   * @generated */
  public int getNumberOfTokens() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_NumberOfTokens == null)
      jcasType.jcas.throwFeatMissing("NumberOfTokens", "hw1.weizhan1.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_NumberOfTokens);}
    
  /** setter for NumberOfTokens - sets This is to specify if this NGram is a 1, 2, or 3 gram. 1 for unigram, 2 for bigram, and 3 for trigram. 
   * @generated */
  public void setNumberOfTokens(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_NumberOfTokens == null)
      jcasType.jcas.throwFeatMissing("NumberOfTokens", "hw1.weizhan1.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_NumberOfTokens, v);}    
  }

    