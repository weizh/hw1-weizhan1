

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The Answer wrapped up with the scoring information and the QAProblem.Answer class.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class AnswerScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
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

  /** getter for begin - gets The starting position of the answer in the doucment.
   * @generated */
  public int getBegin() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets The starting position of the answer in the doucment. 
   * @generated */
  public void setBegin(int v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the ending position of the answer in the document.
   * @generated */
  public int getEnd() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the ending position of the answer in the document. 
   * @generated */
  public void setEnd(int v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The processor that generates this answerScore
   * @generated */
  public String getProcID() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The processor that generates this answerScore 
   * @generated */
  public void setProcID(String v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence for the answer.

   * @generated */
  public double getConfidence() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence for the answer.
 
   * @generated */
  public void setConfidence(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The answer score that is generated from the processor which is denoted by the procID.
   * @generated */
  public double getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The answer score that is generated from the processor which is denoted by the procID. 
   * @generated */
  public void setScore(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets an answer token and it's gold answer label.
   * @generated */
  public Answer getAnswer() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "hw1.weizhan1.AnswerScore");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets an answer token and it's gold answer label. 
   * @generated */
  public void setAnswer(Answer v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets The rank of the answer after ranking the answers based on the scores generated. This field is for boosting the evaluation time. For the first time of the evaluation, we have to rank the answers based on the scores, so the running time will be O(n*log(n)). Next time when we want to use a larger or smaller N, we don't want to sort the answers again, so we can use this rank field to do one-pass filtering to get the top K ( new N value) to measure P@K with only O(n) running time. If K is smaller, it will be O(N). If K is larger, it will be O(Total number of answers).
   * @generated */
  public int getRank() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "hw1.weizhan1.AnswerScore");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets The rank of the answer after ranking the answers based on the scores generated. This field is for boosting the evaluation time. For the first time of the evaluation, we have to rank the answers based on the scores, so the running time will be O(n*log(n)). Next time when we want to use a larger or smaller N, we don't want to sort the answers again, so we can use this rank field to do one-pass filtering to get the top K ( new N value) to measure P@K with only O(n) running time. If K is smaller, it will be O(N). If K is larger, it will be O(Total number of answers). 
   * @generated */
  public void setRank(int v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "hw1.weizhan1.AnswerScore");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_rank, v);}    
  }

    