/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.time.LocalDate;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Morgan
 */
public class Booking {
    /**
     * Booking ID number
     */
    private IntegerProperty bookingID;
    /**
     * Name of the person booking
     */
    private StringProperty bookingName;
    /**
     * Number of people in the booking
     */
    private IntegerProperty bookingNumber;
    /**
     * Room ID number
     */
    private IntegerProperty roomID;
    /**
     * Start Date of Booking
     */
    private ObjectProperty<LocalDate> startDate;
    /**
     * End Date of Booking
     */
    private ObjectProperty<LocalDate> endDate;
    /**
     * Amount Paid
     */
    private DoubleProperty bookingPaid;
    
    /**
     * Empty Constructor
     */
    public Booking(){
    }
    
    /**
     * Constructor for a new booking
     * @param bookingID
     * @param bookingName
     * @param bookingNumber
     * @param roomID
     * @param startDate
     * @param endDate
     * @param bookingPaid 
     */
    public Booking(int bookingID, String bookingName, int bookingNumber, int roomID, LocalDate startDate, LocalDate endDate, double bookingPaid) {
        this.bookingID = new SimpleIntegerProperty(bookingID);
        this.bookingName = new SimpleStringProperty(bookingName);
        this.bookingNumber = new SimpleIntegerProperty(bookingNumber);
        this.roomID = new SimpleIntegerProperty(roomID);
        this.startDate = new SimpleObjectProperty<>(startDate);
        this.endDate = new SimpleObjectProperty<>(endDate);
        this.bookingPaid = new SimpleDoubleProperty(bookingPaid);
    }
    
    /**
     * Get the booking ID 
     * @return booking ID
     */
    public IntegerProperty getBookingID() {
        return bookingID;
    }

    /**
     * Get the room booking name
     * @return room booking name
     */
    public StringProperty getBookingName() {
        return bookingName;
    }

    /**
     * Get the room booking number of people 
     * @return room booking number of people
     */
    public IntegerProperty getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Get the room number
     * @return room number
     */
    public IntegerProperty getRoomID() {
        return roomID;
    }

    /**
     * Get the room cost per night
     * @return room cost per night
     */
    public ObjectProperty<LocalDate> getStartDate() {
        return startDate;
    }

    /**
     * Get the room cost per night
     * @return room cost per night
     */
    public ObjectProperty<LocalDate> getEndDate() {
        return endDate;
    }

    /**
     * Get the room cost per night
     * @return room cost per night
     */
    public DoubleProperty getBookingPaid() {
        return bookingPaid;
    }

    /**
     * Set the booking number of people 
     */
    public void setBookingNumber(IntegerProperty bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    /**
     * Set the room booked ID
     */
    public void setRoomID(IntegerProperty roomID) {
        this.roomID = roomID;
    }

    /**
     * Set the booking start date 
     */
    public void setStartDate(ObjectProperty<LocalDate> startDate) {
        this.startDate = startDate;
    }

    /**
     * Set the booking end date
     */
    public void setEndDate(ObjectProperty<LocalDate> endDate) {
        this.endDate = endDate;
    }

    /**
     * Set the booking amount paid 
     */
    public void setBookingPaid(DoubleProperty bookingPaid) {
        this.bookingPaid = bookingPaid;
    }    
   
}
