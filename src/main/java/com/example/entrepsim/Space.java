package com.example.entrepsim;

public class Space extends Investment{
    public Space(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.SPACE;
    }
}
