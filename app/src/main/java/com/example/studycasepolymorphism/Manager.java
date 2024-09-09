package com.example.studycasepolymorphism;

public class Manager extends Employees {
    public void employ(Employees e){
        e.beHired();
    }
    public void promote(Employees e){
        if (e instanceof Specialist){
            ((Specialist)e).salaryIncrease();
        }
        if (e instanceof Staff){
            System.out.println("There is no promotion in this class.");
        }
    }


}
