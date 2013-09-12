

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.Base;


/** The NGram of the tokens or the tags.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class NGram extends Base {
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
  //* Feature: elementType

  /** getter for elementType - gets values can be "TOKEN", "POS", "ENTITY", "SEMANTIC_ROLE", "HEAD", which means if the elements are tokens, or part-of-speeches, or entities, etc.
   * @generated */
  public String getElementType() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.nlp.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType);}
    
  /** setter for elementType - sets values can be "TOKEN", "POS", "ENTITY", "SEMANTIC_ROLE", "HEAD", which means if the elements are tokens, or part-of-speeches, or entities, etc. 
   * @generated */
  public void setElementType(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.nlp.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType, v);}    
   
    
  //*--------------*
  //* Feature: numberOfElements

  /** getter for numberOfElements - gets 1 for unigram, or 2 for bigram, or 3 for trigram.
   * @generated */
  public int getNumberOfElements() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_numberOfElements == null)
      jcasType.jcas.throwFeatMissing("numberOfElements", "hw1.nlp.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_numberOfElements);}
    
  /** setter for numberOfElements - sets 1 for unigram, or 2 for bigram, or 3 for trigram. 
   * @generated */
  public void setNumberOfElements(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_numberOfElements == null)
      jcasType.jcas.throwFeatMissing("numberOfElements", "hw1.nlp.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_numberOfElements, v);}    
   
    
  //*--------------*
  //* Feature: count

  /** getter for count - gets The time that a NGram appears in a NGramSet. collection could be generated from sentence, or from a tag sequence.
   * @generated */
  public int getCount() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_count == null)
      jcasType.jcas.throwFeatMissing("count", "hw1.nlp.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_count);}
    
  /** setter for count - sets The time that a NGram appears in a NGramSet. collection could be generated from sentence, or from a tag sequence. 
   * @generated */
  public void setCount(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_count == null)
      jcasType.jcas.throwFeatMissing("count", "hw1.nlp.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_count, v);}    
  }

    