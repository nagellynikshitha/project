
package com.bootcamp.customerregistration.customerservice.customerdetails.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="servicePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePlan", propOrder = {
    "sid",
    "servicePlan"
})
public class ServicePlan {

    protected int sid;
    protected String servicePlan;

    /**
     * Gets the value of the sid property.
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

    /**
     * Gets the value of the servicePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Sets the value of the servicePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePlan(String value) {
        this.servicePlan = value;
    }

}
