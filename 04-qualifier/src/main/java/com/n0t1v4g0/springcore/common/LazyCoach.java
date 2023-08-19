package com.n0t1v4g0.springcore.common;

import com.n0t1v4g0.springcore.common.ICoach;
import org.springframework.stereotype.Component;

@Component
public class LazyCoach implements ICoach {
  @Override
  public String getDailyWorkout() {
    return "Just go sleep!";
  }
}
