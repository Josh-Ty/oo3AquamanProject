package com.example.entrepsim;

public class Pharma extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 1000;
    long initializedCost = 37500;
    public Pharma(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.PHARMA;
    }
}