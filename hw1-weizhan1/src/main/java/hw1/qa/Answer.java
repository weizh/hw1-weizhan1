

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.qa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.nlp.Sentence;


/** The Answer tag, with isCorrect Field to show the Gold answer tag.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets if the gold answer is "correct" or "not correct".
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.qa.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets if the gold answer is "correct" or "not correct". 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.qa.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: docID

  /** getter for docID - gets The doc ID that the answer comes from.
   * @generated */
  public String getDocID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_docID);}
    
  /** setter for docID - sets The doc ID that the answer comes from. 
   * @generated */
  public void setDocID(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_docID, v);}    
  }

    