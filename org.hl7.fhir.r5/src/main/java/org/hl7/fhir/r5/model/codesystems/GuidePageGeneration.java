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


import org.hl7.fhir.exceptions.FHIRException;

public enum GuidePageGeneration {

        /**
         * Page is proper xhtml with no templating.  Will be brought across unchanged for standard post-processing.
         */
        HTML, 
        /**
         * Page is markdown with templating.  Will use the template to create a file that imports the markdown file prior to post-processing.
         */
        MARKDOWN, 
        /**
         * Page is xml with templating.  Will use the template to create a file that imports the source file and run the nominated XSLT transform (see parameters) if present prior to post-processing.
         */
        XML, 
        /**
         * Page will be generated by the publication process - no source to bring across.
         */
        GENERATED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static GuidePageGeneration fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("html".equals(codeString))
          return HTML;
        if ("markdown".equals(codeString))
          return MARKDOWN;
        if ("xml".equals(codeString))
          return XML;
        if ("generated".equals(codeString))
          return GENERATED;
        throw new FHIRException("Unknown GuidePageGeneration code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case HTML: return "html";
            case MARKDOWN: return "markdown";
            case XML: return "xml";
            case GENERATED: return "generated";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/guide-page-generation";
        }
        public String getDefinition() {
          switch (this) {
            case HTML: return "Page is proper xhtml with no templating.  Will be brought across unchanged for standard post-processing.";
            case MARKDOWN: return "Page is markdown with templating.  Will use the template to create a file that imports the markdown file prior to post-processing.";
            case XML: return "Page is xml with templating.  Will use the template to create a file that imports the source file and run the nominated XSLT transform (see parameters) if present prior to post-processing.";
            case GENERATED: return "Page will be generated by the publication process - no source to bring across.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case HTML: return "HTML";
            case MARKDOWN: return "Markdown";
            case XML: return "XML";
            case GENERATED: return "Generated";
            default: return "?";
          }
    }


}

