package com.momo.robot;

import javax.inject.Inject;

public class FullRobot {
    private final Arm fireArm;
    private final Arm laserArm;
    private final Leg paperLeg;
    private final Leg ironLeg;

    @Inject
    public FullRobot(FireArm fireArm, LaserArm laserArm, PaperLeg paperLeg, IronLeg ironLeg){
        this.fireArm = fireArm;
        this.laserArm = laserArm;
        this.paperLeg = paperLeg;
        this.ironLeg = ironLeg;
    }

    public void doIt(){
        fireArm.punch();
        laserArm.punch();
        paperLeg.kick();
        ironLeg.kick();
    }

}
