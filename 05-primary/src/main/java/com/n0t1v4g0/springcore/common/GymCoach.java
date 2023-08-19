package com.n0t1v4g0.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // @Primary sets this class to be injected in case of conflict. This annotation can be used in one bean only.
// the @Qualifier annotation has higher priority.
public class GymCoach implements ICoach {

  @Override
  public String getDailyWorkout() {
    return "Skip leg day!";
  }
}
