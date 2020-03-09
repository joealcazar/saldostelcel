
/**
 * ControlDataResponseHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */

            
                package com.amx.mexico.telcel.esb.v1_2;
            

            /**
            *  ControlDataResponseHeaderType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ControlDataResponseHeaderType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ControlDataResponseHeaderType
                Namespace URI = http://amx.com/mexico/telcel/esb/v1_2
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Version
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type localVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type param){
                            
                                            this.localVersion=param;
                                       

                               }
                            

                        /**
                        * field for ResultCode
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type localResultCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type getResultCode(){
                               return localResultCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResultCode
                               */
                               public void setResultCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type param){
                            
                                            this.localResultCode=param;
                                       

                               }
                            

                        /**
                        * field for ResultDesc
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type localResultDesc ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type getResultDesc(){
                               return localResultDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResultDesc
                               */
                               public void setResultDesc(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type param){
                            
                                            this.localResultDesc=param;
                                       

                               }
                            

                        /**
                        * field for AdditionalProperty
                        * This was an Array!
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] localAdditionalProperty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalPropertyTracker = false ;

                           public boolean isAdditionalPropertySpecified(){
                               return localAdditionalPropertyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[]
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] getAdditionalProperty(){
                               return localAdditionalProperty;
                           }

                           
                        


                               
                              /**
                               * validate the array for AdditionalProperty
                               */
                              protected void validateAdditionalProperty(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AdditionalProperty
                              */
                              public void setAdditionalProperty(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] param){
                              
                                   validateAdditionalProperty(param);

                               localAdditionalPropertyTracker = param != null;
                                      
                                      this.localAdditionalProperty=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType
                             */
                             public void addAdditionalProperty(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType param){
                                   if (localAdditionalProperty == null){
                                   localAdditionalProperty = new com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[]{};
                                   }

                            
                                 //update the setting tracker
                                localAdditionalPropertyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAdditionalProperty);
                               list.add(param);
                               this.localAdditionalProperty =
                             (com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[])list.toArray(
                            new com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[list.size()]);

                             }
                             

                        /**
                        * field for MsgLanguageCode
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType localMsgLanguageCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMsgLanguageCodeTracker = false ;

                           public boolean isMsgLanguageCodeSpecified(){
                               return localMsgLanguageCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType getMsgLanguageCode(){
                               return localMsgLanguageCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MsgLanguageCode
                               */
                               public void setMsgLanguageCode(com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType param){
                            localMsgLanguageCodeTracker = param != null;
                                   
                                            this.localMsgLanguageCode=param;
                                       

                               }
                            

                        /**
                        * field for MessageUUID
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.MessageUUIDType localMessageUUID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.MessageUUIDType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.MessageUUIDType getMessageUUID(){
                               return localMessageUUID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageUUID
                               */
                               public void setMessageUUID(com.amx.mexico.telcel.esb.v1_2.MessageUUIDType param){
                            
                                            this.localMessageUUID=param;
                                       

                               }
                            

                        /**
                        * field for ResponseDate
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.DateTimeType localResponseDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.DateTimeType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.DateTimeType getResponseDate(){
                               return localResponseDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseDate
                               */
                               public void setResponseDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType param){
                            
                                            this.localResponseDate=param;
                                       

                               }
                            

                        /**
                        * field for SendBy
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.SenderType localSendBy ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.SenderType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.SenderType getSendBy(){
                               return localSendBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendBy
                               */
                               public void setSendBy(com.amx.mexico.telcel.esb.v1_2.SenderType param){
                            
                                            this.localSendBy=param;
                                       

                               }
                            

                        /**
                        * field for Latency
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.LatencyType localLatency ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.LatencyType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.LatencyType getLatency(){
                               return localLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Latency
                               */
                               public void setLatency(com.amx.mexico.telcel.esb.v1_2.LatencyType param){
                            
                                            this.localLatency=param;
                                       

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
                           namespacePrefix+":ControlDataResponseHeaderType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ControlDataResponseHeaderType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localVersion==null){
                                                 throw new org.apache.axis2.databinding.ADBException("version cannot be null!!");
                                            }
                                           localVersion.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","version"),
                                               xmlWriter);
                                        
                                            if (localResultCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resultCode cannot be null!!");
                                            }
                                           localResultCode.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","resultCode"),
                                               xmlWriter);
                                        
                                            if (localResultDesc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resultDesc cannot be null!!");
                                            }
                                           localResultDesc.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","resultDesc"),
                                               xmlWriter);
                                         if (localAdditionalPropertyTracker){
                                       if (localAdditionalProperty!=null){
                                            for (int i = 0;i < localAdditionalProperty.length;i++){
                                                if (localAdditionalProperty[i] != null){
                                                 localAdditionalProperty[i].serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","additionalProperty"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("additionalProperty cannot be null!!");
                                        
                                    }
                                 } if (localMsgLanguageCodeTracker){
                                            if (localMsgLanguageCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("msgLanguageCode cannot be null!!");
                                            }
                                           localMsgLanguageCode.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","msgLanguageCode"),
                                               xmlWriter);
                                        }
                                            if (localMessageUUID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("messageUUID cannot be null!!");
                                            }
                                           localMessageUUID.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","messageUUID"),
                                               xmlWriter);
                                        
                                            if (localResponseDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("responseDate cannot be null!!");
                                            }
                                           localResponseDate.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","responseDate"),
                                               xmlWriter);
                                        
                                            if (localSendBy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("sendBy cannot be null!!");
                                            }
                                           localSendBy.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","sendBy"),
                                               xmlWriter);
                                        
                                            if (localLatency==null){
                                                 throw new org.apache.axis2.databinding.ADBException("latency cannot be null!!");
                                            }
                                           localLatency.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","latency"),
                                               xmlWriter);
                                        
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
        public static ControlDataResponseHeaderType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ControlDataResponseHeaderType object =
                new ControlDataResponseHeaderType();

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
                    
                            if (!"ControlDataResponseHeaderType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ControlDataResponseHeaderType)mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","version").equals(reader.getName())){
                                
                                                object.setVersion(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","resultCode").equals(reader.getName())){
                                
                                                object.setResultCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","resultDesc").equals(reader.getName())){
                                
                                                object.setResultDesc(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","additionalProperty").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list4.add(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
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
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","additionalProperty").equals(reader.getName())){
                                                                    list4.add(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAdditionalProperty((com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","msgLanguageCode").equals(reader.getName())){
                                
                                                object.setMsgLanguageCode(com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","messageUUID").equals(reader.getName())){
                                
                                                object.setMessageUUID(com.amx.mexico.telcel.esb.v1_2.MessageUUIDType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","responseDate").equals(reader.getName())){
                                
                                                object.setResponseDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","sendBy").equals(reader.getName())){
                                
                                                object.setSendBy(com.amx.mexico.telcel.esb.v1_2.SenderType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","latency").equals(reader.getName())){
                                
                                                object.setLatency(com.amx.mexico.telcel.esb.v1_2.LatencyType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    