/*
 * XML Type:  CsSaldoCapasType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML CsSaldoCapasType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class CsSaldoCapasTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType
{
    private static final long serialVersionUID = 1L;
    
    public CsSaldoCapasTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALDOMES$0 = 
        new javax.xml.namespace.QName("", "saldoMes");
    private static final javax.xml.namespace.QName SALDO30DIAS$2 = 
        new javax.xml.namespace.QName("", "saldo30Dias");
    private static final javax.xml.namespace.QName SALDO60DIAS$4 = 
        new javax.xml.namespace.QName("", "saldo60Dias");
    private static final javax.xml.namespace.QName SALDO90DIAS$6 = 
        new javax.xml.namespace.QName("", "saldo90Dias");
    private static final javax.xml.namespace.QName SALDO120DIAS$8 = 
        new javax.xml.namespace.QName("", "saldo120Dias");
    
    
    /**
     * Gets the "saldoMes" element
     */
    public java.math.BigDecimal getSaldoMes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldoMes" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoMes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOMES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "saldoMes" element
     */
    public void setSaldoMes(java.math.BigDecimal saldoMes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOMES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOMES$0);
            }
            target.setBigDecimalValue(saldoMes);
        }
    }
    
    /**
     * Sets (as xml) the "saldoMes" element
     */
    public void xsetSaldoMes(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoMes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDOMES$0, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDOMES$0);
            }
            target.set(saldoMes);
        }
    }
    
    /**
     * Gets the "saldo30Dias" element
     */
    public java.math.BigDecimal getSaldo30Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO30DIAS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldo30Dias" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldo30Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO30DIAS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "saldo30Dias" element
     */
    public void setSaldo30Dias(java.math.BigDecimal saldo30Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO30DIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDO30DIAS$2);
            }
            target.setBigDecimalValue(saldo30Dias);
        }
    }
    
    /**
     * Sets (as xml) the "saldo30Dias" element
     */
    public void xsetSaldo30Dias(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldo30Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO30DIAS$2, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDO30DIAS$2);
            }
            target.set(saldo30Dias);
        }
    }
    
    /**
     * Gets the "saldo60Dias" element
     */
    public java.math.BigDecimal getSaldo60Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO60DIAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldo60Dias" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldo60Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO60DIAS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "saldo60Dias" element
     */
    public void setSaldo60Dias(java.math.BigDecimal saldo60Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO60DIAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDO60DIAS$4);
            }
            target.setBigDecimalValue(saldo60Dias);
        }
    }
    
    /**
     * Sets (as xml) the "saldo60Dias" element
     */
    public void xsetSaldo60Dias(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldo60Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO60DIAS$4, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDO60DIAS$4);
            }
            target.set(saldo60Dias);
        }
    }
    
    /**
     * Gets the "saldo90Dias" element
     */
    public java.math.BigDecimal getSaldo90Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO90DIAS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldo90Dias" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldo90Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO90DIAS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "saldo90Dias" element
     */
    public void setSaldo90Dias(java.math.BigDecimal saldo90Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO90DIAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDO90DIAS$6);
            }
            target.setBigDecimalValue(saldo90Dias);
        }
    }
    
    /**
     * Sets (as xml) the "saldo90Dias" element
     */
    public void xsetSaldo90Dias(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldo90Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO90DIAS$6, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDO90DIAS$6);
            }
            target.set(saldo90Dias);
        }
    }
    
    /**
     * Gets the "saldo120Dias" element
     */
    public java.math.BigDecimal getSaldo120Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO120DIAS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "saldo120Dias" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldo120Dias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO120DIAS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "saldo120Dias" element
     */
    public void setSaldo120Dias(java.math.BigDecimal saldo120Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO120DIAS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDO120DIAS$8);
            }
            target.setBigDecimalValue(saldo120Dias);
        }
    }
    
    /**
     * Sets (as xml) the "saldo120Dias" element
     */
    public void xsetSaldo120Dias(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldo120Dias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().find_element_user(SALDO120DIAS$8, 0);
            if (target == null)
            {
                target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type)get_store().add_element_user(SALDO120DIAS$8);
            }
            target.set(saldo120Dias);
        }
    }
}
