/*
 * XML Type:  BesCrmOperatorInfoType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML BesCrmOperatorInfoType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class BesCrmOperatorInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.BesCrmOperatorInfoType
{
    private static final long serialVersionUID = 1L;
    
    public BesCrmOperatorInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATORCODE$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "operatorCode");
    private static final javax.xml.namespace.QName ORGID$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "orgId");
    
    
    /**
     * Gets the "operatorCode" element
     */
    public java.lang.String getOperatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operatorCode" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type xgetOperatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().find_element_user(OPERATORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operatorCode" element
     */
    public void setOperatorCode(java.lang.String operatorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORCODE$0);
            }
            target.setStringValue(operatorCode);
        }
    }
    
    /**
     * Sets (as xml) the "operatorCode" element
     */
    public void xsetOperatorCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type operatorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().find_element_user(OPERATORCODE$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type)get_store().add_element_user(OPERATORCODE$0);
            }
            target.set(operatorCode);
        }
    }
    
    /**
     * Gets the "orgId" element
     */
    public java.math.BigDecimal getOrgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "orgId" element
     */
    public com.amx.mexico.telcel.esb.v1_2.Decimal20Type xgetOrgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(ORGID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orgId" element
     */
    public void setOrgId(java.math.BigDecimal orgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGID$2);
            }
            target.setBigDecimalValue(orgId);
        }
    }
    
    /**
     * Sets (as xml) the "orgId" element
     */
    public void xsetOrgId(com.amx.mexico.telcel.esb.v1_2.Decimal20Type orgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.Decimal20Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().find_element_user(ORGID$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.Decimal20Type)get_store().add_element_user(ORGID$2);
            }
            target.set(orgId);
        }
    }
}
