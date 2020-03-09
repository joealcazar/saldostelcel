/*
 * XML Type:  consultaSaldoException
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML consultaSaldoException(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class ConsultaSaldoExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoExceptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLDATA$0 = 
        new javax.xml.namespace.QName("", "controlData");
    private static final javax.xml.namespace.QName DETAILFAIL$2 = 
        new javax.xml.namespace.QName("", "detailFail");
    
    
    /**
     * Gets the "controlData" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType getControlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType)get_store().find_element_user(CONTROLDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "controlData" element
     */
    public void setControlData(com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType controlData)
    {
        generatedSetterHelperImpl(controlData, CONTROLDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlData" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType addNewControlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType)get_store().add_element_user(CONTROLDATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "detailFail" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DetailFailType getDetailFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DetailFailType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DetailFailType)get_store().find_element_user(DETAILFAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "detailFail" element
     */
    public void setDetailFail(com.amx.mexico.telcel.esb.v1_2.DetailFailType detailFail)
    {
        generatedSetterHelperImpl(detailFail, DETAILFAIL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detailFail" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DetailFailType addNewDetailFail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DetailFailType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DetailFailType)get_store().add_element_user(DETAILFAIL$2);
            return target;
        }
    }
}
