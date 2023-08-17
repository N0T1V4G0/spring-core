package com.n0t1v4g0.springcore.rest;

import common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
  public ICoach coach;
  @Autowired
  public CoachController(ICoach coach) {
    this.coach = coach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return this.coach.getDailyWorkout();
  }
}
