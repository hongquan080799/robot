package com.momo;

import com.momo.robot.DaggerRobotComponent;
import com.momo.robot.FullRobot;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTestApp {
    @Test
    public void test(){
        FullRobot fullRobot = DaggerRobotComponent.create().buildRobot();
        Assert.assertNotNull(fullRobot);
    }
    
}
