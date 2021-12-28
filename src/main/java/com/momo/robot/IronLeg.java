package com.momo.robot;

import javax.inject.Inject;

public class IronLeg implements Leg {

    @Inject
    IronLeg(){};
    @Override
    public void kick() {
        System.out.println("Injected iron leg");
    }
    
}
