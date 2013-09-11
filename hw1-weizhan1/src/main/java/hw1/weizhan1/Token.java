

/* First created by JCasGen Wed Sep 11 04:22:06 EDT 2013 */
package hw1.weizhan1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The token type associated with a sentence or a ngram.
 * Updated by JCasGen Wed Sep 11 04:23:20 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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

  /** getter for begin - gets the beginning tag of the token in the document.
If the token is in a NGram, it still represents the position in the document.
   * @generated */
  public int getBegin() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets the beginning tag of the token in the document.
If the token is in a NGram, it still represents the position in the document. 
   * @generated */
  public void setBegin(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "hw1.weizhan1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the end position of the token in the document
   * @generated */
  public int getEnd() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the end position of the token in the document 
   * @generated */
  public void setEnd(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "hw1.weizhan1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: procID

  /** getter for procID - gets The ID of process that generates the token.
   * @generated */
  public String getProcID() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_procID);}
    
  /** setter for procID - sets The ID of process that generates the token. 
   * @generated */
  public void setProcID(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_procID == null)
      jcasType.jcas.throwFeatMissing("procID", "hw1.weizhan1.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_procID, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence value of the token generated.
   * @generated */
  public double getConfidence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Token");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence value of the token generated. 
   * @generated */
  public void setConfidence(double v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.weizhan1.Token");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_confidence, v);}    
  }

    