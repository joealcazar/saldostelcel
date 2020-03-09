/*
 * XML Type:  ControlDataResponseHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML ControlDataResponseHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class ControlDataResponseHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public ControlDataResponseHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "version");
    private static final javax.xml.namespace.QName RESULTCODE$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "resultCode");
    private static final javax.xml.namespace.QName RESULTDESC$4 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "resultDesc");
    private static final javax.xml.namespace.QName ADDITIONALPROPERTY$6 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "additionalProperty");
    private static final javax.xml.namespace.QName MSGLANGUAGECODE$8 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "msgLanguageCode");
    private static final javax.xml.namespace.QName MESSAGEUUID$10 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "messageUUID");
    private static final javax.xml.namespace.QName RESPONSEDATE$12 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "responseDate");
    private static final javax.xml.namespace.QName SENDBY$14 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "sendBy");
    private static final javax.xml.namespace.QName LATENCY$16 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "latency");
    
    
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
     * Gets the "resultCode" element
     */
    public java.lang.String getResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resultCode" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type xgetResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().find_element_user(RESULTCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resultCode" element
     */
    public void setResultCode(java.lang.String resultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTCODE$2);
            }
            target.setStringValue(resultCode);
        }
    }
    
    /**
     * Sets (as xml) the "resultCode" element
     */
    public void xsetResultCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type resultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().add_element_user(RESULTCODE$2);
            }
            target.set(resultCode);
        }
    }
    
    /**
     * Gets the "resultDesc" element
     */
    public java.lang.String getResultDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTDESC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resultDesc" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type xgetResultDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type)get_store().find_element_user(RESULTDESC$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resultDesc" element
     */
    public void setResultDesc(java.lang.String resultDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTDESC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTDESC$4);
            }
            target.setStringValue(resultDesc);
        }
    }
    
    /**
     * Sets (as xml) the "resultDesc" element
     */
    public void xsetResultDesc(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type resultDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type)get_store().find_element_user(RESULTDESC$4, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type)get_store().add_element_user(RESULTDESC$4);
            }
            target.set(resultDesc);
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
     * Gets the "msgLanguageCode" element
     */
    public java.lang.String getMsgLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGLANGUAGECODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "msgLanguageCode" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType xgetMsgLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().find_element_user(MSGLANGUAGECODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "msgLanguageCode" element
     */
    public boolean isSetMsgLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MSGLANGUAGECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "msgLanguageCode" element
     */
    public void setMsgLanguageCode(java.lang.String msgLanguageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGLANGUAGECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGLANGUAGECODE$8);
            }
            target.setStringValue(msgLanguageCode);
        }
    }
    
    /**
     * Sets (as xml) the "msgLanguageCode" element
     */
    public void xsetMsgLanguageCode(com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType msgLanguageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().find_element_user(MSGLANGUAGECODE$8, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().add_element_user(MSGLANGUAGECODE$8);
            }
            target.set(msgLanguageCode);
        }
    }
    
    /**
     * Unsets the "msgLanguageCode" element
     */
    public void unsetMsgLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MSGLANGUAGECODE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEUUID$10, 0);
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
            target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().find_element_user(MESSAGEUUID$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEUUID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEUUID$10);
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
            target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().find_element_user(MESSAGEUUID$10, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.MessageUUIDType)get_store().add_element_user(MESSAGEUUID$10);
            }
            target.set(messageUUID);
        }
    }
    
    /**
     * Gets the "responseDate" element
     */
    public java.util.Calendar getResponseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseDate" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DateTimeType xgetResponseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DateTimeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().find_element_user(RESPONSEDATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "responseDate" element
     */
    public void setResponseDate(java.util.Calendar responseDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSEDATE$12);
            }
            target.setCalendarValue(responseDate);
        }
    }
    
    /**
     * Sets (as xml) the "responseDate" element
     */
    public void xsetResponseDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType responseDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DateTimeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().find_element_user(RESPONSEDATE$12, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.DateTimeType)get_store().add_element_user(RESPONSEDATE$12);
            }
            target.set(responseDate);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDBY$14, 0);
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
            target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().find_element_user(SENDBY$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDBY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDBY$14);
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
            target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().find_element_user(SENDBY$14, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.SenderType)get_store().add_element_user(SENDBY$14);
            }
            target.set(sendBy);
        }
    }
    
    /**
     * Gets the "latency" element
     */
    public int getLatency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATENCY$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "latency" element
     */
    public com.amx.mexico.telcel.esb.v1_2.LatencyType xgetLatency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.LatencyType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.LatencyType)get_store().find_element_user(LATENCY$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "latency" element
     */
    public void setLatency(int latency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATENCY$16);
            }
            target.setIntValue(latency);
        }
    }
    
    /**
     * Sets (as xml) the "latency" element
     */
    public void xsetLatency(com.amx.mexico.telcel.esb.v1_2.LatencyType latency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.LatencyType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.LatencyType)get_store().find_element_user(LATENCY$16, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.LatencyType)get_store().add_element_user(LATENCY$16);
            }
            target.set(latency);
        }
    }
}
