package com.momo.robot;

import javax.inject.Inject;

public class LaserArm implements Arm{

    @Inject
    LaserArm(){}
    
    @Override
    public void punch() {
         System.out.println("Ejecting laser arm!");
        
    }
    
}
