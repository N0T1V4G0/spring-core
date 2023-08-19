package com.n0t1v4g0.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements ICoach {

  @Override
  public String getDailyWorkout() {
    return "Skip leg day!";
  }
}
