package com.example.entrepsim;

public class Estate extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 500;
    long initializedCost = 20000;
    public Estate(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.ESTATE;
    }
}
