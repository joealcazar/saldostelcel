
/**
 * ConsultaSaldoExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;

public class ConsultaSaldoExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1583572857477L;
    
    private mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionE faultMessage;

    
        public ConsultaSaldoExceptionException() {
            super("ConsultaSaldoExceptionException");
        }

        public ConsultaSaldoExceptionException(java.lang.String s) {
           super(s);
        }

        public ConsultaSaldoExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ConsultaSaldoExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionE msg){
       faultMessage = msg;
    }
    
    public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    