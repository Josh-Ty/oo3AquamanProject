package com.example.entrepsim;

public abstract class Investment {
    protected int level;
    protected int income;
    protected long cost;
    public int update(int level, int income){
        return level*income;
    }
    public int upgrade(int level){
        this.level = level+1;
        return level + 1;
    }
    public long upgrade(long cost){
        return -cost;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setIncome(int income){
        this.income = income;
    }
    public void setCost(long cost){
        this.cost = cost;
    }
    public int getLevel(){
        return this.level;
    }
    public int getIncome(){
        return this.income;
    }
    public long getCost(){
        return this.cost;
    }
}
