package com.example.entrepsim;

public class Stock extends Investment{
    public Stock(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
        this.initialCost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.STOCK;
    }
}
