package com.amit.book.inventory.model;

public class StoreInfo {

    private int storeID;
    private String storeName;
    private String shelfLocation;
    private int shelfNo;
    private int rackNo;

    @Override
    public String toString() {
        return "StoreInfo{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", shelfLocation='" + shelfLocation + '\'' +
                ", shelfNo=" + shelfNo +
                ", rackNo=" + rackNo +
                '}';
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public int getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(int shelfNo) {
        this.shelfNo = shelfNo;
    }

    public int getRackNo() {
        return rackNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }
}
