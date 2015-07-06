/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Morgan
 */
public class Service {
    /**
     * Service ID number
     */
    private IntegerProperty serviveID;
    /**
     * Name of service
     */
    private StringProperty serviceName;
    /**
     * Service description 
     */
    private StringProperty serviceDesc;
    /**
     * Service cost 
     */
    private DoubleProperty serviceCost;
    
    public Service(){
    }
    /**
     * Constructor for new service
     * @param serviveID
     * @param serviceName
     * @param serviceDesc
     * @param serviceCost 
     */
    public Service(int serviveID, String serviceName, String serviceDesc, double serviceCost) {
        this.serviveID = new SimpleIntegerProperty(serviveID);
        this.serviceName = new SimpleStringProperty(serviceName);
        this.serviceDesc = new SimpleStringProperty(serviceDesc);
        this.serviceCost = new SimpleDoubleProperty(serviceCost);
    }

    /**
     * Get the service ID 
     * @return service ID
     */
    public IntegerProperty getServiveID() {
        return serviveID;
    }
    
    /**
     * Get the service name 
     * @return service name
     */
    public StringProperty getServiceName() {
        return serviceName;
    }

    /**
     * Get the service description 
     * @return service description
     */
    public StringProperty getServiceDesc() {
        return serviceDesc;
    }

    /**
     * Get the service cost 
     * @return service cost
     */
    public DoubleProperty getServiceCost() {
        return serviceCost;
    }
}
