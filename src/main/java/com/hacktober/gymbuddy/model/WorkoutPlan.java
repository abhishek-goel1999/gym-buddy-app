package com.hacktober.gymbuddy.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "workout_plans")
@Data
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String exerciseName;
    private int sets;
    private int reps;
    private String intensityLevel;

    private String description;
}
