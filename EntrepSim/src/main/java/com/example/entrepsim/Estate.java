package com.example.entrepsim;

public class Estate extends Investment{
    public Estate(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.ESTATE;
    }
}
