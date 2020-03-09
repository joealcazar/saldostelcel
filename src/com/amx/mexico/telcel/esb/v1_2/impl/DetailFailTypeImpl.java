/*
 * XML Type:  DetailFailType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.DetailFailType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML DetailFailType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class DetailFailTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.DetailFailType
{
    private static final long serialVersionUID = 1L;
    
    public DetailFailTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONNAME$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "operationName");
    private static final javax.xml.namespace.QName ERRORS$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "errors");
    
    
    /**
     * Gets the "operationName" element
     */
    public java.lang.String getOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationName" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type xgetOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type)get_store().find_element_user(OPERATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationName" element
     */
    public boolean isSetOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "operationName" element
     */
    public void setOperationName(java.lang.String operationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONNAME$0);
            }
            target.setStringValue(operationName);
        }
    }
    
    /**
     * Sets (as xml) the "operationName" element
     */
    public void xsetOperationName(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type operationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type)get_store().find_element_user(OPERATIONNAME$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type)get_store().add_element_user(OPERATIONNAME$0);
            }
            target.set(operationName);
        }
    }
    
    /**
     * Unsets the "operationName" element
     */
    public void unsetOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONNAME$0, 0);
        }
    }
    
    /**
     * Gets array of all "errors" elements
     */
    public com.amx.mexico.telcel.esb.v1_2.ErrorType[] getErrorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORS$2, targetList);
            com.amx.mexico.telcel.esb.v1_2.ErrorType[] result = new com.amx.mexico.telcel.esb.v1_2.ErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "errors" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ErrorType getErrorsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ErrorType)get_store().find_element_user(ERRORS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "errors" element
     */
    public int sizeOfErrorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORS$2);
        }
    }
    
    /**
     * Sets array of all "errors" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setErrorsArray(com.amx.mexico.telcel.esb.v1_2.ErrorType[] errorsArray)
    {
        check_orphaned();
        arraySetterHelper(errorsArray, ERRORS$2);
    }
    
    /**
     * Sets ith "errors" element
     */
    public void setErrorsArray(int i, com.amx.mexico.telcel.esb.v1_2.ErrorType errors)
    {
        generatedSetterHelperImpl(errors, ERRORS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errors" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ErrorType insertNewErrors(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ErrorType)get_store().insert_element_user(ERRORS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errors" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ErrorType addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ErrorType)get_store().add_element_user(ERRORS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "errors" element
     */
    public void removeErrors(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORS$2, i);
        }
    }
}
