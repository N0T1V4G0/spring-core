package com.n0t1v4g0.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
  public ICoach coach;

  @Autowired // field injection (not recommended).
  public IFood food;

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return this.coach.getDailyWorkout();
  }

  @GetMapping("/dailymeal")
  public String getDailyMeal() {
    return this.food.getDailyMeal();
  }

  @Autowired //setter injection.
  public void setCoach(ICoach coach) {
    this.coach = coach;
  }
}
