package com.engeto.lekce2;

public class Room {
    int roomId;
    int capacity;
    boolean balcony;
    boolean viewOfTheSea;
    int pricePerNight;

    public Room(int roomId, int capacity, boolean balcony, boolean viewOfTheSea, int pricePerNight) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.balcony = balcony;
        this.viewOfTheSea = viewOfTheSea;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void balcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isViewOfTheSea() {
        return viewOfTheSea;
    }

    public void setViewOfTheSea(boolean viewOfTheSea) {
        this.viewOfTheSea= viewOfTheSea;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "Pokoj č. " + roomId + ": " + capacity + " míst, " + pricePerNight + " Kč/noc";
    }
}