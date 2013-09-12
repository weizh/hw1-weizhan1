

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import hw1.Base;


/** A sentence is a sequence of tokens.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Sentence extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets specify the elements in the sequence to be tokens. Behavior not know, because this could be implementation of the elements, or overwrite the interface?
   * @generated */
  public FSArray getTokens() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets specify the elements in the sequence to be tokens. Behavior not know, because this could be implementation of the elements, or overwrite the interface? 
   * @generated */
  public void setTokens(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - specify the elements in the sequence to be tokens. Behavior not know, because this could be implementation of the elements, or overwrite the interface?
   * @generated */
  public Token getTokens(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - specify the elements in the sequence to be tokens. Behavior not know, because this could be implementation of the elements, or overwrite the interface?
   * @generated */
  public void setTokens(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.nlp.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: NGramSets

  /** getter for NGramSets - gets The Ngramset. Could be unigramset, bigramset, or trigramset of tokens or tags.
   * @generated */
  public NGramSet getNGramSets() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NGramSets == null)
      jcasType.jcas.throwFeatMissing("NGramSets", "hw1.nlp.Sentence");
    return (NGramSet)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NGramSets)));}
    
  /** setter for NGramSets - sets The Ngramset. Could be unigramset, bigramset, or trigramset of tokens or tags. 
   * @generated */
  public void setNGramSets(NGramSet v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NGramSets == null)
      jcasType.jcas.throwFeatMissing("NGramSets", "hw1.nlp.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NGramSets, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    