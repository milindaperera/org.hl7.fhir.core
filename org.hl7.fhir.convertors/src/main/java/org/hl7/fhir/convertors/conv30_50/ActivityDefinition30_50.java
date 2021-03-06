package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.dstu3.model.ContactDetail;
import org.hl7.fhir.dstu3.model.Contributor.ContributorType;
import org.hl7.fhir.exceptions.FHIRException;

public class ActivityDefinition30_50 {

    public static org.hl7.fhir.r5.model.ActivityDefinition convertActivityDefinition(org.hl7.fhir.dstu3.model.ActivityDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.ActivityDefinition tgt = new org.hl7.fhir.r5.model.ActivityDefinition();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_50.convertUri(src.getUrlElement()));
        for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_50.convertIdentifier(t));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_50.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_50.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_50.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatusElement(VersionConvertor_30_50.convertPublicationStatus(src.getStatusElement()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_30_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_50.convertString(src.getPublisherElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_50.convertMarkdown(src.getDescriptionElement()));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_50.convertMarkdown(src.getPurposeElement()));
        if (src.hasUsage())
            tgt.setUsageElement(VersionConvertor_30_50.convertString(src.getUsageElement()));
        if (src.hasApprovalDate())
            tgt.setApprovalDateElement(VersionConvertor_30_50.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
            tgt.setLastReviewDateElement(VersionConvertor_30_50.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_50.convertPeriod(src.getEffectivePeriod()));
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_50.convertUsageContext(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_50.convertCodeableConcept(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getTopic()) tgt.addTopic(VersionConvertor_30_50.convertCodeableConcept(t));
        for (org.hl7.fhir.dstu3.model.Contributor t : src.getContributor()) {
            if (t.getType() == ContributorType.AUTHOR)
                for (ContactDetail c : t.getContact()) tgt.addAuthor(VersionConvertor_30_50.convertContactDetail(c));
            if (t.getType() == ContributorType.EDITOR)
                for (ContactDetail c : t.getContact()) tgt.addEditor(VersionConvertor_30_50.convertContactDetail(c));
            if (t.getType() == ContributorType.REVIEWER)
                for (ContactDetail c : t.getContact()) tgt.addReviewer(VersionConvertor_30_50.convertContactDetail(c));
            if (t.getType() == ContributorType.ENDORSER)
                for (ContactDetail c : t.getContact()) tgt.addEndorser(VersionConvertor_30_50.convertContactDetail(c));
        }
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_50.convertContactDetail(t));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_50.convertMarkdown(src.getCopyrightElement()));
        for (org.hl7.fhir.dstu3.model.RelatedArtifact t : src.getRelatedArtifact()) tgt.addRelatedArtifact(VersionConvertor_30_50.convertRelatedArtifact(t));
        for (org.hl7.fhir.dstu3.model.Reference t : src.getLibrary()) tgt.getLibrary().add(VersionConvertor_30_50.convertReferenceToCanonical(t));
        if (src.hasKind())
            tgt.setKindElement(convertActivityDefinitionKind(src.getKindElement()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_30_50.convertType(src.getTiming()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_50.convertReference(src.getLocation()));
        for (org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertActivityDefinitionParticipantComponent(t));
        if (src.hasProduct())
            tgt.setProduct(VersionConvertor_30_50.convertType(src.getProduct()));
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_30_50.convertSimpleQuantity(src.getQuantity()));
        for (org.hl7.fhir.dstu3.model.Dosage t : src.getDosage()) tgt.addDosage(VersionConvertor_30_50.convertDosage(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_30_50.convertCodeableConcept(t));
        if (src.hasTransform())
            tgt.setTransformElement(VersionConvertor_30_50.convertReferenceToCanonical(src.getTransform()));
        for (org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent t : src.getDynamicValue()) tgt.addDynamicValue(convertActivityDefinitionDynamicValueComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ActivityDefinition convertActivityDefinition(org.hl7.fhir.r5.model.ActivityDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_50.convertUri(src.getUrlElement()));
        for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_50.convertIdentifier(t));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_50.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_50.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_50.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatusElement(VersionConvertor_30_50.convertPublicationStatus(src.getStatusElement()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_30_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_50.convertString(src.getPublisherElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_50.convertMarkdown(src.getDescriptionElement()));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_50.convertMarkdown(src.getPurposeElement()));
        if (src.hasUsage())
            tgt.setUsageElement(VersionConvertor_30_50.convertString(src.getUsageElement()));
        if (src.hasApprovalDate())
            tgt.setApprovalDateElement(VersionConvertor_30_50.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
            tgt.setLastReviewDateElement(VersionConvertor_30_50.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_50.convertPeriod(src.getEffectivePeriod()));
        for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_50.convertUsageContext(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_50.convertCodeableConcept(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getTopic()) tgt.addTopic(VersionConvertor_30_50.convertCodeableConcept(t));
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getAuthor()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.AUTHOR);
            c.addContact(VersionConvertor_30_50.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getEditor()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.EDITOR);
            c.addContact(VersionConvertor_30_50.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getReviewer()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.REVIEWER);
            c.addContact(VersionConvertor_30_50.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getEndorser()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.ENDORSER);
            c.addContact(VersionConvertor_30_50.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_50.convertContactDetail(t));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_50.convertMarkdown(src.getCopyrightElement()));
        for (org.hl7.fhir.r5.model.RelatedArtifact t : src.getRelatedArtifact()) tgt.addRelatedArtifact(VersionConvertor_30_50.convertRelatedArtifact(t));
        for (org.hl7.fhir.r5.model.CanonicalType t : src.getLibrary()) tgt.addLibrary(VersionConvertor_30_50.convertCanonicalToReference(t));
        if (src.hasKind())
            tgt.setKindElement(convertActivityDefinitionKind(src.getKindElement()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_30_50.convertType(src.getTiming()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_50.convertReference(src.getLocation()));
        for (org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertActivityDefinitionParticipantComponent(t));
        if (src.hasProduct())
            tgt.setProduct(VersionConvertor_30_50.convertType(src.getProduct()));
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_30_50.convertSimpleQuantity(src.getQuantity()));
        for (org.hl7.fhir.r5.model.Dosage t : src.getDosage()) tgt.addDosage(VersionConvertor_30_50.convertDosage(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_30_50.convertCodeableConcept(t));
        if (src.hasTransform())
            tgt.setTransform(VersionConvertor_30_50.convertCanonicalToReference(src.getTransformElement()));
        for (org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent t : src.getDynamicValue()) tgt.addDynamicValue(convertActivityDefinitionDynamicValueComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent convertActivityDefinitionDynamicValueComponent(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent tgt = new org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasDescription())
            tgt.getExpression().setDescription(src.getDescription());
        if (src.hasPath())
            tgt.setPathElement(VersionConvertor_30_50.convertString(src.getPathElement()));
        if (src.hasLanguage())
            tgt.getExpression().setLanguage(src.getLanguage());
        if (src.hasExpression())
            tgt.getExpression().setExpression(src.getExpression());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent convertActivityDefinitionDynamicValueComponent(org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasPath())
            tgt.setPathElement(VersionConvertor_30_50.convertString(src.getPathElement()));
        if (src.getExpression().hasDescription())
            tgt.setDescription(src.getExpression().getDescription());
        if (src.getExpression().hasLanguage())
            tgt.setLanguage(src.getExpression().getLanguage());
        if (src.getExpression().hasExpression())
            tgt.setExpression(src.getExpression().getExpression());
        return tgt;
    }

    static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType> convertActivityDefinitionKind(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceTypeEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case APPOINTMENT:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.APPOINTMENT);
                break;
            case APPOINTMENTRESPONSE:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.APPOINTMENTRESPONSE);
                break;
            case CAREPLAN:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.CAREPLAN);
                break;
            case CLAIM:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.CLAIM);
                break;
            case COMMUNICATIONREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.COMMUNICATIONREQUEST);
                break;
            case CONTRACT:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.CONTRACT);
                break;
            case DEVICEREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.DEVICEREQUEST);
                break;
            case ENROLLMENTREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.ENROLLMENTREQUEST);
                break;
            case IMMUNIZATIONRECOMMENDATION:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.IMMUNIZATIONRECOMMENDATION);
                break;
            case MEDICATIONREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.MEDICATIONREQUEST);
                break;
            case NUTRITIONORDER:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.NUTRITIONORDER);
                break;
            case PROCEDUREREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.SERVICEREQUEST);
                break;
            case REFERRALREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.SERVICEREQUEST);
                break;
            case SUPPLYREQUEST:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.SUPPLYREQUEST);
                break;
            case TASK:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.TASK);
                break;
            case VISIONPRESCRIPTION:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.VISIONPRESCRIPTION);
                break;
            default:
                tgt.setValue(org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType.NULL);
                break;
        }
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind> convertActivityDefinitionKind(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.ActivityDefinition.RequestResourceType> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKindEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case APPOINTMENT:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENT);
                break;
            case APPOINTMENTRESPONSE:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENTRESPONSE);
                break;
            case CAREPLAN:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CAREPLAN);
                break;
            case CLAIM:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CLAIM);
                break;
            case COMMUNICATIONREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.COMMUNICATIONREQUEST);
                break;
            case CONTRACT:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CONTRACT);
                break;
            case DEVICEREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.DEVICEREQUEST);
                break;
            case ENROLLMENTREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.ENROLLMENTREQUEST);
                break;
            case IMMUNIZATIONRECOMMENDATION:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.IMMUNIZATIONRECOMMENDATION);
                break;
            case MEDICATIONREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.MEDICATIONREQUEST);
                break;
            case NUTRITIONORDER:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.NUTRITIONORDER);
                break;
            case SERVICEREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.PROCEDUREREQUEST);
                break;
            case SUPPLYREQUEST:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.SUPPLYREQUEST);
                break;
            case TASK:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.TASK);
                break;
            case VISIONPRESCRIPTION:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.VISIONPRESCRIPTION);
                break;
            default:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.NULL);
                break;
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionParticipantComponent convertActivityDefinitionParticipantComponent(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionParticipantComponent tgt = new org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionParticipantComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setTypeElement(convertActivityParticipantType(src.getTypeElement()));
        if (src.hasRole())
            tgt.setRole(VersionConvertor_30_50.convertCodeableConcept(src.getRole()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent convertActivityDefinitionParticipantComponent(org.hl7.fhir.r5.model.ActivityDefinition.ActivityDefinitionParticipantComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setTypeElement(convertActivityParticipantType(src.getTypeElement()));
        if (src.hasRole())
            tgt.setRole(VersionConvertor_30_50.convertCodeableConcept(src.getRole()));
        return tgt;
    }

    static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.ActionParticipantType> convertActivityParticipantType(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.ActionParticipantType> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Enumerations.ActionParticipantTypeEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case PATIENT:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.ActionParticipantType.PATIENT);
                break;
            case PRACTITIONER:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.ActionParticipantType.PRACTITIONER);
                break;
            case RELATEDPERSON:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.ActionParticipantType.RELATEDPERSON);
                break;
            default:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.ActionParticipantType.NULL);
                break;
        }
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType> convertActivityParticipantType(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.ActionParticipantType> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantTypeEnumFactory());
        VersionConvertor_30_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case PATIENT:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.PATIENT);
                break;
            case PRACTITIONER:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.PRACTITIONER);
                break;
            case RELATEDPERSON:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.RELATEDPERSON);
                break;
            default:
                tgt.setValue(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.NULL);
                break;
        }
        return tgt;
    }
}
