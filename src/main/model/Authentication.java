/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Kevin
 */
public class Authentication {
     /**
     * Room number of the room
     */
    private IntegerProperty empID;
    /**
     * Room Type e.g. presidential suite
     */
    private StringProperty password;
    /**
     * Room Type e.g. presidential suite
     */
    private StringProperty firstName;
    /**
     * Room Type e.g. presidential suite
     */
    private StringProperty lastName;
    /**
     * Room Type e.g. presidential suite
     */
    private StringProperty positionRole;
    /**
     * Room Type e.g. presidential suite
     */
    private BooleanProperty create;
    /**
     * Room Type e.g. presidential suite
     */
    private BooleanProperty read;
    /**
     * Room Type e.g. presidential suite
     */
    private BooleanProperty update;
    /**
     * Room Type e.g. presidential suite
     */
    private BooleanProperty delete;
    
    /**
     * Empty Constructor
     */
    public Authentication(){
    }
    
    /**
     * Constructor for new Authentication
     * @param empID
     * @param password
     * @param firstName
     * @param lastName
     * @param positionRole
     * @param create
     * @param read
     * @param update
     * @param delete
     */
    public Authentication(int empID, String password, 
            String firstName, String lastName, 
            String positionRole, Boolean create, 
            Boolean read, Boolean update, 
            Boolean delete) {
        this.empID = new SimpleIntegerProperty(empID);
        this.password = new SimpleStringProperty(password);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.positionRole = new SimpleStringProperty(positionRole);
        this.create = new SimpleBooleanProperty(create);
        this.read = new SimpleBooleanProperty(read);
        this.update = new SimpleBooleanProperty(update);
        this.delete = new SimpleBooleanProperty(delete);
    }
    
     /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public IntegerProperty getEmpID() {
        return empID;
    }

    public void setEmpID(IntegerProperty empID) {
        this.empID = empID;
    }

    /**
     * Get the 
     * @return the Employee ID
     */
    public StringProperty getPassword() {
        return password;
    }

    public void setPassword(StringProperty password) {
        this.password = password;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public StringProperty getFirstName() {
        return firstName;
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public StringProperty getLastName() {
        return lastName;
    }

    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public StringProperty getPositionRole() {
        return positionRole;
    }

    public void setPositionRole(StringProperty positionRole) {
        this.positionRole = positionRole;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public BooleanProperty getCreate() {
        return create;
    }

    public void setCreate(BooleanProperty create) {
        this.create = create;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public BooleanProperty getRead() {
        return read;
    }

    public void setRead(BooleanProperty read) {
        this.read = read;
    }

    /**
     * Get the Employee ID
     * @return the Employee ID
     */
    public BooleanProperty getUpdate() {
        return update;
    }

    public void setUpdate(BooleanProperty update) {
        this.update = update;
    }

    /**
     * Get the Employee delete capability 
     * @return the Employee delete capability
     */
    public BooleanProperty getDelete() {
        return delete;
    }

    
    public void setDelete(BooleanProperty delete) {
        this.delete = delete;
    }
    
}
