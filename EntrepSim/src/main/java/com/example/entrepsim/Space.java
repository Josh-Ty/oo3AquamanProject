package com.example.entrepsim;

public class Space extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 10000;
    long initializedCost = 300000;
    public Space(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.SPACE;
    }
}
