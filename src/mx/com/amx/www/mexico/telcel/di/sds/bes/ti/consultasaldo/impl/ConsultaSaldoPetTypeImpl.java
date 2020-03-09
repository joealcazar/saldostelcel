/*
 * XML Type:  ConsultaSaldoPetType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML ConsultaSaldoPetType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class ConsultaSaldoPetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoPetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOCUENTA$0 = 
        new javax.xml.namespace.QName("", "codigoCuenta");
    private static final javax.xml.namespace.QName MSISDN$2 = 
        new javax.xml.namespace.QName("", "msisdn");
    private static final javax.xml.namespace.QName CSALDOACTUAL$4 = 
        new javax.xml.namespace.QName("", "cSaldoActual");
    private static final javax.xml.namespace.QName CSALDOESTIMADO$6 = 
        new javax.xml.namespace.QName("", "cSaldoEstimado");
    private static final javax.xml.namespace.QName CSALDOPENALIZACIONES$8 = 
        new javax.xml.namespace.QName("", "cSaldoPenalizaciones");
    private static final javax.xml.namespace.QName CSALDOCAPAS$10 = 
        new javax.xml.namespace.QName("", "cSaldoCapas");
    
    
    /**
     * Gets the "codigoCuenta" element
     */
    public java.lang.String getCodigoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOCUENTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoCuenta" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type xgetCodigoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type)get_store().find_element_user(CODIGOCUENTA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoCuenta" element
     */
    public boolean isSetCodigoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOCUENTA$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoCuenta" element
     */
    public void setCodigoCuenta(java.lang.String codigoCuenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOCUENTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOCUENTA$0);
            }
            target.setStringValue(codigoCuenta);
        }
    }
    
    /**
     * Sets (as xml) the "codigoCuenta" element
     */
    public void xsetCodigoCuenta(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type codigoCuenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type)get_store().find_element_user(CODIGOCUENTA$0, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type)get_store().add_element_user(CODIGOCUENTA$0);
            }
            target.set(codigoCuenta);
        }
    }
    
    /**
     * Unsets the "codigoCuenta" element
     */
    public void unsetCodigoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOCUENTA$0, 0);
        }
    }
    
    /**
     * Gets the "msisdn" element
     */
    public java.lang.String getMsisdn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSISDN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "msisdn" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType xgetMsisdn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType)get_store().find_element_user(MSISDN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "msisdn" element
     */
    public boolean isSetMsisdn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MSISDN$2) != 0;
        }
    }
    
    /**
     * Sets the "msisdn" element
     */
    public void setMsisdn(java.lang.String msisdn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSISDN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSISDN$2);
            }
            target.setStringValue(msisdn);
        }
    }
    
    /**
     * Sets (as xml) the "msisdn" element
     */
    public void xsetMsisdn(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType msisdn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType)get_store().find_element_user(MSISDN$2, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType)get_store().add_element_user(MSISDN$2);
            }
            target.set(msisdn);
        }
    }
    
    /**
     * Unsets the "msisdn" element
     */
    public void unsetMsisdn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MSISDN$2, 0);
        }
    }
    
    /**
     * Gets the "cSaldoActual" element
     */
    public boolean getCSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOACTUAL$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cSaldoActual" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOACTUAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cSaldoActual" element
     */
    public void setCSaldoActual(boolean cSaldoActual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOACTUAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CSALDOACTUAL$4);
            }
            target.setBooleanValue(cSaldoActual);
        }
    }
    
    /**
     * Sets (as xml) the "cSaldoActual" element
     */
    public void xsetCSaldoActual(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoActual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOACTUAL$4, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().add_element_user(CSALDOACTUAL$4);
            }
            target.set(cSaldoActual);
        }
    }
    
    /**
     * Gets the "cSaldoEstimado" element
     */
    public boolean getCSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOESTIMADO$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cSaldoEstimado" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOESTIMADO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cSaldoEstimado" element
     */
    public void setCSaldoEstimado(boolean cSaldoEstimado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOESTIMADO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CSALDOESTIMADO$6);
            }
            target.setBooleanValue(cSaldoEstimado);
        }
    }
    
    /**
     * Sets (as xml) the "cSaldoEstimado" element
     */
    public void xsetCSaldoEstimado(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoEstimado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOESTIMADO$6, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().add_element_user(CSALDOESTIMADO$6);
            }
            target.set(cSaldoEstimado);
        }
    }
    
    /**
     * Gets the "cSaldoPenalizaciones" element
     */
    public boolean getCSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOPENALIZACIONES$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cSaldoPenalizaciones" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOPENALIZACIONES$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cSaldoPenalizaciones" element
     */
    public void setCSaldoPenalizaciones(boolean cSaldoPenalizaciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOPENALIZACIONES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CSALDOPENALIZACIONES$8);
            }
            target.setBooleanValue(cSaldoPenalizaciones);
        }
    }
    
    /**
     * Sets (as xml) the "cSaldoPenalizaciones" element
     */
    public void xsetCSaldoPenalizaciones(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoPenalizaciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOPENALIZACIONES$8, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().add_element_user(CSALDOPENALIZACIONES$8);
            }
            target.set(cSaldoPenalizaciones);
        }
    }
    
    /**
     * Gets the "cSaldoCapas" element
     */
    public boolean getCSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOCAPAS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cSaldoCapas" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOCAPAS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cSaldoCapas" element
     */
    public void setCSaldoCapas(boolean cSaldoCapas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CSALDOCAPAS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CSALDOCAPAS$10);
            }
            target.setBooleanValue(cSaldoCapas);
        }
    }
    
    /**
     * Sets (as xml) the "cSaldoCapas" element
     */
    public void xsetCSaldoCapas(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoCapas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().find_element_user(CSALDOCAPAS$10, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType)get_store().add_element_user(CSALDOCAPAS$10);
            }
            target.set(cSaldoCapas);
        }
    }
}
