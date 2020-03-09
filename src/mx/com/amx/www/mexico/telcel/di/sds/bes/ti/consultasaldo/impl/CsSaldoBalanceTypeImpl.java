/*
 * XML Type:  CsSaldoBalanceType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML CsSaldoBalanceType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class CsSaldoBalanceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType
{
    private static final long serialVersionUID = 1L;
    
    public CsSaldoBalanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALDOACTUAL$0 = 
        new javax.xml.namespace.QName("", "saldoActual");
    private static final javax.xml.namespace.QName SALDOESTIMADO$2 = 
        new javax.xml.namespace.QName("", "saldoEstimado");
    private static final javax.xml.namespace.QName SALDOPENALIZACIONES$4 = 
        new javax.xml.namespace.QName("", "saldoPenalizaciones");
    
    
    /**
     * Gets the "saldoActual" element
     */
    public java.math.BigDecimal getSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOACTUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldoActual" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOACTUAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "saldoActual" element
     */
    public boolean isSetSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALDOACTUAL$0) != 0;
        }
    }
    
    /**
     * Sets the "saldoActual" element
     */
    public void setSaldoActual(java.math.BigDecimal saldoActual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOACTUAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOACTUAL$0);
            }
            target.setBigDecimalValue(saldoActual);
        }
    }
    
    /**
     * Sets (as xml) the "saldoActual" element
     */
    public void xsetSaldoActual(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoActual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOACTUAL$0, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDOACTUAL$0);
            }
            target.set(saldoActual);
        }
    }
    
    /**
     * Unsets the "saldoActual" element
     */
    public void unsetSaldoActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALDOACTUAL$0, 0);
        }
    }
    
    /**
     * Gets the "saldoEstimado" element
     */
    public java.math.BigDecimal getSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOESTIMADO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldoEstimado" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOESTIMADO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "saldoEstimado" element
     */
    public boolean isSetSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALDOESTIMADO$2) != 0;
        }
    }
    
    /**
     * Sets the "saldoEstimado" element
     */
    public void setSaldoEstimado(java.math.BigDecimal saldoEstimado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOESTIMADO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOESTIMADO$2);
            }
            target.setBigDecimalValue(saldoEstimado);
        }
    }
    
    /**
     * Sets (as xml) the "saldoEstimado" element
     */
    public void xsetSaldoEstimado(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoEstimado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOESTIMADO$2, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDOESTIMADO$2);
            }
            target.set(saldoEstimado);
        }
    }
    
    /**
     * Unsets the "saldoEstimado" element
     */
    public void unsetSaldoEstimado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALDOESTIMADO$2, 0);
        }
    }
    
    /**
     * Gets the "saldoPenalizaciones" element
     */
    public java.math.BigDecimal getSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOPENALIZACIONES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldoPenalizaciones" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOPENALIZACIONES$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "saldoPenalizaciones" element
     */
    public boolean isSetSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALDOPENALIZACIONES$4) != 0;
        }
    }
    
    /**
     * Sets the "saldoPenalizaciones" element
     */
    public void setSaldoPenalizaciones(java.math.BigDecimal saldoPenalizaciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOPENALIZACIONES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOPENALIZACIONES$4);
            }
            target.setBigDecimalValue(saldoPenalizaciones);
        }
    }
    
    /**
     * Sets (as xml) the "saldoPenalizaciones" element
     */
    public void xsetSaldoPenalizaciones(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoPenalizaciones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOPENALIZACIONES$4, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDOPENALIZACIONES$4);
            }
            target.set(saldoPenalizaciones);
        }
    }
    
    /**
     * Unsets the "saldoPenalizaciones" element
     */
    public void unsetSaldoPenalizaciones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALDOPENALIZACIONES$4, 0);
        }
    }
}
