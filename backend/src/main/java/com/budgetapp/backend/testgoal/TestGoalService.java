package com.budgetapp.backend.testgoal;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TestGoalService {
    private final TestGoalRepository repository;

    public TestGoalService(TestGoalRepository repository) {
        this.repository = repository;
    }

    public List<TestGoal> getAllGoals() {
        return repository.findAll();
    }

    public TestGoal saveGoal(TestGoal goal) {
        return repository.save(goal);
    }
}
