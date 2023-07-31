package com.example.entrepsim;

public class Pharma extends Investment{
    public Pharma(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.PHARMA;
    }
}