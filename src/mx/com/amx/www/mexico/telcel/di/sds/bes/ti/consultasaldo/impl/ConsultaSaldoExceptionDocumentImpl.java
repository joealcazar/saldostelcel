/*
 * An XML document type.
 * Localname: consultaSaldoException
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * A document containing one consultaSaldoException(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo) element.
 *
 * This is a complex type.
 */
public class ConsultaSaldoExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTASALDOEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo", "consultaSaldoException");
    
    
    /**
     * Gets the "consultaSaldoException" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException getConsultaSaldoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException)get_store().find_element_user(CONSULTASALDOEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consultaSaldoException" element
     */
    public void setConsultaSaldoException(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException consultaSaldoException)
    {
        generatedSetterHelperImpl(consultaSaldoException, CONSULTASALDOEXCEPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "consultaSaldoException" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException addNewConsultaSaldoException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoException)get_store().add_element_user(CONSULTASALDOEXCEPTION$0);
            return target;
        }
    }
}
