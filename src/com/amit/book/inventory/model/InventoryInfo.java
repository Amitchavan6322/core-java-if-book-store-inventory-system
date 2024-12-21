package com.amit.book.inventory.model;

public class InventoryInfo {

    private int invID;
    private int bookQuantity;

    @Override
    public String toString() {
        return "InventoryInfo{" +
                "invID=" + invID +
                ", bookQuantity=" + bookQuantity +
                '}';
    }

    public int getInvID() {
        return invID;
    }

    public void setInvID(int invID) {
        this.invID = invID;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
