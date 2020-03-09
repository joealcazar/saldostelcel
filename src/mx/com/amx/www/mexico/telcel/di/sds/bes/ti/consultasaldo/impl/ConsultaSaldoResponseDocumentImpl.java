/*
 * An XML document type.
 * Localname: consultaSaldoResponse
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * A document containing one consultaSaldoResponse(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo) element.
 *
 * This is a complex type.
 */
public class ConsultaSaldoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTASALDORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo", "consultaSaldoResponse");
    
    
    /**
     * Gets the "consultaSaldoResponse" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse getConsultaSaldoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse)get_store().find_element_user(CONSULTASALDORESPONSE$0, 0);
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
    public void setConsultaSaldoResponse(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse consultaSaldoResponse)
    {
        generatedSetterHelperImpl(consultaSaldoResponse, CONSULTASALDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultaSaldoResponse" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse addNewConsultaSaldoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse)get_store().add_element_user(CONSULTASALDORESPONSE$0);
            return target;
        }
    }
}
