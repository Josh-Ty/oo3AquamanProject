package com.example.entrepsim;

public class Sports extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 2500;
    long initializedCost = 87500;
    public Sports(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.SPORTS;
    }
}
