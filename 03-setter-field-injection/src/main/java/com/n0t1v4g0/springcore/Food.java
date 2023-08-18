package com.n0t1v4g0.springcore;

import org.springframework.stereotype.Component;

@Component
public class Food implements IFood {

  @Override
  public String getDailyMeal() {
    return "Eat, drink and be merry!";
  }
}
