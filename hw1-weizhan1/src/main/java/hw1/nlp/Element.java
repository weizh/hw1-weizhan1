

/* First created by JCasGen Wed Sep 11 21:34:57 EDT 2013 */
package hw1.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.Base;


/** Super class for token and  tag.
 * Updated by JCasGen Wed Sep 11 21:34:57 EDT 2013
 * XML source: /Users/indri/git/hw1/hw1-weizhan1/src/main/resources/hw1-weizhan1-typesystem.xml
 * @generated */
public class Element extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Element.class);
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
  protected Element() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Element(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Element(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Element(JCas jcas, int begin, int end) {
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
  //* Feature: elementType

  /** getter for elementType - gets The type of the elmenet, token, or part-of-speech tag, or other tags?
   * @generated */
  public String getElementType() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.nlp.Element");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Element_Type)jcasType).casFeatCode_elementType);}
    
  /** setter for elementType - sets The type of the elmenet, token, or part-of-speech tag, or other tags? 
   * @generated */
  public void setElementType(String v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "hw1.nlp.Element");
    jcasType.ll_cas.ll_setStringValue(addr, ((Element_Type)jcasType).casFeatCode_elementType, v);}    
  }

    