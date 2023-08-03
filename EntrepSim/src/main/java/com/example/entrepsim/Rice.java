package com.example.entrepsim;

public class Rice extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 50;
    long initializedCost = 2250;
    public Rice(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.RICE;
    }
}
