package com.airtribe.meditrack.entity;

public final class billsummary {
    private final String billId;
    private final double totalAmount;

    public billsummary(String billId, double totalAmount){
        this.billId = billId;
        this.totalAmount = totalAmount;
    }
    public String getbillId(){
        return billId;
    }

    public double getTotalAmount(){
        return totalAmount;
    }
}
