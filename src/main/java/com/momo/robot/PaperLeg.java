package com.momo.robot;

import javax.inject.Inject;

public class PaperLeg implements Leg{

    @Inject
    PaperLeg (){};

    @Override
    public void kick() {
        System.out.println("Injected paper legs");
    }
    
}
