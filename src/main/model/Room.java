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
 * Class model for storing room details
 * @author Morgan
 */
public class Room {
    /**
     * Room number of the room
     */
    private IntegerProperty roomID;
    /**
     * Room Type e.g. presidential suite
     */
    private StringProperty roomType;
    /**
     * Description of Room
     */
    private StringProperty roomDesc;
    /**
     * Cost of room per night
     */
    private DoubleProperty roomCost;
    
    /**
     * Empty Constructor
     */
    public Room(){
    }

    /**
     * Constructor for new room
     * @param roomNumber
     * @param roomType
     * @param roomDesc
     * @param roomCost 
     */
    public Room(int roomNumber, String roomType, String roomDesc, double roomCost) {
        this.roomID = new SimpleIntegerProperty(roomNumber);
        this.roomType = new SimpleStringProperty(roomType);
        this.roomDesc = new SimpleStringProperty(roomDesc);
        this.roomCost = new SimpleDoubleProperty(roomCost);
    }

    /**
     * Get the room ID
     * @return the room ID
     */
    public IntegerProperty getRoomID() {
        return roomID;
    }

    /**
     * Get the room type
     * @return the room type
     */
    public StringProperty getRoomType() {
        return roomType;
    }

    /**
     * Get the room description
     * @return room description
     */
    public StringProperty getRoomDesc() {
        return roomDesc;
    }

    /**
     * Get the room cost per night
     * @return room cost per night
     */
    public DoubleProperty getRoomCost() {
        return roomCost;
    }
}
