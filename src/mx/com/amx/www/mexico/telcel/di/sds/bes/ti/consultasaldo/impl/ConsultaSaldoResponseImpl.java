/*
 * XML Type:  ConsultaSaldoResponse
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML ConsultaSaldoResponse(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class ConsultaSaldoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLDATA$0 = 
        new javax.xml.namespace.QName("", "controlData");
    private static final javax.xml.namespace.QName DETAILRESPONSE$2 = 
        new javax.xml.namespace.QName("", "detailResponse");
    private static final javax.xml.namespace.QName CONSULTASALDORESPONSE$4 = 
        new javax.xml.namespace.QName("", "consultaSaldoResponse");
    
    
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
     * Gets the "detailResponse" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DetailResponseType getDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DetailResponseType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DetailResponseType)get_store().find_element_user(DETAILRESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "detailResponse" element
     */
    public void setDetailResponse(com.amx.mexico.telcel.esb.v1_2.DetailResponseType detailResponse)
    {
        generatedSetterHelperImpl(detailResponse, DETAILRESPONSE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detailResponse" element
     */
    public com.amx.mexico.telcel.esb.v1_2.DetailResponseType addNewDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.amx.mexico.telcel.esb.v1_2.DetailResponseType target = null;
            target = (com.amx.mexico.telcel.esb.v1_2.DetailResponseType)get_store().add_element_user(DETAILRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Gets the "consultaSaldoResponse" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType getConsultaSaldoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType)get_store().find_element_user(CONSULTASALDORESPONSE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultaSaldoResponse" element
     */
    public void setConsultaSaldoResponse(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType consultaSaldoResponse)
    {
        generatedSetterHelperImpl(consultaSaldoResponse, CONSULTASALDORESPONSE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultaSaldoResponse" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType addNewConsultaSaldoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType)get_store().add_element_user(CONSULTASALDORESPONSE$4);
            return target;
        }
    }
}
