/*
 * XML Type:  BesCbsOperatorInfoType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCbsOperatorInfoType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCbsOperatorInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType
{
    private static final long serialVersionUID = 1L;
    
    public BesCbsOperatorInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATORID$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "operatorID");
    private static final javax.xml.namespace.QName CHANNELID$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "channelID");
    
    
    /**
     * Gets the "operatorID" element
     */
    public java.lang.String getOperatorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operatorID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaType xgetOperatorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaType)get_store().find_element_user(OPERATORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operatorID" element
     */
    public void setOperatorID(java.lang.String operatorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORID$0);
            }
            target.setStringValue(operatorID);
        }
    }
    
    /**
     * Sets (as xml) the "operatorID" element
     */
    public void xsetOperatorID(com.amx.mexico.telcel.esb.v1_2.CadenaType operatorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaType)get_store().find_element_user(OPERATORID$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaType)get_store().add_element_user(OPERATORID$0);
            }
            target.set(operatorID);
        }
    }
    
    /**
     * Gets the "channelID" element
     */
    public java.lang.String getChannelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNELID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "channelID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type xgetChannelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().find_element_user(CHANNELID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "channelID" element
     */
    public boolean isSetChannelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANNELID$2) != 0;
        }
    }
    
    /**
     * Sets the "channelID" element
     */
    public void setChannelID(java.lang.String channelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNELID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNELID$2);
            }
            target.setStringValue(channelID);
        }
    }
    
    /**
     * Sets (as xml) the "channelID" element
     */
    public void xsetChannelID(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type channelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().find_element_user(CHANNELID$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().add_element_user(CHANNELID$2);
            }
            target.set(channelID);
        }
    }
    
    /**
     * Unsets the "channelID" element
     */
    public void unsetChannelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANNELID$2, 0);
        }
    }
}
