package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.interfaces.payable;

public class bill implements payable{
    protected double baseAmount;

    public bill (double baseAmount){
        this.baseAmount = baseAmount;
    }

    @Override

    public double calculateAmount(){
        return applyTax(baseAmount);
    }
}
