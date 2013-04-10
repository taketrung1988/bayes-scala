package dk.bayes.model.factor

/**
 * This class represents a factor for the difference of two Gaussian distributions.
 *
 * @author Daniel Korzekwa
 *
 * diffGaussian = gaussian1 - gaussian2
 *
 * @param gaussian1VarId
 * @param gaussian2VarId
 * @param diffGaussianVarId
 */
case class DiffGaussianFactor(gaussian1VarId: Int, gaussian2VarId: Int, diffGaussianVarId: Int) extends Factor {

  def getVariableIds(): Seq[Int] = throw new UnsupportedOperationException("Not implemented yet")

  def marginal(varId: Int): Factor = throw new UnsupportedOperationException("Not implemented yet")
  
  def withEvidence(varId: Int, varValue: AnyVal): TableFactor = throw new UnsupportedOperationException("Not implemented yet")

  def getValue(assignment: (Int, AnyVal)*): Double = throw new UnsupportedOperationException("Not implemented yet")

  def *(factor: Factor): Factor = throw new UnsupportedOperationException("Not implemented yet")
}