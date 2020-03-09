/*
 * XML Type:  BesCbsRequestHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCbsRequestHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCbsRequestHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public BesCbsRequestHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERSHIPINFO$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "ownershipInfo");
    private static final javax.xml.namespace.QName OPERATORINFO$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "operatorInfo");
    private static final javax.xml.namespace.QName ACCESSMODE$4 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "accessMode");
    private static final javax.xml.namespace.QName MSGLANGUAGECODE$6 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "msgLanguageCode");
    private static final javax.xml.namespace.QName TIMEFORMAT$8 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "timeFormat");
    
    
    /**
     * Gets the "ownershipInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType getOwnershipInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType)get_store().find_element_user(OWNERSHIPINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownershipInfo" element
     */
    public boolean isSetOwnershipInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERSHIPINFO$0) != 0;
        }
    }
    
    /**
     * Sets the "ownershipInfo" element
     */
    public void setOwnershipInfo(com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType ownershipInfo)
    {
        generatedSetterHelperImpl(ownershipInfo, OWNERSHIPINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ownershipInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType addNewOwnershipInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType)get_store().add_element_user(OWNERSHIPINFO$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ownershipInfo" element
     */
    public void unsetOwnershipInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERSHIPINFO$0, 0);
        }
    }
    
    /**
     * Gets the "operatorInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType getOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType)get_store().find_element_user(OPERATORINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "operatorInfo" element
     */
    public boolean isSetOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATORINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "operatorInfo" element
     */
    public void setOperatorInfo(com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType operatorInfo)
    {
        generatedSetterHelperImpl(operatorInfo, OPERATORINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operatorInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType addNewOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType)get_store().add_element_user(OPERATORINFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "operatorInfo" element
     */
    public void unsetOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATORINFO$2, 0);
        }
    }
    
    /**
     * Gets the "accessMode" element
     */
    public java.lang.String getAccessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessMode" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type xgetAccessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().find_element_user(ACCESSMODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "accessMode" element
     */
    public boolean isSetAccessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSMODE$4) != 0;
        }
    }
    
    /**
     * Sets the "accessMode" element
     */
    public void setAccessMode(java.lang.String accessMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSMODE$4);
            }
            target.setStringValue(accessMode);
        }
    }
    
    /**
     * Sets (as xml) the "accessMode" element
     */
    public void xsetAccessMode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type accessMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().find_element_user(ACCESSMODE$4, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type)get_store().add_element_user(ACCESSMODE$4);
            }
            target.set(accessMode);
        }
    }
    
    /**
     * Unsets the "accessMode" element
     */
    public void unsetAccessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSMODE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGLANGUAGECODE$6, 0);
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
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().find_element_user(MSGLANGUAGECODE$6, 0);
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
            return get_store().count_elements(MSGLANGUAGECODE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGLANGUAGECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGLANGUAGECODE$6);
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
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().find_element_user(MSGLANGUAGECODE$6, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType)get_store().add_element_user(MSGLANGUAGECODE$6);
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
            get_store().remove_element(MSGLANGUAGECODE$6, 0);
        }
    }
    
    /**
     * Gets the "timeFormat" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType getTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType)get_store().find_element_user(TIMEFORMAT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeFormat" element
     */
    public boolean isSetTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEFORMAT$8) != 0;
        }
    }
    
    /**
     * Sets the "timeFormat" element
     */
    public void setTimeFormat(com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType timeFormat)
    {
        generatedSetterHelperImpl(timeFormat, TIMEFORMAT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeFormat" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType addNewTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType)get_store().add_element_user(TIMEFORMAT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "timeFormat" element
     */
    public void unsetTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEFORMAT$8, 0);
        }
    }
}
