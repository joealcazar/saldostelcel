
/**
 * ControlDataRequestHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */

            
                package com.amx.mexico.telcel.esb.v1_2;
            

            /**
            *  ControlDataRequestHeaderType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ControlDataRequestHeaderType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ControlDataRequestHeaderType
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
                        * field for BusinessCode
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type localBusinessCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBusinessCodeTracker = false ;

                           public boolean isBusinessCodeSpecified(){
                               return localBusinessCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type getBusinessCode(){
                               return localBusinessCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BusinessCode
                               */
                               public void setBusinessCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type param){
                            localBusinessCodeTracker = param != null;
                                   
                                            this.localBusinessCode=param;
                                       

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
                        * field for RequestDate
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.DateTimeType localRequestDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.DateTimeType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.DateTimeType getRequestDate(){
                               return localRequestDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestDate
                               */
                               public void setRequestDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType param){
                            
                                            this.localRequestDate=param;
                                       

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
                        * field for IpClient
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.IPv4AddressType localIpClient ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIpClientTracker = false ;

                           public boolean isIpClientSpecified(){
                               return localIpClientTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.IPv4AddressType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.IPv4AddressType getIpClient(){
                               return localIpClient;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IpClient
                               */
                               public void setIpClient(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType param){
                            localIpClientTracker = param != null;
                                   
                                            this.localIpClient=param;
                                       

                               }
                            

                        /**
                        * field for IpServer
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.IPv4AddressType localIpServer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIpServerTracker = false ;

                           public boolean isIpServerSpecified(){
                               return localIpServerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.IPv4AddressType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.IPv4AddressType getIpServer(){
                               return localIpServer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IpServer
                               */
                               public void setIpServer(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType param){
                            localIpServerTracker = param != null;
                                   
                                            this.localIpServer=param;
                                       

                               }
                            

                        /**
                        * field for User
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.UserType localUser ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserTracker = false ;

                           public boolean isUserSpecified(){
                               return localUserTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.UserType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.UserType getUser(){
                               return localUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param User
                               */
                               public void setUser(com.amx.mexico.telcel.esb.v1_2.UserType param){
                            localUserTracker = param != null;
                                   
                                            this.localUser=param;
                                       

                               }
                            

                        /**
                        * field for BesCbsRequestHeader
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType localBesCbsRequestHeader ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBesCbsRequestHeaderTracker = false ;

                           public boolean isBesCbsRequestHeaderSpecified(){
                               return localBesCbsRequestHeaderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType getBesCbsRequestHeader(){
                               return localBesCbsRequestHeader;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BesCbsRequestHeader
                               */
                               public void setBesCbsRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType param){
                            localBesCbsRequestHeaderTracker = param != null;
                                   
                                            this.localBesCbsRequestHeader=param;
                                       

                               }
                            

                        /**
                        * field for BesCrmRequestHeader
                        */

                        
                                    protected com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType localBesCrmRequestHeader ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBesCrmRequestHeaderTracker = false ;

                           public boolean isBesCrmRequestHeaderSpecified(){
                               return localBesCrmRequestHeaderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType
                           */
                           public  com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType getBesCrmRequestHeader(){
                               return localBesCrmRequestHeader;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BesCrmRequestHeader
                               */
                               public void setBesCrmRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType param){
                            localBesCrmRequestHeaderTracker = param != null;
                                   
                                            this.localBesCrmRequestHeader=param;
                                       

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
                           namespacePrefix+":ControlDataRequestHeaderType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ControlDataRequestHeaderType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localVersion==null){
                                                 throw new org.apache.axis2.databinding.ADBException("version cannot be null!!");
                                            }
                                           localVersion.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","version"),
                                               xmlWriter);
                                         if (localBusinessCodeTracker){
                                            if (localBusinessCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("businessCode cannot be null!!");
                                            }
                                           localBusinessCode.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","businessCode"),
                                               xmlWriter);
                                        }
                                            if (localMessageUUID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("messageUUID cannot be null!!");
                                            }
                                           localMessageUUID.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","messageUUID"),
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
                                 }
                                            if (localRequestDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("requestDate cannot be null!!");
                                            }
                                           localRequestDate.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","requestDate"),
                                               xmlWriter);
                                        
                                            if (localSendBy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("sendBy cannot be null!!");
                                            }
                                           localSendBy.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","sendBy"),
                                               xmlWriter);
                                         if (localIpClientTracker){
                                            if (localIpClient==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ipClient cannot be null!!");
                                            }
                                           localIpClient.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","ipClient"),
                                               xmlWriter);
                                        } if (localIpServerTracker){
                                            if (localIpServer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ipServer cannot be null!!");
                                            }
                                           localIpServer.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","ipServer"),
                                               xmlWriter);
                                        } if (localUserTracker){
                                            if (localUser==null){
                                                 throw new org.apache.axis2.databinding.ADBException("user cannot be null!!");
                                            }
                                           localUser.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","user"),
                                               xmlWriter);
                                        } if (localBesCbsRequestHeaderTracker){
                                            if (localBesCbsRequestHeader==null){
                                                 throw new org.apache.axis2.databinding.ADBException("besCbsRequestHeader cannot be null!!");
                                            }
                                           localBesCbsRequestHeader.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","besCbsRequestHeader"),
                                               xmlWriter);
                                        } if (localBesCrmRequestHeaderTracker){
                                            if (localBesCrmRequestHeader==null){
                                                 throw new org.apache.axis2.databinding.ADBException("besCrmRequestHeader cannot be null!!");
                                            }
                                           localBesCrmRequestHeader.serialize(new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","besCrmRequestHeader"),
                                               xmlWriter);
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
        public static ControlDataRequestHeaderType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ControlDataRequestHeaderType object =
                new ControlDataRequestHeaderType();

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
                    
                            if (!"ControlDataRequestHeaderType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ControlDataRequestHeaderType)mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","businessCode").equals(reader.getName())){
                                
                                                object.setBusinessCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","requestDate").equals(reader.getName())){
                                
                                                object.setRequestDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","ipClient").equals(reader.getName())){
                                
                                                object.setIpClient(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","ipServer").equals(reader.getName())){
                                
                                                object.setIpServer(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","user").equals(reader.getName())){
                                
                                                object.setUser(com.amx.mexico.telcel.esb.v1_2.UserType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","besCbsRequestHeader").equals(reader.getName())){
                                
                                                object.setBesCbsRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2","besCrmRequestHeader").equals(reader.getName())){
                                
                                                object.setBesCrmRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
    