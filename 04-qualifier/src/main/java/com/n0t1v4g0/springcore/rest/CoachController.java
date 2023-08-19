package com.n0t1v4g0.springcore.rest;

import com.n0t1v4g0.springcore.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
  public ICoach coach;
  @Autowired
  public CoachController(@Qualifier("gymCoach") ICoach coach) {
    this.coach = coach;
  } // @Qualifier recieves the bean name (class name in camel case) to select correct dependency.
  // @Qualifier can also be placed in setters.

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return this.coach.getDailyWorkout();
  }
}
