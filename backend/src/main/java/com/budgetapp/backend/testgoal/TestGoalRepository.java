package com.budgetapp.backend.testgoal;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TestGoalRepository extends JpaRepository<TestGoal, UUID> {}
