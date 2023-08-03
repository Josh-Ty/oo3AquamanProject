package com.example.entrepsim;

public class Resto extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 100;
    long initializedCost = 4250;
    public Resto(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.RESTO;
    }
}
