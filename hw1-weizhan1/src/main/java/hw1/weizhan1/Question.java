

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The question for the QAProblem
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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

  /** getter for tokenArray - gets token array of the question sentence.
   * @generated */
  public Sentence getTokenArray() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "hw1.weizhan1.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets token array of the question sentence. 
   * @generated */
  public void setTokenArray(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "hw1.weizhan1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets the beginning of the question in the document.
   * @generated */
  public int getBegin() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets the beginning of the question in the document. 
   * @generated */
  public void setBegin(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the end of the question
   * @generated */
  public int getEnd() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the end of the question 
   * @generated */
  public void setEnd(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The process that generated this question
   * @generated */
  public String getProcID() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The process that generated this question 
   * @generated */
  public void setProcID(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence value for the question. Sometimes the question should be weighted, and this could be the weight.
   * @generated */
  public double getConfidence() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Question");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence value for the question. Sometimes the question should be weighted, and this could be the weight. 
   * @generated */
  public void setConfidence(double v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Question");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_confidence, v);}    
  }

    