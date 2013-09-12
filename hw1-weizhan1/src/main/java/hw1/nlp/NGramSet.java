

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import hw1.Base;


/** The set that contains the NGrams of a sentence.
 * Updated by JCasGen Wed Sep 11 23:05:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class NGramSet extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramSet.class);
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
  protected NGramSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramSet(JCas jcas, int begin, int end) {
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
  //* Feature: ngrams

  /** getter for ngrams - gets The set of the ngrams, count duplications.
   * @generated */
  public FSArray getNgrams() {
    if (NGramSet_Type.featOkTst && ((NGramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets The set of the ngrams, count duplications. 
   * @generated */
  public void setNgrams(FSArray v) {
    if (NGramSet_Type.featOkTst && ((NGramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngrams - gets an indexed value - The set of the ngrams, count duplications.
   * @generated */
  public NGram getNgrams(int i) {
    if (NGramSet_Type.featOkTst && ((NGramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams), i)));}

  /** indexed setter for ngrams - sets an indexed value - The set of the ngrams, count duplications.
   * @generated */
  public void setNgrams(int i, NGram v) { 
    if (NGramSet_Type.featOkTst && ((NGramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "hw1.nlp.NGramSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSet_Type)jcasType).casFeatCode_ngrams), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    