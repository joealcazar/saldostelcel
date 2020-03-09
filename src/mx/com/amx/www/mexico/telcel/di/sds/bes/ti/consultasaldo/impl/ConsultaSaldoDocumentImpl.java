/*
 * An XML document type.
 * Localname: consultaSaldo
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * A document containing one consultaSaldo(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo) element.
 *
 * This is a complex type.
 */
public class ConsultaSaldoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTASALDO$0 = 
        new javax.xml.namespace.QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo", "consultaSaldo");
    
    
    /**
     * Gets the "consultaSaldo" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo getConsultaSaldo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo)get_store().find_element_user(CONSULTASALDO$0, 0);
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
    public void setConsultaSaldo(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo consultaSaldo)
    {
        generatedSetterHelperImpl(consultaSaldo, CONSULTASALDO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultaSaldo" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo addNewConsultaSaldo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldo)get_store().add_element_user(CONSULTASALDO$0);
            return target;
        }
    }
}
