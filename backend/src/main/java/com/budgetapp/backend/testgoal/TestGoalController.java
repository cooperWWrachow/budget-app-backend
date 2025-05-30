package com.budgetapp.backend.testgoal;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/testgoals")
public class TestGoalController {
    private final TestGoalService service;

    public TestGoalController(TestGoalService service) {
        this.service = service;
    }

    @GetMapping("/get-goals")
    public List<TestGoal> getGoals() {
        return service.getAllGoals();
    }

    @PostMapping("/create-goal")
    public TestGoal createGoal(@RequestBody TestGoal goal) {
        return service.saveGoal(goal);
    }
}
