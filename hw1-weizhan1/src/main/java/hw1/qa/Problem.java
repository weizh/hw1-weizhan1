

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.qa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import hw1.Base;


/** 
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Problem extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Problem.class);
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
  protected Problem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Problem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Problem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Problem(JCas jcas, int begin, int end) {
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
  //* Feature: answers

  /** getter for answers - gets The array of answers for this QA Problem. Use AnswerScore instead of Answer.
   * @generated */
  public FSArray getAnswers() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets The array of answers for this QA Problem. Use AnswerScore instead of Answer. 
   * @generated */
  public void setAnswers(FSArray v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - The array of answers for this QA Problem. Use AnswerScore instead of Answer.
   * @generated */
  public Answer getAnswers(int i) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - The array of answers for this QA Problem. Use AnswerScore instead of Answer.
   * @generated */
  public void setAnswers(int i, Answer v) { 
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.qa.Problem");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: docID

  /** getter for docID - gets One QA problem per document. So, docID is used to specify the file that it comes from.
   * @generated */
  public String getDocID() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Problem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Problem_Type)jcasType).casFeatCode_docID);}
    
  /** setter for docID - sets One QA problem per document. So, docID is used to specify the file that it comes from. 
   * @generated */
  public void setDocID(String v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setStringValue(addr, ((Problem_Type)jcasType).casFeatCode_docID, v);}    
   
    
  //*--------------*
  //* Feature: numOfCorrectAnswers

  /** getter for numOfCorrectAnswers - gets The number of Correct Answers.
   * @generated */
  public int getNumOfCorrectAnswers() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_numOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("numOfCorrectAnswers", "hw1.qa.Problem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Problem_Type)jcasType).casFeatCode_numOfCorrectAnswers);}
    
  /** setter for numOfCorrectAnswers - sets The number of Correct Answers. 
   * @generated */
  public void setNumOfCorrectAnswers(int v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_numOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("numOfCorrectAnswers", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setIntValue(addr, ((Problem_Type)jcasType).casFeatCode_numOfCorrectAnswers, v);}    
   
    
  //*--------------*
  //* Feature: PatN

  /** getter for PatN - gets The Precision at top N of the ranked result list.
   * @generated */
  public double getPatN() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_PatN == null)
      jcasType.jcas.throwFeatMissing("PatN", "hw1.qa.Problem");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Problem_Type)jcasType).casFeatCode_PatN);}
    
  /** setter for PatN - sets The Precision at top N of the ranked result list. 
   * @generated */
  public void setPatN(double v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_PatN == null)
      jcasType.jcas.throwFeatMissing("PatN", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Problem_Type)jcasType).casFeatCode_PatN, v);}    
   
    
  //*--------------*
  //* Feature: totalAnswers

  /** getter for totalAnswers - gets Total number of answers in this question.
   * @generated */
  public int getTotalAnswers() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_totalAnswers == null)
      jcasType.jcas.throwFeatMissing("totalAnswers", "hw1.qa.Problem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Problem_Type)jcasType).casFeatCode_totalAnswers);}
    
  /** setter for totalAnswers - sets Total number of answers in this question. 
   * @generated */
  public void setTotalAnswers(int v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_totalAnswers == null)
      jcasType.jcas.throwFeatMissing("totalAnswers", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setIntValue(addr, ((Problem_Type)jcasType).casFeatCode_totalAnswers, v);}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets The question does not exist if the problem is not created.
   * @generated */
  public Question getQuestion() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.qa.Problem");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Problem_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets The question does not exist if the problem is not created. 
   * @generated */
  public void setQuestion(Question v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setRefValue(addr, ((Problem_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The text that is loaded from the input file.
   * @generated */
  public String getText() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.qa.Problem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Problem_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The text that is loaded from the input file. 
   * @generated */
  public void setText(String v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.qa.Problem");
    jcasType.ll_cas.ll_setStringValue(addr, ((Problem_Type)jcasType).casFeatCode_text, v);}    
  }

    