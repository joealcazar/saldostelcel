
/**
 * ConsultaSaldoHttpServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
    package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.amx.mexico.telcel.esb.v1_2.ActorType;
import com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType;
import com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType;
import com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type;
import com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type;
import com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type;
import com.amx.mexico.telcel.esb.v1_2.CodeType;
import com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType;
import com.amx.mexico.telcel.esb.v1_2.DateTimeType;
import com.amx.mexico.telcel.esb.v1_2.DescriptionType;
import com.amx.mexico.telcel.esb.v1_2.DetailResponseType;
import com.amx.mexico.telcel.esb.v1_2.LatencyType;
import com.amx.mexico.telcel.esb.v1_2.MeaningType;
import com.amx.mexico.telcel.esb.v1_2.MessageUUIDType;
import com.amx.mexico.telcel.esb.v1_2.SenderType;
import com.amx.mexico.telcel.esb.v1_2.SeverityType;

/**
     *  ConsultaSaldoHttpServiceSkeleton java skeleton for the axisService
     */
    public class ConsultaSaldoHttpServiceSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param consultaSaldo 
             * @return consultaSaldoResponse 
             * @throws ConsultaSaldoExceptionException 
         */
        
                 public mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseE consultaSaldo
                  (
                  mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoE consultaSaldo
                  )
            throws ConsultaSaldoExceptionException{
                	 System.out.println("--->entro<----");
                	 DetailResponseType detail = new DetailResponseType();
                	 CodeType code = new CodeType();
                	 code.setCodeType("code");
                	 detail.setCode(code);
                	 ActorType actor = new ActorType();
                	 actor.setActorType("actor");
                	 detail.setActor(actor);
                	 MeaningType meaning = new MeaningType();
                	 meaning.setMeaningType("meaning");
                	 detail.setBusinessMeaning(meaning);
                	 DescriptionType desc = new DescriptionType();
                	 desc.setDescriptionType("description");
                	 detail.setDescription(desc);
                	 SeverityType severity = new SeverityType();
                	 severity.setSeverityType(1);
                	 detail.setSeverityLevel(severity);
                	 
                	 
                	 ConsultaSaldoResponseE response = new ConsultaSaldoResponseE();
                	 ConsultaSaldoResponse r = new ConsultaSaldoResponse();
                	 r.setDetailResponse(detail);
                	 ConsultaSaldoRespType saldo = new ConsultaSaldoRespType();
                	 CadenaAlfanumerica32Type cadena = new CadenaAlfanumerica32Type();
                	 cadena.setCadenaAlfanumerica32Type("codigoCta");
                	 CsSaldoBalanceType saldoBalance = new CsSaldoBalanceType();
                	 Decimal14C6Type decimal = new Decimal14C6Type();
                	 decimal.setDecimal14C6Type(new BigDecimal(1000));
                	 saldoBalance.setSaldoActual(decimal);
                	 saldoBalance.setSaldoEstimado(decimal);
                	 saldoBalance.setSaldoPenalizaciones(decimal);
                	 CsSaldoCapasType saldoCapas = new CsSaldoCapasType();
                	 saldoCapas.setSaldo30Dias(decimal);
                	 saldoCapas.setSaldo60Dias(decimal);
                	 saldoCapas.setSaldo90Dias(decimal);
                	 saldoCapas.setSaldo120Dias(decimal);
                	 saldoCapas.setSaldoMes(decimal);
                	 saldo.setCodigoCuenta(cadena);
                	 saldo.setCsSaldoBalance(saldoBalance);
                	 saldo.setCsSaldoCapas(saldoCapas);
                	 r.setConsultaSaldoResponse(saldo);
                	 System.out.println("--->mitad<----");
                	 ControlDataResponseHeaderType controlData = new ControlDataResponseHeaderType();
                	 BesAdditionalPropertyType[] additional = new BesAdditionalPropertyType[0];
                	 controlData.setAdditionalProperty(additional);
                	 LatencyType latency = new LatencyType();
                	 latency.setLatencyType(1);
                	 controlData.setLatency(latency);
                	 MessageUUIDType mUUID = new MessageUUIDType();
                	 mUUID.setMessageUUIDType("abc");
                	 controlData.setMessageUUID(mUUID);
                	 System.out.println("--->mas o menos<----");
                	 BesCbsLanguageCodeType language = new BesCbsLanguageCodeType();
                	 language.setBesCbsLanguageCodeType("1");
                	 controlData.setMsgLanguageCode(language);
                	 System.out.println("--->puso languate<----");
                	 DateTimeType fecha = new DateTimeType();
                	 Calendar calendar = new GregorianCalendar();
                	 calendar.setTimeInMillis(System.currentTimeMillis());
                	 fecha.setDateTimeType(calendar);
                	 System.out.println("--->antes fecha<----");
                	 controlData.setResponseDate(fecha);
                	 CadenaAlfanumerica20Type cadena20 = new CadenaAlfanumerica20Type();
                	 System.out.println("--->trescuartos<----");
                	 cadena20.setCadenaAlfanumerica20Type("veinte");
                	 controlData.setResultCode(cadena20);
                	 CadenaAlfanumerica1024Type cadena1024 = new CadenaAlfanumerica1024Type();
                	 cadena1024.setCadenaAlfanumerica1024Type("descripcion");
                	 SenderType sender = new SenderType();
                	 controlData.setResultDesc(cadena1024);
                	 sender.setSenderType("jalcazar");
                	 controlData.setSendBy(sender);
                	 CadenaAlfanumerica24Type version = new CadenaAlfanumerica24Type();
                	 version.setCadenaAlfanumerica24Type("1.2");
                	 controlData.setVersion(version);
                	 r.setControlData(controlData);
                	 System.out.println("----- pasó ----");
                	 response.setConsultaSaldoResponse(r);
                	 
                return response;
                
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#consultaSaldo");
        }
     
    }
    