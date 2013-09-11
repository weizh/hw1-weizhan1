

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The type of QA problems, which include question and answers. The answers are wrapped into the answer scores.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class QAProblem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAProblem.class);
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
  protected QAProblem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAProblem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAProblem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QAProblem(JCas jcas, int begin, int end) {
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
  //* Feature: totalNumberOfAnswers

  /** getter for totalNumberOfAnswers - gets The total number of answers in this QAProblem
   * @generated */
  public int getTotalNumberOfAnswers() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_totalNumberOfAnswers == null)
      jcasType.jcas.throwFeatMissing("totalNumberOfAnswers", "hw1.weizhan1.QAProblem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_totalNumberOfAnswers);}
    
  /** setter for totalNumberOfAnswers - sets The total number of answers in this QAProblem 
   * @generated */
  public void setTotalNumberOfAnswers(int v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_totalNumberOfAnswers == null)
      jcasType.jcas.throwFeatMissing("totalNumberOfAnswers", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_totalNumberOfAnswers, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The processor ID for the file loader, or file generator that created this problem.
   * @generated */
  public String getProcID() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.QAProblem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QAProblem_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The processor ID for the file loader, or file generator that created this problem. 
   * @generated */
  public void setProcID(String v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setStringValue(addr, ((QAProblem_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets The question of the QAProblem. Should be a single instance in a QAProblem.
   * @generated */
  public Question getQuestion() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.weizhan1.QAProblem");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAProblem_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets The question of the QAProblem. Should be a single instance in a QAProblem. 
   * @generated */
  public void setQuestion(Question v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAProblem_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: docID

  /** getter for docID - gets The ID of the document that the QAProblem exists in.
   * @generated */
  public int getDocID() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.weizhan1.QAProblem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_docID);}
    
  /** setter for docID - sets The ID of the document that the QAProblem exists in. 
   * @generated */
  public void setDocID(int v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_docID, v);}    
   
    
  //*--------------*
  //* Feature: totalNumberOfCorrectAnswers

  /** getter for totalNumberOfCorrectAnswers - gets The total Number of correct answers in this QAProblem
   * @generated */
  public int getTotalNumberOfCorrectAnswers() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_totalNumberOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("totalNumberOfCorrectAnswers", "hw1.weizhan1.QAProblem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_totalNumberOfCorrectAnswers);}
    
  /** setter for totalNumberOfCorrectAnswers - sets The total Number of correct answers in this QAProblem 
   * @generated */
  public void setTotalNumberOfCorrectAnswers(int v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_totalNumberOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("totalNumberOfCorrectAnswers", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setIntValue(addr, ((QAProblem_Type)jcasType).casFeatCode_totalNumberOfCorrectAnswers, v);}    
   
    
  //*--------------*
  //* Feature: pAtN

  /** getter for pAtN - gets precision @ top N answers, where N is the total number of correct answers for this problem
   * @generated */
  public double getPAtN() {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_pAtN == null)
      jcasType.jcas.throwFeatMissing("pAtN", "hw1.weizhan1.QAProblem");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QAProblem_Type)jcasType).casFeatCode_pAtN);}
    
  /** setter for pAtN - sets precision @ top N answers, where N is the total number of correct answers for this problem 
   * @generated */
  public void setPAtN(double v) {
    if (QAProblem_Type.featOkTst && ((QAProblem_Type)jcasType).casFeat_pAtN == null)
      jcasType.jcas.throwFeatMissing("pAtN", "hw1.weizhan1.QAProblem");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QAProblem_Type)jcasType).casFeatCode_pAtN, v);}    
  }

    