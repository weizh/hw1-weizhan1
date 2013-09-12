

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.qa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.nlp.Sentence;


/** The question for the QA problem.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Question extends Sentence {
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
  //* Feature: docID

  /** getter for docID - gets The document ID of the question.
   * @generated */
  public String getDocID() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_docID);}
    
  /** setter for docID - sets The document ID of the question. 
   * @generated */
  public void setDocID(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_docID == null)
      jcasType.jcas.throwFeatMissing("docID", "hw1.qa.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_docID, v);}    
  }

    