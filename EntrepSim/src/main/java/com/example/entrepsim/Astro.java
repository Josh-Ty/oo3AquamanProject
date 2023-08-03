package com.example.entrepsim;

public class Astro extends Investment{
    int initializedLevel = 0;
    int initializedIncome = 20000;
    long initializedCost = 550000;
    public Astro(){
        this.level = initializedLevel;
        this.income = initializedIncome;
        this.cost = initializedCost;
        this.initialCost = initializedCost;
    }
    public InvestmentType getType() {
        return InvestmentType.ASTRO;
    }
}
