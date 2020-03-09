/*
 * XML Type:  BesCbsTimeFormatType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCbsTimeFormatType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCbsTimeFormatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType
{
    private static final long serialVersionUID = 1L;
    
    public BesCbsTimeFormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETYPE$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "timeType");
    private static final javax.xml.namespace.QName TIMEZONEID$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "timeZoneID");
    
    
    /**
     * Gets the "timeType" element
     */
    public java.lang.String getTimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeType" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type xgetTimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().find_element_user(TIMETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timeType" element
     */
    public void setTimeType(java.lang.String timeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMETYPE$0);
            }
            target.setStringValue(timeType);
        }
    }
    
    /**
     * Sets (as xml) the "timeType" element
     */
    public void xsetTimeType(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type timeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().find_element_user(TIMETYPE$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1Type)get_store().add_element_user(TIMETYPE$0);
            }
            target.set(timeType);
        }
    }
    
    /**
     * Gets the "timeZoneID" element
     */
    public java.lang.String getTimeZoneID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeZoneID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType xgetTimeZoneID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType)get_store().find_element_user(TIMEZONEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeZoneID" element
     */
    public boolean isSetTimeZoneID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEID$2) != 0;
        }
    }
    
    /**
     * Sets the "timeZoneID" element
     */
    public void setTimeZoneID(java.lang.String timeZoneID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONEID$2);
            }
            target.setStringValue(timeZoneID);
        }
    }
    
    /**
     * Sets (as xml) the "timeZoneID" element
     */
    public void xsetTimeZoneID(com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType timeZoneID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType)get_store().find_element_user(TIMEZONEID$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCbsTimeZoneType)get_store().add_element_user(TIMEZONEID$2);
            }
            target.set(timeZoneID);
        }
    }
    
    /**
     * Unsets the "timeZoneID" element
     */
    public void unsetTimeZoneID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEID$2, 0);
        }
    }
}
