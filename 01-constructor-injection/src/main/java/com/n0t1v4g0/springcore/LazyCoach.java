package com.n0t1v4g0.springcore;

import org.springframework.stereotype.Component;

@Component
public class LazyCoach implements ICoach {
  @Override
  public String getDailyWorkout() {
    return "Just go sleep!";
  }
}
