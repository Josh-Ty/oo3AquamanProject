package com.example.entrepsim;

public class Dog extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 10;
    long initializedCost = 475;
    public Dog(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.DOG;
    }
}
