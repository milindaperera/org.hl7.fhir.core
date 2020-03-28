package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum.SupplyDeliveryStatus;
import org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum.SupplyDeliveryStatusEnumFactory;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
/**
 * Record of delivery of what is supplied.
 */
public class SupplyDelivery extends DomainResource {

    /**
     * Identifier assigned by the dispensing facility when the item(s) is dispensed.
     */
    protected Identifier identifier;

    /**
     * A code specifying the state of the dispense event.
     */
    protected Enumeration<SupplyDeliveryStatus> status;

    /**
     * A link to a resource representing the person whom the delivered item is for.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A link to a resource representing the person whom the delivered item is for.)
     */
    protected Patient patientTarget;

    /**
     * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
     */
    protected CodeableConcept type;

    /**
     * The amount of supply that has been dispensed. Includes unit of measure.
     */
    protected SimpleQuantity quantity;

    /**
     * Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.
     */
    protected Reference suppliedItem;

    /**
     * The actual object that is the target of the reference (Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.)
     */
    protected Resource suppliedItemTarget;

    /**
     * The individual responsible for dispensing the medication, supplier or device.
     */
    protected Reference supplier;

    /**
     * The actual object that is the target of the reference (The individual responsible for dispensing the medication, supplier or device.)
     */
    protected Practitioner supplierTarget;

    /**
     * The time the dispense event occurred.
     */
    protected Period whenPrepared;

    /**
     * The time the dispensed item was sent or handed to the patient (or agent).
     */
    protected DateTimeType time;

    /**
     * Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
     */
    protected Reference destination;

    /**
     * The actual object that is the target of the reference (Identification of the facility/location where the Supply was shipped to, as part of the dispense event.)
     */
    protected Location destinationTarget;

    /**
     * Identifies the person who picked up the Supply.
     */
    protected List<Reference> receiver;

    /**
     * The actual objects that are the target of the reference (Identifies the person who picked up the Supply.)
     */
    protected List<Practitioner> receiverTarget;

    private static final long serialVersionUID = -1520129707L;

    /*
   * Constructor
   */
    public SupplyDelivery() {
        super();
    }

