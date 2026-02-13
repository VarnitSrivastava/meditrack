package com.airtribe.meditrack.interfaces;

public interface payable {
    double calculateAmount();

    default double applyTax (double amount){
        return amount + ( amount * 0.25);
    }
}
