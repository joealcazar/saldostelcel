/*
 * XML Type:  ConsultaSaldo
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML ConsultaSaldo(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class ConsultaSaldoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLDATA$0 = 
        new javax.xml.namespace.QName("", "controlData");
    private static final javax.xml.namespace.QName CONSULTASALDO$2 = 
        new javax.xml.namespace.QName("", "consultaSaldo");
    
    
    /**
     * Gets the "controlData" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType getControlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType)get_store().find_element_user(CONTROLDATA$0, 0);
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
    public void setControlData(com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType controlData)
    {
        generatedSetterHelperImpl(controlData, CONTROLDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlData" element
     */
    public com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType addNewControlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType)get_store().add_element_user(CONTROLDATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "consultaSaldo" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType getConsultaSaldo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType)get_store().find_element_user(CONSULTASALDO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultaSaldo" element
     */
    public void setConsultaSaldo(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType consultaSaldo)
    {
        generatedSetterHelperImpl(consultaSaldo, CONSULTASALDO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultaSaldo" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType addNewConsultaSaldo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType)get_store().add_element_user(CONSULTASALDO$2);
            return target;
        }
    }
}
