package com.example.entrepsim;

public class Stock extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 5000;
    long initializedCost = 162500;
    public Stock(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.STOCK;
    }
}
