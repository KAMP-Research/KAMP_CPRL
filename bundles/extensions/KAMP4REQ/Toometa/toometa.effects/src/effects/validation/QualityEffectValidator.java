/**
 *
 * $Id$
 */
package effects.validation;

import qualities.QualityType;

/**
 * A sample validator interface for {@link effects.QualityEffect}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QualityEffectValidator {
	boolean validate();

	boolean validateQualityType(QualityType value);
}