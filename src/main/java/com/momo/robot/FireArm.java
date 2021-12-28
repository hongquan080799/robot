package com.momo.robot;

import javax.inject.Inject;

public class FireArm implements Arm {

    @Inject
    FireArm(){}

    @Override
    public void punch() {
        System.out.println("Ejecting fire arm!");
    }
    
}
