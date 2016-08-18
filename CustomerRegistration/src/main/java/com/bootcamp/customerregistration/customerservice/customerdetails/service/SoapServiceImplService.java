package com.bootcamp.customerregistration.customerservice.customerdetails.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-16T15:57:25.801-05:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "SoapServiceImplService", 
                  wsdlLocation = "file:/C:/project/CustomerRegistration/src/main/resources/test.wsdl",
                  targetNamespace = "http://service.customerdetails.customerservice.com/") 
public class SoapServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.customerdetails.customerservice.com/", "SoapServiceImplService");
    public final static QName SoapServiceImplPort = new QName("http://service.customerdetails.customerservice.com/", "SoapServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/project/CustomerRegistration/src/main/resources/test.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SoapServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/project/CustomerRegistration/src/main/resources/test.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SoapServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SoapServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SoapServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SoapServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SoapServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SoapServiceImpl
     */
    @WebEndpoint(name = "SoapServiceImplPort")
    public SoapServiceImpl getSoapServiceImplPort() {
        return super.getPort(SoapServiceImplPort, SoapServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapServiceImpl
     */
    @WebEndpoint(name = "SoapServiceImplPort")
    public SoapServiceImpl getSoapServiceImplPort(WebServiceFeature... features) {
        return super.getPort(SoapServiceImplPort, SoapServiceImpl.class, features);
    }

}