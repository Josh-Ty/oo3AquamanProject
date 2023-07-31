package com.example.entrepsim;

public class Sports extends Investment{
    public Sports(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.SPORTS;
    }
}
