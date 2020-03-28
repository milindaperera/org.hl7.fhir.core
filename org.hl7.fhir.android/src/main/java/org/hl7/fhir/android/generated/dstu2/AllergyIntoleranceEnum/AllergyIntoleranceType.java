package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AllergyIntoleranceType {

    /**
     * A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other "allergy-like" reactions, including pseudoallergy.
     */
    ALLERGY,
    /**
     * A propensity for adverse reactions to a substance that is not judged to be allergic or "allergy-like".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).
     */
    INTOLERANCE,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("allergy".equals(codeString))
            return ALLERGY;
        if ("intolerance".equals(codeString))
            return INTOLERANCE;
        throw new FHIRException("Unknown AllergyIntoleranceType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ALLERGY:
                return "allergy";
            case INTOLERANCE:
                return "intolerance";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ALLERGY:
                return "http://hl7.org/fhir/allergy-intolerance-type";
            case INTOLERANCE:
                return "http://hl7.org/fhir/allergy-intolerance-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ALLERGY:
                return "A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other \"allergy-like\" reactions, including pseudoallergy.";
            case INTOLERANCE:
                return "A propensity for adverse reactions to a substance that is not judged to be allergic or \"allergy-like\".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ALLERGY:
                return "Allergy";
            case INTOLERANCE:
                return "Intolerance";
            default:
                return "?";
        }
    }
}