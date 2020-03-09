/*
 * XML Type:  ErrorType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.ErrorType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2.impl;
/**
 * An XML ErrorType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.amx.mexico.telcel.esb.v1_2.ErrorType
{
    private static final long serialVersionUID = 1L;
    
    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "code");
    private static final javax.xml.namespace.QName SEVERITYLEVEL$2 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "severityLevel");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "description");
    private static final javax.xml.namespace.QName ACTOR$6 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "actor");
    private static final javax.xml.namespace.QName BUSINESSMEANING$8 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "businessMeaning");
    private static final javax.xml.namespace.QName PROPERTIES$10 = 
        new javax.xml.namespace.QName("http://amx.com/mexico/telcel/esb/v1_2", "properties");
    
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public com.amx.mexico.telcel.esb.v1_2.CodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CodeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CodeType)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(com.amx.mexico.telcel.esb.v1_2.CodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.CodeType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.CodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.CodeType)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "severityLevel" element
     */
    public int getSeverityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYLEVEL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "severityLevel" element
     */
    public com.amx.mexico.telcel.esb.v1_2.SeverityType xgetSeverityLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.SeverityType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.SeverityType)get_store().find_element_user(SEVERITYLEVEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "severityLevel" element
     */
    public void setSeverityLevel(int severityLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITYLEVEL$2);
            }
            target.setIntValue(severityLevel);
        }
    }
    
    /**
     * Sets (as xml) the "severityLevel" element
     */
    public void xsetSeverityLevel(com.amx.mexico.telcel.esb.v1_2.SeverityType severityLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.SeverityType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.SeverityType)get_store().find_element_user(SEVERITYLEVEL$2, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.SeverityType)get_store().add_element_user(SEVERITYLEVEL$2);
            }
            target.set(severityLevel);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DescriptionType xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DescriptionType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DescriptionType)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(com.amx.mexico.telcel.esb.v1_2.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DescriptionType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DescriptionType)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.DescriptionType)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "actor" element
     */
    public java.lang.String getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actor" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ActorType xgetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ActorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ActorType)get_store().find_element_user(ACTOR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "actor" element
     */
    public boolean isSetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTOR$6) != 0;
        }
    }
    
    /**
     * Sets the "actor" element
     */
    public void setActor(java.lang.String actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTOR$6);
            }
            target.setStringValue(actor);
        }
    }
    
    /**
     * Sets (as xml) the "actor" element
     */
    public void xsetActor(com.amx.mexico.telcel.esb.v1_2.ActorType actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ActorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ActorType)get_store().find_element_user(ACTOR$6, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.ActorType)get_store().add_element_user(ACTOR$6);
            }
            target.set(actor);
        }
    }
    
    /**
     * Unsets the "actor" element
     */
    public void unsetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTOR$6, 0);
        }
    }
    
    /**
     * Gets the "businessMeaning" element
     */
    public java.lang.String getBusinessMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSMEANING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "businessMeaning" element
     */
    public com.amx.mexico.telcel.esb.v1_2.MeaningType xgetBusinessMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.MeaningType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.MeaningType)get_store().find_element_user(BUSINESSMEANING$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "businessMeaning" element
     */
    public void setBusinessMeaning(java.lang.String businessMeaning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSMEANING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSMEANING$8);
            }
            target.setStringValue(businessMeaning);
        }
    }
    
    /**
     * Sets (as xml) the "businessMeaning" element
     */
    public void xsetBusinessMeaning(com.amx.mexico.telcel.esb.v1_2.MeaningType businessMeaning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.MeaningType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.MeaningType)get_store().find_element_user(BUSINESSMEANING$8, 0);
            if (target == null)
            {
                target = (com.amx.mexico.telcel.esb.v1_2.MeaningType)get_store().add_element_user(BUSINESSMEANING$8);
            }
            target.set(businessMeaning);
        }
    }
    
    /**
     * Gets array of all "properties" elements
     */
    public com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] getPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$10, targetList);
            com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] result = new com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "properties" element
     */
    public com.amx.mexico.telcel.esb.v1_2.PropertyErrorType getPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.PropertyErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.PropertyErrorType)get_store().find_element_user(PROPERTIES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "properties" element
     */
    public int sizeOfPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$10);
        }
    }
    
    /**
     * Sets array of all "properties" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertiesArray(com.amx.mexico.telcel.esb.v1_2.PropertyErrorType[] propertiesArray)
    {
        check_orphaned();
        arraySetterHelper(propertiesArray, PROPERTIES$10);
    }
    
    /**
     * Sets ith "properties" element
     */
    public void setPropertiesArray(int i, com.amx.mexico.telcel.esb.v1_2.PropertyErrorType properties)
    {
        generatedSetterHelperImpl(properties, PROPERTIES$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "properties" element
     */
    public com.amx.mexico.telcel.esb.v1_2.PropertyErrorType insertNewProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.PropertyErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.PropertyErrorType)get_store().insert_element_user(PROPERTIES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "properties" element
     */
    public com.amx.mexico.telcel.esb.v1_2.PropertyErrorType addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.PropertyErrorType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.PropertyErrorType)get_store().add_element_user(PROPERTIES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "properties" element
     */
    public void removeProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$10, i);
        }
    }
}
