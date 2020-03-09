
/**
 * ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */

            
                package com.amx.mexico.telcel.esb.v1_2;
            

            /**
            *  ErrorType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ErrorType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ErrorType
                Namespace URI = http://amx.com/mexico/telcel/esb/v1_2
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Code
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.CodeType localCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.CodeType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.CodeType getCode(){
                               return localCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Code
                               */
                               public void setCode(com.amx.mexico.telcel.esb.v1_2.CodeType param){
                            
                                            this.localCode=param;
                                       

                               }
                            

                        /**
                        * field for SeverityLevel
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.SeverityType localSeverityLevel ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.SeverityType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.SeverityType getSeverityLevel(){
                               return localSeverityLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeverityLevel
                               */
                               public void setSeverityLevel(com.amx.mexico.telcel.esb.v1_2.SeverityType param){
                            
                                            this.localSeverityLevel=param;
                                       

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.DescriptionType localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.DescriptionType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.DescriptionType getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(com.amx.mexico.telcel.esb.v1_2.DescriptionType param){
                            
                                            this.localDescription=param;
                                       

                               }
                            

                        /**
                        * field for Actor
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.ActorType localActor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActorTracker = false ;

                           public boolean isActorSpecified(){
                               return localActorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.ActorType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.ActorType getActor(){
                               return localActor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Actor
                               */
                               public void setActor(com.amx.mexico.telcel.esb.v1_2.ActorType param){
                            localActorTracker = param != null;
                                   
                                            this.localActor=param;
                                       

                               }
                            

                        /**
                        * field for BusinessMeaning
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.MeaningType localBusinessMeaning ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.MeaningType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.MeaningType getBusinessMeaning(){
                               return localBusinessMeaning;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BusinessMeaning
                               */
                               public void setBusinessMeaning(com.amx.mexico.telcel.esb.v1_2.MeaningType param){
                            
                                            this.localBusinessMeaning=param;
                                       

                               }
                            

                        /**
                        * field for Properties
                        * This was an Array!
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] localProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPropertiesTracker = false ;

                           public boolean isPropertiesSpecified(){
                               return localPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[]
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] getProperties(){
                               return localProperties;
                           }

                           
                        


                               
                              /**
                               * validate the array for Properties
                               */
                              protected void validateProperties(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Properties
                              */
                              public void setProperties(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] param){
                              
                                   validateProperties(param);

                               localPropertiesTracker = param != null;
                                      
                                      this.localProperties=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.amx.mexico.telcel.esb.v1_2.PropertyErrorType
                             */
                             public void addProperties(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType param){
                                   if (localProperties == null){
                                   localProperties = new com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[]{};
                                   }

                            
                                 //update the setting tracker
                                localPropertiesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProperties);
                               list.add(param);
                               this.localProperties =
                             (com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[])list.toArray(
                            new com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://amx.com/mexico/telcel/esb/v1_2");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ErrorType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ErrorType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("code cannot be null!!");
                                            }
                                           localCode.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","code"),
                                               xmlWriter);
                                        
                                            if (localSeverityLevel==null){
                                                 throw new org.apache.axis2.databinding.ADBException("severityLevel cannot be null!!");
                                            }
                                           localSeverityLevel.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","severityLevel"),
                                               xmlWriter);
                                        
                                            if (localDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
                                            }
                                           localDescription.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","description"),
                                               xmlWriter);
                                         if (localActorTracker){
                                            if (localActor==null){
                                                 throw new org.apache.axis2.databinding.ADBException("actor cannot be null!!");
                                            }
                                           localActor.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","actor"),
                                               xmlWriter);
                                        }
                                            if (localBusinessMeaning==null){
                                                 throw new org.apache.axis2.databinding.ADBException("businessMeaning cannot be null!!");
                                            }
                                           localBusinessMeaning.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","businessMeaning"),
                                               xmlWriter);
                                         if (localPropertiesTracker){
                                       if (localProperties!=null){
                                            for (int i = 0;i < localProperties.length;i++){
                                                if (localProperties[i] != null){
                                                 localProperties[i].serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","properties"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("properties cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://amx.com/mexico/telcel/esb/v1_2")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ErrorType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ErrorType object =
                new ErrorType();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ErrorType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ErrorType)mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","code").equals(reader.getName())){
                                
                                                object.setCode(com.amx.mexico.telcel.esb.v1_2.CodeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","severityLevel").equals(reader.getName())){
                                
                                                object.setSeverityLevel(com.amx.mexico.telcel.esb.v1_2.SeverityType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","description").equals(reader.getName())){
                                
                                                object.setDescription(com.amx.mexico.telcel.esb.v1_2.DescriptionType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","actor").equals(reader.getName())){
                                
                                                object.setActor(com.amx.mexico.telcel.esb.v1_2.ActorType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","businessMeaning").equals(reader.getName())){
                                
                                                object.setBusinessMeaning(com.amx.mexico.telcel.esb.v1_2.MeaningType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","properties").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list6.add(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","properties").equals(reader.getName())){
                                                                    list6.add(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProperties((com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.amx.mexico.telcel.esb.v1_2.PropertyErrorType.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    