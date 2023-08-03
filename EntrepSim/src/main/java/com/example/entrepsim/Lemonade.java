package com.example.entrepsim;

public class Lemonade extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 1;
    long initializedCost = 50;
    public Lemonade(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.LEMONADE;
    }
}
