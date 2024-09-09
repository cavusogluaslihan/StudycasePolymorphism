package com.example.studycasepolymorphism;

public class Main {
    public static void main(String args[]){

        Manager manager1= new Manager();


        Employees specialist1 = new Specialist();
        Employees staff1 = new Staff();

        manager1.employ(specialist1);
        manager1.employ(staff1);
        manager1.promote(specialist1);
        manager1.promote(staff1);

    }
}
