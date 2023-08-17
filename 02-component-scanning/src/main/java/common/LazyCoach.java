package common;

import common.ICoach;
import org.springframework.stereotype.Component;

@Component
public class LazyCoach implements ICoach {
  @Override
  public String getDailyWorkout() {
    return "Just go sleep!";
  }
}
