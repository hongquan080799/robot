// Generated by Dagger (https://google.github.io/dagger).
package com.momo.robot;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class LeftFireArmRightLaserArmModule_ProvideLaserArmFactory implements Factory<Arm> {
  private final LeftFireArmRightLaserArmModule module;

  public LeftFireArmRightLaserArmModule_ProvideLaserArmFactory(
      LeftFireArmRightLaserArmModule module) {
    this.module = module;
  }

  @Override
  public Arm get() {
    return provideInstance(module);
  }

  public static Arm provideInstance(LeftFireArmRightLaserArmModule module) {
    return proxyProvideLaserArm(module);
  }

  public static LeftFireArmRightLaserArmModule_ProvideLaserArmFactory create(
      LeftFireArmRightLaserArmModule module) {
    return new LeftFireArmRightLaserArmModule_ProvideLaserArmFactory(module);
  }

  public static Arm proxyProvideLaserArm(LeftFireArmRightLaserArmModule instance) {
    return Preconditions.checkNotNull(
        instance.provideLaserArm(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
