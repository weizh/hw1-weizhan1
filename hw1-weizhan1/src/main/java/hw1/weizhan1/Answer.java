

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** An answer for the QAProblem
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Answer extends Annotation {
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
  //* Feature: tokenArray

  /** getter for tokenArray - gets The token array of the answer sentence
   * @generated */
  public Sentence getTokenArray() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "hw1.weizhan1.Answer");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets The token array of the answer sentence 
   * @generated */
  public void setTokenArray(Sentence v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the end of the answer in the document
   * @generated */
  public int getEnd() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the end of the answer in the document 
   * @generated */
  public void setEnd(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets the beginning of the answer in the document
   * @generated */
  public int getBegin() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets the beginning of the answer in the document 
   * @generated */
  public void setBegin(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The process that generated this answer
   * @generated */
  public String getProcID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The process that generated this answer 
   * @generated */
  public void setProcID(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets the confidence value for the gold answer
   * @generated */
  public double getConfidence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets the confidence value for the gold answer 
   * @generated */
  public void setConfidence(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets If the gold answer is a correct answer or not.
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.weizhan1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets If the gold answer is a correct answer or not. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.weizhan1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
  }

    