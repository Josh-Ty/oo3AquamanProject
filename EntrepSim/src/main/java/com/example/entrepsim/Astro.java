package com.example.entrepsim;

public class Astro extends Investment{
    public Astro(int level, int income, long cost){
        this.level = level;
        this.income = income;
        this.cost = cost;
        this.initialCost = cost;
    }
    public InvestmentType getType() {
        return InvestmentType.ASTRO;
    }
}
