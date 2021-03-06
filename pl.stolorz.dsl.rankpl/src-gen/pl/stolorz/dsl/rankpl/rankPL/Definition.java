/**
 * generated by Xtext 2.11.0
 */
package pl.stolorz.dsl.rankpl.rankPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.stolorz.dsl.rankpl.rankPL.Definition#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see pl.stolorz.dsl.rankpl.rankPL.RankPLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends AbstractDefinition
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see pl.stolorz.dsl.rankpl.rankPL.RankPLPackage#getDefinition_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link pl.stolorz.dsl.rankpl.rankPL.Definition#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // Definition
