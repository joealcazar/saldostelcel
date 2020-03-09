/*
 * XML Type:  BesCbsOwnershipInfoType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCbsOwnershipInfoType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCbsOwnershipInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType
{
    private static final long serialVersionUID = 1L;
    
    public BesCbsOwnershipInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEID$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "BEID");
    private static final javax.xml.namespace.QName BRID$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "BRID");
    
    
    /**
     * Gets the "BEID" element
     */
    public java.lang.String getBEID()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BEID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType xgetBEID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType)get_store().find_element_user(BEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BEID" element
     */
    public void setBEID(java.lang.String beid)
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
            target.setStringValue(beid);
        }
    }
    
    /**
     * Sets (as xml) the "BEID" element
     */
    public void xsetBEID(com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType beid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType)get_store().find_element_user(BEID$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType)get_store().add_element_user(BEID$0);
            }
            target.set(beid);
        }
    }
    
    /**
     * Gets the "BRID" element
     */
    public java.lang.String getBRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BRID" element
     */
    public com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType xgetBRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType)get_store().find_element_user(BRID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "BRID" element
     */
    public boolean isSetBRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRID$2) != 0;
        }
    }
    
    /**
     * Sets the "BRID" element
     */
    public void setBRID(java.lang.String brid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRID$2);
            }
            target.setStringValue(brid);
        }
    }
    
    /**
     * Sets (as xml) the "BRID" element
     */
    public void xsetBRID(com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType brid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType)get_store().find_element_user(BRID$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType)get_store().add_element_user(BRID$2);
            }
            target.set(brid);
        }
    }
    
    /**
     * Unsets the "BRID" element
     */
    public void unsetBRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRID$2, 0);
        }
    }
}