    /**
     * @return {@link #identifier} (Identifier assigned by the dispensing facility when the item(s) is dispensed.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifier assigned by the dispensing facility when the item(s) is dispensed.)
     */
    public SupplyDelivery setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #status} (A code specifying the state of the dispense event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<SupplyDeliveryStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<SupplyDeliveryStatus>(new SupplyDeliveryStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code specifying the state of the dispense event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public SupplyDelivery setStatusElement(Enumeration<SupplyDeliveryStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code specifying the state of the dispense event.
     */
    public SupplyDeliveryStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code specifying the state of the dispense event.
     */
    public SupplyDelivery setStatus(SupplyDeliveryStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<SupplyDeliveryStatus>(new SupplyDeliveryStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #patient} (A link to a resource representing the person whom the delivered item is for.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (A link to a resource representing the person whom the delivered item is for.)
     */
    public SupplyDelivery setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person whom the delivered item is for.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person whom the delivered item is for.)
     */
    public SupplyDelivery setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #type} (Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.)
     */
    public SupplyDelivery setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The amount of supply that has been dispensed. Includes unit of measure.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of supply that has been dispensed. Includes unit of measure.)
     */
    public SupplyDelivery setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #suppliedItem} (Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.)
     */
    public Reference getSuppliedItem() {
        if (this.suppliedItem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.suppliedItem");
            else if (Configuration.doAutoCreate())
                // cc
                this.suppliedItem = new Reference();
        return this.suppliedItem;
    }

    public boolean hasSuppliedItem() {
        return this.suppliedItem != null && !this.suppliedItem.isEmpty();
    }

    /**
     * @param value {@link #suppliedItem} (Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.)
     */
    public SupplyDelivery setSuppliedItem(Reference value) {
        this.suppliedItem = value;
        return this;
    }

    /**
     * @return {@link #suppliedItem} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.)
     */
    public Resource getSuppliedItemTarget() {
        return this.suppliedItemTarget;
    }

    /**
     * @param value {@link #suppliedItem} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.)
     */
    public SupplyDelivery setSuppliedItemTarget(Resource value) {
        this.suppliedItemTarget = value;
        return this;
    }

    /**
     * @return {@link #supplier} (The individual responsible for dispensing the medication, supplier or device.)
     */
    public Reference getSupplier() {
        if (this.supplier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.supplier");
            else if (Configuration.doAutoCreate())
                // cc
                this.supplier = new Reference();
        return this.supplier;
    }

    public boolean hasSupplier() {
        return this.supplier != null && !this.supplier.isEmpty();
    }

    /**
     * @param value {@link #supplier} (The individual responsible for dispensing the medication, supplier or device.)
     */
    public SupplyDelivery setSupplier(Reference value) {
        this.supplier = value;
        return this;
    }

    /**
     * @return {@link #supplier} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The individual responsible for dispensing the medication, supplier or device.)
     */
    public Practitioner getSupplierTarget() {
        if (this.supplierTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.supplier");
            else if (Configuration.doAutoCreate())
                // aa
                this.supplierTarget = new Practitioner();
        return this.supplierTarget;
    }

    /**
     * @param value {@link #supplier} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The individual responsible for dispensing the medication, supplier or device.)
     */
    public SupplyDelivery setSupplierTarget(Practitioner value) {
        this.supplierTarget = value;
        return this;
    }

    /**
     * @return {@link #whenPrepared} (The time the dispense event occurred.)
     */
    public Period getWhenPrepared() {
        if (this.whenPrepared == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.whenPrepared");
            else if (Configuration.doAutoCreate())
                // cc
                this.whenPrepared = new Period();
        return this.whenPrepared;
    }

    public boolean hasWhenPrepared() {
        return this.whenPrepared != null && !this.whenPrepared.isEmpty();
    }

    /**
     * @param value {@link #whenPrepared} (The time the dispense event occurred.)
     */
    public SupplyDelivery setWhenPrepared(Period value) {
        this.whenPrepared = value;
        return this;
    }

    /**
     * @return {@link #time} (The time the dispensed item was sent or handed to the patient (or agent).). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public DateTimeType getTimeElement() {
        if (this.time == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.time");
            else if (Configuration.doAutoCreate())
                // bb
                this.time = new DateTimeType();
        return this.time;
    }

    public boolean hasTimeElement() {
        return this.time != null && !this.time.isEmpty();
    }

    public boolean hasTime() {
        return this.time != null && !this.time.isEmpty();
    }

    /**
     * @param value {@link #time} (The time the dispensed item was sent or handed to the patient (or agent).). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public SupplyDelivery setTimeElement(DateTimeType value) {
        this.time = value;
        return this;
    }

    /**
     * @return The time the dispensed item was sent or handed to the patient (or agent).
     */
    public Date getTime() {
        return this.time == null ? null : this.time.getValue();
    }

    /**
     * @param value The time the dispensed item was sent or handed to the patient (or agent).
     */
    public SupplyDelivery setTime(Date value) {
        if (value == null)
            this.time = null;
        else {
            if (this.time == null)
                this.time = new DateTimeType();
            this.time.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #destination} (Identification of the facility/location where the Supply was shipped to, as part of the dispense event.)
     */
    public Reference getDestination() {
        if (this.destination == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.destination");
            else if (Configuration.doAutoCreate())
                // cc
                this.destination = new Reference();
        return this.destination;
    }

    public boolean hasDestination() {
        return this.destination != null && !this.destination.isEmpty();
    }

    /**
     * @param value {@link #destination} (Identification of the facility/location where the Supply was shipped to, as part of the dispense event.)
     */
    public SupplyDelivery setDestination(Reference value) {
        this.destination = value;
        return this;
    }

    /**
     * @return {@link #destination} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identification of the facility/location where the Supply was shipped to, as part of the dispense event.)
     */
    public Location getDestinationTarget() {
        if (this.destinationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyDelivery.destination");
            else if (Configuration.doAutoCreate())
                // aa
                this.destinationTarget = new Location();
        return this.destinationTarget;
    }

    /**
     * @param value {@link #destination} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identification of the facility/location where the Supply was shipped to, as part of the dispense event.)
     */
    public SupplyDelivery setDestinationTarget(Location value) {
        this.destinationTarget = value;
        return this;
    }

    /**
     * @return {@link #receiver} (Identifies the person who picked up the Supply.)
     */
    public List<Reference> getReceiver() {
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        return this.receiver;
    }

    public boolean hasReceiver() {
        if (this.receiver == null)
            return false;
        for (Reference item : this.receiver) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #receiver} (Identifies the person who picked up the Supply.)
     */
    // syntactic sugar
    public Reference addReceiver() {
        // 3
        Reference t = new Reference();
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        this.receiver.add(t);
        return t;
    }

    // syntactic sugar
    public SupplyDelivery addReceiver(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        this.receiver.add(t);
        return this;
    }

    /**
     * @return {@link #receiver} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies the person who picked up the Supply.)
     */
    public List<Practitioner> getReceiverTarget() {
        if (this.receiverTarget == null)
            this.receiverTarget = new ArrayList<Practitioner>();
        return this.receiverTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #receiver} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Identifies the person who picked up the Supply.)
     */
    public Practitioner addReceiverTarget() {
        Practitioner r = new Practitioner();
        if (this.receiverTarget == null)
            this.receiverTarget = new ArrayList<Practitioner>();
        this.receiverTarget.add(r);
        return r;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier assigned by the dispensing facility when the item(s) is dispensed.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "A code specifying the state of the dispense event.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("patient", "Reference(Patient)", "A link to a resource representing the person whom the delivered item is for.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("type", "CodeableConcept", "Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount of supply that has been dispensed. Includes unit of measure.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("suppliedItem", "Reference(Medication|Substance|Device)", "Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.", 0, java.lang.Integer.MAX_VALUE, suppliedItem));
        childrenList.add(new Property("supplier", "Reference(Practitioner)", "The individual responsible for dispensing the medication, supplier or device.", 0, java.lang.Integer.MAX_VALUE, supplier));
        childrenList.add(new Property("whenPrepared", "Period", "The time the dispense event occurred.", 0, java.lang.Integer.MAX_VALUE, whenPrepared));
        childrenList.add(new Property("time", "dateTime", "The time the dispensed item was sent or handed to the patient (or agent).", 0, java.lang.Integer.MAX_VALUE, time));
        childrenList.add(new Property("destination", "Reference(Location)", "Identification of the facility/location where the Supply was shipped to, as part of the dispense event.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("receiver", "Reference(Practitioner)", "Identifies the person who picked up the Supply.", 0, java.lang.Integer.MAX_VALUE, receiver));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("status"))
            // Enumeration<SupplyDeliveryStatus>
            this.status = new SupplyDeliveryStatusEnumFactory().fromType(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("suppliedItem"))
            // Reference
            this.suppliedItem = castToReference(value);
        else if (name.equals("supplier"))
            // Reference
            this.supplier = castToReference(value);
        else if (name.equals("whenPrepared"))
            // Period
            this.whenPrepared = castToPeriod(value);
        else if (name.equals("time"))
            // DateTimeType
            this.time = castToDateTime(value);
        else if (name.equals("destination"))
            // Reference
            this.destination = castToReference(value);
        else if (name.equals("receiver"))
            this.getReceiver().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type SupplyDelivery.status");
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("suppliedItem")) {
            this.suppliedItem = new Reference();
            return this.suppliedItem;
        } else if (name.equals("supplier")) {
            this.supplier = new Reference();
            return this.supplier;
        } else if (name.equals("whenPrepared")) {
            this.whenPrepared = new Period();
            return this.whenPrepared;
        } else if (name.equals("time")) {
            throw new FHIRException("Cannot call addChild on a primitive type SupplyDelivery.time");
        } else if (name.equals("destination")) {
            this.destination = new Reference();
            return this.destination;
        } else if (name.equals("receiver")) {
            return addReceiver();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "SupplyDelivery";
    }

    public SupplyDelivery copy() {
        SupplyDelivery dst = new SupplyDelivery();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.type = type == null ? null : type.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.suppliedItem = suppliedItem == null ? null : suppliedItem.copy();
        dst.supplier = supplier == null ? null : supplier.copy();
        dst.whenPrepared = whenPrepared == null ? null : whenPrepared.copy();
        dst.time = time == null ? null : time.copy();
        dst.destination = destination == null ? null : destination.copy();
        if (receiver != null) {
            dst.receiver = new ArrayList<Reference>();
            for (Reference i : receiver) dst.receiver.add(i.copy());
        }
        ;
        return dst;
    }

    protected SupplyDelivery typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SupplyDelivery))
            return false;
        SupplyDelivery o = (SupplyDelivery) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(patient, o.patient, true) && compareDeep(type, o.type, true) && compareDeep(quantity, o.quantity, true) && compareDeep(suppliedItem, o.suppliedItem, true) && compareDeep(supplier, o.supplier, true) && compareDeep(whenPrepared, o.whenPrepared, true) && compareDeep(time, o.time, true) && compareDeep(destination, o.destination, true) && compareDeep(receiver, o.receiver, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SupplyDelivery))
            return false;
        SupplyDelivery o = (SupplyDelivery) other;
        return compareValues(status, o.status, true) && compareValues(time, o.time, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (patient == null || patient.isEmpty()) && (type == null || type.isEmpty()) && (quantity == null || quantity.isEmpty()) && (suppliedItem == null || suppliedItem.isEmpty()) && (supplier == null || supplier.isEmpty()) && (whenPrepared == null || whenPrepared.isEmpty()) && (time == null || time.isEmpty()) && (destination == null || destination.isEmpty()) && (receiver == null || receiver.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.SupplyDelivery;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_RECEIVER = "receiver";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SUPPLIER = "supplier";

    public static final String SP_STATUS = "status";
}