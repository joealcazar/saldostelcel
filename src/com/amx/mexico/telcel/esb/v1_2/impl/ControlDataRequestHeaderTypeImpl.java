/*
 * XML Type:  ControlDataRequestHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML ControlDataRequestHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class ControlDataRequestHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public ControlDataRequestHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "version");
    private static final javax.xml.namespace.QName BUSINESSCODE$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "businessCode");
    private static final javax.xml.namespace.QName MESSAGEUUID$4 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "messageUUID");
    private static final javax.xml.namespace.QName ADDITIONALPROPERTY$6 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "additionalProperty");
    private static final javax.xml.namespace.QName REQUESTDATE$8 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "requestDate");
    private static final javax.xml.namespace.QName SENDBY$10 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "sendBy");
    private static final javax.xml.namespace.QName IPCLIENT$12 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "ipClient");
    private static final javax.xml.namespace.QName IPSERVER$14 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "ipServer");
    private static final javax.xml.namespace.QName USER$16 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "user");
    private static final javax.xml.namespace.QName BESCBSREQUESTHEADER$18 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "besCbsRequestHeader");
    private static final javax.xml.namespace.QName BESCRMREQUESTHEADER$20 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "besCrmRequestHeader");
    
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().find_element_user(VERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "businessCode" element
     */
    public java.lang.String getBusinessCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "businessCode" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type xgetBusinessCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type)get_store().find_element_user(BUSINESSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "businessCode" element
     */
    public boolean isSetBusinessCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "businessCode" element
     */
    public void setBusinessCode(java.lang.String businessCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSCODE$2);
            }
            target.setStringValue(businessCode);
        }
    }
    
    /**
     * Sets (as xml) the "businessCode" element
     */
    public void xsetBusinessCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type businessCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type)get_store().find_element_user(BUSINESSCODE$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type)get_store().add_element_user(BUSINESSCODE$2);
            }
            target.set(businessCode);
        }
    }
    
    /**
     * Unsets the "businessCode" element
     */
    public void unsetBusinessCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSCODE$2, 0);
        }
    }
    
    /**
     * Gets the "messageUUID" element
     */
    public java.lang.String getMessageUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEUUID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageUUID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.MessageUUIDType xgetMessageUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.MessageUUIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().find_element_user(MESSAGEUUID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageUUID" element
     */
    public void setMessageUUID(java.lang.String messageUUID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEUUID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEUUID$4);
            }
            target.setStringValue(messageUUID);
        }
    }
    
    /**
     * Sets (as xml) the "messageUUID" element
     */
    public void xsetMessageUUID(com.amx.mexico.telcel.esb.v1_2.MessageUUIDType messageUUID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.MessageUUIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().find_element_user(MESSAGEUUID$4, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().add_element_user(MESSAGEUUID$4);
            }
            target.set(messageUUID);
        }
    }
    
    /**
     * Gets array of all "additionalProperty" elements
     */
    public com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] getAdditionalPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALPROPERTY$6, targetList);
            com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] result = new com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalProperty" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType getAdditionalPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType)get_store().find_element_user(ADDITIONALPROPERTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalProperty" element
     */
    public int sizeOfAdditionalPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALPROPERTY$6);
        }
    }
    
    /**
     * Sets array of all "additionalProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalPropertyArray(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] additionalPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(additionalPropertyArray, ADDITIONALPROPERTY$6);
    }
    
    /**
     * Sets ith "additionalProperty" element
     */
    public void setAdditionalPropertyArray(int i, com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType additionalProperty)
    {
        generatedSetterHelperImpl(additionalProperty, ADDITIONALPROPERTY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalProperty" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType insertNewAdditionalProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType)get_store().insert_element_user(ADDITIONALPROPERTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalProperty" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType addNewAdditionalProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType)get_store().add_element_user(ADDITIONALPROPERTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalProperty" element
     */
    public void removeAdditionalProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALPROPERTY$6, i);
        }
    }
    
    /**
     * Gets the "requestDate" element
     */
    public java.util.Calendar getRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestDate" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DateTimeType xgetRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DateTimeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().find_element_user(REQUESTDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "requestDate" element
     */
    public void setRequestDate(java.util.Calendar requestDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTDATE$8);
            }
            target.setCalendarValue(requestDate);
        }
    }
    
    /**
     * Sets (as xml) the "requestDate" element
     */
    public void xsetRequestDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType requestDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DateTimeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().find_element_user(REQUESTDATE$8, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().add_element_user(REQUESTDATE$8);
            }
            target.set(requestDate);
        }
    }
    
    /**
     * Gets the "sendBy" element
     */
    public java.lang.String getSendBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDBY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendBy" element
     */
    public com.amx.mexico.telcel.esb.v1_2.SenderType xgetSendBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.SenderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().find_element_user(SENDBY$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sendBy" element
     */
    public void setSendBy(java.lang.String sendBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDBY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDBY$10);
            }
            target.setStringValue(sendBy);
        }
    }
    
    /**
     * Sets (as xml) the "sendBy" element
     */
    public void xsetSendBy(com.amx.mexico.telcel.esb.v1_2.SenderType sendBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.SenderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().find_element_user(SENDBY$10, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().add_element_user(SENDBY$10);
            }
            target.set(sendBy);
        }
    }
    
    /**
     * Gets the "ipClient" element
     */
    public java.lang.String getIpClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPCLIENT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ipClient" element
     */
    public com.amx.mexico.telcel.esb.v1_2.IPv4AddressType xgetIpClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.IPv4AddressType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().find_element_user(IPCLIENT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ipClient" element
     */
    public boolean isSetIpClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPCLIENT$12) != 0;
        }
    }
    
    /**
     * Sets the "ipClient" element
     */
    public void setIpClient(java.lang.String ipClient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPCLIENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPCLIENT$12);
            }
            target.setStringValue(ipClient);
        }
    }
    
    /**
     * Sets (as xml) the "ipClient" element
     */
    public void xsetIpClient(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType ipClient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.IPv4AddressType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().find_element_user(IPCLIENT$12, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().add_element_user(IPCLIENT$12);
            }
            target.set(ipClient);
        }
    }
    
    /**
     * Unsets the "ipClient" element
     */
    public void unsetIpClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPCLIENT$12, 0);
        }
    }
    
    /**
     * Gets the "ipServer" element
     */
    public java.lang.String getIpServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPSERVER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ipServer" element
     */
    public com.amx.mexico.telcel.esb.v1_2.IPv4AddressType xgetIpServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.IPv4AddressType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().find_element_user(IPSERVER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ipServer" element
     */
    public boolean isSetIpServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPSERVER$14) != 0;
        }
    }
    
    /**
     * Sets the "ipServer" element
     */
    public void setIpServer(java.lang.String ipServer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPSERVER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPSERVER$14);
            }
            target.setStringValue(ipServer);
        }
    }
    
    /**
     * Sets (as xml) the "ipServer" element
     */
    public void xsetIpServer(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType ipServer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.IPv4AddressType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().find_element_user(IPSERVER$14, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.IPv4AddressType)get_store().add_element_user(IPSERVER$14);
            }
            target.set(ipServer);
        }
    }
    
    /**
     * Unsets the "ipServer" element
     */
    public void unsetIpServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPSERVER$14, 0);
        }
    }
    
    /**
     * Gets the "user" element
     */
    public java.lang.String getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "user" element
     */
    public com.amx.mexico.telcel.esb.v1_2.UserType xgetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.UserType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.UserType)get_store().find_element_user(USER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "user" element
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$16) != 0;
        }
    }
    
    /**
     * Sets the "user" element
     */
    public void setUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$16);
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) the "user" element
     */
    public void xsetUser(com.amx.mexico.telcel.esb.v1_2.UserType user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.UserType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.UserType)get_store().find_element_user(USER$16, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.UserType)get_store().add_element_user(USER$16);
            }
            target.set(user);
        }
    }
    
    /**
     * Unsets the "user" element
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$16, 0);
        }
    }
    
    /**
     * Gets the "besCbsRequestHeader" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType getBesCbsRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType)get_store().find_element_user(BESCBSREQUESTHEADER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "besCbsRequestHeader" element
     */
    public boolean isSetBesCbsRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BESCBSREQUESTHEADER$18) != 0;
        }
    }
    
    /**
     * Sets the "besCbsRequestHeader" element
     */
    public void setBesCbsRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType besCbsRequestHeader)
    {
        generatedSetterHelperImpl(besCbsRequestHeader, BESCBSREQUESTHEADER$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "besCbsRequestHeader" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType addNewBesCbsRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType)get_store().add_element_user(BESCBSREQUESTHEADER$18);
            return target;
        }
    }
    
    /**
     * Unsets the "besCbsRequestHeader" element
     */
    public void unsetBesCbsRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BESCBSREQUESTHEADER$18, 0);
        }
    }
    
    /**
     * Gets the "besCrmRequestHeader" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType getBesCrmRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType)get_store().find_element_user(BESCRMREQUESTHEADER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "besCrmRequestHeader" element
     */
    public boolean isSetBesCrmRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BESCRMREQUESTHEADER$20) != 0;
        }
    }
    
    /**
     * Sets the "besCrmRequestHeader" element
     */
    public void setBesCrmRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType besCrmRequestHeader)
    {
        generatedSetterHelperImpl(besCrmRequestHeader, BESCRMREQUESTHEADER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "besCrmRequestHeader" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType addNewBesCrmRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType)get_store().add_element_user(BESCRMREQUESTHEADER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "besCrmRequestHeader" element
     */
    public void unsetBesCrmRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BESCRMREQUESTHEADER$20, 0);
        }
    }
}
