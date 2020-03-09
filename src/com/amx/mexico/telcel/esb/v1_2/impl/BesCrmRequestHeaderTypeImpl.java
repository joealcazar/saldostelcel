/*
 * XML Type:  BesCrmRequestHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCrmRequestHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCrmRequestHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public BesCrmRequestHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEID$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "beId");
    private static final javax.xml.namespace.QName REGIONID$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "regionId");
    private static final javax.xml.namespace.QName OPERATORINFO$4 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "operatorInfo");
    private static final javax.xml.namespace.QName CHANNELTYPE$6 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "channelType");
    
    
    /**
     * Gets the "beId" element
     */
    public java.math.BigDecimal getBeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "beId" element
     */
    public com.amx.mexico.telcel.esb.v1_2.Decimal20Type xgetBeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(BEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "beId" element
     */
    public void setBeId(java.math.BigDecimal beId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEID$0);
            }
            target.setBigDecimalValue(beId);
        }
    }
    
    /**
     * Sets (as xml) the "beId" element
     */
    public void xsetBeId(com.amx.mexico.telcel.esb.v1_2.Decimal20Type beId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(BEID$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().add_element_user(BEID$0);
            }
            target.set(beId);
        }
    }
    
    /**
     * Gets the "regionId" element
     */
    public java.math.BigDecimal getRegionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "regionId" element
     */
    public com.amx.mexico.telcel.esb.v1_2.Decimal20Type xgetRegionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(REGIONID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "regionId" element
     */
    public void setRegionId(java.math.BigDecimal regionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGIONID$2);
            }
            target.setBigDecimalValue(regionId);
        }
    }
    
    /**
     * Sets (as xml) the "regionId" element
     */
    public void xsetRegionId(com.amx.mexico.telcel.esb.v1_2.Decimal20Type regionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(REGIONID$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().add_element_user(REGIONID$2);
            }
            target.set(regionId);
        }
    }
    
    /**
     * Gets the "operatorInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType getOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType)get_store().find_element_user(OPERATORINFO$4, 0);
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
            return get_store().count_elements(OPERATORINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "operatorInfo" element
     */
    public void setOperatorInfo(com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType operatorInfo)
    {
        generatedSetterHelperImpl(operatorInfo, OPERATORINFO$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operatorInfo" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType addNewOperatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType)get_store().add_element_user(OPERATORINFO$4);
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
            get_store().remove_element(OPERATORINFO$4, 0);
        }
    }
    
    /**
     * Gets the "channelType" element
     */
    public java.lang.String getChannelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNELTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "channelType" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType xgetChannelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType)get_store().find_element_user(CHANNELTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "channelType" element
     */
    public void setChannelType(java.lang.String channelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNELTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNELTYPE$6);
            }
            target.setStringValue(channelType);
        }
    }
    
    /**
     * Sets (as xml) the "channelType" element
     */
    public void xsetChannelType(com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType channelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType)get_store().find_element_user(CHANNELTYPE$6, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCrmChannelType)get_store().add_element_user(CHANNELTYPE$6);
            }
            target.set(channelType);
        }
    }
}
