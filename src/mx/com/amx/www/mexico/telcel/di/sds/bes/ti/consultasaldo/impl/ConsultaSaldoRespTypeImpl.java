/*
 * XML Type:  ConsultaSaldoRespType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.impl;
/**
 * An XML ConsultaSaldoRespType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public class ConsultaSaldoRespTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType
{
    private static final long serialVersionUID = 1L;
    
    public ConsultaSaldoRespTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOCUENTA$0 = 
        new javax.xml.namespace.QName("", "codigoCuenta");
    private static final javax.xml.namespace.QName CSSALDOBALANCE$2 = 
        new javax.xml.namespace.QName("", "csSaldoBalance");
    private static final javax.xml.namespace.QName CSSALDOCAPAS$4 = 
        new javax.xml.namespace.QName("", "csSaldoCapas");
    
    
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
     * Gets the "csSaldoBalance" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType getCsSaldoBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType)get_store().find_element_user(CSSALDOBALANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "csSaldoBalance" element
     */
    public boolean isSetCsSaldoBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSSALDOBALANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "csSaldoBalance" element
     */
    public void setCsSaldoBalance(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType csSaldoBalance)
    {
        generatedSetterHelperImpl(csSaldoBalance, CSSALDOBALANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "csSaldoBalance" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType addNewCsSaldoBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType)get_store().add_element_user(CSSALDOBALANCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "csSaldoBalance" element
     */
    public void unsetCsSaldoBalance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSSALDOBALANCE$2, 0);
        }
    }
    
    /**
     * Gets the "csSaldoCapas" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType getCsSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType)get_store().find_element_user(CSSALDOCAPAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "csSaldoCapas" element
     */
    public boolean isSetCsSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSSALDOCAPAS$4) != 0;
        }
    }
    
    /**
     * Sets the "csSaldoCapas" element
     */
    public void setCsSaldoCapas(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType csSaldoCapas)
    {
        generatedSetterHelperImpl(csSaldoCapas, CSSALDOCAPAS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "csSaldoCapas" element
     */
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType addNewCsSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType target = null;
            target = (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType)get_store().add_element_user(CSSALDOCAPAS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "csSaldoCapas" element
     */
    public void unsetCsSaldoCapas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSSALDOCAPAS$4, 0);
        }
    }
}
