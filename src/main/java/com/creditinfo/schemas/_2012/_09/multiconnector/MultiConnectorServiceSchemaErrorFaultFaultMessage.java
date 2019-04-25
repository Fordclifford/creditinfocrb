
package com.creditinfo.schemas._2012._09.multiconnector;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Error", targetNamespace = "http://creditinfo.com/schemas/2012/09/MultiConnector")
public class MultiConnectorServiceSchemaErrorFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Error faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MultiConnectorServiceSchemaErrorFaultFaultMessage(String message, Error faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MultiConnectorServiceSchemaErrorFaultFaultMessage(String message, Error faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.creditinfo.schemas._2012._09.multiconnector.Error
     */
    public Error getFaultInfo() {
        return faultInfo;
    }

}
