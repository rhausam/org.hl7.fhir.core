package org.hl7.fhir.r5.model.codesystems;

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

// Generated on Sun, Jun 30, 2019 16:52-0400 for FHIR v4.1.0


import org.hl7.fhir.r5.model.EnumFactory;

public class CatalogentryTypeEnumFactory implements EnumFactory<CatalogentryType> {

  public CatalogentryType fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("ActivityDefinition".equals(codeString))
      return CatalogentryType.ACTIVITYDEFINITION;
    if ("PlanDefinition".equals(codeString))
      return CatalogentryType.PLANDEFINITION;
    if ("SpecimenDefinition".equals(codeString))
      return CatalogentryType.SPECIMENDEFINITION;
    if ("ObservationDefinition".equals(codeString))
      return CatalogentryType.OBSERVATIONDEFINITION;
    if ("DeviceDefinition".equals(codeString))
      return CatalogentryType.DEVICEDEFINITION;
    if ("Organization".equals(codeString))
      return CatalogentryType.ORGANIZATION;
    if ("Practitioner".equals(codeString))
      return CatalogentryType.PRACTITIONER;
    if ("PractitionerRole".equals(codeString))
      return CatalogentryType.PRACTITIONERROLE;
    if ("HealthcareService".equals(codeString))
      return CatalogentryType.HEALTHCARESERVICE;
    if ("MedicationKnowledge".equals(codeString))
      return CatalogentryType.MEDICATIONKNOWLEDGE;
    if ("Medication".equals(codeString))
      return CatalogentryType.MEDICATION;
    if ("Substance".equals(codeString))
      return CatalogentryType.SUBSTANCE;
    if ("Location".equals(codeString))
      return CatalogentryType.LOCATION;
    throw new IllegalArgumentException("Unknown CatalogentryType code '"+codeString+"'");
  }

  public String toCode(CatalogentryType code) {
    if (code == CatalogentryType.ACTIVITYDEFINITION)
      return "ActivityDefinition";
    if (code == CatalogentryType.PLANDEFINITION)
      return "PlanDefinition";
    if (code == CatalogentryType.SPECIMENDEFINITION)
      return "SpecimenDefinition";
    if (code == CatalogentryType.OBSERVATIONDEFINITION)
      return "ObservationDefinition";
    if (code == CatalogentryType.DEVICEDEFINITION)
      return "DeviceDefinition";
    if (code == CatalogentryType.ORGANIZATION)
      return "Organization";
    if (code == CatalogentryType.PRACTITIONER)
      return "Practitioner";
    if (code == CatalogentryType.PRACTITIONERROLE)
      return "PractitionerRole";
    if (code == CatalogentryType.HEALTHCARESERVICE)
      return "HealthcareService";
    if (code == CatalogentryType.MEDICATIONKNOWLEDGE)
      return "MedicationKnowledge";
    if (code == CatalogentryType.MEDICATION)
      return "Medication";
    if (code == CatalogentryType.SUBSTANCE)
      return "Substance";
    if (code == CatalogentryType.LOCATION)
      return "Location";
    return "?";
  }

    public String toSystem(CatalogentryType code) {
      return code.getSystem();
      }

}

