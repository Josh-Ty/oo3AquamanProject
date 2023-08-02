package com.example.entrepsim;

public class Resto extends Investment{
    public Resto(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
        this.initialCost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.RESTO;
    }
}
